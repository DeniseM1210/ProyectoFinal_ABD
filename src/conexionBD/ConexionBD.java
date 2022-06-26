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
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author denis
 */
public class ConexionBD {
    private Statement stn = null;
    private static Connection conexionBD;
    private ResultSet rs;
    private static Savepoint sp = null;

    private ConexionBD(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=denise1;"
                    + "password=hanji15;"
                    + "encrypt=true;trustServerCertificate=true;";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try{
            /*String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=denise1;"
                    + "password=hanji15;"
                    + "encrypt=true;trustServerCertificate=true;";*/
            Class.forName(driver);
            conexionBD = DriverManager.getConnection(url);
            
            conexionBD.setAutoCommit(false);
            sp = conexionBD.setSavepoint("Inicio");
            
            System.out.println("Conexión Establecida!!");
        }catch(SQLException | ClassNotFoundException ex ){
            System.out.println("Error de conexión!!");
        }
    }
    
    public static Connection getConnection(){
        if(conexionBD == null){
            new ConexionBD();
        }
        return conexionBD;
    }
    
    public void cerrarConexionBD(){
        if(conexionBD != null){
            try {
                conexionBD.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
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
