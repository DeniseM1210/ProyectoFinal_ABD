/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexionBD.ConexionBD;
import modelo.Branch;
/**
 *
 * @author denis
 */
public class BranchDAO {
    ConexionBD conexion;
    
    public BranchDAO(){
        conexion = new ConexionBD();
    }
    
    public boolean insertarBranch(Branch b){
        boolean resultado = false;
        String sql = "INSERT INTO branch VALUES('" + b.getBranchNo() + "', '"
                + b.getStreet() + "','" + b.getCity() + "','" + b.getPostcode() + "');";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean eliminarBranch(char branchNo){
        boolean resultado = false;
        String sql = "DELETE FROM branch WHERE branchNo = '" + branchNo + "';";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean modificarBranch(Branch b){
        boolean resultado = false;
        String sql = "UPDATE branch SET street = '" + b.getStreet() + 
                "', city = '" + b.getCity() + "', postcode = '" + b.getPostcode() +
                "' WHERE branchNo = '" + b.getBranchNo() + "';";
        resultado = conexion.ejecutarInstruccion(sql);
        
        return resultado;
    }
}
