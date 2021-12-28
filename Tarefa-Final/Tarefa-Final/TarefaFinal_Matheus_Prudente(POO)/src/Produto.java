import java.io.Serializable;

public class Produto implements Serializable{


	private static final long serialVersionUID = 199400173418907704L;
	private int id;
	private int codigo;
	private String nome;
	private float preco;
    private float percentual;
    private int quantidade;
    private Categoria categoria;
  
   
	public Produto() {
		// TODO Auto-generated constructor stub
		
	
	}
	
	public Produto(int id,int codigo, String nome, float preco, float percentual, int quantidade, Categoria categoria) {
		super();

		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.percentual = percentual;
		this.quantidade = quantidade;
		this.categoria = categoria;

	}

	public Produto(int codigo, String nome, float preco, float percentual, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.percentual = percentual;
		this.quantidade = quantidade;
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getPreco() {
		return preco;

	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	
	

}
