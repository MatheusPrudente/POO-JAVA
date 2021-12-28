import java.io.Serializable;

public class Fornecedor  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3708846015569498305L;
	private int id;
	private String cnpj;
	private String nome;
	
	public Fornecedor() {
		// TODO Auto-generated constructor stub
		
	}

	
	public Fornecedor(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
