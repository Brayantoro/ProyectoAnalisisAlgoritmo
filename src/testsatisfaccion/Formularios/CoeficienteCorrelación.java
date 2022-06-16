package testsatisfaccion.Formularios;

import Entidades.UsuarioTest;
import com.uniquindio.proyectoanalisis.dtos.InformacionPrueba;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.math.plot.Plot2DPanel;
import org.math.plot.plotObjects.BaseLabel;


/**
 * @author  Brayan estiven gil toro
 * @author  Alba rocio 
 * @author  Fabian ramirez  bermudez 
 */
public class CoeficienteCorrelación {
   
  
    
    public InformacionPrueba infoPrueba;
    
    //variables para obtener los resultados de las respuestas del test
        double pregunta1 = infoPrueba.getResultadoPrueba1();
        double pregunta2 = infoPrueba.getResultadoPrueba2();
        double pregunta3 = infoPrueba.getResultadoPrueba3();
        double pregunta4 = infoPrueba.getResultadoPrueba4();
        double pregunta5 = infoPrueba.getResultadoPrueba5();
        
    public UsuarioTest usuarioTes;
       
     double calificacion1=usuarioTes.getCalificacion1(); 
     double calificacion2=usuarioTes.getCalificacion2();      
     double calificacion3=usuarioTes.getCalificacion3();

     
    double[] x = {pregunta1,pregunta2,pregunta3,pregunta4,pregunta5};
    double[] y = {calificacion1,calificacion2,calificacion3};

    //Valores 
    SimpleRegression sr = new SimpleRegression();
    Plot2DPanel plot = new Plot2DPanel();
    JTextArea resultados = new JTextArea();

    public void coeficienteCorrelación() {
        for (int i = 0; i < x.length; i++) {
            sr.addData(x[i], y[i]);

        }
        double[] valoresCalculadosY = new double[y.length];
        for (int i = 0; i < x.length; i++) {
            valoresCalculadosY[i] = sr.predict(x[i]);
        }
        
        plot.addLegend("SOUTH");
        plot.addScatterPlot("Dartos", x, y);
        plot.addLinePlot("regresion", valoresCalculadosY);
        BaseLabel titulo = new BaseLabel("COEFICIENTE DE CORRELACION ", Color.BLACK, 0.5, 1);
        plot.addPlotable(titulo);
        resultados.setBackground(Color.lightGray);
        resultados.append("Datos leidos " + sr.getN());
        resultados.append("\nOrdednada al origen " + sr.getIntercept());
        resultados.append("\nPendiente " + sr.getSlope());
        resultados.append("\nRaiz cuadrada" + sr.getRSquare());
        resultados.append("\nValor Min" + StatUtils.min(y));
        resultados.append("\nValor max " + StatUtils.max(y));
        resultados.append("\nValor promedio " + StatUtils.mean(y));
        resultados.append("\nSuma " + StatUtils.sum(y));

        JFrame frame = new JFrame("Coeficiente de correlacion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.add(plot, BorderLayout.CENTER);
        frame.add(resultados, BorderLayout.SOUTH);
        frame.setVisible(true);

    }
}
