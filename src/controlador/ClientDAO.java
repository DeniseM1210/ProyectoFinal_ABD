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
import modelo.ClientM;
/**
 *
 * @author denis
 */
public class ClientDAO {
    Connection conexion = ConexionBD.getConnection();
    //private static Savepoint sp = null;
    /*public ClientDAO(){
        conexion = new ConexionBD();
    }*/
    
    public boolean insertarClient(ClientM c){
        boolean resultado = false;
        try {  
            Statement st = conexion.createStatement();
            String sql = "INSERT INTO client VALUES('" + c.getClientNo() +
                    "', '" + c.getfName() + "','" + c.getlName() +
                    "', '" + c.getTelNo() + "','" + c.getPrefType() +
                    "'," + c.getMaxRent() + ",'" + c.getEmail() + "');";
            st.execute(sql);
            conexion.commit();
            resultado = true;
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean eliminarClient(String clientNo){
        boolean resultado = false;
        try {
            Statement st = conexion.createStatement();
            String sql = "DELETE FROM client WHERE clientNo = '" + clientNo + "';";
            st.execute(sql);
            conexion.commit();
            resultado = true;
            
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public boolean modificarClient(ClientM c){
        boolean resultado = false;
        try {
            Statement st = conexion.createStatement();
            String sql = "UPDATE client SET fName = '" + c.getfName() +
                    "', lName = '" + c.getlName() + "', telNo = '" + c.getTelNo() +
                    "', prefType = '" + c.getPrefType() + "', maxRent = " + c.getMaxRent() +
                    ", email = '" + c.getEmail() + "' WHERE clientNo = '" + c.getClientNo() + "'";
            st.execute(sql);
            conexion.commit();
            resultado = true;
            
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
