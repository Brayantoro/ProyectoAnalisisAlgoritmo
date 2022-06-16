/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniquindio.proyectoanalisis.dtos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import testsatisfaccion.conexion.conexion;

/**
 * @author  Brayan estiven gil toro
 * @author  Alba marin 
 * @author  Fabian ramirez  bermudez 
 */
public class InformacionPrueba {

    private String nombreEstudiante;
    private  String  cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    private int resultadoPrueba1;
    private int resultadoPrueba2;
    private int resultadoPrueba3;
    private int resultadoPrueba4;
    private int resultadoPrueba5;

    private boolean prueba1Solucionada;
    private boolean prueba2Solucionada;
    private boolean prueba3Solucionada;
    private boolean prueba4Solucionada;
    private boolean prueba5Solucionada;

    public boolean isPrueba1Solucionada() {
        return prueba1Solucionada;
    }

    public void setPrueba1Solucionada(boolean prueba1Solucionada) {
        this.prueba1Solucionada = prueba1Solucionada;
    }

    public boolean isPrueba2Solucionada() {
        return prueba2Solucionada;
    }

    public void setPrueba2Solucionada(boolean prueba2Solucionada) {
        this.prueba2Solucionada = prueba2Solucionada;
    }

    public boolean isPrueba3Solucionada() {
        return prueba3Solucionada;
    }

    public void setPrueba3Solucionada(boolean prueba3Solucionada) {
        this.prueba3Solucionada = prueba3Solucionada;
    }

    public boolean isPrueba4Solucionada() {
        return prueba4Solucionada;
    }

    public void setPrueba4Solucionada(boolean prueba4Solucionada) {
        this.prueba4Solucionada = prueba4Solucionada;
    }

    public boolean isPrueba5Solucionada() {
        return prueba5Solucionada;
    }

    public void setPrueba5Solucionada(boolean prueba5Solucionada) {
        this.prueba5Solucionada = prueba5Solucionada;
    }

    public int getResultadoPrueba1() {
        return resultadoPrueba1;
    }

    public void setResultadoPrueba1(int resultadoPrueba1) {
        this.resultadoPrueba1 = resultadoPrueba1;
    }

    public int getResultadoPrueba2() {
        return resultadoPrueba2;
    }

    public void setResultadoPrueba2(int resultadoPrueba2) {
        this.resultadoPrueba2 = resultadoPrueba2;
    }

    public int getResultadoPrueba3() {
        return resultadoPrueba3;
    }

    public void setResultadoPrueba3(int resultadoPrueba3) {
        this.resultadoPrueba3 = resultadoPrueba3;
    }

    public int getResultadoPrueba4() {
        return resultadoPrueba4;
    }

    public void setResultadoPrueba4(int resultadoPrueba4) {
        this.resultadoPrueba4 = resultadoPrueba4;
    }

    public int getResultadoPrueba5() {
        return resultadoPrueba5;
    }

    public void setResultadoPrueba5(int resultadoPrueba5) {
        this.resultadoPrueba5 = resultadoPrueba5;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    //variables para utilizar consultas en la base de datos 
    private final String SQL_INSERT = "INSERT INTO  CalificacionUsu (resultadoPrueba1,resultadoPrueba2,resultadoPrueba3,resultadoPrueba4,resultadoPrueba5,puntaje,Cedula) VALUES (?,?,?,?,?,?,?)";
    // private final String SQL_SELECT = "Select avg(calificacion1)as pronedio from UsuarioTest ";
    private PreparedStatement ps;
    private DefaultTableModel DT;
    private ResultSet RS;

    private final conexion cn;

    public InformacionPrueba() {
        cn = new conexion();
    }

    //metodo que inserta  los datos de la preguntas en la base de datos 
    public int insertarDatosPrueba( double resultadoPrueba1, 
            double resultadoPrueba2, double resultadoPrueba3, double resultadoPrueba4, 
            double resultadoPrueba5, double puntaje, int Cedula) {
        
        int respuesta = 0;
        try {
            PreparedStatement ps = cn.getConexion().prepareStatement(SQL_INSERT);
            ps.setDouble(1, resultadoPrueba1);
            ps.setDouble(2, resultadoPrueba2);
            ps.setDouble(3, resultadoPrueba3);
            ps.setDouble(4, resultadoPrueba4);
            ps.setDouble(5, resultadoPrueba5);
            ps.setDouble(6, puntaje);
            ps.setInt(7, Cedula);
            respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Respuestas del usuario almacenadas exitosamente");
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos" + e.getMessage());
        }
        return respuesta;
    }

}
