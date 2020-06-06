package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.1:3306/3infn32";
        String usuario = "3infn32";
        String senha = "04052001";
        
        try{
            Class.forName(driver);
            return (Connection) DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex){
            throw new RuntimeException("Erro de Conexão", ex);
        }
    }   
}
