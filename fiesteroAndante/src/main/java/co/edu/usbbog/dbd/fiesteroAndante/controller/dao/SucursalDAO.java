package co.edu.usbbog.dbd.fiesteroAndante.controller.dao;

import co.edu.usbbog.dbd.fiesteroAndante.model.SucursalDTO;
import java.util.List;

public interface SucursalDAO {
    
    public boolean create(SucursalDTO sucursal);
    public boolean edit (SucursalDTO sucursal);
    public boolean remove (int id_sucursal);
    public SucursalDTO find (int id_sucursal);
    public List<SucursalDTO> findAll();
    public int count();
}
