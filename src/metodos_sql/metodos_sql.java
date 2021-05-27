/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.PreparedStatement;
//import fantasia_muebles.carga_debilidades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author christian
 */

public class metodos_sql {
    

   // public static conexiondb conexion = new conexiondb();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    //Este carga usuarios para el login 
    public int guardar(String usuario, String password) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO Usuarios(nombre,password) VALUES(?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, usuario);
            sentencia_preparada.setString(2, password);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public static String buscarnombre(String usuario) {
        String busqueda_nombre = null;
        Connection conexion = null;
        try {
            conexion = conexiondb.getConexion();
            String sentencia_buscar = ("SELECT nombre,password FROM Usuarios WHERE nombre = '" + usuario + "'");
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                //String nombre = resultado.getString("nombre");
                String password = resultado.getString("password");
                busqueda_nombre = (usuario);

            }
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;

    }  
 
    public static String buscarUsuarioRegistrado(String usuario, String password) {
        String busqueda_usuario = null;
        Connection conexion = null;
        try {
           conexion = conexiondb.getConexion();
            String sentencia_buscar_usuario = ("SELECT nombre FROM Usuarios WHERE nombre = '" + usuario + "' and password='" + password + "'");
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = "usuario encontrado";
            } else {
                busqueda_usuario = "no encontrado";

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }
//combo box comsulta de lista area formulario de carga de debilidades
    public ResultSet consulta(String sql) {
        ResultSet res = null;
        Connection conn = null;
        try {
             conn = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conn.prepareStatement(sql);
            res = sentencia_preparada.executeQuery();

        } catch (SQLException e) {
            System.err.println("Erro consulta" + e.getMessage());
        }
        return res;
    }
//lista de base de datos para seleccion de area de combo box de carga de debilidades
        public DefaultComboBoxModel area_responsable() {
        Connection conexion = null;
        DefaultComboBoxModel listaArea = new DefaultComboBoxModel();
        listaArea.addElement("Seleccione Area");
        ResultSet res = this.consulta("Select * from area_responsable order by nombre");
        try {
           
            while (res.next()) {
                listaArea.addElement(res.getString("nombre"));
            }
            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
        return listaArea;
    }
        //lista de combobox para tipo de ambientes en control de obra tecnico 
        public DefaultComboBoxModel tipo_ambiente() {
        Connection conexion = null;
        DefaultComboBoxModel listaAmbiente = new DefaultComboBoxModel();
        listaAmbiente.addElement("Seleccione tipo");
        ResultSet res = this.consulta("Select * from ambiente order by nombre");
        try {
           
            while (res.next()) {
                listaAmbiente.addElement(res.getString("nombre"));
            }
            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
        return listaAmbiente;
    }
        //carga de tecnico 
        public int cargar_tecnico(String nombre, String edad,String celular,String direccion) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO tecnico(nombre,edad,celular,direccion) VALUES(?,?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, edad);
             sentencia_preparada.setString(3, celular);
            sentencia_preparada.setString(4, direccion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
   //carga de asesor
        public int cargar_asesor(String nombre, String edad,String celular,String direccion) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO asesor(nombre,edad,celular,direccion) VALUES(?,?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, edad);
             sentencia_preparada.setString(3, celular);
            sentencia_preparada.setString(4, direccion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
        
   //lista seleccion tecnico
        public DefaultComboBoxModel tecnico() {
        Connection conexion = null;
        DefaultComboBoxModel listatecnico = new DefaultComboBoxModel();
        listatecnico.addElement("Seleccione Tecnico");
        ResultSet res = this.consulta("Select * from tecnico order by nombre");
        try {
           
            while (res.next()) {
                listatecnico.addElement(res.getString("nombre"));
            }
            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
        return listatecnico;
    }
        //Lista para cargar cmbo de asesor en debilidades
         public DefaultComboBoxModel asesor() {
        Connection conexion = null;
        DefaultComboBoxModel listaAsesor = new DefaultComboBoxModel();
        listaAsesor.addElement("Seleccione Asesor");
        ResultSet res = this.consulta("Select * from asesor order by nombre");
        try {
           
            while (res.next()) {
                listaAsesor.addElement(res.getString("nombre"));
            }
            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
        return listaAsesor;
    }
        //carga de debilidades
        
           public int cargar_debilidades(String fecha, String usuario ,String nombre_cliente ,String ot ,String tecnico ,String asesor,String ambiente,String area_responsable,String inconveniente,String solucion) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO debilidades(fecha,usuario,nombre_cliente,ot,tecnico,asesor,ambiente,area_responsable,inconveniente,solucion) VALUES(?,?,?,?,?,?,?,?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1,fecha);
            sentencia_preparada.setString(2, usuario);
             sentencia_preparada.setString(3, nombre_cliente);
            sentencia_preparada.setString(4, ot);
            sentencia_preparada.setString(5, tecnico);
            sentencia_preparada.setString(6, asesor);
             sentencia_preparada.setString(7, ambiente);
            sentencia_preparada.setString(8, area_responsable);
            sentencia_preparada.setString(9, inconveniente);
            sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
        //carga de obra_tecnico 
           public int cargar_obra_tecnico(String tecnico, String cliente ,String ot ,String ambiente ,String fecha_ingreso ,String fecha_salida,String dias_terminar,String se_termino,String retraso) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_actualizar = ("INSERT INTO obra_tecnico(tecnico,cliente,ot,ambiente,fecha_ingreso,fecha_salida,dias_terminar,se_termino,retraso) VALUES(?,?,?,?,?,?,?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_actualizar);
            sentencia_preparada.setString(1,tecnico);
            sentencia_preparada.setString(2, cliente);
             sentencia_preparada.setString(3, ot);
            sentencia_preparada.setString(4, ambiente);
            sentencia_preparada.setString(5, fecha_ingreso);
            sentencia_preparada.setString(6, fecha_salida);
             sentencia_preparada.setString(7, dias_terminar);
            sentencia_preparada.setString(8, se_termino);
            sentencia_preparada.setString(9, retraso);
            //sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
           //actualizar obra_tecnico
            public int actualizar_obra_tecnico (String tecnico, String cliente ,String ot ,String ambiente ,String fecha_ingreso ,String fecha_salida,String dias_terminar,String se_termino,String retraso) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("UPDATE obra_tecnico SET tecnico='"+tecnico+"',cliente='"+cliente+"',ot='"+ot+"',ambiente='"+ambiente+"',fecha_ingreso='"+fecha_ingreso+"',fecha_salida='"+fecha_salida+"',dias_terminar='"+dias_terminar+"',se_termino='"+se_termino+"',retraso='"+retraso+"' WHERE ot="+ot);

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
           /* sentencia_preparada.setString(0,id);
            sentencia_preparada.setString(1,tecnico);
            sentencia_preparada.setString(2, cliente);
             sentencia_preparada.setString(3, ot);
            sentencia_preparada.setString(4, ambiente);
            sentencia_preparada.setString(5, fecha_ingreso);
            sentencia_preparada.setString(6, fecha_salida);
             sentencia_preparada.setString(7, dias_terminar);
            sentencia_preparada.setString(8, se_termino);
            sentencia_preparada.setString(9, retraso);*/
            //sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
          //actualizar carga_debilidades
            public int actualizar_carga_debilidades (String nombre_cliente ,String ot ,String tecnico ,String asesor ,String ambiente,String area_responsable,String inconveniente,String solucion) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("UPDATE debilidades SET nombre_cliente='"+nombre_cliente+"',ot='"+ot+"',tecnico='"+tecnico+"',asesor='"+asesor+"',ambiente='"+ambiente+"',area_responsable='"+area_responsable+"',inconveniente='"+inconveniente+"',solucion='"+solucion+"' WHERE ot="+ot);

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
           /* sentencia_preparada.setString(0,id);
            sentencia_preparada.setString(1,tecnico);
            sentencia_preparada.setString(2, cliente);
             sentencia_preparada.setString(3, ot);
            sentencia_preparada.setString(4, ambiente);
            sentencia_preparada.setString(5, fecha_ingreso);
            sentencia_preparada.setString(6, fecha_salida);
             sentencia_preparada.setString(7, dias_terminar);
            sentencia_preparada.setString(8, se_termino);
            sentencia_preparada.setString(9, retraso);*/
            //sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }   
            
            //carga detlle tecnico
           public int detalle_tecnico(String tecnico,String observacion ,String fecha) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_actualizar = ("INSERT INTO detalle_tecnico(tecnico,observacion,fecha) VALUES(?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_actualizar);
            sentencia_preparada.setString(1,tecnico);
            sentencia_preparada.setString(2, observacion);
             sentencia_preparada.setString(3, fecha);
            //sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
           //actualizar detalle_tecnico
            public int actualizar_detalle_tecnico (String tecnico,String observacion, String fecha,String id) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("UPDATE detalle_tecnico SET tecnico='"+tecnico+"',observacion='"+observacion+"',fecha='"+fecha+"' WHERE id_det_tec="+id);

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
           /* sentencia_preparada.setString(0,id);
            sentencia_preparada.setString(1,tecnico);
            sentencia_preparada.setString(2, cliente);
             sentencia_preparada.setString(3, ot);
            sentencia_preparada.setString(4, ambiente);
            sentencia_preparada.setString(5, fecha_ingreso);
            sentencia_preparada.setString(6, fecha_salida);
             sentencia_preparada.setString(7, dias_terminar);
            sentencia_preparada.setString(8, se_termino);
            sentencia_preparada.setString(9, retraso);*/
            //sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
            //guardar productos
                public int guardar_productos(String nombre_producto, String cod_producto, String detalle_producto) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar_productos = ("INSERT INTO productos(nombre_producto,cod_producto,detalle_producto) VALUES(?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar_productos);
            sentencia_preparada.setString(1, nombre_producto);
            sentencia_preparada.setString(2, cod_producto);
             sentencia_preparada.setString(3, detalle_producto);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
             //listar productos de vivis pizza
        public DefaultComboBoxModel tipo_producto() {
        Connection conexion = null;
        DefaultComboBoxModel cmbtipo_prod = new DefaultComboBoxModel();
        cmbtipo_prod.addElement("Seleccione tipo");
        String sentencia_guardar = ("Select * from tipo_productos order by id_producto");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            resultado = sentencia_preparada.executeQuery();
           while (resultado.next()) {
                cmbtipo_prod.addElement(resultado.getString("nombre"));
            }
           resultado.close();
           conexion.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
        return cmbtipo_prod;
    }
                
             //listar productos de vivis pizza
                public DefaultComboBoxModel codigo_producto() {
        Connection conexion = null;
        DefaultComboBoxModel cmbtipo_prod = new DefaultComboBoxModel();
        cmbtipo_prod.addElement("Seleccione tipo");
        String sentencia_guardar = ("select Codigo_Producto from Cod_Producto cp order by Codigo_Producto");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            resultado = sentencia_preparada.executeQuery();
           while (resultado.next()) {
                cmbtipo_prod.addElement(resultado.getString("Codigo_Producto"));
            }
           resultado.close();
           conexion.close(); 
       /* ResultSet res = this.consulta("select Codigo_Producto from Cod_Producto cp order by Codigo_Producto ");
        try {
            
            while (res.next()) {
                cmbtipo_prod.addElement(res.getString("Codigo_Producto"));
            }
            res.close(); */
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } 
        
        return cmbtipo_prod;    
    }
                //carga detalle producto
                public int detalle_producto(String Codigo_producto,String descripcion,int id_producto ) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_actualizar = ("INSERT INTO detalle_producto(Codigo_producto,descripcion,id_producto) VALUES(?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_actualizar);
            
            sentencia_preparada.setString(1, Codigo_producto); 
            sentencia_preparada.setString(2,descripcion);
             sentencia_preparada.setInt(3,id_producto);
            //sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
         
    } 
      //listar detalles productos de vivis pizza
                public  DefaultComboBoxModel detalle_producto() {
        Connection conexion = null;
        DefaultComboBoxModel cmbDetalleProducto = new DefaultComboBoxModel();
        cmbDetalleProducto.addElement("Seleccione tipo");
        String sentencia_guardar = ("Select * from detalle_producto order by id_producto");
        
        
        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            resultado = sentencia_preparada.executeQuery();
           while (resultado.next()) {
                cmbDetalleProducto.addElement(resultado.getString("descripcion"));
            }
           resultado.close();
           conexion.close();

       /* ResultSet res = this.consulta("Select * from detalle_producto order by id_producto");
        try {
           
            while (res.next()) {
                cmbDetalleProducto.addElement(res.getString("descripcion"));
            }
            res.close();*/
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
        return cmbDetalleProducto;
    }  
                
             //listar proveedor de vivis pizza
                public DefaultComboBoxModel proveedor() {
        Connection conexion = null;
        DefaultComboBoxModel cmbproveedor = new DefaultComboBoxModel();
        cmbproveedor.addElement("Seleccione tipo");
         String sentencia_guardar = ("select * FROM  proveedores order by id_proveedor");
        
        
        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            resultado = sentencia_preparada.executeQuery();
           while (resultado.next()) {
                cmbproveedor.addElement(resultado.getString("nombre"));
            }
           resultado.close();
           conexion.close();
        /*ResultSet res = this.consulta("select * FROM  proveedores order by id_proveedor");
        try {
           
            while (res.next()) {
                cmbproveedor.addElement(res.getString("nombre"));
            }
            res.close();*/
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
        return cmbproveedor;
    }
    //guardar precios
                public int guardar_precios(String precio_compra, String precio_venta,int Detalle_Producto,int id_proveedor,String Codigo_producto,String Descripcion) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar_precios = ("INSERT INTO Precios(precio_compra,precio_venta,Detalle_Producto,id_Proveedor,Codigo_producto,Descripcion) VALUES(?,?,?,?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar_precios);
            sentencia_preparada.setString(1, precio_compra);
            sentencia_preparada.setString(2, precio_venta);
            sentencia_preparada.setInt(3, Detalle_Producto);
            sentencia_preparada.setInt(4,id_proveedor); 
            sentencia_preparada.setString(5,Codigo_producto); 
            sentencia_preparada.setString(6,Descripcion); 
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
                
                //actualizar Precios Vivis Pizza 
            public int actualizar_precios (String precio_compra, String precio_venta,int IdProveedor, String Codigo_Producto) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("UPDATE Precios SET Precio_compra='"+precio_compra+"',Precio_venta='"+precio_venta+"',id_proveedor='"+IdProveedor+"' WHERE Codigo_producto= '"+Codigo_Producto+"'");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
           /* sentencia_preparada.setString(0,id);
            sentencia_preparada.setString(1,tecnico);
            sentencia_preparada.setString(2, cliente);
             sentencia_preparada.setString(3, ot);
            sentencia_preparada.setString(4, ambiente);
            sentencia_preparada.setString(5, fecha_ingreso);
            sentencia_preparada.setString(6, fecha_salida);
             sentencia_preparada.setString(7, dias_terminar);
            sentencia_preparada.setString(8, se_termino);
            sentencia_preparada.setString(9, retraso);*/
            //sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
            //carga codigo para detalle_producto
                public int carga_codigo(int Numero,int id_tipo_prod,String Codigo_Producto ) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_actualizar = ("INSERT INTO Cod_Producto(Numero,id_tipo_prod,Codigo_Producto) VALUES(?,?,?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_actualizar);
            
            sentencia_preparada.setInt(1, Numero); 
            sentencia_preparada.setInt(2,id_tipo_prod);
            sentencia_preparada.setString(3,Codigo_Producto);
             //sentencia_preparada.setInt(3,id_producto);
            //sentencia_preparada.setString(10, solucion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
         
    } 
       //carga ventas
                public int ventas(Date fechaDate,String Codigo_Producto,String Descripcion_Producto,String Cliente, int Costo_Delivery,int Cantidad,int Precio_Venta,int SubTotal,int Cobrado,int Diferencia_Cobrar ) {
               int resultado = 0;
        Connection conexion = null;
        String sentencia_actualizar = ("INSERT INTO Ventas(Fecha,Codigo_Producto,Descripcion_Producto,Cliente,Costo_Delivery,Cantidad,Precio_Venta,SubTotal,Cobrado,Diferencia_Cobrar) VALUES(?,?,?,?,?,?,?,?,?,?)");
        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_actualizar);
            
            sentencia_preparada.setDate(1, (java.sql.Date) fechaDate); 
            sentencia_preparada.setString(2,Codigo_Producto);
            sentencia_preparada.setString(3,Descripcion_Producto);
            sentencia_preparada.setString(4, Cliente); 
            sentencia_preparada.setInt(5,Costo_Delivery);
            sentencia_preparada.setInt(6,Cantidad);
            sentencia_preparada.setInt(7, Precio_Venta); 
            sentencia_preparada.setInt(8,SubTotal);
            sentencia_preparada.setInt(9,Cobrado);
            sentencia_preparada.setInt(10,Diferencia_Cobrar);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
         
    }
   //Agregar tipo de Producto
    public int Nuevo_Tipo_Producto(String NuevoProducto) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_insertar = ("INSERT INTO tipo_productos(nombre) VALUES(?)");

        try {
            conexion = conexiondb.getConexion();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_insertar);
            sentencia_preparada.setString(1, NuevoProducto);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
         
             
}
