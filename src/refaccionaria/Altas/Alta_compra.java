/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refaccionaria.Altas;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jesanher
 */
public class Alta_compra extends javax.swing.JPanel {

    /**
     * Creates new form Alta_compra
     */
    public Alta_compra() {
        initComponents();
     //   Fecha_Compra.setText("" + calendar.get(Calendar.DAY_OF_MONTH) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.YEAR) + "");
   // Fecha_Compra.
        init();
    }
    
    public void init(){
        TablaC.fixTable(jScrollPane1);
        Calendar calendar = new GregorianCalendar();
        Fecha_compra.setText("" + calendar.get(Calendar.DAY_OF_MONTH) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.YEAR) + "");
        
       /* TablaC.addRow(new Object[]{"1", "Mike Bhand", "mikebhand@gmail.com", "Admin", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"2", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"3", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"4", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"5", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"6", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"7", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"8", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"9", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"10", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"11", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"12", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"13", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
        TablaC.addRow(new Object[]{"14", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
    */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        Fecha_compra = new refaccionaria.swing.txtf.TextFielda();
        textFielda2 = new refaccionaria.swing.txtf.TextFielda();
        textFielda3 = new refaccionaria.swing.txtf.TextFielda();
        textFielda4 = new refaccionaria.swing.txtf.TextFielda();
        jLabel1 = new javax.swing.JLabel();
        roundPanel1 = new refaccionaria.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaC = new refaccionaria.swing.table.Table();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textFielda1 = new refaccionaria.swing.txtf.TextFielda();
        textFielda5 = new refaccionaria.swing.txtf.TextFielda();
        jButton3 = new javax.swing.JButton();
        textFielda6 = new refaccionaria.swing.txtf.TextFielda();
        textFielda7 = new refaccionaria.swing.txtf.TextFielda();
        jButton4 = new javax.swing.JButton();

        setForeground(new java.awt.Color(25, 25, 25));
        setOpaque(false);

        Fecha_compra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Fecha_compra.setLabelText("Fecha");

        textFielda2.setLabelText("Codigo de barras");

        textFielda3.setLabelText("Cantidad");

        textFielda4.setLabelText("Monto final");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comprar.png"))); // NOI18N
        jLabel1.setText("Nueva Compra");

        roundPanel1.setBackground(new java.awt.Color(188, 188, 188));
        roundPanel1.setRound(10);

        TablaC.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        TablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# ", "Producto", "Precio de compra", "Cantidad", "Monto profucto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(44, 203, 87));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 25, 25));
        jButton1.setText("Generar Compra");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setBackground(new java.awt.Color(32, 189, 255));
        jButton2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(25, 25, 25));
        jButton2.setText("Añadir");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textFielda1.setLabelText("RFC del proveedor");

        textFielda5.setLabelText("Precio de compra");

        jButton3.setBackground(new java.awt.Color(165, 254, 203));
        jButton3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(25, 25, 25));
        jButton3.setText("Buscar");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textFielda6.setLabelText("Nombre del proveedor");

        textFielda7.setLabelText("Nombre del producto");

        jButton4.setBackground(new java.awt.Color(235, 47, 47));
        jButton4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(25, 25, 25));
        jButton4.setText("Cancelar");
        jButton4.setBorder(null);

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
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFielda5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(textFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(textFielda6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(84, 84, 84)
                                            .addComponent(Fecha_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(textFielda7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textFielda6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Fecha_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFielda7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(textFielda5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private refaccionaria.swing.txtf.TextFielda Fecha_compra;
    private refaccionaria.swing.table.Table TablaC;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private refaccionaria.swing.RoundPanel roundPanel1;
    private refaccionaria.swing.txtf.TextFielda textFielda1;
    private refaccionaria.swing.txtf.TextFielda textFielda2;
    private refaccionaria.swing.txtf.TextFielda textFielda3;
    private refaccionaria.swing.txtf.TextFielda textFielda4;
    private refaccionaria.swing.txtf.TextFielda textFielda5;
    private refaccionaria.swing.txtf.TextFielda textFielda6;
    private refaccionaria.swing.txtf.TextFielda textFielda7;
    // End of variables declaration//GEN-END:variables
}
