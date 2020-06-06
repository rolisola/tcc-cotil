package control;

import java.sql.SQLException;
import model.Acionamento;
import model.DAO.AcionamentoDAO;

public class ControlaAcionamento {

    public boolean insereAcionamento(int cpf, int idDrone, int idAtendente, String dataHora, String local, String horaPartida, String horaChegada, String horaRetorno, String tipoOcorrencia, String estadoPaciente) throws SQLException {
        Acionamento ac = new Acionamento(cpf, idDrone, idAtendente, dataHora, local, horaPartida, horaChegada, horaRetorno, tipoOcorrencia, estadoPaciente);
        AcionamentoDAO acDAO = new AcionamentoDAO();
        boolean inseriu = acDAO.inserir(ac);
        return inseriu;
    }

}
