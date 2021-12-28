/*O sistema de nota de uma instituição atribui 
 * notas aos alunos através de conceito. 
 * Sabendo das faixas associadas 
 * a cada conceito (informadas abaixo), 
 * faça um um programa em Java que  leia 3 notas de três alunos,
 *  calcule a média e informe a qual conceito a 
 *  média está relacionada para cada um dos alunos. 

Nota                     Conceito 

>= 9.0                           A 

>= 7.5 e < 9.0             B 

>= 6.0 e < 7.5             C 

>= 4.0 e < 6.0             D 

< 4.0                              E*/

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		float media = 0;
		String conc;
		
		while(cont < 3) {
			Aluno aluno = new Aluno();			
			aluno.setNome(JOptionPane.showInputDialog("Informe o nome do aluno : "));

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota : "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota : "));
			float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota : "));
			
			media = (nota1 + nota2 + nota3)/3;
			
			aluno.setNota1(nota1);
			aluno.setNota2(nota2);
			aluno.setNota3(nota3);
			
			if (media >= 9) {
				conc = "A";
			}
				else if (9>media && media > 7.5) {
					conc = "B";
				}
				else if (7.5>media && media >6) {
					conc = "C";
				}
				else if (6>media && media >=4) {
					conc = "D";
				}
			else {
				conc = "E";
			}
			
			aluno.setConceito(conc);
			
			JOptionPane.showMessageDialog(null, "ALUNO\n\n\tNome : "+aluno.getNome()
					+ "\nNota 1 : "+aluno.getNota1()
					+ "\nNota 2 : "+aluno.getNota2()
					+ "\nNota 3 : "+aluno.getNota3()
					+ "\nMedia : " + media
					+ "\nConceito : "+aluno.getConceito());
			
			cont++;
		}

	}

}
