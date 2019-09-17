package model.bo;

import model.dao.AlunoDAO;
import model.vo.Aluno;

public class AlunoBO {
	
	private AlunoDAO aDAO = new AlunoDAO();
	private String situacao;
	/**
	 * Calcula a mÃ©dia final de um aluno
	 * @param o aluno com suas notas preenchidas
	 * @return a mÃ©dia aritmÃ©tica entre NP1 e NP2
	 * 
	 */
	public double calcularMediaFinal(Aluno aluno){
		double notaF;
		
		notaF = (aluno.getNotaProva1() + aluno.getNotaProva2() * aluno.getPesoProva() / 2) + 
				(aluno.getNotaTrabalho1() + aluno.getNotaTrabalho2() * aluno.getPesoTrabalho() / 2);
		if(notaF <= 8.5) {
			situacao = "ótimo";
			
		}else if (notaF <= 7) {
			situacao = "bom";
		}else if(notaF <=6){
	        situacao = "Satisfatório";	
	    }else {
	    	situacao = "Insatisfatório";
	    }
		return notaF;
	}
	
	/**
	 * Salva um aluno no banco
	 * 
	 * @param novoAluno o aluno que serÃ¡ cadastrado no banco
	 * 
	 * @return void nÃ£o retorna nada porque NUNCA DÃ� ERRO ;)
	 * 
	 */
	
	public String salvarAluno(Aluno novoAluno){
		String mensagem = "";
		AlunoDAO aDAO = new AlunoDAO();
		boolean oquesera = aDAO.verificarMatricula(novoAluno);
	
		if(oquesera == false) {
			mensagem = "Salvo com susesso";
		}else {
			mensagem = "matricula existente";
		}
		
		
		this.aDAO.inserir(novoAluno);
		return mensagem;
	}
	public void inserirAlunoN(Aluno a) {
		AlunoDAO ADAO = new AlunoDAO();
		ADAO.inserir(a);
		
	}
}
