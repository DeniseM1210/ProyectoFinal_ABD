/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexionBD.ConexionBD;
import modelo.PropertyForRentM;

/**
 *
 * @author denis
 */
public class PropertyForRentDAO {
    ConexionBD conexion;
    
    public PropertyForRentDAO(){
        conexion = new ConexionBD();
    }
    
    public boolean insertarProperty(PropertyForRentM pfr){
        boolean resultado = false;
        String sql = "insert into propertyforrent values ('" + pfr.getPropertyNo() + "','" + pfr.getStreet() + "','" + pfr.getCity() +
                "','" + pfr.getPostcode() + "','" + pfr.getType() + "'," + pfr.getRooms() + "," + pfr.getRent() + ",'" + pfr.getOwnerNo() +
                "','" + pfr.getStaffNo() + "','" + pfr.getBranchNo() + "');";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean eliminarProperty(String propertyNo){
        boolean resultado = false;
        String sql = "delete from propertyforrent where propertyNo = '" + propertyNo + "';";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean modificarProperty(PropertyForRentM pfr){
        boolean resultado = false;
        String sql = "UPDATE propertyforrent set street = '" + pfr.getStreet() + "', city = '" + pfr.getCity() + "', postcode = '" + pfr.getPostcode() +
                "', type = '" + pfr.getType() + "', rooms = " + pfr.getRooms() + ", rent = " + pfr.getRent() + ", ownerNo = '" + pfr.getOwnerNo() +
                "', staffNo = '" + pfr.getStaffNo() + "', branchNo = '" + pfr.getBranchNo() + "' where propertyNo = '" + pfr.getPropertyNo() + "'";
        return resultado;
    }
}
