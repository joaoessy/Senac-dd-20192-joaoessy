package empresaVO;

public class OperacionalVO extends EmpregadoVO{

	public OperacionalVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OperacionalVO(int id, String nome, String cpf, String sexo, int idade, double salariobruto, int descontoIR,
			int descontoPrevidencia, double salarioBase, double salarioL) {
		super(id, nome, cpf, sexo, idade, salariobruto, descontoIR, descontoPrevidencia, salarioBase, salarioL);
		// TODO Auto-generated constructor stub
	}
	
	public void calculasalario() {
		setSalarioL(0.85* getSalarioBase());
	}


}
