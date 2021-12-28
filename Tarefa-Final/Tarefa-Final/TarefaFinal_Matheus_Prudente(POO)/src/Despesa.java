import java.io.Serializable;
import java.util.ArrayList;

public class Despesa implements Serializable {

	private static final long serialVersionUID = 2411432263707392512L;
	protected int id;
	protected int codigo;
	protected String data;
	protected float precoTotal;
	protected int tipoDespesa;
	protected ArrayList<Produto> lista;
	private Fornecedor fornecedor;

	public Despesa() {
		// TODO Auto-generated constructor stub
		this.precoTotal = 0;
		this.tipoDespesa = 0;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}


	public int getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(int tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public ArrayList<Produto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Produto> lista) {
		this.lista = lista;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	

}
