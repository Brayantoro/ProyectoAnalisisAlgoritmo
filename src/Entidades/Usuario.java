package Entidades;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import testsatisfaccion.conexion.conexion;


/**
 * @author  Brayan estiven gil toro
 * @author  Alba rocio 
 * @author  Fabian ramirez  bermudez 
 */
public class Usuario {

    private int codigo;
    private String nombre;
    private int edad;
    private String cedula;
    private final String SQL_INSERT = "INSERT INTO Usuario (Cedula,Nombre,Promedio) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM Usuario ORDER BY promedio desc";
    private PreparedStatement ps;
    private DefaultTableModel DT;
    private ResultSet RS;

    private final conexion cn;

    public Usuario() {
        cn = new conexion();
    }

    private DefaultTableModel setTitulos() {
        DT = new DefaultTableModel();
        DT.addColumn("Cedula");
        DT.addColumn("Nombre");
        DT.addColumn("Promedio");
        return DT;
    }

    public int insertarDatos(int cedula, String nombre,double promedio) {
        int respuesta = 0;
        try {
            PreparedStatement ps = cn.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, cedula);
            ps.setString(2, nombre);
            ps.setDouble(3,promedio);
            respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar al usuario, causa: " + e.getMessage());
        }
        return respuesta;
    }

    
    public Double[] calcularPromediosPreguntas() {
        Double[] lista = new Double[5];
        ResultSet rs;
        try {
            String consulta = "SELECT avg(resultadoPrueba1), avg(resultadoPrueba2),"
                    + " avg(resultadoPrueba3), avg(resultadoPrueba4), avg(resultadoPrueba5)   "
                    + " from CalificacionUsu ";
            PreparedStatement ps = cn.getConexion().prepareStatement(consulta);

            rs = ps.executeQuery();

            while (rs.next()) {
                // Position the cursor                  4 
                lista[0] = Double.parseDouble(rs.getString(1));        // Retrieve the first column value
                lista[1] = Double.parseDouble(rs.getString(2));        // Retrieve the first column value
                lista[2] = Double.parseDouble(rs.getString(3));        // Retrieve the first column value
                lista[3] = Double.parseDouble(rs.getString(4));        // Retrieve the first column value
                lista[4] = Double.parseDouble(rs.getString(5));        // Retrieve the first column value
            }

        } catch (SQLException e) {
            System.out.println("Error al calcular los promedios de las preguntas, causa: " + e.getMessage());
        }
        return lista;
    }

    public Integer calcularTotaleRespuestas() {

        int respuesta1 = 0;
        String consultaCorrecta1 = " SELECT COUNT(*) FROM CalificacionUsu ";
        try {
            PreparedStatement ps1 = cn.getConexion().prepareStatement(consultaCorrecta1);
            ResultSet RS1;
            RS1 = ps1.executeQuery();

            while (RS1.next()) {
                respuesta1 = RS1.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("sas");
        }
        return respuesta1;
    }

    public Integer[] calcularTotalesIncorrectas() {

        //correctas
        int respuesta1 = 0;
        int respuesta2 = 0;
        int respuesta3 = 0;
        int respuesta4 = 0;
        int respuesta5 = 0;
        Integer[] lista = new Integer[10];

        String consultaCorrecta1 = " SELECT COUNT(resultadoPrueba1) FROM CalificacionUsu "
                + " WHERE resultadoPrueba1 = 1  ";
        String consultaCorrecta2 = " SELECT COUNT(resultadoPrueba2) FROM CalificacionUsu "
                + " WHERE resultadoPrueba2 = 1  ";
        String consultaCorrecta3 = " SELECT COUNT(resultadoPrueba3) FROM CalificacionUsu "
                + " WHERE resultadoPrueba3 = 1  ";
        String consultaCorrecta4 = " SELECT COUNT(resultadoPrueba4) FROM CalificacionUsu "
                + " WHERE resultadoPrueba4 = 1  ";
        String consultaCorrecta5 = " SELECT COUNT(resultadoPrueba5) FROM CalificacionUsu "
                + " WHERE resultadoPrueba5 = 1  ";

        try {
            PreparedStatement ps1 = cn.getConexion().prepareStatement(consultaCorrecta1);
            ResultSet RS1;
            RS1 = ps1.executeQuery();

            while (RS1.next()) {
                respuesta1 = RS1.getInt(1);
            }

            PreparedStatement ps2 = cn.getConexion().prepareStatement(consultaCorrecta2);
            ResultSet RS2;
            RS2 = ps2.executeQuery();

            while (RS2.next()) {
                respuesta2 = RS2.getInt(1);
            }

            PreparedStatement ps3 = cn.getConexion().prepareStatement(consultaCorrecta3);
            ResultSet RS3;
            RS3 = ps3.executeQuery();

            while (RS3.next()) {
                respuesta3 = RS3.getInt(1);
            }
            PreparedStatement ps4 = cn.getConexion().prepareStatement(consultaCorrecta4);
            ResultSet RS4;
            RS4 = ps4.executeQuery();

            while (RS4.next()) {
                respuesta4 = RS4.getInt(1);
            }
            PreparedStatement ps5 = cn.getConexion().prepareStatement(consultaCorrecta5);
            ResultSet RS5;
            RS5 = ps5.executeQuery();

            while (RS5.next()) {
                respuesta5 = RS5.getInt(1);
            }

        } catch (SQLException e) {
            System.out.println("aa");
        }

        lista[0] = respuesta1;
        lista[1] = respuesta2;
        lista[2] = respuesta3;
        lista[3] = respuesta4;
        lista[4] = respuesta5;

        return lista;
    }

    public int eliminarDatos(int cedula) {
        String SQL_ELIMINAR = "DELETE FROM Usuario WHERE Cedula=" + cedula;
        int respuesta = 0;
        try {

            PreparedStatement ps = cn.getConexion().prepareStatement(SQL_ELIMINAR);
            respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado con exito");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar " + e.getMessage());
        }
        return respuesta;
    }

    public DefaultTableModel getDatos() {
        try {
            setTitulos();
            PreparedStatement ps = cn.getConexion().prepareStatement(SQL_SELECT);
            RS = ps.executeQuery();
            Object[] fila = new Object[3];
            while (RS.next()) {
                fila[0] = RS.getInt(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getDouble(3);
                DT.addRow(fila);

            }

        } catch (SQLException e) {
            System.err.println("Error al listar los datos de los usuarios, causa : " + e.getMessage());
        }
        return DT;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
