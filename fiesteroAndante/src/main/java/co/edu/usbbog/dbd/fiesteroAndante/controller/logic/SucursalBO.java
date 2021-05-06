package co.edu.usbbog.dbd.fiesteroAndante.controller.logic;

import co.edu.usbbog.dbd.fiesteroAndante.controller.dao.SucursalDAO;
import co.edu.usbbog.dbd.fiesteroAndante.controller.dao.SucursalDAOImpl;
import co.edu.usbbog.dbd.fiesteroAndante.model.SucursalDTO;
import java.util.List;

public class SucursalBO {

private SucursalDAO sucursalDAO;

    public SucursalBO() {
        this.sucursalDAO = new SucursalDAOImpl();
    }

    public List <SucursalDTO> mostrar(){
        return sucursalDAO.findAll();
    }
    
    public SucursalDTO buscarSucursal(int id_sucursal){
        return sucursalDAO.find(id_sucursal);
    }
            

    
}
