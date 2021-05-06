package co.edu.usbbog.dbd.fiesteroAndante.controller.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private final String host;
    private final String port;
    private final String user;
    private final String pass;
    private final String database;
    private Connection connection;

    public Connect() {
        this.host = "localhost";
        this.port = "3306";
        this.user = "root";
        this.pass = "password";
        this.database = "bar_domicilio_db";
        this.connection = null;
    }

    public Connection conectar() {
        try {
            String path = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            System.out.println(path);
            this.connection = DriverManager.getConnection(path, user, pass);
            System.out.println("Felicidades, te has conectado a FIESTERO ANDANTE");
        } catch (SQLException ex) {
            System.out.println("lo lamentamos, no se ha podido conectar");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return connection;
    }

    public void desconectar() {
        try {
            this.connection.close();
            System.out.println("Te has desconectado con exito");
        } catch (SQLException ex) {
            System.out.println("No te has podido desconectar");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }
   
}
