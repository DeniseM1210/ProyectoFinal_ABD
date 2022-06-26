/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BranchM;
/**
 *
 * @author denis
 */
public class BranchDAO {
    Connection conexion = ConexionBD.getConnection();
    //private static Savepoint sp = null;
    
    /*public BranchDAO(){
        conexion = new ConexionBD();
    }*/
    
    public boolean insertarBranch(BranchM b){
        boolean resultado = false;
        try {
            Statement st = conexion.createStatement();
            String sql = "INSERT INTO branch VALUES('" + b.getBranchNo() + "', '"
                    + b.getStreet() + "','" + b.getCity() + "','" + b.getPostcode() + "');";
            st.execute(sql);
            conexion.commit();
            resultado = true;
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(BranchDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(BranchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public boolean eliminarBranch(String branchNo){
        boolean resultado = false;
        try {     
            Statement st = conexion.createStatement();
            String sql = "DELETE FROM branch WHERE branchNo = '" + branchNo + "';";
            st.execute(sql);
            conexion.commit();
            resultado = true;
            
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(BranchDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(BranchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public boolean modificarBranch(BranchM b){
        boolean resultado = false;
        try {
            Statement st = conexion.createStatement();
            String sql = "UPDATE branch SET street = '" + b.getStreet() +
                    "', city = '" + b.getCity() + "', postcode = '" + b.getPostcode() +
                    "' WHERE branchNo = '" + b.getBranchNo() + "'";
            st.execute(sql);
            conexion.commit();
            resultado = true;
           
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(BranchDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(BranchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
