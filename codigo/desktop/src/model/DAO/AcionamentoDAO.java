package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Acionamento;

public class AcionamentoDAO {

    Connection con = null;

    public boolean inserir(Acionamento ac) throws SQLException {
        boolean inseriu = false;
        try {
            con = new Conexao().getConnection();
            String sql = "INSERT INTO atendimento (paciente_cpf, drone_id, atendente_id, data_hora, local, hora_partida, hora_chegada, hora_retorno, tipo_ocorrencia, estado_paciente) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, ac.getCpf());
            stmt.setInt(2, ac.getIdDrone());
            stmt.setInt(3, ac.getIdAtendente());
            stmt.setString(4, ac.getDataHora());
            stmt.setString(5, ac.getLocal());
            stmt.setString(6, ac.getHoraPartida());
            stmt.setString(7, ac.getHoraChegada());
            stmt.setString(8, ac.getHoraRetorno());
            stmt.setString(9, ac.getTipoOcorrencia());
            stmt.setString(10, ac.getEstadoPaciente());
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
}
