/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refaccionaria.Bajas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import refaccionaria.Acciones.Conexion;
import refaccionaria.Acciones.Delete;
import refaccionaria.Acciones.Select;

/**
 *
 * @author jesanher
 */
public class Baja_Productos extends javax.swing.JPanel {

    Select s;

    /**
     * Creates new form Baja_Productos
     */
    public Baja_Productos() {
        initComponents();
        s = new Select();
    }

    public void RellenotxtProductos() {
        String nombre = textFieldCodi_Barra.getText();
        System.out.println("" + nombre);
        String sql = "Select * from articulos where codi_barra='" + nombre + "'";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.ConectarBD();
        String modelo;

        System.out.println(sql);
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(sql);
            int id_tipo;
            int x = 0;

            while (rs.next()) {
                //textFieldTipo_Moto.setText(rs.getString(2));
                id_tipo = Integer.parseInt(rs.getString(2));
                modelo = s.BuacarModelo(id_tipo);
                textFieldTipo_Moto.setText(modelo);
                textFieldNombre_Art.setText(rs.getString(3));
                textFieldMarca.setText(rs.getString(4));
                textFieldPrecio.setText(rs.getString(5));
                textFieldStock.setText(rs.getString(6));
                x = 1;
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro producto");
                LimpiarArticulosTxt();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    public void LimpiarArticulosTxt() {
        textFieldCodi_Barra.setText("");
        textFieldTipo_Moto.setText("");
        textFieldNombre_Art.setText("");
        textFieldMarca.setText("");
        textFieldPrecio.setText("");
        textFieldStock.setText("");
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
        textFieldTipo_Moto = new refaccionaria.swing.txtf.TextFielda();
        bBuscar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        textFieldCodi_Barra = new refaccionaria.swing.txtf.TextFielda();
        textFieldNombre_Art = new refaccionaria.swing.txtf.TextFielda();
        textFieldMarca = new refaccionaria.swing.txtf.TextFielda();
        textFieldPrecio = new refaccionaria.swing.txtf.TextFielda();
        textFieldStock = new refaccionaria.swing.txtf.TextFielda();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Productos");

        textFieldTipo_Moto.setLabelText("Tipo de moto");

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

        bEliminar.setBackground(new java.awt.Color(235, 47, 47));
        bEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bEliminar.setForeground(new java.awt.Color(25, 25, 25));
        bEliminar.setText("Eliminar");
        bEliminar.setBorder(null);
        bEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        textFieldCodi_Barra.setLabelText("Codigo de barras");

        textFieldNombre_Art.setLabelText("Nombre del articulo");

        textFieldMarca.setLabelText("Marca");

        textFieldPrecio.setLabelText("Precio");

        textFieldStock.setLabelText("Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldNombre_Art, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldTipo_Moto, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                                    .addComponent(textFieldCodi_Barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1)))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(textFieldCodi_Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTipo_Moto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNombre_Art, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        RellenotxtProductos();
    }//GEN-LAST:event_bBuscarActionPerformed

    Delete delete = new Delete();
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(textFieldCodi_Barra.getText()) || !"".equals(textFieldNombre_Art.getText())
                || !"".equals(textFieldTipo_Moto.getText())
                || !"".equals(textFieldMarca.getText()) | !"".equals(textFieldPrecio.getText()) | !"".equals(textFieldStock.getText())) {

            delete.deleteArticulo(textFieldCodi_Barra.getText());

            LimpiarArticulosTxt();

            JOptionPane.showMessageDialog(null, "Articulo eliminado con exito!");
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_bEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JLabel jLabel1;
    private refaccionaria.swing.txtf.TextFielda textFieldCodi_Barra;
    private refaccionaria.swing.txtf.TextFielda textFieldMarca;
    private refaccionaria.swing.txtf.TextFielda textFieldNombre_Art;
    private refaccionaria.swing.txtf.TextFielda textFieldPrecio;
    private refaccionaria.swing.txtf.TextFielda textFieldStock;
    private refaccionaria.swing.txtf.TextFielda textFieldTipo_Moto;
    // End of variables declaration//GEN-END:variables
}
