
public class Reta {
	
  private Ponto p1;
  private Ponto p2;	
	
  public Reta() {}
  public Reta(Ponto p1){
	  this.p1 = p1;
  }
  
  public Reta(Ponto p1,Ponto p2){
	  this.p1 = p1;
	  this.p2 = p2;
  }
 

  

public void setP1(Ponto p1) {
	this.p1 = p1;
}


public void setP2(Ponto p2) {
	this.p2 = p2;
}
public String verificarPonto() {
	
	String msg = "É possível construir uma reta";
	
	if((p1.getX() == p2.getX())&&(p2.getY() == p1.getY() )) {
		msg = "Não é possivel construir uma reta";
	}
	
	return msg;
}
	
	
	
	

}
