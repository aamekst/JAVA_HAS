package br.com.has.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.has.DAO.AlunoDAO;
import br.com.has.beans.Aluno;
import br.com.has.conexao.Conexao;
import br.com.has.conexao.ConexaoDAO;


public class ProgramaInserirALUNO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Connection con = ConexaoDAO.abrirConexao();
		
		Aluno aluno = new Aluno ();
		AlunoDAO alunoDao = new AlunoDAO(con);
		
		aluno.setNome(JOptionPane.showInputDialog("Digite seu nome:" ));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:" )));
		aluno.setCurso(JOptionPane.showInputDialog("Digite seu curso:" ));
		System.out.println(alunoDao.inserirAluno(aluno));
		
		Conexao.fecharConexao(con);
	}

}
