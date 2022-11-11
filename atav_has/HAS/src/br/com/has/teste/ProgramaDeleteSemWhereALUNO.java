package br.com.has.teste;

import java.sql.Connection;

import br.com.has.DAO.AlunoDAO;
import br.com.has.DAO.FuncionarioDAO;
import br.com.has.conexao.Conexao;
import br.com.has.conexao.ConexaoDAO;

public class ProgramaDeleteSemWhereALUNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = ConexaoDAO.abrirConexao();
		
		AlunoDAO alunoDao = new FuncionarioDAO(con);
		
		System.out.println(alunoDao.de );
	
		Conexao.fecharConexao(con);
	}

}
