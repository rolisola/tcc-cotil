package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.DroneDAO;
import model.Drone;

public class ControlaDrone {

    public boolean insereDrone(String marca, String modelo, String uso) throws SQLException {
        Drone d = new Drone(marca, modelo, uso);
        DroneDAO dDAO = new DroneDAO();
        boolean inseriu = dDAO.inserir(d);
        return inseriu;
    }

    public ArrayList<Drone> buscarDrone() throws SQLException {
        DroneDAO drDAO = new DroneDAO();
        return (drDAO.buscar());
    }
}
