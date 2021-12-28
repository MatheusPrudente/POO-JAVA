import java.util.Scanner;

/*Por definição,  dado uma janela com tamanho 100x100, ou seja,  100 de altura e 100 de comprimento. Desenvolva um programa que permita escolher os seguintes tipos de objetos: linha, quadrado, triangulo. 
Para o caso da linha, a mesma precisa de duas coordenadas (x,y) para ser construída, 
já o quadrado, precisa de 4 coordenadas x e y, 
e  o triângulo 3 coordenadas.
O programa deve ter classes separadas, e neste momento não precisa mostrar as linhas,
 mas somente validar se as distâncias estão corretas. 
 Por exemplo, no caso de uma linha, as duas coordenadas não pode estar sobrepostas,
  caso contrário não forma uma linha. Da mesma forma o quadrado. 
O usuário deverá escolher o tipo geométrico, inserir as coordenadas e
 o sistema deverá informar se o objeto pode ser construído ou não.
Utilize os conceitos empregados no exemplo apresentado para desenvolver os seu programa.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o numero da opção escolhida");
		System.out.println("1 - Reta");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Triângulo\n");
		System.out.println("Resposta:");

		int resp = scan.nextInt();
		Ponto p1;
	    Ponto p2;
	    Ponto p3;
	    Ponto p4;
	    Ponto p5;
	    Ponto p6;
	    
	    int p1x;
	    int p1y;
	    int p2x;
	    int p2y;
	    int p3x;
	    int p3y;
	    int p4x;
	    int p4y;
	  
	    
		   switch(resp) {
		   

		   case(1): 
			   //Dois pontos distintos determinam uma única reta que passa por eles 

			    p1 = new Ponto();
		        p2 = new Ponto();
		      
			   Reta reta = new Reta();
               
			   do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o primeiro ponto )");
				      p1x =  scan.nextInt();
				       
			   }
			   while(p1x>100 || p1x<0);
		 
			   do {
				      System.out.println("\nInforme uma coordenada Y entre 0 e 100 para o primeiro ponto )");
				      p1y =  scan.nextInt();
				       
			   }
			   while(p1y>100 || p1y<0);

		       
		       p1.setX(p1x);
		       p1.setY(p1y);
		       reta.setP1(p1);
		       
	
		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o segundo ponto )");
				      p2x =  scan.nextInt();
				       
			   }
			   while(p2x>100 || p2x<0);
		 
			   do {
				      System.out.println("\nInforme uma coordenada Y entre 0 e 100 para o segundo ponto )");
				      p2y =  scan.nextInt();
				       
			   }
			   while(p2y>100 || p2y<0);

		       p2.setX(p2x);
		       p2.setY(p2y);
		       reta.setP2(p2);
		       
		       System.out.print(reta.verificarPonto());

		       
		       break;
		   	   
		   case(2):
			   Quadrado quadrado = new Quadrado();
		   
			   p1 = new Ponto();
		       p2 = new Ponto();
		       p3 = new Ponto();
		       p4 = new Ponto();
	          		    
		       
		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o primeiro ponto )");
				      p1x =  scan.nextInt();
				       
			   }
			   while(p1x>100 || p1x<0);
		       
		       
		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o primeiro ponto )");
				      p1y =  scan.nextInt();
				       
			   }
			   while(p1y>100 || p1y<0);
		       
		       
		       p1.setX(p1x);
		       p1.setY(p1y);
		       quadrado.setP1(p1);
		       
		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o segundo ponto )");
				      p2x =  scan.nextInt();
				       
			   }
			   while(p2x>100 || p2x<0);
		       
		       
		       do {
				      System.out.println("\nInforme uma coordenada Y entre 0 e 100 para o segundo ponto )");
				      p2y =  scan.nextInt();
				       
			   }
			   while(p2y>100 || p2y<0);
		       
	
		       p2.setX(p2x);
		       p2.setY(p2y);
		       quadrado.setP2(p2);
		       
		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o terceiro ponto )");
				      p3x =  scan.nextInt();
				       
			   }
			   while(p3x>100 || p3x<0);
		       
		       
		       do {
				      System.out.println("\nInforme uma coordenada Y entre 0 e 100 para o terceiro ponto )");
				      p3y =  scan.nextInt();
				       
			   }
			   while(p3y>100 || p3y<0);
	
		       p3.setX(p3x);
		       p3.setY(p3y);
		       quadrado.setP3(p3);
		       

		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o quarto ponto )");
				      p4x =  scan.nextInt();
				       
			   }
			   while(p4x>100 || p4x<0);
		       
		       do {
				      System.out.println("\nInforme uma coordenada Y entre 0 e 100 para o quarto ponto )");
				      p4y =  scan.nextInt();
				       
			   }
			   while(p4y>100 || p4y<0);
		       
		       p4.setX(p4x);
		       p4.setY(p4y);
		       quadrado.setP4(p4);
		       
		       
		       System.out.print(quadrado.verificarPonto());
	   	       break;
	   	   
		   case(3):  
			   // três pontos quaisquer, não colineares,determinam um triângulo.
			   
			   Triangulo triangulo = new Triangulo();
			   p1 = new Ponto();
		       p2 = new Ponto();
		       p3 = new Ponto();

	        
		      
		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o primeiro ponto )");
				      p1x =  scan.nextInt();
				       
			   }
			   while(p1x>100 || p1x<0);
		       
		       
		       do {
				      System.out.println("\nInforme uma coordenada Y entre 0 e 100 para o primeiro ponto )");
				      p1y =  scan.nextInt();
				       
			   }
			   while(p1y>100 || p1y<0);
		       
		       
		       p1.setX(p1x);
		       p1.setY(p1y);
		       triangulo.setP1(p1);
		       
		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o segundo ponto )");
				      p2x =  scan.nextInt();
				       
			   }
			   while(p2x>100 || p2x<0);
		       
		       
		       do {
				      System.out.println("\nInforme uma coordenada Y entre 0 e 100 para o segundo ponto )");
				      p2y =  scan.nextInt();
				       
			   }
			   while(p2y>100 || p2y<0);
		       
	
		       p2.setX(p2x);
		       p2.setY(p2y);
		       triangulo.setP2(p2);
		       
		       do {
				      System.out.println("\nInforme uma coordenada X entre 0 e 100 para o terceiro ponto )");
				      p3x =  scan.nextInt();
				       
			   }
			   while(p3x>100 || p3x<0);
		       
		       
		       do {
				      System.out.println("\nInforme uma coordenada Y entre 0 e 100 para o terceiro ponto )");
				      p3y =  scan.nextInt();
				       
			   }
			   while(p3y>100 || p3y<0);
	
		       p3.setX(p3x);
		       p3.setY(p3y);
		       triangulo.setP3(p3);
		       
		       System.out.print(triangulo.verificarPonto());

		   
		   break;
		}
	}
}
