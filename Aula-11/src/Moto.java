
public class Moto extends Veiculo {
	int veloMax;
	
	

	public int getVeloMax() {
		return veloMax;
	}



	public void setVeloMax(int veloMax) {
		this.veloMax = veloMax;
	}



	@Override
	public void informacao() {
		// TODO Auto-generated method stub
		System.out.print("Ve�culo automotor de duas rodas, com ou sem side-car,\n"
				+ "dirigido em posi��o montada.");
		super.informacao();
	}
}
