package model.bo.aula5;

import model.dao.aula05.ClienteDAO;
import model.entity.aula05.Cliente;


public class ClienteBO {
	
	public void Clientesalvar(Cliente cli) {
		ClienteDAO cliDAO = new ClienteDAO();
		
		
		
		
	}
	

	public String salvar(Cliente novoCliente) {
		String mensagem = "";
		ClienteDAO clienteDAO = new ClienteDAO();

		if(clienteDAO.CPFcliente(novoCliente.getCpf())) {
			mensagem = "CPF informado ja pertence a outro cliente";
		}else {
			novoCliente = clienteDAO.salvar(novoCliente);

			if(novoCliente.getId() > 0) {
				mensagem = "cliente cadastrado com sucesso!";
			}else {
				mensagem = "Erro ao cadastrar cliente";
			}

		}
		return mensagem;
	}



}

