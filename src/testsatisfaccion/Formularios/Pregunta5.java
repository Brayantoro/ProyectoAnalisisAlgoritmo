
package testsatisfaccion.Formularios;

import com.uniquindio.proyectoanalisis.dtos.InformacionPrueba;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;




/**
 * @author  Brayan estiven gil toro
 * @author  Alba rocio 
 * @author  Fabian ramirez  bermudez 
 */
public class Pregunta5 extends javax.swing.JFrame {

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
    private int mejorCamino = 10;
    private int caminorecorrido = 0;

    /**
     * Creates new form Pregunta
     */
    public Pregunta5() {
        initComponents();
        inicializarTabla();
        setResizable(false);
    }

    private void inicializarTabla() {

        btnContinuar.setEnabled(false);
        matriz = new JButton[6][6];

        int posh = 100;
        int posv = 60;
        int fil = 0;
        int col = 0;

        for (col = 0; col < 6; col++) {
            for (fil = 0; fil < 6; fil++) {
                JButton boton = new JButton("");
                boton.setBackground(Color.decode("#66D7D1"));
                matriz[col][fil] = boton;
                matriz[col][fil].setBounds(posv, posh, 60, 60);
                add(matriz[col][fil]);
                posv += 60;
            }
            posh += 60;
            posv = 60;
        }
        //se agrega el punto de inicio y punto fin
        JButton inicio = matriz[4][1];
        Font font = new Font("", 1, 25);
        inicio.setText("🐕");
        inicio.setBackground(Color.decode("#FFF87F"));
        inicio.setFont(font);
        posicionActualI = 4;
        posicionActualJ = 1;

        JButton fin = matriz[2][5];
        Font font2 = new Font("", 1, 25);
        fin.setText("🍖");
        fin.setFont(font);
        fin.setBackground(Color.decode("#FF637D"));
        posicionFinalI = 2;
        posicionFinalJ = 5;

        //se agregan muros
        JButton muro = matriz[0][1];
        muro.setBackground(Color.decode("#EAF2E3"));

        muro = matriz[1][2];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[1][4];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[2][0];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[2][4];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[3][2];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[3][4];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[4][3];
        muro.setBackground(Color.decode("#EAF2E3"));
        muro = matriz[4][5];
        muro.setBackground(Color.decode("#EAF2E3"));

        this.repaint();
    }


    @SuppressWarnings("unchecked")
    //metodo que inica el juego y crea los datos dentro de la matriz
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnArriba1 = new javax.swing.JToggleButton();
        btnDerecha = new javax.swing.JToggleButton();
        btnIzquierda1 = new javax.swing.JToggleButton();
        btnAbajo = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btnCorrer = new javax.swing.JToggleButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Respuesta");

        txtRespuesta.setEditable(false);

        btnContinuar.setBackground(new java.awt.Color(255, 100, 125));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 215, 209));

        jLabel11.setBackground(new java.awt.Color(255, 99, 125));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 99, 125));
        jLabel11.setText("                </Nivel 5>");
        jLabel11.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnArriba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha_arriba1.png"))); // NOI18N
        btnArriba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArriba1ActionPerformed(evt);
            }
        });

        btnDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha_derecha1.png"))); // NOI18N
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnIzquierda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha_izquierda1.png"))); // NOI18N
        btnIzquierda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierda1ActionPerformed(evt);
            }
        });

        btnAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha_abajo1.png"))); // NOI18N
        btnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huella.png"))); // NOI18N

        btnCorrer.setBackground(new java.awt.Color(255, 100, 125));
        btnCorrer.setText("Corre Scooby");
        btnCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrerActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 100, 125));
        btnBorrar.setText("Borrar indicacion ");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnArriba1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnCorrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnIzquierda1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)))
                                    .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(btnArriba1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIzquierda1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnCorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
                            posActual.setText("🐕");
                            posActual.setBackground(Color.decode("#FFF87F"));
                            JOptionPane.showMessageDialog(null, "Oops te has salido de la malla de juego ☹️");
                            pruebaCorrecta = false;
                            choque = true;
                            break;
                        }

                        posAvance = matriz[posicionActualI][posicionActualJ];

                        //se valida si hubo choque con algun muro
                        if (posAvance.getBackground().equals(Color.decode("#EAF2E3"))) {
                            posActual.setFont(font);
                            posActual.setText("🐾");
                            posActual.setBackground(Color.decode("#66D7D1"));
                            posAvance.setText("🐕");
                            posAvance.setBackground(Color.RED);
                            posAvance.setFont(font);
                            JOptionPane.showMessageDialog(null, "Oops  el Scooby a chocado ☹️");
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
                            posActual.setText("🐕");
                            posActual.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops te has salido de la malla de juego ☹️");
                            pruebaCorrecta = false;
                            choque = true;
                            break;
                        }

                        posAvance = matriz[posicionActualI][posicionActualJ];
                        //se valida si hubo choque con algun muro
                        if (posAvance.getBackground().equals(Color.decode("#EAF2E3"))) {
                            posActual.setFont(font);
                            posActual.setText("🐾");
                            posActual.setBackground(Color.decode("#66D7D1"));
                            posActual.setFont(font);
                            posAvance.setText("🐕");
                            posAvance.setBackground(Color.RED);
                            posAvance.setFont(font);
                            JOptionPane.showMessageDialog(null, "Oops Scooby a chocado ☹️");
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
                            posActual.setText("🐕");
                            posActual.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops te has salido de la malla de juego ☹️");
                            pruebaCorrecta = false;
                            choque = true;
                            break;
                        }

                        posAvance = matriz[posicionActualI][posicionActualJ];

                        System.out.println("a" + posicionActualJ);
                        //se valida si hubo choque con algun muro
                        if (posAvance.getBackground().equals(Color.decode("#EAF2E3"))) {
                            posActual.setFont(font);
                            posActual.setText("🐾");
                            posActual.setBackground(Color.decode("#66D7D1"));
                            posAvance.setFont(font);
                            posAvance.setText("🐕");
                            posAvance.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops Scooby a chocado ☹️");
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
                            posActual.setText("🐕");
                            posActual.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops te has salido de la malla de juego ☹️");
                            pruebaCorrecta = false;
                            choque = true;
                            break;
                        }

                        posAvance = matriz[posicionActualI][posicionActualJ];

                        //se valida si hubo choque con algun muro
                        if (posAvance.getBackground().equals(Color.decode("#EAF2E3"))) {
                            posActual.setFont(font);
                            posActual.setText("🐾");
                            posActual.setBackground(Color.decode("#66D7D1"));
                            posAvance.setFont(font);
                            posAvance.setText("🐕");
                            posAvance.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "Oops Scooby se a chocado ☹️");
                            choque = true;
                            pruebaCorrecta = false;
                            break;
                        }
                    }
                    posActual.setFont(font);
                    posActual.setText("🐾");
                    posActual.setBackground(Color.decode("#66D7D1"));
                    posAvance.setFont(font);
                    posAvance.setText("🐕");
                    posAvance.setBackground(Color.decode("#FFF87F"));
                }

                if (posicionActualI == posicionFinalI
                        && posicionActualJ == posicionFinalJ
                        && caminorecorrido == mejorCamino) {

                    pruebaCorrecta = true;
                    JOptionPane.showMessageDialog(null, "Felicitaciones \n has ayudado a Scooby a encontrar su hueso 😋 ");

                } else if (posicionActualI == posicionFinalI
                        && posicionActualJ == posicionFinalJ
                        && caminorecorrido != mejorCamino) {

                    pruebaCorrecta = true;
                    JOptionPane.showMessageDialog(null, "Bien hecho, has ayudado Scooby a encontrar su hueso");

                } else if (!choque) {

                    pruebaCorrecta = false;
                    JOptionPane.showMessageDialog(null, "Oops Scooby no enontro el hueso 😢");
                }
                return null;
            }
        };
        Worker.execute();
    }

    private void btnArriba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArriba1ActionPerformed
        // TODO add your handling code here:
        if (agregarIntrucciones) {
            instrucciones.add(0);
            txtRespuesta.setText(txtRespuesta.getText() + "🡱 ️");
        }
    }//GEN-LAST:event_btnArriba1ActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        // TODO add your handling code here:
        if (agregarIntrucciones) {
            instrucciones.add(3);
            txtRespuesta.setText(txtRespuesta.getText() + "🡲 ️");
        }
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnIzquierda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierda1ActionPerformed
        // TODO add your handling code here:
        if (agregarIntrucciones) {
            instrucciones.add(2);
            txtRespuesta.setText(txtRespuesta.getText() + "🡰 ️");
        }
    }//GEN-LAST:event_btnIzquierda1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed

        //resultado prueba
        if (caminorecorrido == mejorCamino && pruebaCorrecta) {
            infoPrueba.setResultadoPrueba5(3);
        } else if (pruebaCorrecta && caminorecorrido != mejorCamino) {
            infoPrueba.setResultadoPrueba5(2);
        } else {
            infoPrueba.setResultadoPrueba5(1);
        }
        infoPrueba.setPrueba5Solucionada(pruebaCorrecta);

        Resumen resumen = new Resumen();
        resumen.infoPrueba = infoPrueba;

        if (infoPrueba.isPrueba1Solucionada()) {
            resumen.btnRes1.setText("Correcto");
            resumen.btnRes1.setBackground(Color.YELLOW);
        } else {
            resumen.btnRes1.setText("Incorrecto");
            resumen.btnRes1.setBackground(Color.RED);
        }

        if (infoPrueba.isPrueba2Solucionada()) {
            resumen.btnRes2.setText("Correcto");
            resumen.btnRes2.setBackground(Color.YELLOW);
        } else {
            resumen.btnRes2.setText("Incorrecto");
            resumen.btnRes2.setBackground(Color.RED);
        }

        if (infoPrueba.isPrueba3Solucionada()) {
            resumen.btnRes3.setText("Correcto");
            resumen.btnRes3.setBackground(Color.YELLOW);
        } else {
            resumen.btnRes3.setText("Incorrecto");
            resumen.btnRes3.setBackground(Color.RED);
        }

        if (infoPrueba.isPrueba4Solucionada()) {
            resumen.btnRes4.setText("Correcto");
            resumen.btnRes4.setBackground(Color.YELLOW);
        } else {
            resumen.btnRes4.setText("Incorrecto");
            resumen.btnRes4.setBackground(Color.RED);
        }

        if (infoPrueba.isPrueba5Solucionada()) {
            resumen.btnres5.setText("Correcto");
            resumen.btnres5.setBackground(Color.YELLOW);
        } else {
            resumen.btnres5.setText("Incorrecto");
            resumen.btnres5.setBackground(Color.RED);
        }

        resumen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoActionPerformed
        // TODO add your handling code here:
        if (agregarIntrucciones) {
            instrucciones.add(1);
            txtRespuesta.setText(txtRespuesta.getText() + "🡻 ️");
        }
    }//GEN-LAST:event_btnAbajoActionPerformed

    private void btnCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerActionPerformed
        // TODO add your handling code here:

        if (instrucciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes darle indicaciones al perrito");
        } else {

            agregarIntrucciones = false;
            System.out.print(instrucciones);
            btnContinuar.setEnabled(true);
            btnCorrer.setEnabled(false);
            btnBorrar.setEnabled(false);

            runGame();

        }
    }//GEN-LAST:event_btnCorrerActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAbajo;
    private javax.swing.JToggleButton btnArriba1;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JToggleButton btnCorrer;
    private javax.swing.JToggleButton btnDerecha;
    private javax.swing.JToggleButton btnIzquierda1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
