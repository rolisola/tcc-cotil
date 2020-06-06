package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Drone;

public class DroneDAO {

    Connection con = null;

    public boolean inserir(Drone d) throws SQLException {

        boolean inseriu = false;

        try {
            con = new Conexao().getConnection();
            String sql = "INSERT INTO drone (marca, modelo, uso) VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, d.getMarca());
            stmt.setString(2, d.getModelo());
            stmt.setString(3, d.getUso());
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

    public ArrayList<Drone> buscar() throws SQLException {
        ResultSet rs = null;
        ArrayList<Drone> listaDrone = new ArrayList<Drone>();
        try {
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM drone";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Drone dr = new Drone();
                dr.setId(rs.getInt("id_drone"));
                dr.setMarca("marca");
                dr.setModelo("modelo");
                dr.setUso(rs.getString("modelo"));
                listaDrone.add(dr);
            }
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return listaDrone;
    }
}
