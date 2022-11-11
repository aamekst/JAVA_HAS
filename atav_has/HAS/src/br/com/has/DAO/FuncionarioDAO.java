package br.com.has.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.has.beans.Aluno;
import br.com.has.beans.Funcionario;

public class FuncionarioDAO {
	
	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public FuncionarioDAO(Connection con){
		setCon(con);
	}

	
	//metodo inserir prof
	public String inserirFunc(Funcionario funcionario)
	{
		String sql = "insert into funcionario(nome, idade, salario) values (?,?,?)";
		
		try {
			
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			ps.setInt(2, funcionario.getIdade());
			ps.setDouble(3, funcionario.getSalario());
			if(ps.executeUpdate()>0) {
				return "Inserido com sucesso!";
			}else {
				return "Erro ao inserir";
			}
			
			
		}catch (SQLException e)
		{
			return e.getMessage();
		}
		
	}
	
	//delete com where
	//update com where
	
	//select com array - meotodo selecionar FUNCIONARIO


	public ArrayList<Funcionario>  retornarInfo(){//nome do metodo
		
		String sql = "Select * from funcionario";
		ArrayList<Funcionario> retornarFunc = new ArrayList<Funcionario>();//objeto "retornanotebook"
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Funcionario funcionario = new Funcionario();
					funcionario.setNome(rs.getString(1));
					funcionario.setIdade(rs.getInt(2));
					funcionario.setSalario(rs.getDouble(3));
					retornarFunc.add(funcionario);
				}
				return retornarFunc;
				
			}else{
				return null;
			}
			
		}catch(SQLException e) {
			return null;
		}
		
	}
				
	
	
	
	
	
	
	

}
