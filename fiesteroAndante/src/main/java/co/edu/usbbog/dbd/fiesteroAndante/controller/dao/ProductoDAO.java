package co.edu.usbbog.dbd.fiesteroAndante.controller.dao;

import co.edu.usbbog.dbd.fiesteroAndante.model.ProductoDTO;
import java.util.List;

public interface ProductoDAO {

    public boolean create(ProductoDTO producto);

    public boolean edit(ProductoDTO producto);

    public boolean remove(int cod_producto);

    public ProductoDTO find(int cod_producto);

    public List <ProductoDTO> findAll();

    public int count();

}
