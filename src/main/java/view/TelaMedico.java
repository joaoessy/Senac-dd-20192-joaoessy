package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;

public class TelaMedico {

	private JFrame frame;
	private JTextField dateTime;
	private JTable tableRemedios;
	private JTextField observacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMedico window = new TelaMedico();
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
	public TelaMedico() {
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
		
		JLabel lblNomemedico = new JLabel("nomeMedico");
		lblNomemedico.setBounds(20, 11, 84, 14);
		frame.getContentPane().add(lblNomemedico);
		
		JComboBox IdosoSelect = new JComboBox();
		IdosoSelect.setBounds(20, 53, 84, 20);
		frame.getContentPane().add(IdosoSelect);
		
		dateTime = new JTextField();
		dateTime.setBounds(18, 200, 86, 20);
		frame.getContentPane().add(dateTime);
		dateTime.setColumns(10);
		
		tableRemedios = new JTable();
		tableRemedios.setBounds(160, 133, 248, -108);
		frame.getContentPane().add(tableRemedios);
		
		JComboBox RemedioSelect = new JComboBox();
		RemedioSelect.setBounds(20, 133, 84, 20);
		frame.getContentPane().add(RemedioSelect);
		
		observacao = new JTextField();
		observacao.setBounds(150, 133, 257, 87);
		frame.getContentPane().add(observacao);
		observacao.setColumns(10);
	}
}
