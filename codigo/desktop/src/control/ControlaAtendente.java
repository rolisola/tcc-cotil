package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Atendente;
import model.DAO.AtendenteDAO;

public class ControlaAtendente {

    public boolean insereAtendente(String nome, String senha, String cpf, String coren) throws SQLException {
        Atendente ate = new Atendente(nome, senha, cpf, coren);
        AtendenteDAO ateDAO = new AtendenteDAO();
        boolean inseriu = ateDAO.inserir(ate);
        return inseriu;
    }

    public ArrayList<Atendente> buscarAtendente() throws SQLException {
        AtendenteDAO atDAO = new AtendenteDAO();
        return (atDAO.buscar());
    }
}
