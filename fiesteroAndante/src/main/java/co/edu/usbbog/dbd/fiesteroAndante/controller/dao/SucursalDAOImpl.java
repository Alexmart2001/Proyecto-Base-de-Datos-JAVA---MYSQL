package co.edu.usbbog.dbd.fiesteroAndante.controller.dao;

import co.edu.usbbog.dbd.fiesteroAndante.controller.config.Connect;
import co.edu.usbbog.dbd.fiesteroAndante.model.SucursalDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SucursalDAOImpl implements SucursalDAO {

    private final Connect conexion;

    public SucursalDAOImpl() {
        this.conexion = new Connect();
    }

    @Override
    public boolean create(SucursalDTO sucursal) {
        boolean seHizo = false;
        try {
            String query = "INSERT INTO sucursal(id_sucursal,nombre_sucursal,seguridad_sucursal,"
                    + "atencion_presencial_sucursal,tiempo_espera_consultas_sucursal,soporte) VALUES("
                    + sucursal.getId_sucursal() + ","
                    + "'" + sucursal.getNombre_sucursal() + "',"
                    + "'" + sucursal.getSeguridad_sucursal() + "',"
                    + sucursal.getAtencion_presencial_sucursal() + ","
                    + sucursal.getTiempo_espera_consultas_sucursal() + ","
                    + "'" + sucursal.getSoporte() + "'"
                    + ");";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se inserto la persona");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se inserto la persona");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se inserto la persona");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());

        }
        return seHizo;
    }

    @Override
    public boolean edit(SucursalDTO sucursal) {
        boolean seHizo = false;
        try {
            String query = "UPDATE sucursal SET "
                    + sucursal.getId_sucursal() + ","
                    + "'" + sucursal.getNombre_sucursal() + "',"
                    + "'" + sucursal.getSeguridad_sucursal() + "',"
                    + sucursal.getAtencion_presencial_sucursal() + ","
                    + sucursal.getTiempo_espera_consultas_sucursal() + ","
                    + "'" + sucursal.getSoporte() + "'"
                    + " WHERE Id_sucursal = " + sucursal.getId_sucursal()
                    + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se modifico la persona");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se modifico la persona");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se modifico la persona");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public boolean remove(int id_sucursal) {
        boolean seHizo = false;
        try {
            String query = "DELETE FROM sucursal WHERE id_sucursal = " + id_sucursal + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se elimino la persona");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se elimino la persona");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se elimino la persona");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());

        }
        return seHizo;
    }

    @Override
    public SucursalDTO find(int id_sucursal) {
        SucursalDTO sucursal = null;
        try {
            String query = "SELECT *FROM sucursal WHERE id_sucursal = " + id_sucursal + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            sucursal = new SucursalDTO(
                    rs.getInt("id_sucursal"),
                    rs.getString("Nombre_sucursal"),
                    rs.getInt("Seguridad_sucursal"),
                    rs.getString("Atencion_presencial_sucursal"),
                    rs.getTimestamp("Tiempo_espera_consultas_sucursal"),
                    rs.getString("Soporte")
            );
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("se obtuvo la persona");

        } catch (SQLTimeoutException e) {
            sucursal = null;
            System.out.println("No obtuvieron las personas");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());

        } catch (SQLException e) {
            sucursal = null;
            System.out.println("No obtuvieron las personas");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return sucursal;
    }

    @Override
    public List<SucursalDTO> findAll() {
        List<SucursalDTO> sucursales = new ArrayList<>();
        SucursalDTO sucursal = null;
        try {
            String query = "SELECT * FROM  sucursal;";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                sucursal = new SucursalDTO(
                        rs.getInt("id_sucursal"),
                        rs.getString("Nombre_sucursal"),
                        rs.getInt("Seguridad_sucursal"),
                        rs.getString("Atencion_presencial_sucursal"),
                        rs.getTimestamp("Tiempo_espera_consultas_sucursal"),
                        rs.getString("Soporte")
                );
                sucursales.add(sucursal);
            }
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se obtuvieron las personas");

        } catch (SQLTimeoutException e) {
            sucursales = new ArrayList<>();
            System.out.println("No obtuvieron las personas");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());

        } catch (SQLException e) {
            sucursales = new ArrayList<>();
            System.out.println("No sobtuvieron las personas");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return sucursales;
    }

    @Override
    public int count() {
        return findAll().size();
    }

}
