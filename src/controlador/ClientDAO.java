/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import conexionBD.ConexionBD;
import modelo.ClientM;
/**
 *
 * @author denis
 */
public class ClientDAO {
    ConexionBD conexion;
    
    public ClientDAO(){
        conexion = new ConexionBD();
    }
    
    public boolean insertarClient(ClientM c){
        boolean resultado = false;
        String sql = "INSERT INTO client VALUES('" + c.getClientNo() +
                "', '" + c.getfName() + "','" + c.getlName() +
                "', '" + c.getTelNo() + "','" + c.getPrefType() +
                "'," + c.getMaxRent() + ",'" + c.getEmail() + "');";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean eliminarClient(String clientNo){
        boolean resultado = false;
        String sql = "DELETE FROM client WHERE clientNo = '" + clientNo + "';";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean modificarClient(ClientM c){
        boolean resultado = false;
        String sql = "UPDATE client SET fName = '" + c.getfName() +
                "', lName = '" + c.getlName() + "', telNo = '" + c.getTelNo() + 
                        "', prefType = '" + c.getPrefType() + "', maxRent = " +
                        ", email = '" + c.getEmail() + "';";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
}
