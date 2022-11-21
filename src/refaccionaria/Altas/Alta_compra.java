/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refaccionaria.Altas;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import refaccionaria.Acciones.Conexion;
import refaccionaria.Acciones.Insert;
import refaccionaria.Acciones.Select;
import refaccionaria.Validaciones.ValidarC;

/**
 *
 * @author jesanher
 */
public class Alta_compra extends javax.swing.JPanel {

    Insert in = new Insert();//
    Connection conex;//
    ValidarC v = new ValidarC();//
    Conexion c = new Conexion();//
    Select s; //= new Select();
    DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
    private Component rootPane;
    PreparedStatement ps;
    ResultSet rs;

    float monto_final, precio_compra;
    int cantidad, con = 1;

    /**
     * Creates new form Alta_compra
     */
    public Alta_compra() {
        initComponents();
        conex = c.ConectarBD();
        s = new Select();
        init();//para que se asigne solita la fecha
        comboP();

    }

    public void comboP() {
        comboProveedor.removeAll();
        //comboTipo.addItem("Seleccione");
        String[] buscarCod = s.verProveedor();
        for (String i : buscarCod) {
            comboProveedor.addItem(i);
        }
    }

    public void init() {
        TablaC.fixTable(jScrollPane1);
        Calendar calendar = new GregorianCalendar();
        Fecha_compra.setText("" + calendar.get(Calendar.DAY_OF_MONTH) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.YEAR) + "");
    }

    public void limpiar() {
        txtCodigoB.setText("");
        txtCantidad.setText("");
        txtPrecioC.setText("");
    }

    public void limpiar_todo() {
        comboProveedor.setSelectedIndex(0);
        txtCodigoB.setText("");
        txtCantidad.setText("");
        txtPrecioC.setText("");
        txtMontoF.setText("");
        LimpiarTable();
    }

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        Fecha_compra = new refaccionaria.swing.txtf.TextFielda();
        txtCodigoB = new refaccionaria.swing.txtf.TextFielda();
        txtCantidad = new refaccionaria.swing.txtf.TextFielda();
        txtMontoF = new refaccionaria.swing.txtf.TextFielda();
        jLabel1 = new javax.swing.JLabel();
        roundPanel1 = new refaccionaria.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaC = new refaccionaria.swing.table.Table();
        bGuardar = new javax.swing.JButton();
        bAnadir = new javax.swing.JButton();
        txtPrecioC = new refaccionaria.swing.txtf.TextFielda();
        jButton4 = new javax.swing.JButton();
        comboProveedor = new refaccionaria.swing.txtf.ComboBoxA();
        bquitarF = new javax.swing.JButton();

        setForeground(new java.awt.Color(25, 25, 25));
        setOpaque(false);

        Fecha_compra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Fecha_compra.setLabelText("Fecha");

        txtCodigoB.setLabelText("Codigo de barras");

        txtCantidad.setLabelText("Cantidad");

        txtMontoF.setLabelText("Monto final");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comprar.png"))); // NOI18N
        jLabel1.setText("Nueva Compra");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        TablaC.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        TablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# ", "Codigo barras", "Nombre", "Precio_compra", "Cantidad", "Total por articulo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaC);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        bGuardar.setBackground(new java.awt.Color(44, 203, 87));
        bGuardar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bGuardar.setForeground(new java.awt.Color(25, 25, 25));
        bGuardar.setText("Generar Compra");
        bGuardar.setBorder(null);
        bGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bAnadir.setBackground(new java.awt.Color(32, 189, 255));
        bAnadir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bAnadir.setForeground(new java.awt.Color(25, 25, 25));
        bAnadir.setText("Añadir");
        bAnadir.setBorder(null);
        bAnadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnadirActionPerformed(evt);
            }
        });

        txtPrecioC.setLabelText("Precio de compra");

        jButton4.setBackground(new java.awt.Color(235, 47, 47));
        jButton4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(25, 25, 25));
        jButton4.setText("Cancelar");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        comboProveedor.setForeground(new java.awt.Color(255, 255, 255));
        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el Proveedor" }));
        comboProveedor.setLabeText("");
        comboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorActionPerformed(evt);
            }
        });

        bquitarF.setBackground(new java.awt.Color(220, 213, 53));
        bquitarF.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bquitarF.setForeground(new java.awt.Color(25, 25, 25));
        bquitarF.setText("Quitar producto");
        bquitarF.setBorder(null);
        bquitarF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bquitarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquitarFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(231, 231, 231)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(comboProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                                .addComponent(txtCodigoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPrecioC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(469, 469, 469)
                                            .addComponent(Fecha_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bquitarF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtMontoF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigoB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bquitarF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(txtPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMontoF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorActionPerformed
        // TODO add your handling code here:
        try {
            c = new Conexion();
            String nombre = comboProveedor.getSelectedItem().toString();
            if (!nombre.equals("")) {
                String datos[] = s.verProveedor();
            }
        } catch (Exception x) {

        }

    }//GEN-LAST:event_comboProveedorActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        // TODO add your handling code here:
        if (comboProveedor.getSelectedIndex() != 0 && !txtMontoF.equals("") && modelo.getRowCount() != 0) {
            guardar_compra();
            guardar_detalle();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar todos datos!!!!");
        }
        con = 1;
        limpiar_todo();
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadirActionPerformed
        // TODO add your handling code here:
        if (!txtCodigoB.getText().equals("") && !txtCantidad.getText().equals("") && !txtPrecioC.getText().equals("")) {
            agregar_articulo();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar todos datos!!!!");
            limpiar();
        }

    }//GEN-LAST:event_bAnadirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        limpiar_todo();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void bquitarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bquitarFActionPerformed
        // TODO add your handling code here:
        modelo = (DefaultTableModel)TablaC.getModel();
        if (TablaC.getSelectedRowCount() == 1) {
            modelo.removeRow(TablaC.getSelectedRow());
        } else if (TablaC.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "No hay nada en la tabla, favor de ingresar los datos");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar un dato");
        }
    }//GEN-LAST:event_bquitarFActionPerformed

    public void agregar_articulo() {
        float total_pa = 0;//total por articulo
        modelo = (DefaultTableModel) TablaC.getModel();
        String codi_Barra = txtCodigoB.getText();
        cantidad = Integer.parseInt(txtCantidad.getText());
        String nombre = s.BuscarNombre(codi_Barra);
        precio_compra = Float.parseFloat(txtPrecioC.getText());
        total_pa = cantidad * precio_compra;
        if (v.ValidarArticulo(codi_Barra, nombre) == 1) {
            JOptionPane.showMessageDialog(rootPane, "No existe el porducto ingresado!");
        } else {
            ArrayList lista = new ArrayList();
            if (cantidad > 0) {
                lista.add(con);
                lista.add(codi_Barra);
                lista.add(nombre);
                lista.add(precio_compra);
                lista.add(cantidad);
                lista.add(total_pa);

                Object[] ob = new Object[6];
                for (int i = 0; i < 6; i++) {
                    ob[i] = lista.get(i);
                }
                modelo.addRow(ob);
                TablaC.setModel(modelo);
                calcular_costo();
                int ultima_fila = TablaC.getRowCount();
                con = 1 + Integer.parseInt(TablaC.getValueAt(ultima_fila - 1, 0).toString());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ingrese la cantidad del material!!!!");
            }

        }
    }

    public void calcular_costo() {
        monto_final = 0;
        for (int i = 0; i < TablaC.getRowCount(); i++) {
            cantidad = Integer.parseInt(TablaC.getValueAt(i, 4).toString());
            precio_compra = Float.parseFloat(TablaC.getValueAt(i, 3).toString());
            monto_final = monto_final + (cantidad * precio_compra);
        }
        txtMontoF.setText("" + monto_final);

    }

    public void guardar_compra() {

        float monto_TotalC = Float.parseFloat(txtMontoF.getText());
        String fecha_compra = Fecha_compra.getText();
        String proveedor = comboProveedor.getSelectedItem().toString();
        String rfc_proveedor = s.BuacarIPr(proveedor);
        if (monto_TotalC != 0) {
            if (in.insertCompra(rfc_proveedor, monto_TotalC, fecha_compra)) {
                JOptionPane.showMessageDialog(rootPane, "La compra fue guardada exitosamente!!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se guardo la compra!!!");
            }
        }

    }

    public void guardar_detalle() {
        String idC = s.buscarIdc();
        for (int i = 0; i < TablaC.getRowCount(); i++) {
            int id_compra = Integer.parseInt(idC);
            int cns = Integer.parseInt(TablaC.getValueAt(i, 0).toString());
            String codi_barra = TablaC.getValueAt(i, 1).toString();
            String nombre = TablaC.getValueAt(i, 2).toString();
            float precio_c = Float.parseFloat(TablaC.getValueAt(i, 3).toString());
            int cantidad = Integer.parseInt(TablaC.getValueAt(i, 4).toString());
            float precio_total = Float.parseFloat(TablaC.getValueAt(i, 5).toString());
            PreparedStatement ps = null;
            ResultSet rs = null;
            int pRes;

            try {
                conex = c.ConectarBD();
                String sql = "call Altadedetallecompraprove (" + id_compra + "," + cns + ", '" + codi_barra + "', '" + nombre + "'," + precio_c + ", " + cantidad + "," + precio_total + ", null);";
                ps = conex.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.next();
                pRes = rs.getInt("pRes");
                //Condicion para cuando ya se ha guardado el registro
                if (pRes == 1) {
                    System.out.println("Detalle guardado!!");
                } else if (pRes == 2) {
                    JOptionPane.showMessageDialog(null, "Error al realizar la compra, no e encuentra el id de la compra");
                } else if (pRes == 3) {
                    JOptionPane.showMessageDialog(null, "Error al realizar la compra", "No hay el articulo ingresado!", JOptionPane.ERROR_MESSAGE);
                } else if (pRes == 0) {
                    JOptionPane.showMessageDialog(null, "Error al realizar la compra", "error", JOptionPane.ERROR_MESSAGE);
                }

                /* if (pRes == 0) {
                    JOptionPane.showMessageDialog(null, "Error al realizar la compra", "Error al realizar la compra", JOptionPane.ERROR_MESSAGE);
                } else if (pRes == 1) {
                    // JOptionPane.showMessageDialog(null, "Compra realizada");
                    JOptionPane.showMessageDialog(null, "Compra realizada", "Compra realizada", JOptionPane.INFORMATION_MESSAGE);
                    //limpiar_articulos();
                    //Se debe mostrar el total que lleva la venta               
                }*/
            } catch (Exception e) {
            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private refaccionaria.swing.txtf.TextFielda Fecha_compra;
    private refaccionaria.swing.table.Table TablaC;
    private javax.swing.JButton bAnadir;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bquitarF;
    private javax.swing.ButtonGroup buttonGroup1;
    private refaccionaria.swing.txtf.ComboBoxA comboProveedor;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private refaccionaria.swing.RoundPanel roundPanel1;
    private refaccionaria.swing.txtf.TextFielda txtCantidad;
    private refaccionaria.swing.txtf.TextFielda txtCodigoB;
    private refaccionaria.swing.txtf.TextFielda txtMontoF;
    private refaccionaria.swing.txtf.TextFielda txtPrecioC;
    // End of variables declaration//GEN-END:variables

    public void Agregar_Producto() {
        float totalV = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) TablaC.getModel();
        String codi_Barra = txtCodigoB.getText();
        cantidad = Integer.parseInt(txtCantidad.getText());
        precio_compra = Float.parseFloat(txtPrecioC.getText());

    }

}
