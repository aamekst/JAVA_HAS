package br.com.has.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.has.DAO.FuncionarioDAO;
import br.com.has.beans.Funcionario;
import br.com.has.conexao.Conexao;
import br.com.has.conexao.ConexaoDAO;

public class ProgramaSelecionarFuncionario {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = ConexaoDAO.abrirConexao();
		

		FuncionarioDAO funcionarioDao = new FuncionarioDAO(con);
		
		//select
		
		ArrayList<Funcionario> lista = funcionarioDao.retornarInfo();
		if(lista != null) {
			for (Funcionario f: lista) {

				System.out.println("Nome: " + f.getNome());
				System.out.println("Idade: " + f.getIdade());
				System.out.println("Salario: " + f.getSalario());
					
			}
			
		}
	

		Conexao.fecharConexao(con);


	}

}
