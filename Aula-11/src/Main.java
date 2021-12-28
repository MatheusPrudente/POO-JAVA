import java.util.Scanner;

/*Monte um sistema (em modo gr�fico ou n�o) 
 *que permita cadastrar ve�culos, divididos nas seguintes categorias, 
 *autom�veis, caminh�es e motos.

Utilize o conceito de heran�a e polimorfismo ao programar o sistema.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int op;
		System.out.println("--------- Cadastro de ve�culos --------");
		
		do {
		System.out.println("Informe o tipo do ve�culo :");
		System.out.println("1 - Autom�vel");
		System.out.println("2 - Caminh�o");
		System.out.println("3 - Moto ");
		System.out.println("4 - Fechar");
		System.out.println("Op��o : ");
		 op = s.nextInt();
		}while(op > 4 || op <1);

		String ano;
		String marca;
		String modelo;
		String placa;
		String cor;
		String cidade;
		int numLugar;
		int veloMax;
		int cargaMax;
		
		switch(op) {
		case 1 : 
			
			Automovel a  = new Automovel();
		
			System.out.print("\n\nSobre o autom�vel :\n");

			
			System.out.println("Informe o ano : ");
			ano = s.next();
			System.out.println("Informe a marca : ");
			marca = s.next();
			System.out.println("Informe o modelo :");
			modelo = s.next();
			System.out.println("Informe a placa :");
			placa = s.next();
			System.out.println("Informe a cor :");
			cor = s.next();
			System.out.println("Informe a cidade :");
			cidade = s.next();
			System.out.println("Informe o numero de lugares :");
			numLugar = s.nextInt();
			
			a.setAno(ano);
			a.setCidade(marca);
			a.setCor(cor);
			a.setMarca(marca);
			a.setModelo(modelo);
			a.setPlaca(placa);
			a.setCidade(cidade);
			a.setNumLugar(numLugar);
			
			System.out.print("\n ------------ Autom�vel Cadastrado ----------------\n");
			System.out.println("Ano :"+a.getAno()+"\nMarca : "+a.getMarca()+"\nModelo : "
			+a.getModelo()+"\nPlaca"+a.getPlaca()+"\nCor : "+ a.getCor() + "\nCidade : " + a.getCidade());

			System.out.print("\n\nSegundo o Detran um automovel � : \n");
			a.informacao();
			break;
		case 2 : 
			
			Caminhao c  = new Caminhao();
			System.out.print("\n\nSobre o caminh�o :\n");

			System.out.println("Informe o ano : ");
			ano = s.next();
			System.out.println("Informe a marca : ");
			marca = s.next();
			System.out.println("Informe o modelo :");
			modelo = s.next();
			System.out.println("Informe a placa :");
			placa = s.next();
			System.out.println("Informe a cor :");
			cor = s.next();
			System.out.println("Informe a cidade :");
			cidade = s.next();
			System.out.println("Informe a carga maxima :");
			cargaMax = s.nextInt();
			
			
			c.setAno(ano);
			c.setCidade(marca);
			c.setCor(cor);
			c.setMarca(marca);
			c.setModelo(modelo);
			c.setPlaca(placa);
			c.setCidade(cidade);
			c.setCargaMax(cargaMax);
			
			System.out.print("\n ------  Caminh�o cadastrado ----------\n");
			System.out.println("Ano :"+c.getAno()+"\nMarca : "+c.getMarca()+"\nModelo : "
			+c.getModelo()+"\nPlaca"+c.getPlaca()+"\nCor : "+c.getCor() + "\nCidade : " + c.getCidade());

			
			
			System.out.println("\n\nSegundo o Detran um caminh�o � : ");
			c.informacao();
			break;
		case 3:
			
			
			Moto m = new Moto();
			System.out.print("\nSobre a moto :\n");

			System.out.println("Informe o ano : ");
			ano = s.next();
			System.out.println("Informe a marca : ");
			marca = s.next();
			System.out.println("Informe o modelo :");
			modelo = s.next();
			System.out.println("Informe a placa :");
			placa = s.next();
			System.out.println("Informe a cor :");
			cor = s.next();
			System.out.println("Informe a cidade :");
			cidade = s.next();
			System.out.println("Informe a velocidade maxima:");
			veloMax = s.nextInt();
			
			m.setAno(ano);
			m.setCidade(marca);
			m.setCor(cor);
			m.setMarca(marca);
			m.setModelo(modelo);
			m.setPlaca(placa);
			m.setCidade(cidade);
			m.setVeloMax(veloMax);
			
			System.out.print("\n------ Moto Cadastrada --------\n");
			System.out.println("Ano :"+m.getAno()+"\nMarca : "+m.getMarca()+"\nModelo : "
			+m.getModelo()+"\nPlaca"+m.getPlaca()+"\nCor : "+ m.getCor() + "\nCidade : " + m.getCidade());

		
			System.out.println("\n\nSegundo o Detran uma moto � : ");
			m.informacao();
			break;
			default:
				System.exit(0);
		}
		
		
		
		
	}

}
