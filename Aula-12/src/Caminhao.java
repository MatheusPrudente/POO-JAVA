
public class Caminhao extends Veiculo {
	
	String cargaMax;
	
	public String getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(String cargaMax) {
		this.cargaMax = cargaMax;
	}
	@Override
	public void informacao() {
		// TODO Auto-generated method stub
		System.out.print("Veículo automotor destinado ao transporte de carga,\ncom carroçaria, e peso bruto total superior a 3500 Kg.");
		super.informacao();
	}
	
}