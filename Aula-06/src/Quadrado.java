
public class Quadrado {
	
	  private Ponto p1;
	  private Ponto p2;	
	  private Ponto p3;
	  private Ponto p4;
	  
	  public Quadrado() {};
	  
	  public Quadrado(Ponto p1) {
		  this.p1 = p1;
	  };
	
	  public Quadrado(Ponto p1,Ponto p2) {
		  this.p1 = p1;
		  this.p2  = p2;
	  };
	  
	  public Quadrado(Ponto p1,Ponto p2,Ponto p3) {
		  this.p1 = p1;
		  this.p2  = p2;
		  this.p3 = p3;
	  }

	  public Quadrado(Ponto p1,Ponto p2,Ponto p3,Ponto p4) {
		  this.p1 = p1;
		  this.p2  = p2;
		  this.p3 = p3;
		  this.p4 = p4;
	  }
	  
	  public String verificarPonto() {
			String msg = "É possível construir um triângulo";
			
			if(((p1.getX() == p2.getX()) && (p1.getY() == p2.getY())) ||
					((p2.getX() == p3.getX()) && (p2.getY() == p3.getY())) ||
					((p1.getX() == p3.getX()) && (p1.getY() == p3.getY())) ||
					((p1.getX() == p4.getX()) && (p1.getY() == p4.getY())) ||
					((p2.getX() == p4.getX()) && (p2.getY() == p4.getY())) ||
					((p3.getX() == p4.getX()) && (p3.getY() == p4.getY())) ) {
				msg = "Não é possível construir um Quadrado";
			}
			
			return msg;
			
			
		}


	public void setP1(Ponto p1) {
		this.p1 = p1;
	}

	public void setP2(Ponto p2) {
		this.p2 = p2;
	}

	public void setP3(Ponto p3) {
		this.p3 = p3;
	}

	public void setP4(Ponto p4) {
		this.p4 = p4;
	}
}
