package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Administrador;

public class AdministradorDAO {

    Connection con = null;

    public boolean inserir(Administrador adm1) throws SQLException {
        boolean inseriu = false;
        try {
            con = new Conexao().getConnection();
            String sql = "INSERT INTO administrador (nome, senha) VALUES(?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, adm1.getNome());
            stmt.setString(2, adm1.getSenha());
            stmt.execute();
            stmt.close();
            inseriu = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return inseriu;
    }

    public boolean checkLogin(String nome, String senha) throws SQLException {
        boolean entrou = false;
        JOptionPane.showMessageDialog(null, senha);
        try {
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM administrador WHERE nome = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                entrou = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return entrou;
    }
}
