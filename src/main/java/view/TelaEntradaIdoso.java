package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class TelaEntradaIdoso extends JFrame {

	private JPanel contentPane;
	private JTable tableIdoso;
	private JTextField observacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEntradaIdoso frame = new TelaEntradaIdoso();
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
	public TelaEntradaIdoso() {
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
		lblNome.setBounds(10, 11, 307, 14);
		panel.add(lblNome);
		
		JLabel lblMedicoresponsavel = new JLabel("Medicoresponsavel");
		lblMedicoresponsavel.setBounds(264, 48, 160, 14);
		panel.add(lblMedicoresponsavel);
		
		tableIdoso = new JTable();
		tableIdoso.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		tableIdoso.setColumnSelectionAllowed(true);
		tableIdoso.setCellSelectionEnabled(true);
		tableIdoso.setBounds(25, 225, 185, -157);
		panel.add(tableIdoso);
		
		JLabel lblCuidador = new JLabel("Cuidador");
		lblCuidador.setBounds(264, 73, 91, 14);
		panel.add(lblCuidador);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 36, 46, 14);
		panel.add(lblIdade);
		
		JLabel lblObservacao = new JLabel("");
		lblObservacao.setBounds(264, 98, 160, 136);
		panel.add(lblObservacao);
		
		observacao = new JTextField();
		observacao.setBounds(264, 105, 160, 129);
		panel.add(observacao);
		observacao.setColumns(10);
	}
}
