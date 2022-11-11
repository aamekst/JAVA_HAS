package br.com.has.teste;

import java.sql.Connection;

import br.com.has.DAO.FuncionarioDAO;
import br.com.has.conexao.Conexao;
import br.com.has.conexao.ConexaoDAO;


public class ProgramaDeleteALUNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = ConexaoDAO.abrirConexao();
		
		FuncionarioDAO funcionarioDao = new FuncionarioDAO(con);
		
		System.out.println(funcionarioDao.de );
	
		Conexao.fecharConexao(con);
	}

}
