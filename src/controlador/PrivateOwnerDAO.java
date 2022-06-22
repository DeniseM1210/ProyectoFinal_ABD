/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexionBD.ConexionBD;
import modelo.PrivateOwnerM;

/**
 *
 * @author denis
 */
public class PrivateOwnerDAO {
    ConexionBD conexion;
    
    public PrivateOwnerDAO(){
        conexion = new ConexionBD();
    }
    
    public boolean insertarPrivateOwner(PrivateOwnerM po){
        boolean resultado = false;
        String sql = "INSERT INTO privateOwner VALUES('" + po.getOwnerNo() +
                "','" + po.getfName() + "','" + po.getlName() + 
                "','" + po.getAddress() + "','" + po.getTelNo() +
                "','" + po.getEmail() + "','" + po.getPassword() + "');";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean eliminarPrivateOwner(String ownerNo){
        boolean resultado = false;
        String sql = "DELETE FROM privateOwner WHERE ownerNo = '" + ownerNo + "';";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean modificarPrivateOwner(PrivateOwnerM po){
        boolean resultado = false;
        String sql = "UPDATE privateOwner SET fName = '" + po.getfName() + 
                "', lName = '" + po.getlName() + "', address = '" + po.getAddress() +
                "', telNo = '" + po.getTelNo() + "', email = '" + po.getEmail() +
                "', password = '" + po.getPassword() + "' WHERE ownerNo = '" + po.getOwnerNo() + "';";
        resultado = conexion.ejecutarInstruccion(sql);
        
        return resultado;
    }
}
