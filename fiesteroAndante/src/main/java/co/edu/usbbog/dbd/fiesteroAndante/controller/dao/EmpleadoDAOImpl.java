package co.edu.usbbog.dbd.fiesteroAndante.controller.dao;

import co.edu.usbbog.dbd.fiesteroAndante.controller.config.Connect;
import co.edu.usbbog.dbd.fiesteroAndante.model.EmpleadoDTO;
import co.edu.usbbog.dbd.fiesteroAndante.model.SucursalDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAOImpl implements EmpleadoDAO {

    private final Connect conexion;

    public EmpleadoDAOImpl() {

        this.conexion = new Connect();
    }
    
    @Override
    public boolean create(EmpleadoDTO empleado) {
        boolean seHizo = false;
        try {
            String query = "INSERT INTO empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, "
                    + " correo_empleado, salario_empleado, cargo, sucursal) VALUES("
                    + empleado.getId_empleado() + ","
                    + "'" + empleado.getNombre_empleado() + "',"
                    + "'" + empleado.getProfesion_empleado()+ "',"
                    + empleado.getTelefono_empleado()+ ","
                    + "'" + empleado.getCorreo_empleado()+ "',"
                    + empleado.getSalario_empleado()+ ","
                    + "'" + empleado.getCargo()+ "',"
                    + empleado.getSucursal().getId_sucursal()
                    + ");";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se inserto el empleado");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se inserto el empleado");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se inserto el empleado");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public boolean edit(EmpleadoDTO empleado) {
        try {
            String query = "UPDATE empleado SET "
                    + "id_empleado = " + empleado.getId_empleado() + ", "
                    + "nombre_empleado = '" + empleado.getNombre_empleado() + "', "
                    + "profesion_empleado = '" + empleado.getProfesion_empleado() + "', "
                    + "telefono_empleado = " + empleado.getTelefono_empleado() + ", "
                    + "correo_empleado = '" + empleado.getCorreo_empleado() + "', "
                    + "salario_empleado = " + empleado.getSalario_empleado() + ", "
                    + "cargo = '" + empleado.getCargo()+ "', "
                    + "sucursal = " + empleado.getSucursal().getId_sucursal()
                    + " WHERE id_empleado = " + empleado.getId_empleado() + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se modifico el empleado");
            return true;
         } catch (SQLException e) {
            System.out.println("Error al modificar el empleado");
            System.out.println("Error: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
        }
        return false;
    }

    @Override
    public boolean remove(Integer id_empleado) {
        boolean seHizo = false;
        try {
            String query = "DELETE FROM empleado WHERE id_empleado = " + id_empleado + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se elimino el empleado");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se elimino el empleado");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se elimino el empleado");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public EmpleadoDTO find(Integer id_empleado) {
        EmpleadoDTO empleado = null;
        SucursalDTO sucursal;
        SucursalDAO sucursaldao = new SucursalDAOImpl();
        try {
            String query = "SELECT * FROM empleado WHERE id_empleado = " + id_empleado + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            sucursal = sucursaldao.find(rs.getInt("sucursal"));
            empleado = new EmpleadoDTO(
                    rs.getInt("id_empleado"),
                    rs.getString("nombre_empleado"),
                    rs.getString("profesion_empleado"),
                    rs.getInt("telefono_empleado"),
                    rs.getString("correo_empleado"),
                    rs.getDouble("salario_empleado"),
                    rs.getString("cargo"),
                    sucursal); 
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se obtuvo el empleado");
        } catch (SQLTimeoutException e) {
            empleado = null;
            System.out.println("No se obtuvo el empleado");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            empleado = null;
            System.out.println("No se obtuvo el empleado");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return empleado;
    }

    @Override
    public List<EmpleadoDTO> findAll() {
        List<EmpleadoDTO> empleados = new ArrayList<>();
        EmpleadoDTO empleado = null;
        SucursalDTO sucursal;
        SucursalDAO sucursaldao = new SucursalDAOImpl();
        try {
            String query = "SELECT * FROM empleado;";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {                
                sucursal = sucursaldao.find(rs.getInt("sucursal"));
                empleado = new EmpleadoDTO(
                    rs.getInt("id_empleado"),
                    rs.getString("nombre_empleado"),
                    rs.getString("profesion_empleado"),
                    rs.getInt("telefono_empleado"),
                    rs.getString("correo_empleado"),
                    rs.getDouble("salario_empleado"),
                    rs.getString("cargo"),
                    sucursal); 
                empleados.add(empleado);
            } 
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se obtuvieron los empleados");
        } catch (SQLTimeoutException e) {
            empleados = new ArrayList<>();
            System.out.println("No se obtuvieron los empleados");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            empleados = new ArrayList<>();
            System.out.println("No se obtuvieron los empleados");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return empleados;
    }

    @Override
    public int count() {
        return findAll().size();
    }

}