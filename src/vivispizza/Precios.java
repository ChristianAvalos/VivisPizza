/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivispizza;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlElement;
import metodos_sql.conexiondb;
import metodos_sql.metodos_sql;
import static vivispizza.login.texto;

/**
 *
 * @author christian
 */
public class Precios extends javax.swing.JFrame {

    /**
     * Creates new form Precios
     */
    private metodos_sql metodos = new metodos_sql();
    
    public Precios() {
        initComponents();
        setLocationRelativeTo(null);
        this.cmbCodigoProducto.setModel(metodos.codigo_producto());
        this.cmbproveedor.setModel(metodos.proveedor());
       actualizartabla(); 
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListaPrecios = new javax.swing.JTable();
        cmbCodigoProducto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbproveedor = new javax.swing.JComboBox<>();
        txtpreciocompra = new javax.swing.JTextField();
        txtprecioventa = new javax.swing.JTextField();
        lblNombreCod_prod = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Precios");
        setName("Agregar Precios"); // NOI18N
        setResizable(false);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Precios de Compra:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Precios");

        jLabel3.setText("Precio de Venta:");

        JListaPrecios = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        JListaPrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JListaPrecios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListaPreciosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JListaPrecios);

        cmbCodigoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCodigoProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCodigoProductoItemStateChanged(evt);
            }
        });
        cmbCodigoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCodigoProductoMouseClicked(evt);
            }
        });

        jLabel5.setText("Codigo Producto:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("Proveedor:");

        cmbproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNombreCod_prod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodigoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpreciocompra)
                                    .addComponent(txtprecioventa, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 403, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegresar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNombreCod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)))))
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cmbCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreCod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       Menu_principal ventana = new Menu_principal();
       ventana.labelusuario.setText(texto.toUpperCase());
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String Codigo_producto=null;
        String proveedor;
        String nombre=null;
        String tipo=null;
        String Descripcion;
        int id_proveedor=-1;
        int id = 0;
        if ("Seleccione tipo".equals(cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex()))&& "".equals(txtcodigo.getText())){
             JOptionPane.showMessageDialog(null,"Seleccione Codigo");

        }else{
            if(!"Seleccione tipo".equals(cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex()))){
             Codigo_producto=cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex());
             }
            if(!"".equals(txtcodigo.getText())){
                Codigo_producto=txtcodigo.getText();
            }
            
        }
        
        
       
        proveedor=cmbproveedor.getItemAt(cmbproveedor.getSelectedIndex());
        
        //trae la descripcion concatenada del  Codigo_producto 
        try{
           PreparedStatement ps = null;
            ResultSet rs = null;
            conexiondb conn = new conexiondb();
            Connection con = conn.getConexion();  
            
            String sql = "SELECT tp.nombre ,dp.descripcion,dp.id_det_prod FROM detalle_producto dp join tipo_productos tp  on tp.id_producto = dp.id_producto  Where dp.Codigo_producto= "+"'"+Codigo_producto+"'";
             System.out.println(sql);
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
            // id.to(rs.getString("Descripcion"));
            //descripcion=(rs.getString("id_det_prod"));
            while (rs.next()){
                tipo=(rs.getString("nombre")); 
                nombre=(rs.getString("descripcion"));
                id=(rs.getInt("id_det_prod"));
              
            }        
          con.close();  
         }catch(SQLException ex) {
            System.err.println(ex.toString());  
        }
        Descripcion=tipo+nombre;
        
        //trae el valor de proveedor
        try{
           PreparedStatement ps = null;
            ResultSet rs = null;
            conexiondb conn = new conexiondb();
            Connection con = conn.getConexion();  
            
            String sql = "SELECT id_proveedor FROM proveedores Where nombre= "+"'"+proveedor+"'";
             System.out.println(sql);
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
            // id.to(rs.getString("Descripcion"));
            //descripcion=(rs.getString("id_det_prod"));
            while (rs.next()){
                id_proveedor=(rs.getInt("id_proveedor"));
              
            }
            
            con.close();
         }catch(SQLException ex) {
            System.err.println(ex.toString());  
        }
        
        
      //aca ingreso los vaores a la base de datos
        if ("".equals(txtpreciocompra.getText())) {
           
            JOptionPane.showMessageDialog(this, "Completar los campos por favor");
            
        } else {
          /* if ("Seleccione tipo".equals(cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex())) && "".equals(txtcodigo.getText())) {
                JOptionPane.showMessageDialog(this, "Completar los campos por favor");
            } else {*/
                if("".equals(txtprecioventa.getText())){
                    JOptionPane.showMessageDialog(this, "Completar los campos por favor");
                }else{
                       /*if ("Seleccione tipo".equals(cmbDetalleProducto.getItemAt(cmbDetalleProducto.getSelectedIndex()))) {
                JOptionPane.showMessageDialog(this, "Completar los campos por favor");
                       }else{*/
                           if ("Seleccione tipo".equals(cmbproveedor.getItemAt(cmbproveedor.getSelectedIndex()))) {
                JOptionPane.showMessageDialog(this, "Completar los campos por favor");
                           }else{
                               
                           
                //en esta linea se encuentra la forma de pasar de jdchooser a mysql
                int i = metodos.guardar_precios(txtpreciocompra.getText(),txtprecioventa.getText(),id,id_proveedor,Codigo_producto,Descripcion);
              //  int i = metodos.detalle_producto(cmbtipo_prod.getItemAt(cmbtipo_prod.getSelectedIndex()),txtdescripcion.getText());
                if (i > 0) {
                    JOptionPane.showMessageDialog(this, "Datos guardados correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo guardar los datos");
                }
            }
        }
                
         actualizartabla();
         this.cmbCodigoProducto.setModel(metodos.codigo_producto());
         this.cmbproveedor.setModel(metodos.proveedor());
         txtpreciocompra.setText("");
         txtprecioventa.setText("");
         txtcodigo.setText("");
         lblNombreCod_prod.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed
    }
    private void JListaPreciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListaPreciosMouseClicked
           Connection conexion = null;
           PreparedStatement ps = null;
           ResultSet rs = null;
          // conexiondb conn = new conexiondb();
           //Connection con = conn.getConexion(); 
           
            try{
            conexion = conexiondb.getConexion();  
            int Fila = JListaPrecios.getSelectedRow();
            String Id_Prod = JListaPrecios.getValueAt(Fila,0).toString();
           // String codigo = JListaPrecios.getValueAt(Fila,1).toString();
            
            ps = conexion.prepareStatement("SELECT  dp.id_det_prod,p.descripcion,dp.Codigo_producto ,Precio_compra ,p.Precio_venta,p2.nombre as proveedores\n" +
                        "FROM Precios p\n" +
                        " LEFT join detalle_producto dp on dp.id_det_prod =p.detalle_Producto\n" +
                        " left  join  proveedores p2 on p2.id_proveedor = p.id_proveedor \n" +
                        " join tipo_productos tp on tp.id_producto = dp.id_producto "
                                         + "WHERE dp.id_det_prod=? -- and tp.id_producto=?");
            ps.setString(1, Id_Prod);
           // ps.setString(2, codigo);
            rs = ps.executeQuery();
            while (rs.next()){
              //  txtdescripcion.setText(rs.getString("Nombre"));
            cmbCodigoProducto.setSelectedItem(rs.getString("Codigo_producto"));
             // cmbDetalleProducto.setSelectedItem(rs.getString("descripcion"));
            cmbproveedor.setSelectedItem(rs.getString("proveedores"));  
            txtpreciocompra.setText(rs.getString("Precio_compra")); 
            txtprecioventa.setText(rs.getString("Precio_venta"));  
                
              
            }
            
             } catch (SQLException ex) {
                 System.out.println(ex.toString());
        }finally{
 
            if(conexion!=null){
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Precios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
  
}
            
        
        
        
        
        
    }//GEN-LAST:event_JListaPreciosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                Connection conexion = null;
                String tipoproducto = null;
                String detalleprod = null;
                String proveedor = null;
                String where = "";        
                 if (!"Seleccione tipo".equals(cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex()))){
                     tipoproducto = cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex());
                     where = "WHERE dp.Codigo_producto like '"+"%"+tipoproducto+"%'";
                      /*if (!"Seleccione tipo".equals(cmbDetalleProducto.getItemAt(cmbDetalleProducto.getSelectedIndex()))){
                          detalleprod = cmbDetalleProducto.getItemAt(cmbDetalleProducto.getSelectedIndex());
                           where = "WHERE tp.Nombre like '"+"%"+tipoproducto+"%"+"' and dp.descripcion like '"+"%"+detalleprod+"%"+"'";*/
                         
                          if (!"Seleccione tipo".equals(cmbproveedor.getItemAt(cmbproveedor.getSelectedIndex()))){
                              proveedor = cmbproveedor.getItemAt(cmbproveedor.getSelectedIndex());
                               where = "WHERE dp.Codigo_producto like ifnull('"+"%"+tipoproducto+"%"+"'"+",dp.Codigo_producto )"+" and p2.nombre like ifnull('"+"%"+proveedor+"%"+"',p2.nombre)";
                    
                          }
                      }
                
        
        try{
           conexion = conexiondb.getConexion(); 
           DefaultTableModel modelo = new DefaultTableModel();
            JListaPrecios.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            
           String sql = "SELECT  dp.id_det_prod,p.descripcion,dp.Codigo_producto ,Precio_compra ,p.Precio_venta,p2.nombre as proveedores\n" +
                        "FROM Precios p\n" +
                        " LEFT join detalle_producto dp on dp.id_det_prod =p.detalle_Producto\n" +
                        " left  join  proveedores p2 on p2.id_proveedor = p.id_proveedor \n" +
                        " join tipo_productos tp on tp.id_producto = dp.id_producto \n"+
                        where+
                        "Order by dp.Codigo_producto";
            
            System.out.println(sql);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Codigo del Producto");
            modelo.addColumn("Precio Compra");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Proveedor");
            int [] anchos = {25,25,25,25,25,25,25,25};
            for (int x = 0; x<cantidadColumnas; x++)
            {
                JListaPrecios.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            
            while (rs.next()){
                
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0;i<cantidadColumnas;i++){
                    filas[i]= rs.getObject(i+1);
               }
                modelo.addRow(filas);               
            }   
           
        conexion.close();
        } catch(SQLException ex) {
            System.err.println(ex.toString());
            
        }
       
                
                
          txtpreciocompra.setText("");
          txtprecioventa.setText("");
          this.cmbCodigoProducto.setModel(metodos.codigo_producto());
          this.cmbproveedor.setModel(metodos.proveedor());

        
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          PreparedStatement ps = null;
          
          if ("".equals(txtpreciocompra.getText())){
            JOptionPane.showMessageDialog(this, "Completar los campos por favor");  
              
          }else{
              if(cmbCodigoProducto.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(this, "Seleccione Tipo de Producto");   
                  
              }else{
  
             try{
                 
                 conexiondb conn = new conexiondb();
                 Connection con = conn.getConexion();
            
            int Fila = JListaPrecios.getSelectedRow();
            String nombre = JListaPrecios.getValueAt(Fila,0).toString();
            
            ps = con.prepareStatement("delete FROM  Precios where Detalle_producto=?");
            ps.setString(1, nombre);
            ps.execute();
            JOptionPane.showMessageDialog(this, "Datos eliminados");
             txtpreciocompra.setText("");
             txtprecioventa.setText("");
             this.cmbCodigoProducto.setModel(metodos.codigo_producto());
             this.cmbproveedor.setModel(metodos.proveedor());
             
             actualizartabla();
            /* Add_Supr_usuario el = new Add_Supr_usuario();
             el.setVisible(true);
             this.dispose();*/
            con.close();
             } catch (SQLException ex) {
                 System.out.println(ex.toString());
                 

            }
             
          } 
         
        }
        
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String proveedor;
        int id=-1;
        int id_proveedor=-1;
        String codigo;
        if (!"".equals(txtcodigo.getText())){
        codigo=txtcodigo.getText();
        }
        else{
           codigo=cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex());
            
        }
        proveedor=cmbproveedor.getItemAt(cmbproveedor.getSelectedIndex());
        //trae el valor de proveedor
        try{
           PreparedStatement ps = null;
            ResultSet rs = null;
            conexiondb conn = new conexiondb();
            Connection con = conn.getConexion();  
            
            String sql = "SELECT id_proveedor FROM proveedores Where nombre= "+"'"+proveedor+"'";
             System.out.println(sql);
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
            // id.to(rs.getString("Descripcion"));
            //descripcion=(rs.getString("id_det_prod"));
            while (rs.next()){
                id_proveedor=(rs.getInt("id_proveedor"));
              
            }
            
            
         }catch(SQLException ex) {
            System.err.println(ex.toString());  
        }
        
        if ("".equals(txtpreciocompra.getText()) && txtprecioventa.equals("")/*&&txtinconveniente.equals("")&&txtsolucion.equals("")*/) {
            JOptionPane.showMessageDialog(this, "Completar los campos por favor");
        } else {
            if ("".equals(txtpreciocompra.getText())) {
                JOptionPane.showMessageDialog(this, "Completar los campos por favor");
            } else {
                int i = metodos.actualizar_precios(txtpreciocompra.getText(),txtprecioventa.getText(),id_proveedor,codigo);
                if (i > 0) {
                    JOptionPane.showMessageDialog(this, "Datos guardados correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo guardar los datos");
                }
            }
        }
         actualizartabla();
         txtpreciocompra.setText("");
         txtprecioventa.setText("");
         this.cmbCodigoProducto.setModel(metodos.codigo_producto());
         this.cmbproveedor.setModel(metodos.proveedor());
         lblNombreCod_prod.setText("");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cmbCodigoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCodigoProductoMouseClicked
        // TODO add your handling code here:
        // traerNombreCodigo();
    }//GEN-LAST:event_cmbCodigoProductoMouseClicked

    private void cmbCodigoProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCodigoProductoItemStateChanged
        // TODO add your handling code here:
        
        traerNombreCodigo();
        
    }//GEN-LAST:event_cmbCodigoProductoItemStateChanged

    private void txtcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyReleased
    traerNombreCodigo();
    this.cmbCodigoProducto.setModel(metodos.codigo_producto());
        
        
        
    }//GEN-LAST:event_txtcodigoKeyReleased
     //Mostrar Jtable
       public  DefaultTableModel actualizartabla(){
            Connection conexion = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
              try{
            conexion = conexiondb.getConexion();
            DefaultTableModel modelo = new DefaultTableModel();        
            JListaPrecios.setModel(modelo);
            
            
            String sql = "SELECT  dp.id_det_prod,p.descripcion,dp.Codigo_producto ,Precio_compra ,p.Precio_venta,p2.nombre as proveedores\n" +
                        "FROM Precios p\n" +
                        " LEFT join detalle_producto dp on dp.id_det_prod =p.detalle_Producto\n" +
                        " left  join  proveedores p2 on p2.id_proveedor = p.id_proveedor \n" +
                        " join tipo_productos tp on tp.id_producto = dp.id_producto \n"+
                        "Order by p.Detalle_Producto,p.Codigo_producto";
            
            System.out.println(sql);
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Codigo del Producto");
            modelo.addColumn("Precio Compra");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Proveedor");
            int [] anchos = {25,25,25,25,25,25};
            for (int x = 0; x<cantidadColumnas; x++)
            {
                JListaPrecios.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            
            while (rs.next()){
                
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0;i<cantidadColumnas;i++){
                    filas[i]= rs.getObject(i+1);
               }
                modelo.addRow(filas);   
            } 
            conexion.close();
        } catch(SQLException ex) {
            System.err.println(ex.toString());
        }    
        return null;
       }
       
       //trae el nombre para el labeldescripcion ejemplo Pizza Muzzarella
       public void traerNombreCodigo(){
        String Codigo_Producto=null;
        String Nombre=null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = null;
         
        if (!"Seleccione tipo".equals(cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex()))){
            Codigo_Producto = cmbCodigoProducto.getItemAt(cmbCodigoProducto.getSelectedIndex());
        }else{
            Codigo_Producto=txtcodigo.getText();
        }
        
         //trae el Nombre Concatenado
        try{
           conexion = conexiondb.getConexion();
            
            String sql = "SELECT CONCAT(tp.nombre,' ',dp.descripcion)As Descripcion   FROM  detalle_producto dp "
                    + "join tipo_productos tp on tp.id_producto = dp.id_producto "
                    + "where dp.Codigo_producto ="+"'"+Codigo_Producto+"'";
             System.out.println(sql);
             ps = conexion.prepareStatement(sql);
             rs = ps.executeQuery();
            // id.to(rs.getString("Descripcion"));
            //descripcion=(rs.getString("id_det_prod"));
            while (rs.next()){
                Nombre=(rs.getString("Descripcion"));
              
            }
            
           conexion.close();
         }catch(SQLException ex) {
            System.err.println(ex.toString());  
        }       
         lblNombreCod_prod.setText(Nombre);            
               
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
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Precios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JListaPrecios;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JComboBox<String> cmbCodigoProducto;
    private javax.swing.JComboBox<String> cmbproveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblNombreCod_prod;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtpreciocompra;
    private javax.swing.JTextField txtprecioventa;
    // End of variables declaration//GEN-END:variables
}
