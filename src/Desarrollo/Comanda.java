package Desarrollo;

import java.sql.Date;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Bdd.Conexion;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Comanda {
    
    private int nroComanda;
    private int nroMesa;
    private Date fechaComanda;
    private Time horaComanda;
    private String codOpe;
    private String estado;
    private double importeTotal;
    
    private String nomOpe;
    
    private PreparedStatement ps;
    private ResultSet rs;
    
    Conexion bdd;
    
    

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public Date getFechaComanda() {
        return fechaComanda;
    }

    public void setFechaComanda(Date fechaComanda) {
        this.fechaComanda = fechaComanda;
    }

    public Time getHoraComanda() {
        return horaComanda;
    }

    public void setHoraComanda(Time horaComanda) {
        this.horaComanda = horaComanda;
    }

    public String getCodOpe() {
        return codOpe;
    }

    public void setCodOpe(String codOpe) {
        this.codOpe = codOpe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public int getNroComanda() {
        return nroComanda;
    }

    public void setNroComanda(int nroComanda) {
        this.nroComanda = nroComanda;
    }

    public String getNomOpe() {
        return nomOpe;
    }

    public void setNomOpe(String nomOpe) {
        this.nomOpe = nomOpe;
    }
    
    
    
    
    
    //Comanda c = new Comanda(nroMesaEscogido, fechaComandaSql, horaComandaSql, codOpe , totalCom); 

    public Comanda(int nroMesa, Date fechaComanda, Time horaComanda, String codOpe, double importeTotal) {
        this.nroMesa = nroMesa;
        this.fechaComanda = fechaComanda;
        this.horaComanda = horaComanda;
        this.codOpe = codOpe;
        this.estado = "Pendiente";
        this.importeTotal = importeTotal;
    }

    public Comanda() {
    }
    
    
    
    public void insertar(){
        bdd = new Conexion();
        String sentenciaSQLInsertar = "INSERT INTO comanda (mesas_nroMesa,fecha,hora,operadores_codOpe,estado,importeTotal) VALUES (?,?,?,?,?,?);";
        try {
            //PREPARAR LA SENTENCIA SQL A INSERTAR
            ps = bdd.getUse().prepareStatement(sentenciaSQLInsertar);
            //PASARLE LOS VALORES DE LOS ATRIBUTOS A LAS COLUMNAS CORRESPONDIENTES
            ps.setInt(1, this.getNroMesa());
            ps.setDate(2, this.getFechaComanda());
            ps.setTime(3, this.getHoraComanda());
            ps.setString(4, this.getCodOpe());
            ps.setString(5, this.estado);
            ps.setDouble(6, this.importeTotal);

            //EJECUTAR LA INSERCIÓN
            int x = ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inserción fallida" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public DefaultTableModel mostrarComandasPendientes(){
        bdd = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("N° de comanda");
        modelo.addColumn("N° de mesa");
        modelo.addColumn("Fecha de comanda");
        modelo.addColumn("Hora de comanda");
        modelo.addColumn("Nombre del operador");
        modelo.addColumn("Importe total");
        modelo.addColumn("Estado de comanda");
        
        String sentenciaSQL = "SELECT c.nroCom, c.mesas_nroMesa, c.fecha, c.hora, e.nom, c.importeTotal, c.estado FROM comanda AS c INNER JOIN empleado AS e ON c.operadores_codOpe = e.cod WHERE c.estado = 'Pendiente' OR c.estado = 'Entregado'; ";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                this.setNroComanda(rs.getInt(1));
                this.setNroMesa(rs.getInt(2));
                this.setFechaComanda(rs.getDate(3));
                this.setHoraComanda(rs.getTime(4));
                this.setNomOpe(rs.getString(5));
                this.setImporteTotal(rs.getDouble(6));
                this.setEstado(rs.getString(7));
                
                LocalDate fechaComandaALocalDate = this.getFechaComanda().toLocalDate();
                String fechaComanda = fechaComandaALocalDate.getDayOfMonth() + "-" + fechaComandaALocalDate.getMonthValue() + "-" + fechaComandaALocalDate.getYear();
                
                Object [] registro = {this.getNroComanda(), this.getNroMesa(), fechaComanda, this.getHoraComanda(), this.getNomOpe(), this.getImporteTotal(), this.getEstado()};
            
                modelo.addRow(registro);
            }  
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró la comanda.\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return modelo;        
    }
    
    public DefaultTableModel mostrarComandasFinalizadas(){
        bdd = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("N° de comanda");
        modelo.addColumn("N° de mesa");
        modelo.addColumn("Fecha de comanda");
        modelo.addColumn("Hora de comanda");
        modelo.addColumn("Nombre del operador");
        modelo.addColumn("Importe total");
        modelo.addColumn("Estado de comanda");
        
        String sentenciaSQL = "SELECT c.nroCom, c.mesas_nroMesa, c.fecha, c.hora, e.nom, c.importeTotal, c.estado FROM comanda AS c INNER JOIN empleado AS e ON c.operadores_codOpe = e.cod WHERE c.estado = 'Finalizado'; ";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                this.setNroComanda(rs.getInt(1));
                this.setNroMesa(rs.getInt(2));
                this.setFechaComanda(rs.getDate(3));
                this.setHoraComanda(rs.getTime(4));
                this.setNomOpe(rs.getString(5));
                this.setImporteTotal(rs.getDouble(6));
                this.setEstado(rs.getString(7));
                
                LocalDate fechaComandaALocalDate = this.getFechaComanda().toLocalDate();
                String fechaComanda = fechaComandaALocalDate.getDayOfMonth() + "-" + fechaComandaALocalDate.getMonthValue() + "-" + fechaComandaALocalDate.getYear();
                
                Object [] registro = {this.getNroComanda(), this.getNroMesa(), fechaComanda, this.getHoraComanda(), this.getNomOpe(), this.getImporteTotal(), this.getEstado()};
            
                modelo.addRow(registro);
            }  
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró la comanda.\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return modelo;        
    }
    
    
    public void modificarEstado(int nroComanda, String tipo){
        bdd = new Conexion();
        String sentenciaSQL =  "UPDATE comanda SET estado = '"+ tipo +"' WHERE nroCom = '"+ nroComanda +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            int x = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Actualización fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
