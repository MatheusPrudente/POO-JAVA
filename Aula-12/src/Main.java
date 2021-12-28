import java.util.ArrayList;
import java.util.Scanner;

/*Reutilize o programa feito na atividade da aula 11 
 * e insira um ArrayList para armazenar todos os objetos que foram cadastrados no sistema.
Lembre-se, um ArrayList armazenada dados de um único tipo de dado, sendo assim, dados diferentes,
 devem ser armazenados em ArrayList diferentes.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int op;
		Automovel a;
		Caminhao c;
		Moto m;

		
	    ArrayList<Automovel> listaAutomovel = new ArrayList<Automovel>();

	    a  = new Automovel();
        a.setAno("2001");
        a.setCidade("Sorocaba");
        a.setCor("Preto");
        a.setMarca("Chevolet");
        a.setModelo("Cruze");
        a.setPlaca("ajf1293");
        a.setNumLugar("5");
	    
        listaAutomovel.add(a);
	    
	    ArrayList<Caminhao> listaCaminhao = new ArrayList<Caminhao>();

	    c  = new Caminhao();
        c.setAno("2013");
        c.setCidade("Curitiba");
        c.setCor("Branco");
        c.setMarca("Volkswagen");
        c.setModelo("5150 ");
        c.setPlaca("akfj232");
        c.setCargaMax("1202");
	    
        listaCaminhao.add(c);   
        
        ArrayList<Moto> listaMoto = new ArrayList<Moto>();

	    m  = new Moto();
        m.setAno("2007");
        m.setCidade("Curitiba");
        m.setCor("Vermelha");
        m.setMarca("Honda");
        m.setModelo("CG 160 Start");
        m.setPlaca("khhe3031");
        m.setVeloMax("120");
	    
        listaMoto.add(m);  
        
        boolean e = true;
	    
        while(e) {
			
			System.out.println("\n--------- Menu --------\n");
			System.out.println(" 1 - Visualizar dados cadastrados");
			System.out.println(" 2 - Cadastrar novos veículos");
			System.out.println(" 3 - Sair\n");
			System.out.print("\nOpção : ");
			op = s.nextInt();
			 
			 if(op == 1) {
					int tam;
					
					System.out.println("\n--------- Dados Cadastrados --------\n");
					System.out.println("  --- Informe o tipo do veículo : --- \n");
					System.out.println(" 1 - Automóvel");
					System.out.println(" 2 - Caminhão");
					System.out.println(" 3 - Moto ");
					System.out.println(" 4 - Sair ");
					System.out.print("\nOpção : ");
					
					op = s.nextInt();
					
					
					if (op == 1) {
						System.out.print("\n ------- Automóveis Cadastrados ---------\n");

						a  = new Automovel();
						for(tam= 0; tam < listaAutomovel.size();tam++) {
							a = listaAutomovel.get(tam);
							System.out.print("\n Automóvel"+ " ["+(tam+1)+"] :" + "\n");
							System.out.println("\n Ano :"+a.getAno()+"\n Marca : "+a.getMarca()+"\n Modelo : "
							+a.getModelo()+"\n Placa : "+a.getPlaca()+"\n Cor : "+ a.getCor() + "\n Cidade : " + 
									a.getCidade() + "\n Numero de Lugares :" + a.getNumLugar());
					
						
						}
						
						System.out.print("\n\n --- Deseja voltar ao menu ? ---\n");
						System.out.println("\n 1 - Sim");
						System.out.println(" 2 - Não");
						System.out.print("\nOpção : ");
	                    op = s.nextInt();
						System.out.print("\n\n\n");

	                    if (op == 2) {
	                    	e = false;
	                    }
						
					}
					
					else if(op == 2) {
						System.out.print("\n ------- Caminhões Cadastrados ---------\n");

						c = new Caminhao();
						for(tam= 0; tam < listaCaminhao.size();tam++) {
							c = listaCaminhao.get(tam);
							System.out.print("\n Caminhão "+ " ["+(tam+1)+"] :" + "\n");
							System.out.println(" Ano :"+c.getAno()+"\n Marca : "+c.getMarca()+"\n Modelo : "
									+c.getModelo()+"\n Placa : "+c.getPlaca()+"\n Cor : "+c.getCor() + "\n Cidade : " 
									+ c.getCidade()+"\n Carga Maxima : " + c.getCargaMax()+ " Kg\n");

						
						}
						
						System.out.print("\n\n --- Deseja voltar ao menu ? ---\n");
						System.out.println("\n 1 - Sim");
						System.out.println(" 2 - Não");
						System.out.print("\nOpção : ");
	                    op = s.nextInt();
						System.out.print("\n\n\n");

	                    if (op == 2) {
	                    	e = false;
	                    }
						
					}
					else if(op == 3) {
						System.out.print("\n ------- Motos Cadastradas ---------\n");

						m = new Moto();
						for(tam= 0; tam < listaMoto.size();tam++) {
							m = listaMoto.get(tam);
							System.out.print("\n Moto "+ " ["+(tam+1)+"] :" + "\n");
							System.out.println(" Ano :"+m.getAno()+"\n Marca : "+m.getMarca()+"\n Modelo : "
									+m.getModelo()+"\n Placa"+m.getPlaca()+"\n Cor : "+ m.getCor() + "\n Cidade : " 
											+ m.getCidade()+"\n Velocidade Maxima : " + m.getVeloMax() + "  km/h\n" );

						
						}
						
						System.out.print("\n\n --- Deseja voltar ao menu ? ---\n");
						System.out.println("\n 1 - Sim");
						System.out.println(" 2 - Não");
						System.out.print("\nOpção : ");
	                    op = s.nextInt();
						System.out.print("\n\n\n");

	                    if (op == 2) {
	                    	e = false;
	                    }
					}
					else {
	                    	e = false;
	               }
			 }
			 else if (op == 2 ) {
				 
				String ano;
				String marca;
				String modelo;
				String placa;
				String cor;
				String cidade;
				String numLugar;
				String veloMax;
				String cargaMax;
				
				 System.out.println("\n--------- Cadastro de veículos --------");
					
				
						
					System.out.println(" --- Informe o tipo do veículo : ---\n");
					System.out.println(" 1 - Automóvel");
					System.out.println(" 2 - Caminhão");
					System.out.println(" 3 - Moto ");
					System.out.println(" 4 - Sair ");
					System.out.print("\nOpção : ");
					op = s.nextInt();
					 
				
					
					
					
					if (op == 1) {
						a  = new Automovel();
						   
						System.out.print("\n\n --- Sobre o automóvel : ---\n");
			
						
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
						numLugar = s.next();
						
						a.setAno(ano);
						a.setCidade(marca);
						a.setCor(cor);
						a.setMarca(marca);
						a.setModelo(modelo);
						a.setPlaca(placa);
						a.setCidade(cidade);
						a.setNumLugar(numLugar);
						listaAutomovel.add(a);

						System.out.print("\n -------- Automóvel cadastrado -------- \n");
						System.out.println("\nAno :"+a.getAno()+"\nMarca : "+a.getMarca()+"\nModelo : "
						+a.getModelo()+"\nPlaca : "+a.getPlaca()+"\nCor : "+ a.getCor() + "\nCidade : "
								+ a.getCidade() + "\nNumero de Lugares :" + a.getNumLugar());
			
						System.out.print("\n\nSegundo o Detran um automovel é : \n");
						a.informacao();
						
						System.out.print("\n\nDeseja voltar ao menu ? \n");
						System.out.println(" 1 - Sim");
						System.out.println(" 2 - Não");
						System.out.print("\nOpção : ");
	                    op = s.nextInt();
						System.out.print("\n\n\n");

					}
					
					else if(op == 2) {
						
						c  = new Caminhao();
						System.out.print("\n\n --- Sobre o caminhão : --- \n");

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
						cargaMax = s.next();
						
						
						c.setAno(ano);
						c.setCidade(marca);
						c.setCor(cor);
						c.setMarca(marca);
						c.setModelo(modelo);
						c.setPlaca(placa);
						c.setCidade(cidade);
						c.setCargaMax(cargaMax);
				        listaCaminhao.add(c);   

						System.out.print("\n ------  Caminhão cadastrado ----------\n");
						System.out.println(" Ano :"+c.getAno()+"\n Marca : "+c.getMarca()+"\n Modelo : "
								+c.getModelo()+"\n Placa : "+c.getPlaca()+"\n Cor : "+c.getCor() + "\n Cidade : " 
								+ c.getCidade()+"\n Carga Maxima : " + c.getCargaMax() + " Kg");
						
						System.out.println("\n\nSegundo o Detran um caminhão é : ");
						c.informacao();
						System.out.print("\n\n\n");

					}
					else if(op == 3) {
						
						m = new Moto();
						System.out.print("\n --- Sobre a moto : --- \n");

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
						veloMax = s.next();
					
						m.setAno(ano);
						m.setCidade(marca);
						m.setCor(cor);
						m.setMarca(marca);
						m.setModelo(modelo);
						m.setPlaca(placa);
						m.setCidade(cidade);
						m.setVeloMax(veloMax);
				        listaMoto.add(m);   

						System.out.print("\n------ Moto Cadastrada --------\n");
						System.out.println(" Ano :"+m.getAno()+"\n Marca : "+m.getMarca()+"\n Modelo : "
						+m.getModelo()+"\n Placa"+m.getPlaca()+"\n Cor : "+ m.getCor() + "\n Cidade : " 
								+ m.getCidade()+"\nVelocidade Maxima : " + m.getVeloMax() + "  km/h" );

					
						System.out.println("\n\nSegundo o Detran uma moto é : ");
						m.informacao();
						System.out.print("\n\n\n");
						
						
					}
					
					 else {
						 e = false;
					 }
		  
					
			 }
			 
			 else {
				 e = false;
			 }
  
        }
	}

}
