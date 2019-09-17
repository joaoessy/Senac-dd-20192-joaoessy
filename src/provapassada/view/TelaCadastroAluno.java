package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.SwingConstants;

import controller.ControllerAluno;
import model.vo.Aluno;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroAluno {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textMatricula;
	private JTextField textSobrenome;
	private JTextField textP1;
	private JTextField textP2;
	private JTextField textT1;
	private JTextField textT2;
	private JTextField textPesoP;
	private JTextField textPesoT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAluno window = new TelaCadastroAluno();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Aluno a = new Aluno();
	/**
	 * Create the application.
	 */
	public TelaCadastroAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 955, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textNome = new JTextField();
		a.getNome();
		textNome.setColumns(10);
		
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNivel = new JLabel("N\u00EDvel");
		lblNivel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textMatricula = new JTextField();
		textMatricula.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setColumns(10);
		
		JComboBox<String> cbxNivel = new JComboBox<String>();
		
		 cbxNivel.addItem("Básico");
		 cbxNivel.addItem("Intermediário");
		 cbxNivel.addItem("Avançado");
		 
		
		JLabel lblNewLabel = new JLabel("----------------------------------------------");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 42));
		lblNewLabel.setBackground(Color.BLACK);
		
		JLabel label = new JLabel("----------------------------------------------");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 42));
		label.setBackground(Color.BLACK);
		
		JLabel lblNp1 = new JLabel("NP1:");
		lblNp1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNp2 = new JLabel("NP2:");
		lblNp2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNt = new JLabel("NT1:");
		lblNt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNt_1 = new JLabel("NT2:");
		lblNt_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textP1 = new JTextField();
		textP1.setColumns(10);
		
		textP2 = new JTextField();
		textP2.setColumns(10);
		
		textT1 = new JTextField();
		textT1.setColumns(10);
		
		textT2 = new JTextField();
		textT2.setColumns(10);
		
		JLabel lblPesoDasProvas = new JLabel("Peso das Provas :");
		lblPesoDasProvas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textPesoP = new JTextField();
		textPesoP.setColumns(10);
		
		JLabel lblPesoDosTrabalhos = new JLabel("Peso dos Trabalhos :");
		lblPesoDosTrabalhos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textPesoT = new JTextField();
		textPesoT.setColumns(10);
		
		JLabel lblMediaF = new JLabel("M\u00E9dia Final: ");
		lblMediaF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblMF = new JLabel("");
		lblMF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblSituacao = new JLabel("");
		lblSituacao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnSalvar = new JButton("Salvar e Calcular M\u00E9dia Final");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerAluno cA = new ControllerAluno();
				cA.calcularMediaFinalController(a);
				cA.salvarAlunoController(a);
				cA.inserirAlunoController(a);
				        a.setNome(textNome.getText());
						a.setSobrenome(textSobrenome.getText());
						a.setMatricula(Integer.parseInt(textMatricula.getText()));
						a.setNotaProva1(Double.parseDouble(textP1.getText()));
						a.setNotaProva2(Double.parseDouble(textP2.getText()));
						a.setNotaTrabalho1(Double.parseDouble(textT1.getText()));
						a.setNotaTrabalho2(Double.parseDouble(textT2.getText()));
						a.setPesoProva(Double.parseDouble(textPesoP.getText()));
						a.setPesoTrabalho(Double.parseDouble(textPesoT.getText()));
	
		
			}});
			
			
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 774, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 757, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(97)
							.addComponent(btnSalvar))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(38)
							.addComponent(lblMediaF)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblMF, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(lblSituao)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSituacao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(185))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(73)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMatricula))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPesoDasProvas)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNp1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textP1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textNome)
								.addComponent(textMatricula, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
							.addGap(171)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSobrenome)
								.addComponent(lblNivel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(cbxNivel, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textSobrenome, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNp2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textP2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(textPesoP, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(70)
									.addComponent(lblNt, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textT1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(50)
									.addComponent(lblNt_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textT2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(56)
									.addComponent(lblPesoDosTrabalhos)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textPesoT, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(96, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSobrenome)
						.addComponent(textSobrenome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMatricula)
						.addComponent(textMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNivel)
						.addComponent(cbxNivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNp1)
						.addComponent(textP1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNp2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(textP2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNt)
						.addComponent(textT1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textT2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNt_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPesoDasProvas)
						.addComponent(textPesoP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPesoDosTrabalhos, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPesoT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblSituacao, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblSituao, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(lblMediaF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblMF, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(85)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnLimpar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSalvar, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
					.addGap(25))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	
}
