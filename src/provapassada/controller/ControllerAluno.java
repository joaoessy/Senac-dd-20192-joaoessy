package controller;

import model.bo.AlunoBO;
import model.vo.Aluno;

public class ControllerAluno {
	
	public void calcularMediaFinalController(Aluno a) {
		AlunoBO aBO = new AlunoBO();
		aBO.calcularMediaFinal(a);
		
	}
	public void inserirAlunoController(Aluno a) {
		AlunoBO aBO = new AlunoBO();
		aBO.inserirAlunoN(a);
	}
	
	public void salvarAlunoController(Aluno a) {
		AlunoBO aBO = new AlunoBO();
		aBO.salvarAluno(a);
		
	}
	
	
}
