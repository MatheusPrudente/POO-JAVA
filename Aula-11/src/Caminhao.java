
public class Caminhao extends Veiculo {
	int cargaMax;
	
	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	@Override
	public void informacao() {
		// TODO Auto-generated method stub
		System.out.print("Veículo automotor destinado ao transporte de carga,\ncom carroçaria, e peso bruto total superior a 3500 Kg.");
		super.informacao();
	}
	
	
	
}
