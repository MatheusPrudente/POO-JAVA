
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
		System.out.print("Ve�culo automotor destinado ao transporte de carga,\ncom carro�aria, e peso bruto total superior a 3500 Kg.");
		super.informacao();
	}
	
}