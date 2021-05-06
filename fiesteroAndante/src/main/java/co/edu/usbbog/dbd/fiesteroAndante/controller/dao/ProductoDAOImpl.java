package co.edu.usbbog.dbd.fiesteroAndante.controller.dao;

import co.edu.usbbog.dbd.fiesteroAndante.controller.config.Connect;
import co.edu.usbbog.dbd.fiesteroAndante.model.ProductoDTO;
import co.edu.usbbog.dbd.fiesteroAndante.model.SucursalDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO {

    private final Connect conexion;

    public ProductoDAOImpl() {
        this.conexion = new Connect();
    }

    @Override
    public boolean create(ProductoDTO producto) {
        boolean hecho = false;
        try {
            String query = "INSERT INTO producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad,aniejamiento_del_producto,"
                    + " cantidad_producto,tipo, comida, orquesta,sucursal) VALUES("
                    + producto.getCod_producto() 
                    + ",'" + producto.getCalidad_producto() + "'"
                    + ", " + producto.getPrecio_producto()
                    + ",'" + producto.getFecha_caducidad() + "'"
                    + ",'" + producto.getAniejamiento_producto() + "'"
                    + "," + producto.getCantidad_producto()
                    + ",'" + producto.getTipo()+"'"
                    + ",'" + producto.getComida() + "'"
                    + ",'" + producto.getOrquesta() + "',"
                    + producto.getSucursal().getId_sucursal()
                    + ");";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se inserto el producto");
            hecho = true;
        } catch (SQLTimeoutException e) {
            hecho = false;
            System.out.println("No se inserto el producto");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            hecho = false;
            System.out.println("No se inserto el producto");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return hecho;
    }

    @Override
    public boolean edit(ProductoDTO producto) {
        boolean hecho = false;
        try {
            String query = "UPDATE producto SET "
                    + " cod_producto = " + producto.getCod_producto()+ ", "
                    + " calidad_producto = " + "'" + producto.getCalidad_producto() + "',"
                    + " precio_producto = " + producto.getPrecio_producto()+ ", "
                    + " fecha_caducidad =" + "'" + producto.getFecha_caducidad() + "',"
                    + " aniejamiento_del_producto = " + "'" + producto.getAniejamiento_producto() + "' ,"
                    + " tipo = " + "'" +producto.getTipo() + "' ,"
                    + "  cantidad_producto = " + producto.getCantidad_producto()+ ", "
                    + "  comida = " + "'" + producto.getComida() + "',"
                    + "  orquesta = " + "'" + producto.getOrquesta() + "'"
                    + "  WHERE cod_producto = " + producto.getCod_producto() + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se modifico el producto");
            hecho = true;
        } catch (SQLTimeoutException e) {
            hecho = false;
            System.out.println("No se modifico el producto");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            hecho = false;
            System.out.println("No se modifico el producto");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return hecho;
    }

    @Override
    public boolean remove(int cod_producto) {
        boolean hecho = false;
        try {
            String query = "DELETE FROM producto WHERE cod_producto = " + cod_producto + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();;
            System.out.println("Se modifico el producto");
            hecho = true;
        } catch (SQLTimeoutException e) {
            hecho = false;
            System.out.println("No se elimino el producto");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            hecho = false;
            System.out.println("No se elimino el producto");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return hecho;

    }

    @Override
    public ProductoDTO find(int cod_producto) {
        ProductoDTO producto = null;
        SucursalDTO sucursal;
        SucursalDAO sucursalDAO = new SucursalDAOImpl();
        try {
            String query = "SELECT * FROM producto WHERE cod_producto = " + cod_producto + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                sucursal = sucursalDAO.find(rs.getInt("sucursal"));
                producto = new ProductoDTO(
                        rs.getInt("cod_producto"),
                        rs.getString("calidad_producto"),
                        rs.getDouble("precio_producto"),
                        rs.getDate("fecha_caducidad"),
                        rs.getDate("aniejamiento_del_producto"),
                        rs.getInt("cantidad_producto"),
                        rs.getString("tipo"),
                        rs.getString("comida"),
                        rs.getString("orquesta"),
                         sucursal
                );
            }
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se obtuvo el producto");
        } catch (SQLTimeoutException e) {
            producto = null;
            System.out.println("No se obtuvo el telefono");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            producto = null;
            System.out.println("No se obtuvo el telefono");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return producto;
    }

    @Override
    public List<ProductoDTO> findAll() {
        List<ProductoDTO> productos = new ArrayList<>();
        SucursalDTO sucursal;
        SucursalDAO sucursalDAO = new SucursalDAOImpl();
        try {
            String query = "SELECT * FROM producto;";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                sucursal = sucursalDAO.find(rs.getInt("sucursal"));
                productos.add(new ProductoDTO(
                                rs.getInt("cod_producto"),
                                rs.getString("calidad_producto"),
                                rs.getDouble("precio_producto"),
                                rs.getDate("fecha_caducidad"),
                                rs.getDate("aniejamiento_del_producto"),
                                rs.getInt("cantidad_producto"),
                                rs.getString("tipo"),
                                rs.getString("comida"),
                                rs.getString("orquesta"),
                        sucursal)
                        );
               
           }
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se obtuvieron los productos");
        } catch (SQLException e) {
            productos = new ArrayList<>();
            System.out.println("No se obtuvo el producto");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return productos;
    }

    @Override
    public int count() {
        return findAll().size();
    }

}
