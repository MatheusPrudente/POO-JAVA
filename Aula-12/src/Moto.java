
public class Moto extends Veiculo {
	
	String veloMax;
	

	public String getVeloMax() {
		return veloMax;
	}


	public void setVeloMax(String veloMax) {
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

