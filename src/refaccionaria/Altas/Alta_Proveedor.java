package refaccionaria.Altas;

import refaccionaria.Acciones.Conexion;
import refaccionaria.Acciones.Insert;

public class Alta_Proveedor extends javax.swing.JPanel {

    public Alta_Proveedor() {
        initComponents();
    }

    public void Limpiar() {
        txtRFC.setText("");
        txtNombreP.setText("");
        txtTelefonoP.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bGuardar = new javax.swing.JButton();
        txtRFC = new refaccionaria.swing.txtf.TextFielda();
        txtNombreP = new refaccionaria.swing.txtf.TextFielda();
        txtTelefonoP = new refaccionaria.swing.txtf.TextFielda();
        Bcancelar = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 680));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_businessman_35px_1.png"))); // NOI18N
        jLabel1.setText("Guardar Proveedor");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        bGuardar.setBackground(new java.awt.Color(44, 203, 87));
        bGuardar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bGuardar.setForeground(new java.awt.Color(25, 25, 25));
        bGuardar.setText("Guardar");
        bGuardar.setBorder(null);
        bGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        txtRFC.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRFC.setLabelText("RFC del proveedor");

        txtNombreP.setLabelText("Nombre del proveedor");

        txtTelefonoP.setLabelText("Numero Telefonico");

        Bcancelar.setBackground(new java.awt.Color(235, 47, 47));
        Bcancelar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Bcancelar.setForeground(new java.awt.Color(25, 25, 25));
        Bcancelar.setText("Cancelar");
        Bcancelar.setBorder(null);
        Bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefonoP, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(txtRFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtTelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_BcancelarActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        // TODO add your handling code here:
        try {
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JLabel jLabel1;
    private refaccionaria.swing.txtf.TextFielda txtNombreP;
    private refaccionaria.swing.txtf.TextFielda txtRFC;
    private refaccionaria.swing.txtf.TextFielda txtTelefonoP;
    // End of variables declaration//GEN-END:variables
}
