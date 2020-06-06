package control;

import java.sql.SQLException;
import model.Administrador;
import model.DAO.AdministradorDAO;

public class ControlaAdministrador {
    
    public boolean insereAdministrador(String nome, String senha) throws SQLException{
        Administrador adm = new Administrador(nome, senha);
        AdministradorDAO admDAO = new AdministradorDAO();
        boolean inseriu = admDAO.inserir(adm);
        return inseriu;
    }
}
