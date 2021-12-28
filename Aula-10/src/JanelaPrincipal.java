import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtModelo;
	private JTextField txtPlaca;
	private JTextField txtAno;
	private JTextField txtCor;
	private JTextField txtNumMotor;
	private JTextField txtMarca;
	private JTextField txtCombustivel;
	private JTextField txtCidade;
	private JLabel lblNewLabel_2_5_1;
	private JTextField txtChassi;
	private JLabel lblNewLabel;
	private JButton btnCancelar;

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
		setTitle("Cadastros de Ve\u00EDculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo :");
		lblNewLabel_2.setBounds(10, 71, 54, 14);
		contentPane.add(lblNewLabel_2);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(62, 68, 140, 20);
		contentPane.add(txtModelo);
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBounds(62, 93, 140, 20);
		contentPane.add(txtPlaca);
		
		JLabel lblNewLabel_2_1 = new JLabel("Placa :");
		lblNewLabel_2_1.setBounds(10, 96, 56, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ano :");
		lblNewLabel_2_2.setBounds(10, 121, 43, 17);
		contentPane.add(lblNewLabel_2_2);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(62, 119, 140, 20);
		contentPane.add(txtAno);
		
		JLabel lblNewLabel_2_3 = new JLabel("Cor:");
		lblNewLabel_2_3.setBounds(10, 147, 54, 17);
		contentPane.add(lblNewLabel_2_3);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(62, 147, 140, 20);
		contentPane.add(txtCor);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setBounds(110, 227, 105, 23);
		contentPane.add(btnCadastrar);
		
		txtNumMotor = new JTextField();
		txtNumMotor.setColumns(10);
		txtNumMotor.setBounds(307, 48, 140, 20);
		contentPane.add(txtNumMotor);
		
		JLabel lblNewLabel_2_4 = new JLabel("N\u00B0 Motor :");
		lblNewLabel_2_4.setBounds(225, 48, 54, 14);
		contentPane.add(lblNewLabel_2_4);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(62, 45, 140, 20);
		contentPane.add(txtMarca);
		
		JLabel lblNewLabel_2_5 = new JLabel("Marca :");
		lblNewLabel_2_5.setBounds(10, 46, 54, 14);
		contentPane.add(lblNewLabel_2_5);
		
		lblNewLabel_2_5_1 = new JLabel("Cidade/UF :");
		lblNewLabel_2_5_1.setBounds(225, 75, 63, 14);
		contentPane.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_6 = new JLabel("Combust\u00EDvel :");
		lblNewLabel_2_6.setBounds(225, 100, 80, 14);
		contentPane.add(lblNewLabel_2_6);
		
		txtCombustivel = new JTextField();
		txtCombustivel.setColumns(10);
		txtCombustivel.setBounds(307, 100, 140, 20);
		contentPane.add(txtCombustivel);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(307, 75, 140, 20);
		contentPane.add(txtCidade);
		
		txtChassi = new JTextField();
		txtChassi.setColumns(10);
		txtChassi.setBounds(62, 174, 140, 20);
		contentPane.add(txtChassi);
		
		JLabel lblNewLabel_2_6_1 = new JLabel("Chassi :");
		lblNewLabel_2_6_1.setBounds(10, 177, 54, 14);
		contentPane.add(lblNewLabel_2_6_1);
		
		lblNewLabel = new JLabel("Informe os dados sobre o ve\u00EDculo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(110, 11, 263, 23);
		contentPane.add(lblNewLabel);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(225, 227, 105, 23);
		contentPane.add(btnCancelar);
		
	}

}
