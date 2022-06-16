package proyectoMain;

import testsatisfaccion.Formularios.Inicio;
import testsatisfaccion.conexion.conexion;

/**
 *
 * @author 1
 */
public class Main {

    //metodo main donde se inicializa la primera ventana 
    public static void main(String[] args) {
         
        Inicio inicioVentana=new Inicio();
        inicioVentana.setVisible(true);
     
        conexion  c=new conexion();
        c.getConexion();
       
    }

    
}
