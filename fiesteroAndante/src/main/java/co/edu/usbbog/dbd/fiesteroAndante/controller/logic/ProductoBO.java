package co.edu.usbbog.dbd.fiesteroAndante.controller.logic;

import co.edu.usbbog.dbd.fiesteroAndante.controller.dao.ProductoDAO;
import co.edu.usbbog.dbd.fiesteroAndante.controller.dao.ProductoDAOImpl;
import co.edu.usbbog.dbd.fiesteroAndante.model.ProductoDTO;
import co.edu.usbbog.dbd.fiesteroAndante.model.SucursalDTO;
import java.sql.Date;
import java.util.List;

public class ProductoBO {
    
    
    private ProductoDAO productoDAO;

    public ProductoBO() {
        this.productoDAO = new ProductoDAOImpl();
    }
    
    public List<ProductoDTO> mostrar() {
        return productoDAO.findAll();
    }
    public String crearProducto (int cod_producto, String calidad_producto, Double precio_producto, Date fecha_caducidad,Date aniejamiento_producto, int cantidad_producto,String tipo ,String comida, String orquesta,SucursalDTO sucursal){
        return productoDAO.create(new ProductoDTO(cod_producto, calidad_producto, precio_producto, fecha_caducidad,aniejamiento_producto, cantidad_producto,tipo, comida, orquesta,sucursal))?  "Se creó" : "No se creó";
        
    }
     public String editarProducto(int cod_producto, String calidad_producto, Double precio_producto, Date fecha_caducidad,Date aniejamiento_producto, int cantidad_producto,String tipo ,String comida, String orquesta,SucursalDTO sucursal) {
            ProductoDTO producto = new ProductoDTO(cod_producto, calidad_producto, precio_producto, fecha_caducidad,aniejamiento_producto, cantidad_producto,tipo, comida, orquesta,sucursal);
        if (productoDAO.edit(producto)) {
            return "Se creo exitosamente";
        } else {
            return "No se creo";
        }
    }
     public String eliminarProducto(int cod_producto) {
        if (productoDAO.remove(cod_producto)) {
            return "Se elimino exitosamente";
        } else {
            return "No se edito";
        }
    }
     public ProductoDTO buscarProducto(int cod_producto) {
        ProductoDTO producto = productoDAO.find(cod_producto);
        return producto;

    }
    
    
}