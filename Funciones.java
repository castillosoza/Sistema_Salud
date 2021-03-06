# Sistema_Salud
Proyectos desarrollados en Netbeans
package Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Gutierrez
 */
public class Conexion {
    //com.mysql.jdbc.Driver
     // public String db="jdbc:odbc:Driver=Microsoft Access Driver (*.mbd);DBQ=c:/BaseDeDatos.mdb";
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost/chantalud";
    private static final String user="root";
    private static final String pass="";
    private static Connection link = null;
    private PreparedStatement ps = null;
    private static Conexion instance=null;
    static{
         try {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            // crear el enlace hacia la base de datos
            link = DriverManager.getConnection(url,user,pass);

            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /* patron singleton el constructor se declara private, entonces solo puede ser accedido desde dentro de la clase, esto hace
       que esta clase solo pueda instanciarse una vez, a traves del metodo getInstance
     */
    private Conexion() { }

   public static Conexion getInstance(){
       if(instance==null)
           instance = new Conexion();

       return instance;
   }

    public  ResultSet ejecutarQuery(String sql){
       ResultSet rs = null;
        try {
            ps = link.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
       return rs;
    }
    
     
    
    /**
     * metodo para insertar, actualizar o eliminar
     * @param sql
     */
    public void ejecutarIAE(String sql){
        try {
             ps = link.prepareStatement(sql);
             ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
