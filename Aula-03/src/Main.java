/*Na aplica��o de hoje, voc�s criaram a classe biblioteca com pelo menos 6 vari�veis de inst�ncia.
Dever�o utilizar a classe JOptionPane para pegar os dados e gravar nas vari�veis;
Ap�s cadastrar os dados, dever� ter uma forma de mostrar todo o conte�do do objeto.
N�o esque�a de utilizar a classe principal para instanciar a classe biblioteca.*/

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Biblioteca biblioteca = new Biblioteca(); 
		biblioteca.setNome(JOptionPane.showInputDialog("Informe o nome da biblioteca:"));
		biblioteca.setTelefone(JOptionPane.showInputDialog("Informe o telefone da biblioteca:"));
		biblioteca.setEndereco(JOptionPane.showInputDialog("Informe o endere�o da biblioteca:"));
		biblioteca.setResponsavel(JOptionPane.showInputDialog("Informe o nome do responsavel pela biblioteca:"));
		
		int qtdlivro = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de livros da biblioteca:"));
		biblioteca.setQtdlivro(qtdlivro);

	
		int qtdvisitante = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de visitantes da biblioteca:"));
		biblioteca.setQtdlivro(qtdlivro);
		
		JOptionPane.showMessageDialog(null, "BIBLIOTECA\n\n\tNome : " 
		+biblioteca.getNome()
		+"\nTelefone : " +biblioteca.getTelefone()
		+"\nEndere�o : "+biblioteca.getEndereco()
		+"\nRespons�vel : " +biblioteca.getResponsavel()
		+"\nQuantidade de livros : "+biblioteca.getQtdlivro()
		+"\nQuantidade de visitantes : "+biblioteca.getQtdvisitante());
		
	}

}
