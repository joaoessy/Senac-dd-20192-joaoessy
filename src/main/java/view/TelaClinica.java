package view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaClinica {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaClinica window = new TelaClinica();
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
	public TelaClinica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setBounds(222, 11, 115, 20);
		frame.getContentPane().add(comboBoxTipo);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(560, 317, -523, -251);
		frame.getContentPane().add(table);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(422, 11, 89, 23);
		frame.getContentPane().add(btnEditar);
		
		JComboBox comboBoxNome = new JComboBox();
		comboBoxNome.setBounds(72, 11, 115, 20);
		frame.getContentPane().add(comboBoxNome);
		
		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon(TelaClinica.class.getResource("/icon_imag/idoso.jpg")));
		Fundo.setHorizontalAlignment(SwingConstants.CENTER);
		Fundo.setBounds(0, 0, 592, 360);
		frame.getContentPane().add(Fundo);
		

		
		
		
	}
}
