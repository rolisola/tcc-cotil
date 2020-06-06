package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Atendente;

public class AtendenteDAO {

    Connection con = null;

    public boolean inserir(Atendente ate) throws SQLException{
        
        boolean inseriu = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO atendente (nome, senha, cpf, coren) VALUES(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ate.getNome());
            stmt.setString(2, ate.getSenha());
            stmt.setString(3, ate.getCpf());
            stmt.setString(4, ate.getCoren());
            stmt.execute();
            stmt.close();
            inseriu = true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
        return inseriu;
    }
    
    public ArrayList<Atendente> buscar()throws SQLException{
        ResultSet rs = null;
        ArrayList<Atendente> listaAtendente = new ArrayList<Atendente>();
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM atendente";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Atendente at = new Atendente();
                at.setId(rs.getInt("id_atendente"));
                at.setNome(rs.getString("nome"));
                listaAtendente.add(at);
            }
            stmt.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
        return listaAtendente;
    }
}