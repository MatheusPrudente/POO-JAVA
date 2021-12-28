
public class Triangulo {
	
	  private Ponto p1;
	  private Ponto p2;	
	  private Ponto p3;
	  
	  public Triangulo() {};
	  
	  public Triangulo(Ponto p1) {
		  this.p1 = p1;
	  };
	
	  public Triangulo(Ponto p1,Ponto p2) {
		  this.p1 = p1;
		  this.p2  = p2;
	  };
	  
	  public Triangulo(Ponto p1,Ponto p2,Ponto p3) {
		  this.p1 = p1;
		  this.p2  = p2;
		  this.p3 = p3;
	  }

	
	public void setP1(Ponto p1) {
		this.p1 = p1;
	}

	
	public void setP2(Ponto p2) {
		this.p2 = p2;
	}

	public void setP3(Ponto p3) {
		this.p3 = p3;
	};
	
	
	
	public String verificarPonto() {
		String msg = "� poss�vel construir um tri�ngulo";
		
		if(((p1.getX() == p2.getX()) && (p1.getY() == p2.getY())) ||
				((p2.getX() == p3.getX()) && (p2.getY() == p3.getY())) ||
				((p1.getX() == p3.getX()) && (p1.getY() == p3.getY()))) {
			msg = "N�o � poss�vel construir um tri�ngulo";
		}
		
		else if ((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()) &&
				(p1.getX() == p3.getX()) && (p1.getY() == p3.getY())) {
			msg = "N�o � poss�vel construir um tri�ngulo";
		}
		
		else if ((p1.getX() == p2.getX()) && (p1.getX() == p3.getX())) {
			msg = "N�o � poss�vel construir um tri�ngulo";
		}
		
		else if ((p1.getY() == p2.getY()) && (p1.getY() == p3.getY())) {
			msg = "N�o � poss�vel construir um tri�ngulo";
		}
		return msg;
		
		
	}
}
