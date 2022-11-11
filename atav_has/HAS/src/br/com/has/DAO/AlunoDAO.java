package br.com.has.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.has.beans.Aluno;

public class AlunoDAO {
	
	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	
	public AlunoDAO(Connection con){
		setCon(con);
	}
	//metodo inserir aluno
			public String inserirAluno(Aluno aluno)
			{
				String sql = "insert into aluno(nome, idade, curso) values (?,?,?)";
				
				try {
					
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, aluno.getNome());
					ps.setInt(2, aluno.getIdade());
					ps.setString(3, aluno.getCurso());
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
			
			//metodo deletar sem where
			public String deleteAluno()
			{
				String sql = "delete from aluno";
				
				try {
					
					PreparedStatement ps = getCon().prepareStatement(sql);
			
					if(ps.executeUpdate()>0) {
						return "Deletado com sucesso!";
					}else {
						return "Erro ao inserir";
					}
					
				}catch (SQLException e)
				{
					return e.getMessage();
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			//select com array - meotodo selecionar aluno

			public ArrayList<Aluno>  retornarInfo(){//nome do metodo
				
				String sql = "Select * from aluno";
				ArrayList<Aluno> retornarAluno = new ArrayList<Aluno>();//objeto "retornanotebook"
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					if(rs != null) {
						while(rs.next()) {
							Aluno aluno = new Aluno();
							aluno.setNome(rs.getString(1));
							aluno.setIdade(rs.getInt(2));
							aluno.setCurso(rs.getString(3));
							retornarAluno.add(aluno);
						}
						return retornarAluno;
						
					}else{
						return null;
					}
					
				}catch(SQLException e) {
					return null;
				}
				
			}
						
			
			
			
			
			
			
			
			
			
			

}
