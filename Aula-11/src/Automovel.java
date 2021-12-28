
public class Automovel extends Veiculo {

	int numLugar;
	

	public int getNumLugar() {
		return numLugar;
	}


	public void setNumLugar(int numLugar) {
		this.numLugar = numLugar;
	}


	@Override
	public void informacao() {
		// TODO Auto-generated method stub
		System.out.print("Veículo automotor destinado ao transporte de passageiros,\ncom capacidade para até oito pessoas, exclusive o condutor.");

		super.informacao();
	}
	


}
