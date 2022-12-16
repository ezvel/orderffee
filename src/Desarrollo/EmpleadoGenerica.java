package Desarrollo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Bdd.Conexion;

public class EmpleadoGenerica {
    
    private static String nom;
    private static char tipo;
    
    public static void setNom(String nom){
        EmpleadoGenerica.nom = nom;
    }
    
    public static String getNom(){
        return EmpleadoGenerica.nom;
    }

    public static char getTipo() {
        return tipo;
    }
    
    public static void setTipo(char tipo){
        EmpleadoGenerica.tipo = tipo;
    }
    
    public static void buscarPorEstado(){
        PreparedStatement ps;
        
        String devolver = "";
        
        String sentenciaSQL = "SELECT nom, tipo FROM empleado WHERE estado = 'A';";
        Conexion bdd = new Conexion();
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
               EmpleadoGenerica.setNom(rs.getString(1));
               EmpleadoGenerica.setTipo(rs.getString(2).charAt(0));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el estado.");
        }
    }
    
    
    
    public static void modificarEstado(String email){
        PreparedStatement ps;
        Conexion bdd = new Conexion();
        System.out.println(email);
        String sentenciaSQL = "UPDATE empleado SET estado = 'A' WHERE email = '" + email + "';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void modificarEstadoInactivo(){
        PreparedStatement ps;
        Conexion bdd = new Conexion();
        String sentenciaSQL = "UPDATE empleado SET estado = 'I' WHERE estado = 'A';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
