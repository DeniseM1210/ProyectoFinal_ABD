/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Locale.Category;
import modelo.ClientM;

/**
 *
 * @author denis
 */
public class ConexionBD2 {
    private static PreparedStatement pstm = null;
    private static Connection conexionBD = null;
    private static CallableStatement cs;
    
    public ConexionBD2(int valor){}
    
    private ConexionBD2(){
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=denise1;"
                    + "password=hanji15;"
                    + "encrypt=true;trustServerCertificate=true;";
            
            conexionBD = DriverManager.getConnection(url);
        }catch(SQLException e){
            System.out.println("Error de conexión!!");
        }
    }
    
    public static Connection getConexionBD2(){
        if(conexionBD == null){
            new ConexionBD2();
        }
        return conexionBD;
    }
    
    public static void cerrarConexion(){
        try{
            cs.close();
            pstm.close();
            conexionBD.close();
        }catch(SQLException e){
            System.out.println("Error al cerrar la conexión");
            e.printStackTrace();
        }
    }
    
    public static boolean eliminarRegistro(String sql) throws SQLException{
        try{
            pstm = conexionBD.prepareStatement(sql);
            pstm.executeUpdate();
            conexionBD.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public static ResultSet ejecutarConsulta(String sql){
        try{
            String consulta = sql;
            pstm = conexionBD.prepareStatement(consulta);
            return pstm.executeQuery();
        }catch(Exception ex){
            System.out.println("No se pudo ejecutar la instrucción");
            ex.printStackTrace();
        }
        return null;
    }
    
    public static boolean actualizarRegistro(ClientM cliente) throws SQLException{
        try{
            pstm = conexionBD.prepareStatement("UPDATE client SET fName = ?, lName = ?, telNo = ?, " + 
                    "prefType = ?, maxRent = ?, email = ? WHERE clientNo = ?");
            pstm.setString(1, cliente.getfName());
            pstm.setString(2, cliente.getlName());
            pstm.setString(3, cliente.getTelNo());
            pstm.setString(4, cliente.getPrefType());
            pstm.setInt(5, cliente.getMaxRent());
            pstm.setString(6, cliente.getEmail());
            pstm.setString(7, cliente.getClientNo());
            pstm.executeUpdate();
            return true;
        }catch(Exception ex){
            System.out.println("No se pudo actualizar");
            ex.printStackTrace();
        }
        return false;
    }
    
    public static boolean agregarRegistro(ClientM cliente) throws SQLException{
        try{
            pstm = conexionBD.prepareStatement("INSERT \"client\"(\"clientNo\",\"fName\",\"lName\",\"telNo\",\"prefType\",\"maxRent\",\"email\") VALUES (?,?,?,?,?,?,?)");
            pstm.setString(1, cliente.getClientNo());
            pstm.setString(2, cliente.getfName());
            pstm.setString(3, cliente.getlName());
            pstm.setString(4, cliente.getTelNo());
            pstm.setString(5, cliente.getPrefType());
            pstm.setInt(6, cliente.getMaxRent());
            pstm.setString(7, cliente.getEmail());
            pstm.executeUpdate();
            return true;
        }catch(Exception ex){
            System.out.println("No se pudo insertar");
            ex.printStackTrace();
        }
        return false;
    }
    
    
}
