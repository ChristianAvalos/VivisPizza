/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivispizza;

import static java.awt.SystemColor.info;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import metodos_sql.conexiondb;
import metodos_sql.metodos_sql;
import static vivispizza.login.texto;



/**
 *
 * @author christian
 */
public class Ventas extends javax.swing.JFrame {
private metodos_sql metodos = new metodos_sql();
DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        setLocationRelativeTo(null);
        
        modelo.addColumn("Fecha");
        modelo.addColumn("Codigo Producto");
        modelo.addColumn("Descripcion Producto");
        modelo.addColumn("Cliente");
        modelo.addColumn("Costo Delivery");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Sub Total");
        modelo.addColumn("Cobrado");
        modelo.addColumn("Diferencia a Pagar");
        this.TablaVentas.setModel(modelo);
        
        //Esto trae la fecha de Hoy
        Calendar c2 = new GregorianCalendar();
        date.setCalendar(c2);
        
        lblDescripcion.setVisible(false);
        this.cmbcliente.setModel(metodos.proveedor());
        
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
        jLabel2 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdelivery = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcobrado = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JToggleButton();
        lblDescripcion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        cmbcliente = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        chkOnline = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtDiferenciaPagar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Fecha:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ventas");

        date.setDateFormatString("yyyy-MM-dd");

        jLabel3.setText("Codigo:");

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodigoKeyReleased(evt);
            }
        });

        jLabel4.setText("Cantidad:");

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantidadKeyReleased(evt);
            }
        });

        jLabel6.setText("Costo Delivery:");

        txtdelivery.setText("0");

        jLabel7.setText("Cobrado:");

        txtcobrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcobradoKeyReleased(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblDescripcion.setText("sssssssssssssssssssssssssssssssssssss");

        jLabel5.setText("Cliente:");

        TablaVentas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaVentas.setFocusable(false);
        TablaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaVentas);

        cmbcliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbcliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbclienteItemStateChanged(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminarTodo.setText("Eliminar Todo");
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });

        jLabel8.setText("Precio Venta:");

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.setText("0");

        jLabel9.setText("TOTAL PAGAR:");

        txtTotalPagar.setEditable(false);
        txtTotalPagar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalPagar.setText("0");

        chkOnline.setText("Online");
        chkOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkOnlineMouseClicked(evt);
            }
        });

        jLabel10.setText("Diferencia a pagar:");

        jLabel11.setText("Sub-Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnAgregar)
                .addGap(12, 12, 12)
                .addComponent(btnEliminar)
                .addGap(6, 6, 6)
                .addComponent(btnEliminarTodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(btnGuardar)
                        .addGap(12, 12, 12)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cmbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtdelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(txtcobrado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(chkOnline)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtDiferenciaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1))
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(cmbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtdelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(txtcobrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkOnline)
                    .addComponent(jLabel10)
                    .addComponent(txtDiferenciaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnEliminarTodo))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnRegresar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu_principal ventana = new Menu_principal();
         if(texto!=null){
               ventana.labelusuario.setText(texto.toUpperCase());
               System.out.print("bobo");
           }
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbclienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbclienteItemStateChanged
        //Hay dos formas de pasar de entero a cadena la mejor opcion es el segundo que esta activado
        //proveedor=cmbcliente.getSelectedIndex()+"";
        proveedor=Integer.toString(cmbcliente.getSelectedIndex());
        TraerDatos();
    }//GEN-LAST:event_cmbclienteItemStateChanged

    private void txtcobradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcobradoKeyReleased
        int a,b,c,d,f;
        if (!"".equals(txtcantidad.getText())){
        a=Integer.parseInt(txtPrecioVenta.getText());
        b=Integer.parseInt(txtcobrado.getText()) ;
        c=Integer.parseInt(txtcantidad.getText()) ;
        f=Integer.parseInt(txtdelivery.getText());
        d=(c*a)-b+f;
        txtDiferenciaPagar.setText(d+"");
        }else{
          
        JOptionPane.showMessageDialog(this, "Ingresar Cantidad");
        }
        
    }//GEN-LAST:event_txtcobradoKeyReleased

    private void txtcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyReleased
        TraerDatos();
    }//GEN-LAST:event_txtcodigoKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        SimpleDateFormat dformart=new SimpleDateFormat("yyyy-MM-dd");
        String fecha = dformart.format(date.getDate());
        String[]info = new String[10];
        if (!"".equals(txtcodigo.getText().trim())) {
            if(!"Seleccione tipo".equals(cmbcliente.getItemAt(cmbcliente.getSelectedIndex()))){
               if(!"".equals(txtdelivery.getText().trim())){
                   if(!"".equals(txtcantidad.getText().trim())){
                       if(!"".equals(txtcobrado.getText().trim())){
                           
                            info[0]=fecha;
                            info[1]=txtcodigo.getText();
                            info[2]=lblDescripcion.getText();
                            info[3]=(String) cmbcliente.getSelectedItem();
                            info[4]=txtdelivery.getText();
                            info[5]=txtcantidad.getText();
                            info[6]=txtPrecioVenta.getText();
                            info[7]=txtSubTotal.getText();
                            info[8]=txtcobrado.getText();
                            info[9]=txtDiferenciaPagar.getText();
                            modelo.addRow(info);
                                  
                            chkOnline.setSelected(false);
                            txtDiferenciaPagar.setText("");
                            txtPrecioVenta.setText("0");
                            txtSubTotal.setText("");
                            txtcantidad.setText("");
                            txtcobrado.setText("");
                            txtcodigo.setText("");
                            txtdelivery.setText("0");
                            this.cmbcliente.setModel(metodos.proveedor());
                            suma(); 
                       }else{
                           JOptionPane.showMessageDialog(this, "Ingrese el precio cobrado");
                       }
                   }else{
                       JOptionPane.showMessageDialog(this, "Ingrese Cantidad");
                   }
               } else{
                  JOptionPane.showMessageDialog(this, "Ingrese Costo del Delivery");  
               }
            }else{
               JOptionPane.showMessageDialog(this, "Seleccione Cliente"); 
            }
        }else{
            JOptionPane.showMessageDialog(this, "Completar Codigo");
        }                
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void chkOnlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkOnlineMouseClicked
        int a,b,c,d,f;
        
       if (!"".equals(txtcantidad.getText())){   
                
             if (chkOnline.isSelected()){
                 txtcobrado.setText("0");
                 a=Integer.parseInt(txtPrecioVenta.getText());
                 b=Integer.parseInt(txtcobrado.getText()) ;
                 c=Integer.parseInt(txtcantidad.getText()) ;
                 f=Integer.parseInt(txtdelivery.getText());
                 d=(c*a)-b+f;
                 txtDiferenciaPagar.setText(d+"");
             }else{
                 txtcobrado.setText("");
                 txtDiferenciaPagar.setText("");
             }
       }else{
            chkOnline.setSelected(false);
            JOptionPane.showMessageDialog(this, "Ingresar Cantidad");
       }  
    }//GEN-LAST:event_chkOnlineMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila =TablaVentas.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
        txtTotalPagar.setText("0");
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        int fila = TablaVentas.getRowCount();
        for (int i= fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
        txtTotalPagar.setText("0");
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void txtcantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyReleased
        int a,b,c,d;
        a=Integer.parseInt(txtdelivery.getText()) ;
        b=Integer.parseInt(txtcantidad.getText()) ;
        c=Integer.parseInt(txtPrecioVenta.getText());
        d=(b*c)+a;
        txtSubTotal.setText(d+"");
       
        
        
        
    }//GEN-LAST:event_txtcantidadKeyReleased
    public Date fechaDate;
    public  Date ParseFecha(String fecha){
        fechaDate = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fechaDate = formato.parse(fecha);  
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        ///JOptionPane.showMessageDialog(null,fechaDate.toString());
       // date.setDate(fechaDate);
        
        return fechaDate;
        
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         int resultado=0;
        for (int k=0;k<TablaVentas.getRowCount();k++){
            ParseFecha(TablaVentas.getValueAt(k,0).toString());
            java.sql.Date sqlDate = new java.sql.Date(fechaDate.getTime());
            String Codigo_Producto = TablaVentas.getValueAt(k,1).toString();
            String Descripcion = TablaVentas.getValueAt(k,2).toString();
            String Cliente = TablaVentas.getValueAt(k,3).toString();
            int Costo =Integer.parseInt(TablaVentas.getValueAt(k,4).toString());
            int Cantidad = Integer.parseInt(TablaVentas.getValueAt(k,5).toString());
            int Precio= Integer.parseInt(TablaVentas.getValueAt(k,6).toString());
            int SubTotal=Integer.parseInt(TablaVentas.getValueAt(k,7).toString());
            int Cobrado=Integer.parseInt(TablaVentas.getValueAt(k,8).toString());
            int DiferenciaPafar=Integer.parseInt(TablaVentas.getValueAt(k,9).toString());     
            int i = metodos.ventas(sqlDate,Codigo_Producto,Descripcion,Cliente,Costo,Cantidad,Precio,SubTotal,Cobrado,DiferenciaPafar);
            resultado = i;
        }
        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente");
            int fila = TablaVentas.getRowCount();
            for (int i= fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
        txtTotalPagar.setText("0");
            } else {
            JOptionPane.showMessageDialog(this, "No se pudo guardar los datos");
            }
            
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    public static String proveedor=null;
    public void TraerDatos(){
       String Codigo_Producto=null;
       String Nombre=null;
       String Precio=null;
       Connection conexion = null;
        
       Codigo_Producto = txtcodigo.getText();
      
      
         //trae el Nombre Concatenado
        try{
           conexion = conexiondb.getConexion();
           PreparedStatement ps = null;
            ResultSet rs = null;
            
            
            String sql = "SELECT CONCAT(tp.nombre,' ',dp.descripcion)As Descripcion,p.Precio_venta FROM  detalle_producto dp \n"
                    + "join tipo_productos tp on tp.id_producto = dp.id_producto \n"
                    +"JOIN  Precios p on p.Detalle_Producto = dp.id_det_prod \n "
                    + "where dp.Codigo_producto ="+"'"+Codigo_Producto+"' and p.id_proveedor=ifnull("+proveedor+",p.id_proveedor)";
             System.out.println(sql);
             ps = conexion.prepareStatement(sql);
             rs = ps.executeQuery();
            // id.to(rs.getString("Descripcion"));
            //descripcion=(rs.getString("id_det_prod"));
            while (rs.next()){
                Nombre=(rs.getString("Descripcion"));
                Precio=(rs.getString("Precio_venta"));
            }
            
           conexion.close();
         }catch(SQLException ex) {
            System.err.println(ex.toString());  
        }       
         lblDescripcion.setText(Nombre);
         lblDescripcion.setVisible(true);
         txtPrecioVenta.setText(Precio);
     
 }
    public  void suma(){
        int contar = TablaVentas.getRowCount();
       // txtTotalPagar.setText(contar+"");
        int suma =0;
        int fila=0;
        for(int i = 0; i < contar; i++){
            fila = Integer.parseInt(TablaVentas.getValueAt(i,9).toString());
            suma+=fila; 
        }
        txtTotalPagar.setText(suma+"");
       // return suma;
    }
    
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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JCheckBox chkOnline;
    private javax.swing.JComboBox<String> cmbcliente;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JTextField txtDiferenciaPagar;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcobrado;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdelivery;
    // End of variables declaration//GEN-END:variables
}
