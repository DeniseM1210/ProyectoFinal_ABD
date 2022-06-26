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
import modelo.PropertyForRentM;

/**
 *
 * @author denis
 */
public class PropertyForRentDAO {
    Connection conexion = ConexionBD.getConnection();
   // private static Savepoint sp = null;
    /*public PropertyForRentDAO(){
        conexion = new ConexionBD();
    }*/
    
    public boolean insertarProperty(PropertyForRentM pfr){
        boolean resultado = false;
        try {
            Statement st = conexion.createStatement();
            String sql = "insert into propertyforrent values ('" + pfr.getPropertyNo() + "','" + pfr.getStreet() + "','" + pfr.getCity() +
                    "','" + pfr.getPostcode() + "','" + pfr.getType() + "'," + pfr.getRooms() + "," + pfr.getRent() + ",'" + pfr.getOwnerNo() +
                    "','" + pfr.getStaffNo() + "','" + pfr.getBranchNo() + "');";
            st.execute(sql);
            conexion.commit();
            resultado = true;
            
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PropertyForRentDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(PropertyForRentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public boolean eliminarProperty(String propertyNo){
        boolean resultado = false;
        try {
            Statement st = conexion.createStatement();
            String sql = "delete from propertyforrent where propertyNo = '" + propertyNo + "';";
            st.execute(sql);
            conexion.commit();
            resultado = true;
            
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PropertyForRentDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(PropertyForRentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public boolean modificarProperty(PropertyForRentM pfr){
        boolean resultado = false;
        try {
            Statement st = conexion.createStatement();
            String sql = "UPDATE propertyforrent set street = '" + pfr.getStreet() + "', city = '" + pfr.getCity() + "', postcode = '" + pfr.getPostcode() +
                    "', type = '" + pfr.getType() + "', rooms = " + pfr.getRooms() + ", rent = " + pfr.getRent() + ", ownerNo = '" + pfr.getOwnerNo() +
                    "', staffNo = '" + pfr.getStaffNo() + "', branchNo = '" + pfr.getBranchNo() + "' where propertyNo = '" + pfr.getPropertyNo() + "'";
            st.execute(sql);
            conexion.commit();
            resultado = true;
            
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PropertyForRentDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(PropertyForRentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
