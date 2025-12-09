package VISTA;

import MODELO.ArchivoCarrito;
import MODELO.Productos;
import javax.swing.JOptionPane;

public class Calzado_Inicio extends javax.swing.JFrame {

    ArchivoCarrito ar = new ArchivoCarrito();

    public Calzado_Inicio() {
        initComponents();
        this.setLocationRelativeTo(null); //Coloca la ventana en el centro de la pantalla cuando se muestra.
        this.setResizable(false); //Impide que el usuario cambie el tamaño de la ventana.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btncarrito = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        talla1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        talla2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        talla3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        talla4 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnañadir1 = new javax.swing.JButton();
        btnañadir2 = new javax.swing.JButton();
        btnañadir3 = new javax.swing.JButton();
        btnañadir4 = new javax.swing.JButton();
        txtcantidad = new javax.swing.JTextField();
        txtcantidad2 = new javax.swing.JTextField();
        txtcantidad3 = new javax.swing.JTextField();
        txtcantidad4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALZADO");

        btncarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carrito.png"))); // NOI18N
        btncarrito.setText("CARRITO");
        btncarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarritoActionPerformed(evt);
            }
        });

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backbutton.png"))); // NOI18N
        btnregresar.setText("REGRESAR");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnregresar)
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncarrito)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btncarrito)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(btnregresar))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calzado_NegroNike.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calzado_AmarilloNike.jpg"))); // NOI18N
        jLabel3.setText("DDD");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calzado_AzulNike.jpg"))); // NOI18N
        jLabel4.setText("DDD");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calzado_RosaPuma.jpg"))); // NOI18N
        jLabel5.setText("DDD");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Calzado Negro Nike");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Calzado Amarillo Nike");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Calzado Azul Nike");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Calzado Rosado Puma");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Referencia 367");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Referencia 287");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Referencia 768");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Referencia 133");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Precio $198.000");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Precio $245.000");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Precio $272.000");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Precio $203.000");

        jLabel18.setText("Talla");

        talla1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "33", "35", "36", "37", "40", "41" }));

        jLabel19.setText("Talla");

        talla2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "35", "36", "37", "38", "39" }));

        jLabel20.setText("Talla");

        talla3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "34", "36", "37", "38", "39", "41" }));

        jLabel21.setText("Talla");

        talla4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "34", "36", "38", "40", "41" }));

        jLabel22.setText("Cantidad");

        jLabel23.setText("Cantidad");

        jLabel24.setText("Cantidad");

        jLabel25.setText("Cantidad");

        btnañadir1.setText("AÑADIR AL CARRITO");
        btnañadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadir1ActionPerformed(evt);
            }
        });

        btnañadir2.setText("AÑADIR AL CARRITO");
        btnañadir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadir2ActionPerformed(evt);
            }
        });

        btnañadir3.setText("AÑADIR AL CARRITO");
        btnañadir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadir3ActionPerformed(evt);
            }
        });

        btnañadir4.setText("AÑADIR AL CARRITO");
        btnañadir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(talla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcantidad))
                                    .addComponent(btnañadir1))
                                .addGap(7, 7, 7)))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(talla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcantidad2))
                            .addComponent(btnañadir2))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel16)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(talla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcantidad3)
                                        .addGap(95, 95, 95)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(talla4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcantidad4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnañadir3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(btnañadir4))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(talla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(talla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(talla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(talla4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(txtcantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtcantidad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtcantidad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnañadir1)
                    .addComponent(btnañadir2)
                    .addComponent(btnañadir3)
                    .addComponent(btnañadir4))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnañadir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir2ActionPerformed
        String tal2 = talla2.getSelectedItem().toString(); ////obtener y convertir a texto el elemento seleccionado
        String Cantidad2T = txtcantidad2.getText(); 
        //VALIDAR SI EL CAMPO DE CANTIDAD ESTA VACIO
        if (Cantidad2T.isEmpty()) {
            JOptionPane.showMessageDialog(null, "DIGITE UNA CANTIDAD PORFAVOR");
        } else {
            try { // EL TRY CATCH NOS SIRVE PARA PODER VALIDAR SI EN EL CAMPO DE CANTIDAD NO SE ESCRIBIO UNA LETRA

                int Cantidad2 = Integer.parseInt(txtcantidad2.getText());
                //VALIDAR SI LA CANTIDAD ES MENOR 0 IGUAL A 0
                if (Cantidad2 <= 0) {
                    JOptionPane.showMessageDialog(null, "CANTIDAD DIGITADA NO VALIDA");
                } else {
                    Productos objcar2 = new Productos("Calzado Amarillo NIKE", "287", 245000, tal2, Cantidad2);
                    JOptionPane.showMessageDialog(null, "AGREGADO AL CARRITO CON ÉXITO");

                    try { //INGRESAMOS LOS DATOS AL ARCHIVO CARRITO
                        ar.ingresar(objcar2);

                    } catch (Exception e) {
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "CANTIDAD DIGITADA NO VALIDA");
            }
        }
    }//GEN-LAST:event_btnañadir2ActionPerformed

    private void btnañadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir1ActionPerformed
        String tal1 = talla1.getSelectedItem().toString();
        String Cantidad1T = txtcantidad.getText();
        //VALIDAR SI EL CAMPO DE CANTIDAD ESTA VACIO
        if (Cantidad1T.isEmpty()) {
            JOptionPane.showMessageDialog(null, "DIGITE UNA CANTIDAD PORFAVOR");
        } else {
            try { // EL TRY CATCH NOS SIRVE PARA PODER VALIDAR SI EN EL CAMPO DE CANTIDAD NO SE ESCRIBIO UNA LETRA

                int Cantidad1 = Integer.parseInt(txtcantidad.getText());
                //VALIDAR SI LA CANTIDAD ES MENOR 0 IGUAL A 0
                if (Cantidad1 <= 0) {
                    JOptionPane.showMessageDialog(null, "CANTIDAD DIGITADA NO VALIDA");
                } else {
                    Productos objcar1 = new Productos("Calzado Negro NIKE", "367", 198000, tal1, Cantidad1);
                    JOptionPane.showMessageDialog(null, "AGREGADO AL CARRITO CON ÉXITO");

                    try { //INGRESAMOS LOS DATOS AL ARCHIVO CARRITO
                        ar.ingresar(objcar1);

                    } catch (Exception e) {
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "CANTIDAD DIGITADA NO VALIDA");
            }
        }
    }//GEN-LAST:event_btnañadir1ActionPerformed

    private void btnañadir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir3ActionPerformed
        String tal3 = talla3.getSelectedItem().toString();
        String Cantidad3T = txtcantidad3.getText();
        //VALIDAR SI EL CAMPO DE CANTIDAD ESTA VACIO
        if (Cantidad3T.isEmpty()) {
            JOptionPane.showMessageDialog(null, "DIGITE UNA CANTIDAD PORFAVOR");
        } else {
            try { // EL TRY CATCH NOS SIRVE PARA PODER VALIDAR SI EN EL CAMPO DE CANTIDAD NO SE ESCRIBIO UNA LETRA

                int Cantidad3 = Integer.parseInt(txtcantidad3.getText());
                //VALIDAR SI LA CANTIDAD ES MENOR 0 IGUAL A 0
                if (Cantidad3 <= 0) {
                    JOptionPane.showMessageDialog(null, "CANTIDAD DIGITADA NO VALIDA");
                } else {
                    Productos objcar3 = new Productos("Calzado Azul NIKE", "768", 272000, tal3, Cantidad3);
                    JOptionPane.showMessageDialog(null, "AGREGADO AL CARRITO CON ÉXITO");

                    try { //INGRESAMOS LOS DATOS AL ARCHIVO CARRITO
                        ar.ingresar(objcar3);

                    } catch (Exception e) {
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "CANTIDAD DIGITADA NO VALIDA");
            }
        }
    }//GEN-LAST:event_btnañadir3ActionPerformed

    private void btnañadir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadir4ActionPerformed
        String tal4 = talla4.getSelectedItem().toString();
        String Cantidad4T = txtcantidad4.getText();
        //VALIDAR SI EL CAMPO DE CANTIDAD ESTA VACIO
        if (Cantidad4T.isEmpty()) {
            JOptionPane.showMessageDialog(null, "DIGITE UNA CANTIDAD PORFAVOR");
        } else {
            try { // EL TRY CATCH NOS SIRVE PARA PODER VALIDAR SI EN EL CAMPO DE CANTIDAD NO SE ESCRIBIO UNA LETRA

                int Cantidad4 = Integer.parseInt(txtcantidad4.getText());
                //VALIDAR SI LA CANTIDAD ES MENOR 0 IGUAL A 0
                if (Cantidad4 <= 0) {
                    JOptionPane.showMessageDialog(null, "CANTIDAD DIGITADA NO VALIDA");
                } else {
                    Productos objcar2 = new Productos("Calzado Rosado PUMA", "133", 203000, tal4, Cantidad4);
                    JOptionPane.showMessageDialog(null, "AGREGADO AL CARRITO CON ÉXITO");

                    try { //INGRESAMOS LOS DATOS AL ARCHIVO CARRITO
                        ar.ingresar(objcar2);

                    } catch (Exception e) {
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "CANTIDAD DIGITADA NO VALIDA");
            }
        }
    }//GEN-LAST:event_btnañadir4ActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        new Principal_Sesion().setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btncarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarritoActionPerformed
        this.dispose();
        new Carrito().setVisible(true);
    }//GEN-LAST:event_btncarritoActionPerformed

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
            java.util.logging.Logger.getLogger(Calzado_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calzado_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calzado_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calzado_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calzado_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnañadir1;
    private javax.swing.JButton btnañadir2;
    private javax.swing.JButton btnañadir3;
    private javax.swing.JButton btnañadir4;
    private javax.swing.JButton btncarrito;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> talla1;
    private javax.swing.JComboBox<String> talla2;
    private javax.swing.JComboBox<String> talla3;
    private javax.swing.JComboBox<String> talla4;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcantidad2;
    private javax.swing.JTextField txtcantidad3;
    private javax.swing.JTextField txtcantidad4;
    // End of variables declaration//GEN-END:variables
}
