
package testsatisfaccion.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * @author  Brayan estiven gil toro
 * @author  Alba rocio 
 * @author  Fabian ramirez  bermudez 
 */
public class conexion {
    
    //variables que almacenan los puertos de conexion y clave 
public static final String URL = "jdbc:mysql://database.cpg2xzh8wubh.us-east-1.rds.amazonaws.com:3306/torobase";
    public static final String USER = "toro";
    public static final String CLAVE = "1006289995toro";
    
    //metodo que se conecta con la base de datos 
    Connection con = null;
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("se a conectado ala base de datos");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No se conecta ala base de datos");
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
    
    
        public void desconectar() {
     
    try {
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
        
         
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
