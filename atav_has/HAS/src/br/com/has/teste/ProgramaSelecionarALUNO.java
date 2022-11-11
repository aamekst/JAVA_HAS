package br.com.has.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.has.DAO.AlunoDAO;
import br.com.has.beans.Aluno;
import br.com.has.conexao.Conexao;
import br.com.has.conexao.ConexaoDAO;



public class ProgramaSelecionarALUNO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = ConexaoDAO.abrirConexao();
		

		AlunoDAO alunoDao = new AlunoDAO(con);
		
		//select
		
		
		ArrayList<Aluno> lista = alunoDao.retornarInfo();
		if(lista != null) {
			for (Aluno a : lista) {

				System.out.println("Nome: " + a.getNome());
				System.out.println("Idade: " + a.getIdade());
				System.out.println("Curso: " + a.getCurso());
					
			}
			
		}
	

		Conexao.fecharConexao(con);


	}

}


