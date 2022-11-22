package refaccionaria.Actualizar;

import java.sql.*;
import javax.swing.*;
import refaccionaria.Acciones.Conexion;
import refaccionaria.Acciones.Select;
import refaccionaria.Acciones.Update;

/**
 *
 * @author jesanher
 */
public class Actualizar_Empleado extends javax.swing.JPanel {

    /**
     * Creates new form Actualizar_Empleado
     */
    public Actualizar_Empleado() {
        initComponents();
    }

    public void LimpiarEmpleadoTxt() {
        textFieldID_Emp.setText("");
        textFieldaNombre.setText("");
        textFieldaAp_Pat.setText("");
        textFieldaAp_Mat.setText("");
       // textFieldaStatus.setText("");
        comboBStatus.setSelectedIndex(-1);
        textFieldaTel_Emp.setText("");
        textFieldCorreo.setText("");

    }

    public void RellenotxtEmpleado() {
        String nombre = textFieldaNombre.getText();
        System.out.println("" + nombre);
        String sql = "Select * from Empleado where nombre_Emp='" + nombre + "'";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.ConectarBD();
        int status;

        System.out.println(sql);
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(sql);
            int x = 0;

            while (rs.next()) {
                textFieldID_Emp.setText(rs.getString(1));
                textFieldaAp_Pat.setText(rs.getString(3));
                textFieldaAp_Mat.setText(rs.getString(4));
                status=Integer.parseInt(rs.getString(5));
                if (status==1) {
                     comboBStatus.setSelectedItem("Empleado normal");
                }
                if (status==2) {
                    comboBStatus.setSelectedItem("Encargado");
                }
                //textFieldaStatus.setText(rs.getString(5));
                textFieldaTel_Emp.setText(rs.getString(6));
                textFieldCorreo.setText(rs.getString(7));
                x = 1;
            }
            if(x == 0){
                JOptionPane.showMessageDialog(null, "No se encontro el empleado!");
                LimpiarEmpleadoTxt();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldaNombre = new refaccionaria.swing.txtf.TextFielda();
        textFieldaAp_Pat = new refaccionaria.swing.txtf.TextFielda();
        textFieldaAp_Mat = new refaccionaria.swing.txtf.TextFielda();
        textFieldaTel_Emp = new refaccionaria.swing.txtf.TextFielda();
        textFieldCorreo = new refaccionaria.swing.txtf.TextFielda();
        textFieldID_Emp = new refaccionaria.swing.txtf.TextFielda();
        bActualizar = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        Bcancelar = new javax.swing.JButton();
        comboBStatus = new refaccionaria.swing.txtf.ComboBoxA();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 680));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleado.png"))); // NOI18N
        jLabel1.setText("Actualizar Empleado");

        textFieldaNombre.setLabelText("Nombre  del Empleado");

        textFieldaAp_Pat.setLabelText("Apellido Paterno");

        textFieldaAp_Mat.setLabelText("Apellido materno");

        textFieldaTel_Emp.setLabelText("Numero Telefonico");

        textFieldCorreo.setLabelText("Correo electronico");

        textFieldID_Emp.setLabelText("ID del Empleado");

        bActualizar.setBackground(new java.awt.Color(32, 189, 255));
        bActualizar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bActualizar.setForeground(new java.awt.Color(25, 25, 25));
        bActualizar.setText("Actualizar");
        bActualizar.setBorder(null);
        bActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bBuscar.setBackground(new java.awt.Color(165, 254, 203));
        bBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bBuscar.setForeground(new java.awt.Color(25, 25, 25));
        bBuscar.setText("Buscar");
        bBuscar.setBorder(null);
        bBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

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

        comboBStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empleado normal", "Encargado" }));
        comboBStatus.setSelectedIndex(-1);
        comboBStatus.setLabeText("Status del empleado");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el nombre del empleado");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("para poder buscar y actualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldaAp_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldaAp_Pat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldaTel_Emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldID_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboBStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(textFieldID_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldaAp_Pat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(textFieldaAp_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(comboBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(textFieldaTel_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    Update con = new Update();
    Select select = new Select();
    
    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        RellenotxtEmpleado();
    }//GEN-LAST:event_bBuscarActionPerformed

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        // TODO add your handling code here:
        LimpiarEmpleadoTxt();
    }//GEN-LAST:event_BcancelarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        // TODO add your handling code here:
        String StatusT = comboBStatus.getSelectedItem().toString();
        int status_Empleado;
        if(!"".equals(textFieldID_Emp.getText())|| !"".equals(textFieldaNombre.getText())
            || !"".equals(textFieldaAp_Mat.getText())
            || !"".equals(textFieldaAp_Pat.getText())|!"".equals(textFieldaTel_Emp.getText())|!"".equals(textFieldCorreo.getText())){
             if (StatusT.equals("Empleado normal")) {
                 status_Empleado = 1;
                 con.updateEmpleado(textFieldID_Emp.getText(),textFieldaNombre.getText(),textFieldaAp_Pat.getText(),textFieldaAp_Mat.getText(),status_Empleado,textFieldaTel_Emp.getText(),textFieldCorreo.getText());

            }
             if (StatusT.equals("Encargado")) {
                  status_Empleado = 2;
                con.updateEmpleado(textFieldID_Emp.getText(),textFieldaNombre.getText(),textFieldaAp_Pat.getText(),textFieldaAp_Mat.getText(),status_Empleado,textFieldaTel_Emp.getText(),textFieldCorreo.getText());
            }
            //con.updateEmpleado(textFieldID_Emp.getText(),textFieldaNombre.getText(),textFieldaAp_Pat.getText(),textFieldaAp_Mat.getText(),textFieldaStatus.getText(),textFieldaTel_Emp.getText(),textFieldCorreo.getText());

            
            LimpiarEmpleadoTxt();

            JOptionPane.showMessageDialog(null, "Empleado actualizado!");
        }else{
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_bActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bBuscar;
    private refaccionaria.swing.txtf.ComboBoxA comboBStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private refaccionaria.swing.txtf.TextFielda textFieldCorreo;
    private refaccionaria.swing.txtf.TextFielda textFieldID_Emp;
    private refaccionaria.swing.txtf.TextFielda textFieldaAp_Mat;
    private refaccionaria.swing.txtf.TextFielda textFieldaAp_Pat;
    private refaccionaria.swing.txtf.TextFielda textFieldaNombre;
    private refaccionaria.swing.txtf.TextFielda textFieldaTel_Emp;
    // End of variables declaration//GEN-END:variables
}
