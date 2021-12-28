import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BD {

			public void insereDados(Connection con, String sql_table, String sql_data) {
				     PreparedStatement ps;
				     try {
					          String sql = "INSERT INTO "+sql_table+" VALUES "+sql_data;
					          ps = con.prepareStatement(sql);
					          ps.execute();
				      } catch (SQLException e) {
					         e.printStackTrace();
				      }
			  }
			
			public int definirId(Connection con, String tabela){
				PreparedStatement ps;
				int i = 0;			
				try {
					String sql = "SELECT COUNT(id) FROM "+tabela;
					ps = con.prepareStatement(sql);
					ResultSet retorno = ps.executeQuery();	
					if(retorno.next()){
						i = retorno.getInt("COUNT(id)");
					}
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}	
				return i;
			}
			
			public int selecionaId(Connection con, String tabela,String chave){
				PreparedStatement ps;
				int i = 0;			
				try {
					String sql = "SELECT id FROM "+tabela+" WHERE "+chave;
					ps = con.prepareStatement(sql);
					ResultSet retorno = ps.executeQuery();	
					if(retorno.next()){
						i = retorno.getInt("id");
					}
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}	
				return i;
			}
			
			public ArrayList<Despesa> selecionaIds(Connection con, String tabela,String campo,String chave){
				PreparedStatement ps;
				ArrayList<Despesa> lista = new ArrayList<Despesa>();
				try {
					String sql = "SELECT "+campo+" FROM "+tabela+" WHERE "+chave;
					ps = con.prepareStatement(sql);
					ResultSet retorno = ps.executeQuery();	
					while(retorno.next()){
						Despesa d = new Despesa();
						d.setId(retorno.getInt("id"));
						d.setCodigo(retorno.getInt("codigo"));
						d.setData(retorno.getString("data"));
						d.setTipoDespesa(retorno.getInt("tipo_despesa"));
						lista.add(d);
					}
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}	
				return lista;
			}
		
			public ArrayList<Fornecedor> listaFornecedor(Connection con, String tabela){
				PreparedStatement ps;
				ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
				try {
					String sql = "SELECT * FROM "+ tabela;
					ps = con.prepareStatement(sql);
					ResultSet retorno = ps.executeQuery();		
					while(retorno.next()) {
						lista.add(new Fornecedor(retorno.getInt("id"), retorno.getString("nome")));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}	
				return lista;
			}
			
			public ArrayList<Produto> listaProduto(Connection con,String campo,String tabela){
				PreparedStatement ps;
				ArrayList<Produto> lista = new ArrayList<Produto>();
				try {
					String sql = "SELECT" + campo +" FROM \r\n"
							+ "produto INNER JOIN "+tabela +" ON "+tabela+".produto_id = produto.id \r\n"
							+ "INNER JOIN categoria ON categoria.id = produto.categoria_id\r\n"
							+ "GROUP BY produto.nome ORDER BY produto.id"; 
				

					
					ps = con.prepareStatement(sql);
					ResultSet retorno = ps.executeQuery();		
					while(retorno.next()) {
						Categoria cat = new Categoria(retorno.getInt("catID"),retorno.getString("cat"));
						lista.add(new Produto(retorno.getInt("id"),retorno.getInt("codigo"), retorno.getString("nome"),retorno.getFloat("preco"),retorno.getFloat("percentual"),retorno.getInt("quantidade"),cat));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}	
				return lista;
			}
			
			public ArrayList<Produto> listaProdutoDespesa(Connection con,String campo,String tabela,String chave){
				PreparedStatement ps;
				ArrayList<Produto> lista = new ArrayList<Produto>();
				try {
					String sql = "SELECT" + campo +" FROM \r\n"
							+ "produto INNER JOIN "+tabela +" ON "+tabela+".produto_id = produto.id \r\n"
							+ "INNER JOIN categoria ON categoria.id = produto.categoria_id WHERE "+chave; 
				

					
					ps = con.prepareStatement(sql);
					ResultSet retorno = ps.executeQuery();		
					while(retorno.next()) {
						Categoria cat = new Categoria(retorno.getInt("catID"),retorno.getString("cat"));
						lista.add(new Produto(retorno.getInt("id"),retorno.getInt("codigo"), retorno.getString("nome"),retorno.getFloat("preco"),retorno.getFloat("percentual"),retorno.getInt("quantidade"),cat));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}	
				return lista;
			}
			
			public ArrayList<Produto> listaProdutoComCondicao(Connection con,String chave){
				PreparedStatement ps;
				ArrayList<Produto> lista = new ArrayList<Produto>();
				try {
					String sql = "SELECT produto.id,produto.codigo,produto.nome,produto.percentual,produto.quantidade,item_compra.preco,categoria.id as catID, categoria.categoria as cat \r\n"
							+ "FROM produto \r\n"
							+ "INNER JOIN categoria ON categoria.id = produto.categoria_id\r\n"
							+ "INNER JOIN item_compra ON item_compra.produto_id= produto.id\r\n"
							+ "INNER JOIN compra ON compra.id = item_compra.compra_id\r\n"
							+ "WHERE " + chave
							+ "\r\nGROUP BY produto.nome"; 
				

					
					ps = con.prepareStatement(sql);
					ResultSet retorno = ps.executeQuery();		
					while(retorno.next()) {
						Categoria cat = new Categoria(retorno.getInt("catID"),retorno.getString("cat"));
						lista.add(new Produto(retorno.getInt("id"),retorno.getInt("codigo"), retorno.getString("nome"),retorno.getFloat("preco"),retorno.getFloat("percentual"),0,cat));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}	
				return lista;
			}
			
			public void alteraDado(Connection con, String tabela, String campos, String chave ) {
				PreparedStatement ps;
				try {
					String sql = "UPDATE "+ tabela +" SET "+campos+" WHERE "+chave;
					ps = con.prepareStatement(sql);
					int retorno = ps.executeUpdate();
					if(retorno  == 0){
					System.out.println("Não foi possível alterar os registros!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
				
			}
			
			
			
			
}
