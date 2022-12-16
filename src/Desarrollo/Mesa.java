package Desarrollo;

import java.sql.PreparedStatement;
import Bdd.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Mesa {
    
    Conexion bdd = new Conexion();

    private int nroMesa;
    private String estado;
    
    public Mesa(){
    }
    
    public void setEstadoMesa(int nroMesa, String estadoMesa){
        String sentenciaSQL = "UPDATE mesas SET estado = '"+ estadoMesa +"' WHERE nroMesa = '"+ nroMesa +"';";
        try {
            PreparedStatement ps = bdd.getUse().prepareStatement(sentenciaSQL); 
            int x = ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public String getEstadoMesa(int nroMesa){
        String estadoMesa = "";
        String sentenciaSQL = "SELECT estado FROM mesas WHERE nroMesa = '"+ nroMesa +"';";
        try {
            PreparedStatement ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                estadoMesa = rs.getString(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró la mesa");
        }
        return estadoMesa;
    }
    
    
    
}
