package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DetalleComanda {
    
    private int nroDetalle;
    private int nroComanda;
    private int codProd;
    private int cant;
    private double subtotal;
    private double precioUnit;
    
    private String nomProd;
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion bdd = new Conexion();

    public DetalleComanda(int codProd, int cant, double subtotal, int nroComanda) {
        this.codProd = codProd;
        this.cant = cant;
        this.subtotal = subtotal;
        this.nroComanda = nroComanda;
    }
    
    public DetalleComanda(){
        
    }
    
    public void setNroDetalle(int nroDetalle){
        this.nroDetalle = nroDetalle;
    }
    
    private void setNroComanda(int nroComanda){
        this.nroComanda = nroComanda;
    }
    
    private void setNomProd(String nomProd){
        this.nomProd = nomProd;
    }
    
    private void setPrecioUnit(double precioUnit){
        this.precioUnit = precioUnit;
    }
    
    private void setCant(int cant){
        this.cant = cant;
    }
    
    private void setSubtotal(double subtotal){
        this.subtotal = subtotal;
    }

    public int getCant() {
        return cant;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public String getNomProd() {
        return nomProd;
    }
    
    public int getNroComandaDesdeTabla(){
        return this.nroComanda;
    }

    public int getNroDetalleDesdeTabla(){
        return this.nroDetalle;
    }
    
    public void insertar(){
        String sentenciaSQLInsertar = "INSERT INTO detalledecomanda (cant,subtotal,comanda_nroCom,productos_codProd) VALUES (?,?,?,?);";
        try {
            //PREPARAR LA SENTENCIA SQL A INSERTAR
            ps = bdd.getUse().prepareStatement(sentenciaSQLInsertar);
            //PASARLE LOS VALORES DE LOS ATRIBUTOS A LAS COLUMNAS CORRESPONDIENTES
            ps.setInt(1, this.cant);
            ps.setDouble(2, this.subtotal);
            ps.setInt(3, this.nroComanda);
            ps.setInt(4, this.codProd);
            //EJECUTAR LA INSERCIÓN
            int x = ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inserción fallida" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int getNroComanda(){
        int nroComanda = 0;
        String sentenciaSQL = "SELECT count(nroCom) FROM comanda;";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            rs = ps.executeQuery();
            
            if (rs.next()) {
              nroComanda = rs.getInt(1) + 1;
            } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el nro de comanda\n" + e);
        }
        
        return nroComanda;
    }
    
    public int getNroDetalle(){
        int nroDetalle = 0;
        String sentenciaSQL = "SELECT count(nroDetalle) FROM detalledecomanda;";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            rs = ps.executeQuery();
            
            if (rs.next()) {
              nroDetalle = rs.getInt(1);
            } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el nro de detalle\n" + e);
        }
        
        return nroDetalle;
    }
    
    public int getCantidadProductosEnDetalle(int nroComanda){
        int cantProductosEnDetalle = 0;
        String sentenciaSQL = "SELECT count(nroDetalle) FROM detalledecomanda WHERE comanda_nroCom = '"+ nroComanda +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            rs = ps.executeQuery();
            
            if (rs.next()) {
              cantProductosEnDetalle = rs.getInt(1);
            } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el nro de detalle\n" + e);
        }
        
        return cantProductosEnDetalle;
    }
    
    public int totalComanda(int nroCom){
        int total = 0;
        String sentenciaSQL = "SELECT sum(subtotal) FROM detalledecomanda WHERE comanda_nroCom = '"+ nroCom +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            rs = ps.executeQuery();
            
            if (rs.next()) {
              total = rs.getInt(1);
            } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return total;
    }
    
    public DefaultTableModel mostrarDetalleComanda(int nroComanda){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("N° de detalle");
        modelo.addColumn("N° de comanda");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio unitario");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Subtotal");
        
        String sentenciaSQL = "SELECT dc.nroDetalle, dc.comanda_nroCom, p.nom, dc.cant, dc.subtotal, p.precioUnit FROM detalledecomanda AS dc INNER JOIN productos AS p ON p.codProd = dc.productos_codProd WHERE dc.comanda_nroCom = '"+ nroComanda +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                this.setNroDetalle(rs.getInt(1));
                this.setNroComanda(rs.getInt(2));
                this.setNomProd(rs.getString(3));
                this.setCant(rs.getInt(4));
                this.setSubtotal(rs.getDouble(5));
                this.setPrecioUnit(rs.getDouble(6));

                Object [] registro = {this.getNroDetalleDesdeTabla(), this.getNroComandaDesdeTabla(), this.getNomProd(), this.getPrecioUnit(), this.getCant(), this.getSubtotal()};
            
                modelo.addRow(registro);
            }  
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el detalle.\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return modelo;        
    }
    
}
