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
        return resultado;
    }
}
