package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class Conexion {
    private static String URL="jdbc:mysql://localhost:3306/java?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static String Driver="com.mysql.cj.jdbc.Driver";
    private static String user="root";
    private static String pass="trau214";
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static String sql = "";
    private Connection conex;
    private static Connection cn = null;
    
    public void conectar() throws ClassNotFoundException, SQLException{
        Class.forName(Driver);
        conex=DriverManager.getConnection(URL, user,pass);
}
    
    public void desconectar()throws  SQLException {
        conex.close();
    }
    
     public static Connection getConexion() throws SQLException {
  
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cn = DriverManager.getConnection(URL, user, pass);

        return cn;
    }
     
     public ResultSet getDatos(String com){
        try {
            this.getConexion();
            rs = ps.executeQuery(com);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        return rs;
    }
}
