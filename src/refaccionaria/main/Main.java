package refaccionaria.main;

import java.awt.Component;
import refaccionaria.Actualizar.*;
import refaccionaria.Altas.*;
import refaccionaria.Bajas.*;
import refaccionaria.buscar.*;
import refaccionaria.menu.EventMenuSelected;
import java.awt.*;
import javax.swing.*;

public class Main extends javax.swing.JFrame {

    private static Main main;
    private JFrame fram;

    public Main() {
        initComponents();
        init();
    }

    private void init() {
        main = this;
        titleBar.initJFram(this);
        menu1.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (index == 0 && indexSubMenu == 0) {
                    showForm(new Panel_Bienvenida());
                }
                //Menu Proveedor----------------------------------------------------------------------------
                if (index == 1 && indexSubMenu == 1) {
                    showForm(new Alta_Proveedor());
                }
                if (index == 1 && indexSubMenu == 2) {
                    showForm(new Buscar_Proveedor());
                }
                if (index == 1 && indexSubMenu == 3) {
                    showForm(new Actualizar_Proveedor());
                }
                if (index == 1 && indexSubMenu == 4) {
                    showForm(new Bajas_Proveedores());
                }

                //Menu Productos------------------------------------------------------------------------------
                if (index == 2 && indexSubMenu == 1) {
                    showForm(new Alta_Productos());
                }
                if (index == 2 && indexSubMenu == 2) {
                    showForm(new Buscar_Producto());
                }
                if (index == 2 && indexSubMenu == 3) {
                    showForm(new Actualizar_Productos());
                }
                if (index == 2 && indexSubMenu == 4) {
                    showForm(new Baja_Productos());
                }
                //Menu Tipo de moto----------------------------------------------------------------------------
                if (index == 3 && indexSubMenu == 1) {
                    showForm(new Alta_TipoM());
                }
                if (index == 3 && indexSubMenu == 2) {
                    showForm(new Buscar_TM());
                }
                if (index == 3 && indexSubMenu == 3) {
                    showForm(new Actualizar_TM());
                }
                if (index == 3 && indexSubMenu == 4) {
                    showForm(new Baja_TipoM());
                }
                //Menu de servicios----------------------------------------------------------------------------
                if (index == 4 && indexSubMenu == 1) {
                    showForm(new Alta_Servicios());
                }
                if (index == 4 && indexSubMenu == 2) {
                    showForm(new Buscar_Servicio());
                }
                if (index == 4 && indexSubMenu == 3) {
                    showForm(new Actualizar_Servicios());
                }
                if (index == 4 && indexSubMenu == 4) {
                    showForm(new Baja_Servicios());
                }
                //Menu de ventas----------------------------------------------------------------------------
                if (index == 5 && indexSubMenu == 1) {
                    showForm(new Alta_Venta());
                }
                if (index == 5 && indexSubMenu == 2) {
                    showForm(new Buscar_Venta());
                }
                //Menu de compras----------------------------------------------------------------------------
                if (index == 6 && indexSubMenu == 1) {
                    showForm(new Alta_compra());
                }
                if (index == 6 && indexSubMenu == 2) {
                    showForm(new Buscar_compra());
                }
                //Menu de Clientes----------------------------------------------------------------------------
                if (index == 7 && indexSubMenu == 1) {
                    showForm(new Alta_Clientes());
                }
                if (index == 7 && indexSubMenu == 2) {
                    showForm(new Buscar_Clientes());
                }
                if (index == 7 && indexSubMenu == 3) {
                    showForm(new Actualizar_Cliente());
                }
                if (index == 7 && indexSubMenu == 4) {
                    showForm(new Baja_Cliente());
                }
                //Menu de usuarios----------------------------------------------------------------------------
                if (index == 8 && indexSubMenu == 1) {
                    showForm(new Alta_Usuarios());
                }
                if (index == 8 && indexSubMenu == 2) {
                    showForm(new Buscar_Usuario());
                }
                if (index == 8 && indexSubMenu == 3) {
                    showForm(new Actualizar_Usuario());
                }
                if (index == 8 && indexSubMenu == 4) {
                    showForm(new Baja_Usuario());
                }
                //Menu de empleado----------------------------------------------------------------------------
                if (index == 9 && indexSubMenu == 1) {
                    showForm(new Alta_Empleado());
                }
                if (index == 9 && indexSubMenu == 2) {
                    showForm(new Buscar_Empleado());
                }
                if (index == 9 && indexSubMenu == 3) {
                    showForm(new Actualizar_Empleado());
                }
                if (index == 9 && indexSubMenu == 4) {
                    showForm(new Baja_Empleado());
                }
                /* if (index == 10 && indexSubMenu == 0) {
                    // showForm(new Baja_Empleado());
                    fram.dispose();
                    Inicio salir = new Inicio();
                }*/
 /*else {
                    showForm(new Form_Empty(index + " " + indexSubMenu));
                }*/
            }
        });
        menu1.setSelectedIndex(0, 0);
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }
    
    public static Main getMain() {
        return main;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        titleBar = new refaccionaria.swing.titlebar.TitleBar();
        menu1 = new refaccionaria.menu.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(25, 25, 25));

        panelMenu.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private refaccionaria.menu.Menu menu1;
    private javax.swing.JPanel panelMenu;
    private refaccionaria.swing.titlebar.TitleBar titleBar;
    // End of variables declaration//GEN-END:variables
}
