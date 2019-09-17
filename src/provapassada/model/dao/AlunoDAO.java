package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import model.Banco;
import model.vo.Aluno;

public class AlunoDAO {

	public int inserir(Aluno a){
		int novoId = -1;

		String sql = " INSERT INTO ALUNO (NOME, SOBRENOME, MATRICULA, NOTA_P1, NOTA_P2, NOTA_T1, NOTA_T2, NOTA_PT, NOTA_PP) "
				+ " VALUES (?,?,?,?,?,?,?,?,?) ";

		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql, 
				java.sql.Statement.RETURN_GENERATED_KEYS);

		try {
			prepStmt.setString(1, a.getNome());
			prepStmt.setString(2, a.getSobrenome());
			prepStmt.setInt(3, a.getMatricula());
			prepStmt.setDouble(4, a.getNotaProva1());
			prepStmt.setDouble(5, a.getNotaProva2());
			prepStmt.setDouble(6, a.getNotaTrabalho1());
			prepStmt.setDouble(7, a.getNotaTrabalho2());
			prepStmt.setDouble(8, a.getPesoProva());
			prepStmt.setDouble(9, a.getPesoTrabalho());

			prepStmt.execute();

			ResultSet generatedKeys = prepStmt.getGeneratedKeys();
			if (generatedKeys.next()) {
				novoId = generatedKeys.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir aluno. Causa: \n:" + e.getCause());
		} finally{
			Banco.closePreparedStatement(prepStmt);
			Banco.closeConnection(conexao);
		}

		return novoId;
	}

	public boolean verificarMatricula(Aluno a) {
		Connection conn = Banco.getConnection();
		Statement stmt = (Statement) Banco.getStatement(conn);
		ResultSet resultado = null;

		String query = "SELECT matricula FROM aluno WHERE aluno = '" + a.getMatricula() + "'";

		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next()) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println("erro ao executar a query que verifica existência de um aluno por matricula");
			System.out.println("erro" + e.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);

		}

		return false;
}

		
		
	}

	