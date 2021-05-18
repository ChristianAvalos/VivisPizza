/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author christian
 */
public class Encriptar {
    String secretkey = "SomosProgramadores";
    
    public String encriptar (String secretkey, String Cadena ){
        String encriptacion = "";
        try{
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretkey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword,24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE,key);
            
            byte[] plainTextByte = Cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextByte);
            byte[] base64Bytes = Base64.encodeBase64(buf); 
            encriptacion = new String(base64Bytes);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"Algo Salio mal");
        
    }
        return encriptacion;
        
    }
    
    public String desencriptar (String secretkey, String CadenaEncriptada ){
        String desencriptacion = "";
         try{
             byte[] message = Base64.decodeBase64(CadenaEncriptada.getBytes("utf-8"));
             MessageDigest md5 = MessageDigest.getInstance("MD5");
             byte[] digestOfPassword = md5.digest(secretkey.getBytes("utf-8"));
             byte[] keyBytes = Arrays.copyOf(digestOfPassword,24);
             SecretKey key = new SecretKeySpec(keyBytes, "DESede");
             Cipher decipher = Cipher.getInstance("DESede");
             decipher.init(Cipher.DECRYPT_MODE,key);
             
             byte[] plainText = decipher.doFinal(message);
             desencriptacion = new String(plainText,"utf-8");
            
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e+"Algo Salio mal");
    }
        return desencriptacion;
        
    }
    
    
}
