package empresaVO;

public class DiretorVO extends EmpregadoVO {
	private double comissao;

	public DiretorVO(int id, String nome, String cpf, String sexo, int idade, double salariobruto, int descontoIR,
			int descontoPrevidencia, double salarioBase, double salarioL, double comissao) {
		super(id, nome, cpf, sexo, idade, salariobruto, descontoIR, descontoPrevidencia, salarioBase, salarioL);
		this.comissao = comissao;
	}

	public DiretorVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void calculasalario() {
		setSalarioL(3* getSalarioBase() + comissao);
	}

	
}
