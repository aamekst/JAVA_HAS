package br.com.has.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.has.DAO.FuncionarioDAO;
import br.com.has.beans.Funcionario;
import br.com.has.conexao.Conexao;
import br.com.has.conexao.ConexaoDAO;


public class ProgramaInserirFuncionario {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = ConexaoDAO.abrirConexao();
		
		Funcionario funcionario = new Funcionario ();
		FuncionarioDAO funcionarioionarioDao = new FuncionarioDAO(con);
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite seu nome:" ));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:" )));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario:" )));
		System.out.println(funcionarioionarioDao.inserirFunc(funcionario));
		
		Conexao.fecharConexao(con);
	}

}


