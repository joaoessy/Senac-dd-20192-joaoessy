package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField txtnome;
	private JTextField txtsobrenome;
	private JTextField txtcpf;
	private JTextField txtPais;
	private JTextField txtDDD;
	private JTextField txtnumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela window = new PrimeiraTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 556, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("nome");
		lblNome.setBounds(10, 32, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblSobrenome = new JLabel("sobrenome");
		lblSobrenome.setBounds(10, 76, 58, 14);
		frame.getContentPane().add(lblSobrenome);
		
		JLabel lblCpf = new JLabel("cpf");
		lblCpf.setBounds(10, 121, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JComboBox cboxendereco = new JComboBox();
		cboxendereco.setBounds(250, 29, 199, 20);
		frame.getContentPane().add(cboxendereco);
		
		JLabel lblTelefone = new JLabel("telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setFont(new Font("Vivaldi", Font.PLAIN, 42));
		lblTelefone.setBounds(10, 157, 520, 51);
		frame.getContentPane().add(lblTelefone);
		
		JLabel lblPais = new JLabel("pais");
		lblPais.setBounds(10, 236, 46, 14);
		frame.getContentPane().add(lblPais);
		
		JLabel lblDdd = new JLabel("DDD");
		lblDdd.setBounds(10, 274, 46, 14);
		frame.getContentPane().add(lblDdd);
		
		JLabel lblNumero = new JLabel("numero");
		lblNumero.setBounds(10, 310, 46, 14);
		frame.getContentPane().add(lblNumero);
		
		JComboBox cboxTipo = new JComboBox();
		cboxTipo.setBounds(216, 233, 199, 20);
		frame.getContentPane().add(cboxTipo);
		
		txtnome = new JTextField();
		txtnome.setBounds(66, 29, 140, 20);
		frame.getContentPane().add(txtnome);
		txtnome.setColumns(10);
		
		txtsobrenome = new JTextField();
		txtsobrenome.setBounds(66, 73, 140, 20);
		frame.getContentPane().add(txtsobrenome);
		txtsobrenome.setColumns(10);
		
		txtcpf = new JTextField();
		txtcpf.setBounds(66, 118, 140, 20);
		frame.getContentPane().add(txtcpf);
		txtcpf.setColumns(10);
		
		txtPais = new JTextField();
		txtPais.setBounds(66, 233, 124, 20);
		frame.getContentPane().add(txtPais);
		txtPais.setColumns(10);
		
		txtDDD = new JTextField();
		txtDDD.setBounds(66, 271, 124, 20);
		frame.getContentPane().add(txtDDD);
		txtDDD.setColumns(10);
		
		txtnumero = new JTextField();
		txtnumero.setBounds(66, 307, 124, 20);
		frame.getContentPane().add(txtnumero);
		txtnumero.setColumns(10);
	}
}
