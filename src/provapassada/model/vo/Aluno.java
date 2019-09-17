package model.vo;

public class Aluno {

	private int id;
	private String nome;
	private String sobrenome;
	private int matricula;
	private double notaProva1;
	private double notaProva2;
	private double notaTrabalho1;
	private double notaTrabalho2;
	private double pesoProva;
	private double pesoTrabalho;
	public Aluno(int id, String nome, String sobrenome, int matricula, double notaProva1, double notaProva2,
			double notaTrabalho1, double notaTrabalho2, double pesoProva, double pesoTrabalho) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho1 = notaTrabalho1;
		this.notaTrabalho2 = notaTrabalho2;
		this.pesoProva = pesoProva;
		this.pesoTrabalho = pesoTrabalho;
	}
	public Aluno() {
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int i) {
		this.matricula = i;
	}
	public double getNotaProva1() {
		return notaProva1;
	}
	public void setNotaProva1(double notaProva1) {
		this.notaProva1 = notaProva1;
	}
	public double getNotaProva2() {
		return notaProva2;
	}
	public void setNotaProva2(double notaProva2) {
		this.notaProva2 = notaProva2;
	}
	public double getNotaTrabalho1() {
		return notaTrabalho1;
	}
	public void setNotaTrabalho1(double notaTrabalho1) {
		this.notaTrabalho1 = notaTrabalho1;
	}
	public double getNotaTrabalho2() {
		return notaTrabalho2;
	}
	public void setNotaTrabalho2(double notaTrabalho2) {
		this.notaTrabalho2 = notaTrabalho2;
	}
	public double getPesoProva() {
		return pesoProva;
	}
	public void setPesoProva(double pesoProva) {
		this.pesoProva = pesoProva;
	}
	public double getPesoTrabalho() {
		return pesoTrabalho;
	}
	public void setPesoTrabalho(double pesoTrabalho) {
		this.pesoTrabalho = pesoTrabalho;
	}
}
	