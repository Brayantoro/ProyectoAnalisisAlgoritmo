
package Entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import testsatisfaccion.conexion.conexion;

/**
 * @author  Brayan estiven gil toro
 * @author  Alba rocio 
 * @author  Fabian ramirez  bermudez 
 */
public class UsuarioTest {

    
   //Variables utilizadas en la base de datos
    private int PreguntaUnoCalificacion;
    private int PreguntaDosCalificacion;
    private int PreguntaTresCalificacion;
    private double calificacion1;
     private double calificacion2;

    public double getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public double getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }
        private double calificacion3;
    
    //variables para asignar y llamar las cosultas en la base de datos 
    private final String SQL_INSERT = "INSERT INTO  "
            + " UsuarioTest (calificacion1,calificacion2,calificacion3,Cedula) "
            + " VALUES (?,?,?,?) ";
    // private final String SQL_SELECT = "Select avg(calificacion1)as pronedio from UsuarioTest ";
    private PreparedStatement ps;
    private DefaultTableModel DT;
    private ResultSet RS;

    private final conexion cn;

    public UsuarioTest() {
        cn = new conexion();
    }

    public int datoCedula(int cedula) {
        return cedula;
    }

    //metodo que para insertar los datos en la base de datos
    public int insertarDatosTest(int calificacion1, int calificacion2, int calificacion3, int Cedula) {
        int respuesta = 0;
        try {

            PreparedStatement ps =cn.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, calificacion1);
            ps.setInt(2, calificacion2);
            ps.setInt(3, calificacion3);
            ps.setInt(4, Cedula);
            respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos" + e.getMessage());
        }
        return respuesta;
    }

    //metodo que realiza la consulta en la base de datos para el promedio de las preguntas de satisfaccion 
    public String promedioCalifiacion1() {
        
        String SQL_PROMEDIO = "Select avg(calificacion1),avg(calificacion2),avg(calificacion3) from UsuarioTest";
         String resultado ="";
         double calificacionPRO1;
         double calificacionPRO2;
         double calificacionPRO3;
        try {
            PreparedStatement ps = cn.getConexion().prepareStatement(SQL_PROMEDIO);
            RS = ps.executeQuery();
            while(RS.next()) {
             calificacionPRO1=RS.getDouble(1);
             calificacionPRO2=RS.getDouble(2);
             calificacionPRO3=RS.getDouble(3);
             JOptionPane.showMessageDialog(null, "Promedio Global:\n"
                + "1.En general,¿ como califica la  experiencia  con el  juego?\n" +   calificacionPRO1 + "\n"
                + "2.¿consideras que el juego ha sido comprensible y adecuado con el desarrollo planteado en clase?\n" + calificacionPRO2 + "\n"
                + "3¿Estás de acuerdo o en desacuerdo con que el problema fue resuelto en el juego efectivamente?\n" + calificacionPRO3+ "\n");
            }
        } catch (SQLException e) {
            System.err.println("Error al listar los datos");
        }
        return resultado;
    }
     public double promedioCalifiacion2() {
        String SQL_PROMEDIO2 = "Select avg(calificacion2) from UsuarioTest";
        double resultado = 0;
        try {
            PreparedStatement ps = cn.getConexion().prepareStatement(SQL_PROMEDIO2);
            RS = ps.executeQuery();
            while(RS.next()) {
                resultado = RS.getDouble("promedio");
                // .. rest of your code
            }

        } catch (SQLException e) {
            System.err.println("Error al listar los datos");
        }
        return resultado;
    }
    
     public double promedioCalifiacion3() {
         
        String SQL_PROMEDIO3= "Select avg(calificacion3)from UsuarioTest";
        double resultado = 0;
        try {
            PreparedStatement ps = cn.getConexion().prepareStatement(SQL_PROMEDIO3);
            RS = ps.executeQuery();
            while(RS.next()) {
                resultado = RS.getDouble("promedio");
                // .. rest of your code
            }
        } catch (SQLException e) {
            System.err.println("Error al listar los datos");
        }
        return resultado;
    }
    
    
    
    public int getPreguntaUnoCalificacion() {
        return PreguntaUnoCalificacion;
    }

    public void setPreguntaUnoCalificacion(int PreguntaUnoCalificacion) {
        this.PreguntaUnoCalificacion = PreguntaUnoCalificacion;
    }

    public int getPreguntaDosCalificacion() {
        return PreguntaDosCalificacion;
    }

    public void setPreguntaDosCalificacion(int PreguntaDosCalificacion) {
        this.PreguntaDosCalificacion = PreguntaDosCalificacion;
    }

    public int getPreguntaTresCalificacion() {
        return PreguntaTresCalificacion;
    }

    public void setPreguntaTresCalificacion(int PreguntaTresCalificacion) {
        this.PreguntaTresCalificacion = PreguntaTresCalificacion;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(double calificacion) {
        this.calificacion1 = calificacion;
    }

    public int promedioCalificacion(int calificacion1, int calificacion2, int calificacion3) {
        int promedio;
        int suma = calificacion1 + calificacion2 + calificacion3;
        promedio = suma / 3;
        return promedio;
    }

}
