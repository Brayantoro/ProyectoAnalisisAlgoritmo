package testsatisfaccion.Formularios;

import Entidades.Usuario;
import com.uniquindio.proyectoanalisis.dtos.InformacionPrueba;

/**
 * @author Brayan estiven gil toro
 * @author Alba rocio
 * @author Fabian ramirez bermudez
 */
public class Resumen extends javax.swing.JFrame {

    public InformacionPrueba infoPrueba;
    private final Usuario usu;
    private final Inicio inicio;

    /**
     * Creates new form Resumen
     */
    public Resumen() {
        usu = new Usuario();
        inicio = new Inicio();
        initComponents();
        inicializarInformacion();

    }

    private void inicializarInformacion() {
        //nombreEstudiante.setText(infoPrueba.getNombreEstudiante());
        //resultado1.setText(infoPrueba.getResultadoPrueba1().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreEstudiante = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonContinuar = new javax.swing.JButton();
        btnRes1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRes2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRes3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRes4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnres5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perrito55.gif"))); // NOI18N

        jLabel2.setText("Estudiante");

        nombreEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setText("Resultado nivel 1: ");

        jButtonContinuar.setBackground(new java.awt.Color(255, 99, 125));
        jButtonContinuar.setText("Continuar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        btnRes1.setText("resultado1");
        btnRes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRes1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado nivel 2: ");

        btnRes2.setText("resultado1");
        btnRes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRes2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Resultado nivel 3: ");

        btnRes3.setText("resultado1");

        jLabel6.setText("Resultado nivel 4: ");

        btnRes4.setText("resultado1");

        jLabel7.setText("Resultado nivel 5: ");

        btnres5.setText("resultado1");

        jPanel2.setBackground(new java.awt.Color(102, 215, 209));

        jLabel8.setBackground(new java.awt.Color(255, 99, 125));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 99, 125));
        jLabel8.setText("                </ Tus Resultados >");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nombreEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRes4)
                            .addComponent(btnres5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRes3)
                                .addComponent(btnRes2)
                                .addComponent(btnRes1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRes1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRes2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRes3)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRes4)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(btnres5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
//        UsuarioFormulario ventana = new UsuarioFormulario();
//        ventana.setVisible(true);
//        this.setVisible(false);

        double pregunta1 = infoPrueba.getResultadoPrueba1();
        double pregunta2 = infoPrueba.getResultadoPrueba2();
        double pregunta3 = infoPrueba.getResultadoPrueba3();
        double pregunta4 = infoPrueba.getResultadoPrueba4();
        double pregunta5 = infoPrueba.getResultadoPrueba5();

        int cedula = Integer.parseInt(infoPrueba.getCedula());

        double suma = pregunta1 + pregunta2 + pregunta3 + pregunta4 + pregunta5;
        double puntaje = suma / 5;

        String nombre = Inicio.datoRecuperadoNombre;
        usu.insertarDatos(cedula, nombre, puntaje);

        infoPrueba.insertarDatosPrueba(pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, puntaje, cedula);

        testFormulario ventaTest = new testFormulario();
        ventaTest.infoPrueba = infoPrueba;
        ventaTest.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void btnRes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRes1ActionPerformed

    private void btnRes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRes2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnRes1;
    public static javax.swing.JButton btnRes2;
    public static javax.swing.JButton btnRes3;
    public static javax.swing.JButton btnRes4;
    public static javax.swing.JButton btnres5;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel nombreEstudiante;
    // End of variables declaration//GEN-END:variables
}
