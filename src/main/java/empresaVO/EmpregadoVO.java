package empresaVO;

public abstract class EmpregadoVO {

	private int id;
	private String nome;
	private String cpf;
	private String sexo;
	private int idade;
	private double salariobruto;
	private double descontoIR;
	private double descontoPrevidencia;
	private double salarioBase;
	private double salarioL;
	public EmpregadoVO(int id, String nome, String cpf, String sexo, int idade, double salariobruto, int descontoIR,
			int descontoPrevidencia, double salarioBase, double salarioL) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
		this.salariobruto = salariobruto;
		this.descontoIR = descontoIR;
		this.descontoPrevidencia = descontoPrevidencia;
		this.salarioBase = salarioBase;
		this.salarioL = salarioL;
	}
	public EmpregadoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setSalariobruto(double salariobruto) {
		this.salariobruto = salariobruto;
	}
	
	public void setDescontoIR(int descontoIR) {
		this.descontoIR = descontoIR;
	}
	
	public void setDescontoPrevidencia(int descontoPrevidencia) {
		this.descontoPrevidencia = descontoPrevidencia;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public void setSalarioL(double salarioL) {
		this.salarioL = salarioL;
	}
	
	public void calcularIR() {
		if (salariobruto >= 1800 || salariobruto <= 3000) { 
		descontoIR = salariobruto* 0.10;
		
		}
		if (salariobruto > 3000) {
			descontoIR = salariobruto* 0.15;
		}
		
	}
	
	public void calculardescontoprev() {
		if (idade < 45) {
			descontoPrevidencia = salariobruto* 0.12;
		}else {
			descontoPrevidencia = salariobruto* 0.08;
		}
		
		
	}
	
	public void calcularsalariobase() {
		
		salarioBase = salariobruto - descontoIR - descontoPrevidencia;
	}
	
	
}
