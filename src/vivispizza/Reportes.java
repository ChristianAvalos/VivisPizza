/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivispizza;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metodos_sql.conexiondb;
import metodos_sql.metodos_sql;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static vivispizza.login.texto;

/**
 *
 * @author christian
 */
public class Reportes extends javax.swing.JFrame {
private metodos_sql metodos = new metodos_sql();
    /**
     * Creates new form Reportes
     */
    public Reportes() {
        initComponents();
        setLocationRelativeTo(null);
        //Esto trae la fecha de Hoy
        Calendar c2 = new GregorianCalendar();
        JFechaInicio.setCalendar(c2);
        JFechaFin.setCalendar(c2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JToggleButton();
        btnventas = new javax.swing.JButton();
        JFechaInicio = new com.toedter.calendar.JDateChooser();
        JFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnListado_Productos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnventas.setText("Ventas");
        btnventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reportes");
        jLabel1.setToolTipText("");

        jLabel2.setText("Desde");

        jLabel3.setText("Hasta");

        btnListado_Productos.setText("Listado de Productos");
        btnListado_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListado_ProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRegresar))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnventas)
                                .addGap(67, 67, 67)
                                .addComponent(btnListado_Productos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(JFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(JFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(JFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnventas)
                    .addComponent(btnListado_Productos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
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

    private void btnventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventasActionPerformed
            SimpleDateFormat dformart=new SimpleDateFormat("dd/MM/yyyy");
            String fecha = dformart.format(JFechaInicio.getDate());
            ParseFecha(fecha);
            java.sql.Date FechaInicio = new java.sql.Date(fechaDate.getTime());
            String fecha2 = dformart.format(JFechaFin.getDate());
            ParseFecha(fecha2);
            java.sql.Date FechaFin = new java.sql.Date(fechaDate.getTime());
           Connection conexion = null;
           try {     
        
            conexion = conexiondb.getConexion();
            JasperReport reporte = null;
            //Este path seria para linux
            String path = "/mnt/2BB12D737F92C9C5/software vivis pizza/vivispizza/src/Reportes/Reportes_Ventas.jasper";
            //Este path seria para windows
            //String path = "D:\\software vivis pizza\\vivispizza\\src\\Reportes\\Reportes_Ventas.jasper";
            //Aqui se le pasa el parametro de Fechas
            Map parametro = new HashMap();
            parametro.put("fecha",FechaInicio);
            parametro.put("FechaFin",FechaFin);
        
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        
            JasperPrint jprint = JasperFillManager.fillReport(path,parametro,conexion);
                        
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        
    } catch (JRException ex) {
        Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnventasActionPerformed

    private void btnListado_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListado_ProductosActionPerformed
         try {     
        
            conexiondb conn = new conexiondb();
            Connection con = conn.getConexion(); 
            JasperReport reporte = null;
            //Este path seria para linux
            String path = "/mnt/2BB12D737F92C9C5/software vivis pizza/vivispizza/src/Reportes/Reporte_Tipo_Producto.jasper";
            //Este path seria para windows
            //String path = "D:\\software vivis pizza\\vivispizza\\src\\Reportes\\Reporte_Tipo_Producto.jasper";
         reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        
            JasperPrint jprint = JasperFillManager.fillReport(path,null,con);
                        
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        
    } catch (JRException ex) {
        Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnListado_ProductosActionPerformed
 public java.util.Date fechaDate;
    public  java.util.Date ParseFecha(String fecha){
        fechaDate = null;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaDate = formato.parse(fecha);  
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        //JOptionPane.showMessageDialog(null,fechaDate.toString());
       // date.setDate(fechaDate);
        
        return fechaDate;
        
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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JFechaFin;
    private com.toedter.calendar.JDateChooser JFechaInicio;
    private javax.swing.JButton btnListado_Productos;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JButton btnventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
