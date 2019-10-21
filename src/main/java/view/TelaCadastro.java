package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField txtIdade;
	private JTextField textCpf;
	private JTextField txtNumero;
	private JTextField txtObservacao;
	private JTextField textcredenciais;
	private JTextField textcrm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 54, 46, 14);
		panel.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 77, 46, 14);
		panel.add(lblIdade);
		
		JLabel lblCpf = new JLabel("Cpf");
		lblCpf.setBounds(10, 100, 46, 14);
		panel.add(lblCpf);
		
		JLabel lblNTelefone = new JLabel("N Telefone");
		lblNTelefone.setBounds(10, 122, 66, 14);
		panel.add(lblNTelefone);
		
		JLabel lblCrm = new JLabel("CRM");
		lblCrm.setBounds(257, 51, 46, 14);
		panel.add(lblCrm);
		
		JLabel lblCredenciais = new JLabel("Credenciais");
		lblCredenciais.setBounds(231, 122, 72, 14);
		panel.add(lblCredenciais);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 197, 46, 14);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 115, 20);
		panel.add(comboBox);
		
		comboBox.addItem("Seielcione");
		comboBox.addItem("Medico");
		comboBox.addItem("Cuidador");
		comboBox.addItem("Idoso");
		
		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o");
		lblObservao.setBounds(10, 147, 80, 14);
		panel.add(lblObservao);
		
		textNome = new JTextField();
		textNome.setBounds(66, 51, 165, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(66, 74, 46, 20);
		panel.add(txtIdade);
		txtIdade.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setBounds(76, 97, 99, 20);
		panel.add(textCpf);
		textCpf.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(76, 119, 99, 20);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtObservacao = new JTextField();
		txtObservacao.setBounds(10, 172, 192, 78);
		panel.add(txtObservacao);
		txtObservacao.setColumns(10);
		
		textcredenciais = new JTextField();
		textcredenciais.setBounds(231, 155, 193, 95);
		panel.add(textcredenciais);
		textcredenciais.setColumns(10);
		
		textcrm = new JTextField();
		textcrm.setBounds(290, 51, 115, 20);
		panel.add(textcrm);
		textcrm.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 10, 89, 23);
		panel.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(236, 10, 89, 23);
		panel.add(btnLimpar);
		
	}
	}

