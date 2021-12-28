import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Color;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private ArrayList <String> dadoUsuario = new ArrayList<String>();
	private ArrayList <String> dadoCodigo = new ArrayList<String>();
	private JList listaUsuario = new JList();
	


	private JTextField txtCodigoExcluir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Cadastro de Usu\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 250);
		contentPane.add(tabbedPane);
		
		JPanel cad = new JPanel();
		cad.setBorder(null);
		tabbedPane.addTab("Cadastro", null, cad, null);
		cad.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(62, 46, 46, 14);
		cad.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(62, 71, 46, 14);
		cad.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(62, 96, 62, 14);
		cad.add(lblNewLabel_2);
		
	 
		 
		JLabel lblNewLabel_3 = new JLabel( dadoUsuario.size() + " Usuários Cadastrados");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(145, 123, 139, 14);
		cad.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("0 Usu\u00E1rios Cadastrados");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(258, 132, 139, 14);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(134, 43, 150, 20);
		cad.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(134, 68, 150, 20);
		cad.add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(134, 92, 150, 20);
		cad.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valor = txtCodigo.getText();
				dadoCodigo.add(valor);
				valor = txtCodigo.getText() + "     " + txtNome.getText() + "      "+txtTelefone.getText();
			
				dadoUsuario.add(valor);
				listaUsuario.setListData(dadoUsuario.toArray());
				
			   	lblNewLabel_3.setText( dadoUsuario.size() + " Usuários Cadastrados");
			   	lblNewLabel_3_1.setText( dadoUsuario.size() + " Usuários Cadastrados");

			}
		});
		btnSalvar.setBounds(62, 164, 89, 23);
		cad.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCodigo.setText("");
				txtNome.setText("");
				txtTelefone.setText("");
			}
		});
		btnLimpar.setBounds(171, 164, 89, 23);
		cad.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        dispose();
		        System.exit(0); 
			}
		});
		btnSair.setBounds(280, 164, 89, 23);
		cad.add(btnSair);
		
		JPanel lista = new JPanel();
		lista.setBorder(null);
		tabbedPane.addTab("Lista", null, lista, null);
		lista.setLayout(null);
		
		JButton btnNewButton = new JButton("Excluir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String codigo = txtCodigoExcluir.getText();

				for(int i = 0; i < dadoCodigo.size(); i++) {

					if(dadoCodigo.get(i).equals(codigo)) {
						
						dadoCodigo.remove(i);
						dadoUsuario.remove(i);
						listaUsuario.setListData(dadoUsuario.toArray());

						
					   	lblNewLabel_3.setText( dadoUsuario.size() + " Usuários Cadastrados");
					   	lblNewLabel_3_1.setText( dadoUsuario.size() + " Usuários Cadastrados");
					   	break;
					}
					
				}
				
			}
		});
		btnNewButton.setBounds(248, 98, 139, 23);
		lista.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("C\u00F3digo");
		lblNewLabel_4.setBounds(257, 70, 46, 14);
		lista.add(lblNewLabel_4);
		
		txtCodigoExcluir = new JTextField();
		txtCodigoExcluir.setBounds(301, 67, 86, 20);
		lista.add(txtCodigoExcluir);
		txtCodigoExcluir.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Apagar Usu\u00E1rio");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(275, 27, 86, 32);
		lista.add(lblNewLabel_5);
		lista.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 32, 228, 179);
		lista.add(scrollPane);
		
		scrollPane.setViewportView(listaUsuario);
		
		JLabel lblNewLabel_6 = new JLabel("C\u00F3digo");
		lblNewLabel_6.setBounds(10, 11, 46, 14);
		lista.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Nome");
		lblNewLabel_7.setBounds(87, 11, 46, 14);
		lista.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Telefone\r\n");
		lblNewLabel_8.setBounds(159, 11, 65, 14);
		lista.add(lblNewLabel_8);
		
		
		
	}
}
