
public class Automovel extends Veiculo {
	
    String numLugar;
	

	public String getNumLugar() {
		return numLugar;
	}


	public void setNumLugar(String numLugar) {
		this.numLugar = numLugar;
	}

	@Override
	public void informacao() {
		// TODO Auto-generated method stub
		System.out.print("Ve�culo automotor destinado ao transporte de passageiros,\ncom capacidade para at� oito pessoas, exclusive o condutor.");

		super.informacao();
	}
	


}
