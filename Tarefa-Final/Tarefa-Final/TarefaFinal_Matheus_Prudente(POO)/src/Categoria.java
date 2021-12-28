import java.io.Serializable;

public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4596763807014978796L;
	private int id;
	private String nome;
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	
	public Categoria(int id, String nome) {
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
