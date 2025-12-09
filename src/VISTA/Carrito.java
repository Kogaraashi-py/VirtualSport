
package VISTA;

import MODELO.ArchivoCarrito;
import MODELO.ArchivoVentas;
import MODELO.Pago;
import MODELO.Persona;
import MODELO.Productos;
import MODELO.Tarjeta;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Carrito extends javax.swing.JFrame {
    ArchivoCarrito ar = new ArchivoCarrito();
    ArchivoVentas ve = new ArchivoVentas();
    int fila;
    
    String [] cabecera = {"PRODUCTOS","REFERENCIAS","PRECIO","TALLA","CANTIDAD"};
    DefaultTableModel dmt = new DefaultTableModel(null,cabecera);
    
    public Carrito() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
        validararchivo();
        casillaprecios();
        btneliminar.setEnabled(false);
        btnpagarefectivo.setEnabled(false);
        btnpagartarjeta.setEnabled(false);
        tblcarrito.setModel(dmt);
        listar();
    }
    
    //PARA QUE NO PUEDA ESCRIBIR EN ESAS CASILLAS
    void casillaprecios(){
        txtabsoluto.setEditable(false);
        txtiva.setEditable(false);
        txtpagar.setEditable(false);
        txtabsolutotarjeta.setEditable(false);
        txtivatarjeta.setEditable(false);
        txtpagartarjeta.setEditable(false);
    }
    //MOSTRAR LOS DATOS QUE SE ENCUENTRAN EN EL ARCHIVO EN LA TABLA
    void listar(){
        dmt.setRowCount(0);
        try{
            //LEER EL ARCHIVO Y LUEGO RECORRER LA LISTA
            ar.leer();
            for (Productos p1 : ar.lista) {
                Object [] fila = {p1.getIdProducto(),p1.getReferencia(),p1.getPrecio(),p1.getTalla(),p1.getCantidad()};
                dmt.addRow(fila);
            } 
        } catch(Exception e){
            
        }
    }
    //LIMPIA LOS DATOS REFERENTES AL PRECIO
    void limpiarprecios(){
       txtabsoluto.setText("");
       txtiva.setText("");
       txtpagar.setText("");
       txtabsolutotarjeta.setText("");
       txtivatarjeta.setText("");
       txtpagartarjeta.setText("");
        
    }
    
    //VALIDAR QUE LOS DATOS DE LA PERSONA ESTEN CORRECTOS
    boolean validacionusuario(){
        
        if (txtcedula.getText().isEmpty() || !txtcedula.getText().matches("\\d+")){ //MATCHES SIRVE PÁRA VERIFICAR SI EL STRING SE CUMPLE EN ESTE CASO \\d+ ES PARA VER SI LA CADENA TIENE UNO O MAS DIGITOS
            return false;
        } else if (txtapellido.getText().isEmpty() || !txtapellido.getText().matches("[a-zA-Z]+"))  { //MATCHES SIRVE PÁRA VERIFICAR SI EL STRING SE CUMPLE EN ESTE CASO [a-zA-Z]+ ES PARA VER SI LA CADENA TIENE UNO O MAS CARACTERES
            return false;
        } else if (txtnombre.getText().isEmpty() || !txtnombre.getText().matches("[a-zA-Z]+")){
            return false;
        } else if (txtdepartamento.getText().isEmpty() || !txtdepartamento.getText().matches("[a-zA-Z]+")){
            return false;
        } else if (txtmunicipio.getText().isEmpty() || !txtmunicipio.getText().matches("[a-zA-Z]+")){ 
            return false;
        } else if (txtdireccion.getText().isEmpty()){
            return false;
        } 
        return true;
    }
    //VALIDAR LOS DATOS DE LA TARJETA
    boolean validaciontarjeta(){
        
        if (txtnumero.getText().isEmpty() || !txtnumero.getText().matches("\\d+") || txtnumero.getText().length() > 16){ //SE VALIDA QUE LA CANTIDAD NO SOBREPASE A 16 DIGITOS
            return false;
        } else if (txtfecha.getText().isEmpty() || !txtfecha.getText().matches("\\d+") || txtfecha.getText().length() > 4){
            return false;
        } else if (txtcvv.getText().isEmpty() || txtcvv.getText().length() > 3){
            return false;
        }
       return true; 
    }
    
    //SE UTILIZA PARA QUE CUANDO EL CARRITO ESTE VACIO ESTE NO PERMITA ACCEDER AL BOTON CALCULAR PRECIO
    void validararchivo(){
        try{
            ar.validararchivo();
            if (ar.validararchivo() == true){
                btncalcular.setEnabled(false);
            } else if (ar.validararchivo() == false){
                btncalcular.setEnabled(true);
            }
        } catch(Exception e){
          
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btncontinuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcarrito = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btncalcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnpagarefectivo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtabsoluto = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        txtpagar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnpagartarjeta = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtabsolutotarjeta = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        txtcvv = new javax.swing.JTextField();
        txtivatarjeta = new javax.swing.JTextField();
        txtpagartarjeta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdepartamento = new javax.swing.JTextField();
        txtmunicipio = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();

        jLabel2.setText("RESUMEN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("CARRITO");

        btncontinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backbutton.png"))); // NOI18N
        btncontinuar.setText("CONTINUAR COMPRANDO");
        btncontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinuarActionPerformed(evt);
            }
        });

        tblcarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTO", "REFERENCIA", "PRECIO", "TALLA", "CANTIDAD"
            }
        ));
        tblcarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcarritoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcarrito);

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ELIMINAR.png"))); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btncalcular.setText("CALCULAR PRECIO");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(btncontinuar)
                                .addGap(67, 67, 67)
                                .addComponent(btneliminar)
                                .addGap(57, 57, 57)
                                .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar)
                    .addComponent(btncontinuar)
                    .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PAGO");

        jTabbedPane2.setBackground(new java.awt.Color(0, 102, 0));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));

        btnpagarefectivo.setText("PAGAR");
        btnpagarefectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarefectivoActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TOTAL ABSOLUTO");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("IVA 15%");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("VALOR TOTAL A PAGAR");

        txtabsoluto.setFocusable(false);

        txtiva.setFocusable(false);

        txtpagar.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpagar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtabsoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnpagarefectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtabsoluto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnpagarefectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Efectivo", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));
        jPanel4.setForeground(new java.awt.Color(0, 102, 0));

        btnpagartarjeta.setText("PAGAR");
        btnpagartarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagartarjetaActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NUMERO DE LA TARJETA");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("FECHA EXPIRACION");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CVV");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TOTAL ABSOLUTO");

        txtabsolutotarjeta.setFocusable(false);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("IVA 15%");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("TOTAL A PAGAR");

        txtivatarjeta.setFocusable(false);

        txtpagartarjeta.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfecha))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcvv, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel17))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtabsolutotarjeta))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtivatarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpagartarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnpagartarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtcvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtabsolutotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtivatarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtpagartarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpagartarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Credito/Debito", jPanel4);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("METODO DE PAGO");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CEDULA");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NOMBRE");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("APELLIDO");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MUNICIPIO");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DEPARTAMENTO");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DIRECCIÓN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(23, 23, 23)
                                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpagarefectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarefectivoActionPerformed
        if (validacionusuario() == false){
            JOptionPane.showMessageDialog(null, "EXISTEN UNO O MAS DATOS INCORRECTOS");
        } else if (validacionusuario() == true){
            Persona p = new Persona(txtcedula.getText(),txtapellido.getText(),txtnombre.getText(),txtdepartamento.getText(),txtmunicipio.getText(),txtdireccion.getText());
            Pago f = new Pago(Double.parseDouble(txtabsoluto.getText()),Double.parseDouble(txtiva.getText()),Double.parseDouble(txtpagar.getText()));
            String linea = p.toArchivo() + " | " + f.toArchivo();
            try{
                ve.ingresar(linea);
            }catch(Exception e){
         }
            this.dispose();
            new Factura().setVisible(true);
        }
    }//GEN-LAST:event_btnpagarefectivoActionPerformed

    private void btnpagartarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagartarjetaActionPerformed
        try{
        if (validacionusuario() == false){
            JOptionPane.showMessageDialog(null, "EXISTEN UNO O MAS DATOS INCORRECTOS");
        } else if (validacionusuario() == true){
            if (validaciontarjeta() == false){
                JOptionPane.showMessageDialog(null, "EXISTEN UNO O MAS DATOS INCORRECTOS EN LA TARJETA");
            } else if (validaciontarjeta() == true){
                
                Persona p = new Persona(txtcedula.getText(),txtapellido.getText(),txtnombre.getText(),txtdepartamento.getText(),txtmunicipio.getText(),txtdireccion.getText());
                Tarjeta t = new Tarjeta(Double.parseDouble(txtabsolutotarjeta.getText()),Double.parseDouble(txtivatarjeta.getText()),Double.parseDouble(txtpagartarjeta.getText()),txtnumero.getText(),txtfecha.getText(),Integer.parseInt(txtcvv.getText()));
                //VINCULA LOS DATOS DE PERSONA Y PAGO EN UNA SOLA ENTRADA DENTRO DEL ARCHIVO
                String linea = p.toArchivo() + " | " + t.toArchivo();
                try{
                    ve.ingresar(linea); // // GUARDA LA LINEA COMBINADA
                }catch (Exception e){
            
              }
                this.dispose();
                new Factura().setVisible(true);       
            }
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "DIGITE LOS DATOS CORRECTAMENTE");
        }
    }//GEN-LAST:event_btnpagartarjetaActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
       //SE REALIZA EL CALCULO DE LOS PRECIOS
        double sumaprecios= 0.0;
        double iva = 0.0;
        double pagar = 0.0;
        try{
            ar.leer();
        }catch(Exception e){
        }
        //RECORRE EL CICLO DEL ARRAYLIST
        for (Productos p : ar.lista) {
            double precio = p.getPrecio();
            int cantidad = p.getCantidad();
            sumaprecios = sumaprecios + precio * cantidad;
        }
        iva = sumaprecios * 0.15;
        pagar = sumaprecios + iva;
       
        String suma = Double.toString(sumaprecios);
        String piva = Double.toString(iva);
        String ppagar = Double.toString(pagar);
       txtabsoluto.setText(suma);
       txtiva.setText(piva);
       txtpagar.setText(ppagar);
       txtabsolutotarjeta.setText(suma);
       txtivatarjeta.setText(piva);
       txtpagartarjeta.setText(ppagar);
       btnpagarefectivo.setEnabled(true); //HABILITA LOS BOTONES
       btnpagartarjeta.setEnabled(true);
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       int dialogo = JOptionPane.YES_NO_OPTION;
       int resultado = JOptionPane.showConfirmDialog(null, "DESEA BORRAR LA FILA SELECCIONADA", "BORRAR", dialogo);
       
       if (resultado==0){
       ar.lista.remove(fila);
       dmt.removeRow(fila);
       try{
           ar.eliminar(fila);
           if (ar.validararchivo() == true){
               btncalcular.setEnabled(false);
           } else if (ar.validararchivo() == false){
               btncalcular.setEnabled(true);
           }
  
       }catch (Exception e){
       }
       JOptionPane.showMessageDialog(null, "FILA ELIMINADA CON EXITO");
       btneliminar.setEnabled(false);
       btnpagarefectivo.setEnabled(false);
       btnpagartarjeta.setEnabled(false);
       limpiarprecios();
       }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tblcarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcarritoMouseClicked
        fila=tblcarrito.getSelectedRow();
        btneliminar.setEnabled(true);
    }//GEN-LAST:event_tblcarritoMouseClicked

    private void btncontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinuarActionPerformed
        this.dispose();
        new Principal_Sesion().setVisible(true);
    }//GEN-LAST:event_btncontinuarActionPerformed

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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btncontinuar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnpagarefectivo;
    private javax.swing.JButton btnpagartarjeta;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblcarrito;
    private javax.swing.JTextField txtabsoluto;
    private javax.swing.JTextField txtabsolutotarjeta;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcvv;
    private javax.swing.JTextField txtdepartamento;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtivatarjeta;
    private javax.swing.JTextField txtmunicipio;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpagar;
    private javax.swing.JTextField txtpagartarjeta;
    // End of variables declaration//GEN-END:variables
}
