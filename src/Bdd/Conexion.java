package Bdd;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Conexion {
    private final String nomBdd = "jdbc:mysql://localhost:3307/orderffee";
    private final String usu = "root";    
    private final String clave = "";
    private String Driver = "com.mysql.jdbc.Driver";
    Connection bdd = null;
    
    public Conexion(){ 
        try {
            Class.forName(Driver);
            bdd = DriverManager.getConnection(this.nomBdd, this.usu, this.clave);
            /*if (bdd != null) {
                JOptionPane.showMessageDialog(null, "Conexión exitosa.");
            }*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexión fallida.\n" + e);
        }   
    }
    
    public Connection getUse(){
        return bdd;
    }
    
}
