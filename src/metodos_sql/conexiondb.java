
package metodos_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class conexiondb {
    public static String url ="jdbc:mysql://localhost:3306/vivispizza?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
       
    //"jdbc:mysql://localhost:3306/dbfantasia?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC"
    // "jdbc:mysql://localhost/dbfantasia?useSSL=false"
    //jdbc:mysql://localhost:3306/dbfantasia?zeroDateTimeBehavior=convertToNull
    public static String usuario = "root";
    public static String contraseña = "12345";
    public static String clase ="com.mysql.cj.jdbc.Driver";
    
    
    
    public static Connection getConexion (){
        Connection conexion = null;
        
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexion establecida");
        }catch (ClassNotFoundException | SQLException e) {
            
             System.out.println(e);
        }
        return conexion;
    }
    
    
    
    //Este codigo es para conectarse a SQL Server
   /* static  Connection conexion = null;
     public static Connection getConexion(){
         String url = "jdbc:sqlserver://localhost:1433;databaseName=vivispizza";
         try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         } catch (ClassNotFoundException e) {
             JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion revisar Driver"+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);
         }
         try{
             conexion = DriverManager.getConnection(url,"sa","#Password#");
              System.out.println("Conexion establecida");
             
         }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error"+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);
         }
         return conexion;
    }   
    public static  ResultSet Consulta (String Consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet rs = declara.executeQuery(Consulta);
           
            return rs;
        }catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "Error"+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        return  null;
    }*/
    
    
    
    
}
