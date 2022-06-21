/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author denis
 */
public class ConexionBD {
    private Statement stn = null;
    private Connection conexionBD = null;
    private ResultSet rs;

    public ConexionBD(){
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
            
            conexionBD = DriverManager.getConnection(url);
            System.out.println("Conexión Establecida!!");
        }catch(SQLException ex){
            System.out.println("Error de conexión!!");
        }
    }
    
    public void cerrarConexionBD(){
        try{
            stn.close();
            conexionBD.close();
        }catch(SQLException ex){
            System.out.println("Error al cerrar la conexión");
            ex.printStackTrace();
        }
        
    }
    public boolean ejecutarInstruccion(String sql){
            try{
                stn = conexionBD.createStatement();
                int resultado = stn.executeUpdate(sql);
            }catch(SQLException ex){
                System.out.println("No se pudo ejecutar la instrucción");
                ex.printStackTrace();
                return false;
            }
            return false;
        }
    
    public ResultSet ejecutarConsulta(String sql){
        try{
            stn = conexionBD.createStatement();
            rs = stn.executeQuery(sql);
        }catch(SQLException ex){
            System.out.println("No se pudo ejecutar la instrucción");
            ex.printStackTrace();
        }
        return rs;
    }
}
