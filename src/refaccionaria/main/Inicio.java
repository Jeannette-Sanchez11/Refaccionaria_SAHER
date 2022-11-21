package refaccionaria.main;

import java.awt.*;
import java.sql.Connection;
import javax.swing.*;
import refaccionaria.Acciones.Conexion;
import refaccionaria.Validaciones.ValidarC;

public class Inicio extends javax.swing.JFrame {

    private static Inicio main;
    fondo fd = new fondo();
    Conexion c = new Conexion();
    Connection conex;
    ValidarC v = new ValidarC();

    public Inicio() {
        conex = c.ConectarBD();
        this.setContentPane(fd);
        initComponents();
        init();
        setResizable(false);
    }

    private void init() {
        main = this;
        titleBar2.initJFram(this);
    }
    public void limpiar(){
        usuarioTxt.setText("");
        contraTxt.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hide = new javax.swing.JPanel();
        titleBar2 = new refaccionaria.swing.titlebar.TitleBar();
        usuarioTxt = new javax.swing.JTextField();
        contraTxt = new javax.swing.JPasswordField();
        ingresoB = new javax.swing.JPanel();
        IngresoB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        hide.setBackground(new java.awt.Color(255, 255, 255));
        hide.setPreferredSize(new java.awt.Dimension(400, 23));

        javax.swing.GroupLayout hideLayout = new javax.swing.GroupLayout(hide);
        hide.setLayout(hideLayout);
        hideLayout.setHorizontalGroup(
            hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        hideLayout.setVerticalGroup(
            hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hideLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titleBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
        );

        usuarioTxt.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(0, 0, 0));
        usuarioTxt.setBorder(null);
        usuarioTxt.setPreferredSize(new java.awt.Dimension(55, 20));

        contraTxt.setForeground(new java.awt.Color(0, 0, 0));
        contraTxt.setBorder(null);

        ingresoB.setBackground(new java.awt.Color(8, 12, 38));
        ingresoB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IngresoB.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        IngresoB.setForeground(new java.awt.Color(255, 255, 255));
        IngresoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IngresoB.setText("Ingresar");
        IngresoB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresoBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresoBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresoBMouseExited(evt);
            }
        });
        ingresoB.add(IngresoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 3, 290, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hide, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(contraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ingresoB, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(contraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(ingresoB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoBMouseClicked
        // TODO add your handling code here:
        if (!usuarioTxt.getText().equals("") && !contraTxt.getText().equals("")) {
            String nombre_usuario = usuarioTxt.getText();
            String contrasenia = contraTxt.getText();
            if (v.Validar_UsuarioI(nombre_usuario, contrasenia) == 0) {
                Main ingreso = new Main();
                ingreso.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese su contrasena y su usuario!!");
        }
        limpiar();
    }//GEN-LAST:event_IngresoBMouseClicked

    private void IngresoBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoBMouseEntered
        // TODO add your handling code here:
        ingresoB.setBackground(new Color(16, 27, 96));
    }//GEN-LAST:event_IngresoBMouseEntered

    private void IngresoBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoBMouseExited
        // TODO add your handling code here:
        ingresoB.setBackground(new Color(10, 17, 60));
    }//GEN-LAST:event_IngresoBMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IngresoB;
    private javax.swing.JPasswordField contraTxt;
    private javax.swing.JPanel hide;
    private javax.swing.JPanel ingresoB;
    private refaccionaria.swing.titlebar.TitleBar titleBar2;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
 class fondo extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/inicioR.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
