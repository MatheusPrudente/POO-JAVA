
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
		String msg = "É possível construir um triângulo";
		
		if(((p1.getX() == p2.getX()) && (p1.getY() == p2.getY())) ||
				((p2.getX() == p3.getX()) && (p2.getY() == p3.getY())) ||
				((p1.getX() == p3.getX()) && (p1.getY() == p3.getY()))) {
			msg = "Não é possível construir um triângulo";
		}
		
		else if ((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()) &&
				(p1.getX() == p3.getX()) && (p1.getY() == p3.getY())) {
			msg = "Não é possível construir um triângulo";
		}
		
		else if ((p1.getX() == p2.getX()) && (p1.getX() == p3.getX())) {
			msg = "Não é possível construir um triângulo";
		}
		
		else if ((p1.getY() == p2.getY()) && (p1.getY() == p3.getY())) {
			msg = "Não é possível construir um triângulo";
		}
		return msg;
		
		
	}
}
