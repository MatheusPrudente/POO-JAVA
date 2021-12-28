import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args) {
		
    Conexao conexao = new Conexao();
	Connection conn = null;  
	BD bd = new BD();
	int aux = 0;
	Date data = new Date(System.currentTimeMillis()); 
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	Despesa despesa = new Despesa();
	despesa.setData(formatter.format(data).toString());
	

	//SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd"); 
	try (Scanner scanner = new Scanner(System.in)) {
		int a = 0;
		while(true) {
			System.out.print("\n------------ Bar do Seu Zé ---------------\n");
			System.out.print("\n[1] Venda De Bebidas\n");
			System.out.print("[2] Compra De Bebidas\n");
			System.out.print("[3] Estoque\n");
			System.out.print("[4] Fechar Caixa\n");
			System.out.print("\nInforme o Número Da Opção Desejada :\n");
			scanner.reset();
			aux = scanner.nextInt();
   
			if (aux == 1) {
				
				despesa.setTipoDespesa(1);
				adicionarProduto(despesa,conexao,conn,bd);
				confirmarProduto(despesa,conexao,conn,bd);	
		      }else if (aux == 2) {
		    	  despesa.setTipoDespesa(0);
		    	  adicionarProduto(despesa,conexao,conn,bd);
				  confirmarProduto(despesa,conexao,conn,bd);
				   	}else if (aux == 3) {
				   		mostrarEstoque(conexao,conn,bd);
				   		}else{
					   		mostrarEstoque(conexao,conn,bd);
				   			gerarRelatorioDia(conexao,conn,bd);
				   			fecharCaixa();
				   			System.exit(0);
				   	}   
			}
		}
		
}
 //classe para mostrar as bebidas 
public static void mostrarProduto(ArrayList<Produto>lista, int tipo_despesa) {
	
	if (tipo_despesa == 0) {
		
		System.out.print("Cdg | Prdto | Qtde |Pre.Uni\n\n");

		for (Produto p : lista) {
					
			System.out.printf("%d   |%.3s %.5s",p.getCodigo(),p.getCategoria().getNome(),p.getNome()); 
			int tam = p.getNome().length() + p.getCategoria().getNome().length();
			
			while(tam < 10) {
				System.out.print(" ");
		        tam++;
				}
			System.out.printf(" | %d | %.2f",p.getQuantidade(), p.getPreco());
				
				System.out.print("\n");
			}
		
	}else if (tipo_despesa == 1){
		System.out.print("Cdg | Prdto | Qtde |Pre.Uni\n\n");

		for (Produto p : lista) {
			
			
			System.out.printf("%d   | %.3s %.5s",p.getCodigo(),p.getCategoria().getNome(),p.getNome()); 
			int tam = p.getNome().length() + p.getCategoria().getNome().length();
			while(tam < 10) {
				System.out.print(" ");
	            tam++;
			}
			System.out.printf(" | %d | %.2f",p.getQuantidade(), p.getPreco() + (p.getPreco()*p.getPercentual()));
			System.out.print("\n");
			}
		}else {
			System.out.print("Cdg | Prdto |Pre.Uni\n\n");

			for (Produto p : lista) {
						
				System.out.printf("%d   |%.3s %.5s",p.getCodigo(),p.getCategoria().getNome(),p.getNome()); 
				int tam = p.getNome().length() + p.getCategoria().getNome().length();
				
				while(tam < 10) {
					System.out.print(" ");
			        tam++;
					}
				System.out.printf(" | %.2f", p.getPreco());
					
					System.out.print("\n");
				}
		}
	
	
	System.out.print("\n------------------------------------------\n\n");
}  

//classe para adicionar as bebidas a lista 
public static void adicionarProduto(Despesa despesa,Conexao conexao,Connection conn, BD bd) {
		   
	Scanner sc = new Scanner(System.in);
	ArrayList<Produto> lista = new ArrayList<Produto>();
	ArrayList<Produto> listaProduto = new ArrayList<Produto>();

		try {
			conn = conexao.conectar();
			
			if(despesa.getTipoDespesa() == 0) {
				
				int cont = 0;
				Fornecedor forEscolhido = new Fornecedor();
				ArrayList<Fornecedor> listaFor = new ArrayList<Fornecedor>();

				System.out.print("\n------------ Fornecedores   ---------------\n\n");
				listaFor.addAll(bd.listaFornecedor(conn, "Fornecedor"));		
					for (Fornecedor f : listaFor) {
							System.out.print("["+(cont+1)+"]"+f.getNome());
							System.out.print("\n");
							cont++;}					
			    sc = new Scanner(System.in);
				System.out.print("\nInforme o numero do fornecedor: ");
				forEscolhido = listaFor.get(sc.nextInt()-1);
				despesa.setFornecedor(forEscolhido);
				sc.reset();
				System.out.print("\n------------ Produtos Fornecidos ----------\n\n");
				String chave = "compra.fornecedor_id="+forEscolhido.getId();
				lista = bd.listaProdutoComCondicao(conn,chave);
		    	mostrarProduto(lista,despesa.getTipoDespesa() + 2); 	

		    }else {
		    	System.out.print("\n------------ Bebidas a Venda -------------\n\n");
		    	String campo = " produto.id,produto.codigo,produto.nome,produto.percentual,produto.quantidade,item_compra.preco,categoria.id as catID, categoria.categoria as cat ";
		    	String tabela = "item_compra";
		    	lista.addAll(bd.listaProduto(conn,campo,tabela));
		    	mostrarProduto(lista,despesa.getTipoDespesa()); 	
		    	}
				conexao.desconectar(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		do {
			System.out.print("\nInforme o Codigo Da Bebida [0 - Finalizar Ação]: ");	
			int prodEscolhido = sc.nextInt();
			sc.reset();
		    	if(prodEscolhido == 0){
		    		despesa.setLista(listaProduto);
		    		break;
					
				}
		    	else {
		    		int qtdEscolhida = 0;
		    		do {
						System.out.print("Informe a Quantidade Da Bebida: ");
						qtdEscolhida= sc.nextInt();
						sc.reset();
		    		}while(qtdEscolhida<=0);
		    		
					int enc = 0;
						//refazer de acordo com o codigo do produto
						for (Produto p : lista) {
						    if(prodEscolhido == p.getCodigo() ) {
						    	enc++;
						    	if(despesa.getTipoDespesa() == 0) {
							    		p.setQuantidade(qtdEscolhida);
							    		listaProduto.add(p);
										  
						    	}else {
						    		if(qtdEscolhida <= p.getQuantidade()){  
							    		p.setQuantidade(qtdEscolhida);
							    		listaProduto.add(p);
										  }else{
												System.out.print("\n------------------------------------------\n\n");
											    System.out.print("-- Não ha Quantidade De Produtos No Estoque -");
												System.out.print("\n------------------------------------------\n\n");
										  }
						    		}
						    	}
						}
						if(enc == 0) {
							System.out.print("\n------------------------------------------\n\n");
				    		System.out.print(" ----- Não a produtos com este codigo ----");
				    		System.out.print("\n------------------------------------------\n\n");  
						}
					System.out.print("\n");}
			}while(true);
}
//classe para retirar ou confimar os produtos
public static void confirmarProduto(Despesa despesa,Conexao conexao,Connection conn, BD bd) {
	Scanner sc = new Scanner(System.in);
	while(despesa.getLista().size() > 0) {
				System.out.print("\n------------ Carrinho  ---------------\n\n");
				mostrarProduto(despesa.getLista(),despesa.getTipoDespesa());	
				System.out.print("[1]Retirar Produto");
				System.out.print("\n[2]Confirmar Lista");
				System.out.print("\n[3]Cancelar\n");
				System.out.print("\nInforme o Número Da Opção Desejada :");
				int op = sc.nextInt();
				sc.reset();
				if(op == 1) {
					System.out.print("\nInforme o Codigo Da Bebida [0 - Finalizar Ação]: ");	
					int prodEscolhido = sc.nextInt();
					System.out.print("Informe a Quantidade Da Bebida: ");
					int qtdEscolhida = sc.nextInt();
					 			int enc=0;
					 			for (Produto p : despesa.getLista()) {
					 				if(prodEscolhido == p.getCodigo() ) {
								    	enc++;
					 					if(qtdEscolhida < p.getQuantidade()){  
					 						p.setQuantidade( p.getQuantidade()- qtdEscolhida);
					 						}else{
					 							despesa.getLista().remove(p);
											  break;
										  	}
					 					System.out.print("\n------------------------------------------\n\n");
								    	System.out.print(" ----------- Retirando produtos ------------");
								    	System.out.print("\n------------------------------------------\n\n");
					 					}
					 				}
					 			
					 			if(enc == 0) {
					 				System.out.print("\n-------------------------------------\n");
						    		System.out.print("Não a Produtos Com Este Código");
						    		System.out.print("\n-------------------------------------\n");
					 			}
					 			
					}else if (op == 2) {
							gerarComprovante(despesa,conexao,conn,bd);
							break;
					}else {
						break;
					}
		}
	
	if(despesa.getLista().size() == 0) {
		System.out.print("\n-------------------------------------\n");
		System.out.print("----- Não a produtos na sua venda -----");
		System.out.print("\n-------------------------------------\n");
	}

}

//classe para gerar comprovante e inserir no banco 
public static void gerarComprovante(Despesa despesa,Conexao conexao,Connection conn, BD bd) {
	   
	System.out.print("\n\n------------ Comprovante  ---------------\n\n");
	mostrarProduto(despesa.getLista(),despesa.getTipoDespesa());	
	for (Produto prodAtual :despesa.getLista()) {
		float pr = 0.00f;
		if(despesa.getTipoDespesa() == 0) {
			pr= prodAtual.getPreco()*prodAtual.getQuantidade();
		    despesa.setPrecoTotal(despesa.getPrecoTotal()+pr);
		}else {
			pr = prodAtual.getPreco() + (prodAtual.getPreco()*prodAtual.getPercentual());
		    pr*=prodAtual.getQuantidade();
		    despesa.setPrecoTotal(despesa.getPrecoTotal()+pr);

		}
		   
		    
	 }
		if(despesa.getTipoDespesa() == 0) {
			
			System.out.print("Fornecedor : "+ despesa.getFornecedor().getNome());
			System.out.print("\nData : " + despesa.getData()+"\n");  
			System.out.printf("\nPreço total : %.2f",despesa.getPrecoTotal());   
			
		}else {
			System.out.print("Data : " + despesa.getData()+"\n");  
			System.out.printf("Preço total : %.2f",despesa.getPrecoTotal());   
			System.out.print("\n\n");
		}
	
		try {
     		conn = conexao.conectar();
     		
     		int codDespesa;
     		int idDespesa;
     		if(despesa.getTipoDespesa() == 0) {
    			//inserir na tabela compra
    		    codDespesa = (bd.definirId(conn,"Compra"))  + 1;
    		    despesa.setCodigo(codDespesa);
    			bd.insereDados(conn, "Compra (fornecedor_id,data,codigo)", "('"+despesa.getFornecedor().getId()+"','"+despesa.getData()+"','"+despesa.getCodigo()+"')");       
    			//pegar id da compra
    			idDespesa = bd.selecionaId(conn,"Compra","codigo="+despesa.getCodigo());
    		    despesa.setId(idDespesa);					 		 
    		    for (Produto prodAtual : despesa.getLista()) {          
    		    //inserir na item_compra
         			 bd.insereDados(conn, "Item_compra (quantidade,preco,produto_id,compra_id,tipo_despesa)", "('"+prodAtual.getQuantidade()+"','"
    	    		            +prodAtual.getPreco()+"','"
    	    		            +prodAtual.getId()+"','"
    	    		            +despesa.getId()+"','"
    	    		            +despesa.getTipoDespesa()+"')");
        			 bd.alteraDado(conn, "Produto", "produto.quantidade = produto.quantidade +"+ prodAtual.getQuantidade(), "produto.id="+prodAtual.getId());
        					
         		 	}
	     		    System.out.print("\n\n------------------------------------------\n");
    				System.out.print("------- Compra efetuada com Sucesso ------");
    				System.out.print("\n------------------------------------------\n\n");
    
     		}else {
				//inserir na tabela venda
			    codDespesa = (bd.definirId(conn,"Venda"))  + 1;
			    despesa.setCodigo(codDespesa);
				bd.insereDados(conn, "Venda (data,codigo)", "('"+despesa.getData()+"','"+despesa.getCodigo()+"')");       
				//pegar id da venda
			    idDespesa = bd.selecionaId(conn,"Venda","codigo="+despesa.getCodigo());
			    despesa.setId(idDespesa);
			    
			 
	     		 for (Produto prodAtual : despesa.getLista()) {          
	    		 //inserir na item_venda
	     			 bd.insereDados(conn, "Item_venda (quantidade,preco,produto_id,venda_id,tipo_despesa)", "('"+prodAtual.getQuantidade()+"','"
		    		            +(prodAtual.getPreco() + (prodAtual.getPreco()*prodAtual.getPercentual()))+"','"
		    		            +prodAtual.getId()+"','"
		    		            +despesa.getId()+"','"
		    		            +despesa.getTipoDespesa()+"')");
	     			 bd.alteraDado(conn, "Produto", "produto.quantidade = produto.quantidade -"+ prodAtual.getQuantidade(), "produto.id="+prodAtual.getId());
	    					
	     		 	}
	     		System.out.print("\n\n------------------------------------------\n");
  			 	System.out.print("------- Venda efetuada com Sucesso -------");
				System.out.print("\n------------------------------------------\n\n");
     			}
     			
     		 conexao.desconectar(conn);
     		 
		     } catch (ClassNotFoundException e) {
		  		 e.printStackTrace();
		  		}
}
	
public static void mostrarEstoque(Conexao conexao,Connection conn, BD bd) {
	ArrayList<Produto> lista = new ArrayList<Produto>();
	System.out.print("\n-------------- Estoque  ------------------\n\n");

	try {
		conn = conexao.conectar();
    	String campo = " produto.id,produto.codigo,produto.nome,produto.percentual,produto.quantidade,item_compra.preco,categoria.id as catID, categoria.categoria as cat ";
    	String tabela = "item_compra";
    	lista.addAll(bd.listaProduto(conn,campo,tabela));
    	mostrarProduto(lista,1);	
		conexao.desconectar(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void fecharCaixa() {
		System.out.print("\n------------------------------------------\n");
		System.out.print("------------ Fechando Caixa --------------");
		System.out.print("\n------------------------------------------\n\n");
		}
	
	
	public static void gerarRelatorioDia(Conexao conexao,Connection conn, BD bd) {
		float lucroTotal = 0;
		float despesaTotal= 0 ;
		System.out.print("---------- Relatorio do Dia --------------\n\n");
		
		try {
			Date data = new Date(System.currentTimeMillis()); 
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			conn = conexao.conectar();
			
			String tabela = " venda \r\n"
					+ "INNER JOIN item_venda \r\n"
					+ "ON item_venda.venda_id = venda.id " ;
			String campo = " venda.id,venda.data,venda.codigo,item_venda.tipo_despesa,item_venda.venda_id ";
			String chave = " venda.data LIKE '"+formatter.format(data).toString()+"%' GROUP BY venda.id";
			ArrayList<Despesa> lista = bd.selecionaIds(conn, tabela,campo, chave);
			if(lista.size()<0) {
				System.out.print("---- Não foram efetuadas Vendas Hoje -----");

			}
			else {
				System.out.print("-------------- Vendas --------------------\n");

				for (Despesa despesa : lista) {
					campo = " produto.id,produto.codigo,produto.nome,produto.percentual,produto.quantidade,item_venda.preco,categoria.id as catID, categoria.categoria as cat ";
			    	tabela = " item_venda ";
			    	chave = "item_venda.venda_id="+despesa.getId();
			    	despesa.setLista(bd.listaProdutoDespesa(conn, campo, tabela, chave));
			    	System.out.print("\nData : " + despesa.getData()+"\n\n");
			    	mostrarProduto(despesa.getLista(),despesa.getTipoDespesa());
			    	for (Produto prodAtual :despesa.getLista()) {
			    		float pr = 0.00f;
			    		if(despesa.getTipoDespesa() == 0) {
			    			pr= prodAtual.getPreco()*prodAtual.getQuantidade();
			    		    despesa.setPrecoTotal(despesa.getPrecoTotal()+pr);
			    		}else {
			    			pr = prodAtual.getPreco() + (prodAtual.getPreco()*prodAtual.getPercentual());
			    		    pr*=prodAtual.getQuantidade();
			    		    despesa.setPrecoTotal(despesa.getPrecoTotal()+pr);

			    		}
			    		   
			    		    
			    	 }
			    	
			    	
			    	
			    	
			    	
			    	
					lucroTotal = despesa.getPrecoTotal();

				}
				
				
				
			}
			
	tabela = " compra \r\n"
					+ "INNER JOIN item_compra \r\n"
					+ "ON item_compra.compra_id = compra.id " ;
	campo = " compra.id,compra.data,compra.codigo,item_compra.tipo_despesa,item_compra.compra_id ";
	chave = " compra.data LIKE '"+formatter.format(data).toString()+"%' GROUP BY compra.id";
	lista = bd.selecionaIds(conn, tabela,campo, chave);
	if(lista.size()<0) {
		System.out.print("---- Não foram efetuadas Compras Hoje -----");

	}
	else {
		System.out.print("-------------- Compras --------------------\n");

		for (Despesa d : lista) {
			campo = " produto.id,produto.codigo,produto.nome,produto.percentual,produto.quantidade,item_compra.preco,categoria.id as catID, categoria.categoria as cat ";
		    tabela = " item_compra ";
			 chave = "item_compra.compra_id="+d.getId();
			 d.setLista(bd.listaProdutoDespesa(conn, campo, tabela, chave));
			  System.out.print("\nData : " + d.getData()+"\n\n");
			  mostrarProduto(d.getLista(),d.getTipoDespesa());
			   for (Produto prodAtual :d.getLista()) {
				   float pr = 0.00f;
			    	if(d.getTipoDespesa() == 0) {
			    		pr= prodAtual.getPreco()*prodAtual.getQuantidade();
			    		 d.setPrecoTotal(d.getPrecoTotal()+pr);
			    	}else {
			    		pr = prodAtual.getPreco() + (prodAtual.getPreco()*prodAtual.getPercentual());
			    		pr*=prodAtual.getQuantidade();
			    		 d.setPrecoTotal(d.getPrecoTotal()+pr);

			    	}
			    		   
			    		    
			 }
	    	
	    	
	    	
			despesaTotal = d.getPrecoTotal();

		}
		System.out.print("Lucro = " + lucroTotal+"\n");
		System.out.print("Despesa = " + despesaTotal+"\n");
		System.out.print("Total = "+(lucroTotal-despesaTotal));
	}
	
			
			conexao.desconectar(conn);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		
	}
}
