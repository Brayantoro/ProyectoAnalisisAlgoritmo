/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testsatisfaccion.Formularios;

import com.uniquindio.proyectoanalisis.dtos.InformacionPrueba;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 * @author Brayan estiven gil toro
 * @author Alba rocio
 * @author Fabian ramirez bermudez
 */
public class Pregunta1 extends javax.swing.JFrame {

    // itrcucciones
    // 0 -> arriba
    // 1 -> abajo
    // 2 -> izquierda
    // 3 -> derecha
    private List<Integer> instrucciones = new ArrayList<>();

    private boolean agregarIntrucciones = true;

    Inicio inicio = new Inicio();
    public InformacionPrueba infoPrueba;
    private int posicionActualI;
    private int posicionActualJ;
    private int posicionFinalI;
    private int posicionFinalJ;
    private JButton[][] matriz;
    private boolean pruebaCorrecta = true;
    private int mejorCamino = 4;
    private int caminorecorrido = 0;

    Icon comeGalleta;

    private String img_personaje = "C:\\Users\\Sebastian Alzate\\Documents\\alba\\imagenes\\posicion.png";

    /**
     * Creates new form Pregunta
     */
    public Pregunta1() {
        initComponents();
        inicializarTabla();
        setResizable(false);

    }

    public static int datoRecuperado1 = 0;

   // metodo que inicializa los datos de la la tabla para ver en la matriz de 6 po 6
    //se asignan los colores y figuras
    private void inicializarTabla() {

        File imageCheck = new File(img_personaje);

        if (imageCheck.exists()) {
            System.out.println("Image file found!");

        } else {
            System.out.println("Image file not found!");
        }

        btnContinuar.setEnabled(false);
        System.out.println(img_personaje);

        matriz = new JButton[6][6];

        int posh = 100;
        int posv = 60;
        int fil = 0;
        int col = 0;

        for (col = 0; col < 6; col++) {
            for (fil = 0; fil < 6; fil++) {
                JButton boton = new JButton("");

                boton.setBackground(Color.decode("#66D7D1"));
//                boton.setBackground(Color.GREEN);
                matriz[col][fil] = boton;
                matriz[col][fil].setBounds(posv, posh, 60, 60);
                add(matriz[col][fil]);
                posv += 60;
            }
            posh += 60;
            posv = 60;
        }

        JButton inicio = matriz[5][2];
        Font font = new Font("", 1, 25);
        inicio.setText("????");
        inicio.setBackground(Color.decode("#FFF87F"));
        inicio.setFont(font);
//        inicio.setfo
        posicionActualI = 5;
        posicionActualJ = 2;

        JButton fin = matriz[3][4];
        Font font2 = new Font("", 1, 25);
        fin.setText("????");
        fin.setFont(font);
        fin.setBackground(Color.decode("#FF637D"));
        posicionFinalI = 3;
        posicionFinalJ = 4;

        //se agregan muros
        JButton muro = matriz[0][0];
        muro.setBackground(Color.decode("#EAF2E3"));

        muro = matriz[0][1];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[1][2];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[1][3];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[1][4];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[1][5];
        muro.setBackground(Color.decode("#EAF2E3"));

        muro = matriz[2][1];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[3][1];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[3][1];
        muro.setBackground(Color.decode("#EAF2E3"));

        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIzquierda = new javax.swing.JToggleButton();
        btnDerecha = new javax.swing.JToggleButton();
        btnAbajo = new javax.swing.JToggleButton();
        btnCorrer = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        btnArriba = new javax.swing.JToggleButton();
        btnContinuar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha_izquierda1.png"))); // NOI18N
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        btnDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha_derecha1.png"))); // NOI18N
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha_abajo1.png"))); // NOI18N
        btnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoActionPerformed(evt);
            }
        });

        btnCorrer.setBackground(new java.awt.Color(255, 100, 125));
        btnCorrer.setText("Corre Scooby");
        btnCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrerActionPerformed(evt);
            }
        });

        jLabel1.setText("Respuesta");

        txtRespuesta.setEditable(false);
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });

        btnArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha_arriba1.png"))); // NOI18N
        btnArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaActionPerformed(evt);
            }
        });

        btnContinuar.setBackground(new java.awt.Color(255, 100, 125));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 100, 125));
        btnBorrar.setText("Borrar indicacion ");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 215, 209));

        jLabel10.setBackground(new java.awt.Color(255, 99, 125));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 99, 125));
        jLabel10.setText("                </Nivel 1>");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huella.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRespuesta))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCorrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42)))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(btnArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        // TODO add your handling code here:
        if (agregarIntrucciones) {
            instrucciones.add(2);
            txtRespuesta.setText(txtRespuesta.getText() + "???? ???");
        }
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        // TODO add your handling code here:
        if (agregarIntrucciones) {
            instrucciones.add(3);
            txtRespuesta.setText(txtRespuesta.getText() + "???? ???");
        }
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoActionPerformed
        // TODO add your handling code here:
        if (agregarIntrucciones) {
            instrucciones.add(1);
            txtRespuesta.setText(txtRespuesta.getText() + "???? ???");
        }
    }//GEN-LAST:event_btnAbajoActionPerformed

    private void btnCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerActionPerformed

        if (instrucciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes darle indicaciones a Scooby");
        } else {

            agregarIntrucciones = false;
            System.out.print(instrucciones);
            btnContinuar.setEnabled(true);
            btnCorrer.setEnabled(false);
            btnBorrar.setEnabled(false);

            runGame();
        }

    }//GEN-LAST:event_btnCorrerActionPerformed

    private void runGame() {
        SwingWorker<Void, String> Worker;
        Worker = new SwingWorker<Void, String>() {

            @Override
            protected Void doInBackground() throws Exception {
                boolean choque = false;
                Font font = new Font("", 1, 25);
                for (Integer instruccione : instrucciones) {
                    caminorecorrido += 1;
                    JButton posActual = new JButton();
                    JButton posAvance = new JButton();;
                    Thread.sleep(1000);

                    //arriba
                    if (instruccione == 0) {
                        posActual = matriz[posicionActualI][posicionActualJ];
                        posicionActualI = posicionActualI - 1;

                        //se valida si se sale de las dimensiones
                        if (posicionActualI < 0) {
                            posActual.setFont(font);
                            posActual.setText("????");
                            posActual.setBackground(Color.decode("#FFF87F"));
                            JOptionPane.showMessageDialog(null, "Oops te has salido de la malla de juego ??????");
                            pruebaCorrecta = false;
                            choque = true;
                            break;
                        }

                        posAvance = matriz[posicionActualI][posicionActualJ];

                        //se valida si hubo choque con algun muro
                        if (posAvance.getBackground().equals(Color.decode("#EAF2E3"))) {
                            posActual.setFont(font);
                            posActual.setText("????");
                            posActual.setBackground(Color.decode("#66D7D1"));
                            posAvance.setText("????");
                            posAvance.setBackground(Color.RED);
                            posAvance.setFont(font);
                            JOptionPane.showMessageDialog(null, "Oops  el Scooby a chocado ??????");
                            choque = true;
                            pruebaCorrecta = false;
                            break;
                        }
                    }

                    //abajo
                    if (instruccione == 1) {
                        posActual = matriz[posicionActualI][posicionActualJ];
                        posicionActualI = posicionActualI + 1;

                        //se valida si se sale de las dimensiones
                        if (posicionActualI > 5) {
                            posActual.setFont(font);
                            posActual.setText("????");
                            posActual.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops te has salido de la malla de juego ??????");
                            pruebaCorrecta = false;
                            choque = true;
                            break;
                        }

                        posAvance = matriz[posicionActualI][posicionActualJ];
                        //se valida si hubo choque con algun muro
                        if (posAvance.getBackground().equals(Color.decode("#EAF2E3"))) {
                            posActual.setFont(font);
                            posActual.setText("????");
                            posActual.setBackground(Color.decode("#66D7D1"));
                            posActual.setFont(font);
                            posAvance.setText("????");
                            posAvance.setBackground(Color.RED);
                            posAvance.setFont(font);
                            JOptionPane.showMessageDialog(null, "Oops Scooby a chocado ??????");
                            choque = true;
                            pruebaCorrecta = false;
                            break;
                        }
                    }

                    //Izquierda
                    if (instruccione == 2) {
                        System.out.println(posicionActualJ);
                        posActual = matriz[posicionActualI][posicionActualJ];
                        posicionActualJ = posicionActualJ - 1;

                        //se valida si se sale de las dimensiones
                        if (posicionActualJ < 0) {
                            posActual.setFont(font);
                            posActual.setText("????");
                            posActual.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops te has salido de la malla de juego ??????");
                            pruebaCorrecta = false;
                            choque = true;
                            break;
                        }

                        posAvance = matriz[posicionActualI][posicionActualJ];

                        System.out.println("a" + posicionActualJ);
                        //se valida si hubo choque con algun muro
                        if (posAvance.getBackground().equals(Color.decode("#EAF2E3"))) {
                            posActual.setFont(font);
                            posActual.setText("????");
                            posActual.setBackground(Color.decode("#66D7D1"));
                            posAvance.setFont(font);
                            posAvance.setText("????");
                            posAvance.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops Scooby a chocado ??????");
                            choque = true;
                            pruebaCorrecta = false;
                            break;
                        }
                    }

                    //Derecha
                    if (instruccione == 3) {
                        posActual = matriz[posicionActualI][posicionActualJ];
                        posicionActualJ = posicionActualJ + 1;

                        //se valida si se sale de las dimensiones
                        if (posicionActualJ > 5) {
                            posActual.setFont(font);
                            posActual.setText("????");
                            posActual.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops te has salido de la malla de juego ??????");
                            pruebaCorrecta = false;
                            choque = true;
                            break;
                        }

                        posAvance = matriz[posicionActualI][posicionActualJ];

                        //se valida si hubo choque con algun muro
                        if (posAvance.getBackground().equals(Color.decode("#EAF2E3"))) {
                            posActual.setFont(font);
                            posActual.setText("????");
                            posActual.setBackground(Color.decode("#66D7D1"));
                            posAvance.setFont(font);
                            posAvance.setText("????");
                            posAvance.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops Scooby se a chocado ??????");
                            choque = true;
                            pruebaCorrecta = false;
                            break;
                        }
                    }
                    posActual.setFont(font);
                    posActual.setText("????");
                    posActual.setBackground(Color.decode("#66D7D1"));
                    posAvance.setFont(font);
                    posAvance.setText("????");
                    posAvance.setBackground(Color.decode("#FFF87F"));
                }

                if (posicionActualI == posicionFinalI
                        && posicionActualJ == posicionFinalJ
                        && caminorecorrido == mejorCamino) {

                    pruebaCorrecta = true;
                    JOptionPane.showMessageDialog(null, "Felicitaciones \n has ayudado a Scooby a encontrar su hueso ???? ");

                } else if (posicionActualI == posicionFinalI
                        && posicionActualJ == posicionFinalJ
                        && caminorecorrido != mejorCamino) {

                    pruebaCorrecta = true;
                    JOptionPane.showMessageDialog(null, "Bien hecho, has ayudado Scooby a encontrar su hueso");

                } else if (!choque) {

                    pruebaCorrecta = false;
                    JOptionPane.showMessageDialog(null, "Oops Scooby no enontro el hueso ????");
                }
                return null;
            }
        };
        Worker.execute();
    }


    private void btnArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaActionPerformed
        // TODO add your handling code here:
        if (agregarIntrucciones) {
            instrucciones.add(0);
            txtRespuesta.setText(txtRespuesta.getText() + "???? ???");
        }
    }//GEN-LAST:event_btnArribaActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed

        //resultado prueba
        if (caminorecorrido == mejorCamino && pruebaCorrecta) {
            infoPrueba.setResultadoPrueba1(3);
        } else if (pruebaCorrecta && caminorecorrido != mejorCamino) {
            infoPrueba.setResultadoPrueba1(2);
        } else {
            infoPrueba.setResultadoPrueba1(1);
        }

        infoPrueba.setPrueba1Solucionada(pruebaCorrecta);

        Pregunta2 pregunta2 = new Pregunta2();
        pregunta2.infoPrueba = infoPrueba;
        pregunta2.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        instrucciones.remove(instrucciones.size() - 1);
        String[] res = txtRespuesta.getText().split(" ");
        int index = res.length;
        String res2 = "";
        for (int i = 0; i < index - 1; i++) {
            res2 += " " + res[i].trim();
        }
        txtRespuesta.setText(res2);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAbajo;
    private javax.swing.JToggleButton btnArriba;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JToggleButton btnCorrer;
    private javax.swing.JToggleButton btnDerecha;
    private javax.swing.JToggleButton btnIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
