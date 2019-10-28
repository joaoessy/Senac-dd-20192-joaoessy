package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaCuidador {

	private JFrame frame;
	private JTable table;
	private JTextField txtDataEHora;
	private JTextField obsevacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCuidador window = new TelaCuidador();
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
	public TelaCuidador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 245, 230, -139);
		frame.getContentPane().add(table);
		
		JLabel nomeCuidador = new JLabel("nomeCuidador");
		nomeCuidador.setBounds(10, 11, 85, 14);
		frame.getContentPane().add(nomeCuidador);
		
		txtDataEHora = new JTextField();
		txtDataEHora.setText("data e hora");
		txtDataEHora.setBounds(10, 36, 86, 20);
		frame.getContentPane().add(txtDataEHora);
		txtDataEHora.setColumns(10);
		
		JComboBox nomeIdoso = new JComboBox();
		nomeIdoso.setBounds(196, 8, 109, 20);
		frame.getContentPane().add(nomeIdoso);
		
		JComboBox nomeRemedio = new JComboBox();
		nomeRemedio.setBounds(315, 8, 109, 20);
		frame.getContentPane().add(nomeRemedio);
		
		obsevacao = new JTextField();
		obsevacao.setText("observa\u00E7\u00E3o");
		obsevacao.setBounds(259, 108, 165, 111);
		frame.getContentPane().add(obsevacao);
		obsevacao.setColumns(10);
		
		JButton btnAplicar = new JButton("aplicar");
		btnAplicar.setBounds(259, 227, 89, 23);
		frame.getContentPane().add(btnAplicar);
		
		JComboBox cbxMedico = new JComboBox();
		cbxMedico.setBounds(105, 8, 81, 20);
		frame.getContentPane().add(cbxMedico);
	}
}
