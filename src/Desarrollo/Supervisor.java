package Desarrollo;

import Desarrollo.Empleado;
import javax.swing.JOptionPane;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Supervisor extends Empleado{
    
    private Conexion bdd = new Conexion();
    private PreparedStatement ps;

    public Supervisor(String nom, String ape, String dni, String email, String pass, String tel, char tipo) {
        super(nom, ape, dni, email, pass, tel, tipo);
    }

    public Supervisor(String nom, String ape, String dni, String email, String pass, char tipo) {
        super(nom, ape, dni, email, pass, tipo);
    }

    public Supervisor() {
    }
    
    public String getPass(){
        return this.pass;
    }

    @Override
    public void setPass(String pass){
        this.pass = pass;
    }
    
    @Override
    public void generarCodigo(){
        this.cod = "sup" + this.dni;
    }
    
    
    //MÉTODOS PARA EL DEFAULT TABLE MODEL
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public char getEstado() {
        return estado;
    }
    
    public void setTipo(char tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
       String tipoStr = ""; 
       switch (this.tipo) {
                case 'S': tipoStr = "Supervisor"; break;
                case 'O': tipoStr = "Operador"; break;
            }     
       return tipoStr;
    }
    
    public void separarNombreDeApellido(){
        String nomApeStr = this.nom;
        String [] nomApeArray = nomApeStr.split(",");
        String ape = nomApeArray[0];
        String nom = nomApeArray[1];
        this.nom = nom;
        this.ape = ape;
    }
    
    public String cambiarEstadoDeCharAString(){
        String StrADevolver = "";
        char estado = this.estado;
        switch (estado) {
            case 'A': StrADevolver = "Conectado"; break;
            case 'I': StrADevolver = "Desconectado"; break;
        }
        return StrADevolver;
    }
    
    
    
    @Override
    public boolean agregar(){
        boolean registroExitoso = false;
        
        String sentenciaSQLInsertar = "INSERT INTO empleado (cod,nom,dni,email,pass,tel,estado,turno,tipo) VALUES (?,?,?,?,?,?,?,?,?);";
        try {
            //PREPARAR LA SENTENCIA SQL A INSERTAR
            ps = bdd.getUse().prepareStatement(sentenciaSQLInsertar);
            //PASARLE LOS VALORES DE LOS ATRIBUTOS A LAS COLUMNAS CORRESPONDIENTES
            ps.setString(1, this.cod);
            ps.setString(2, this.ape+ ", " + this.nom);
            ps.setString(3, this.dni);
            ps.setString(4, this.email);
            ps.setString(5, this.pass);
            ps.setString(6, this.tel);
            ps.setString(7, String.valueOf(this.estado));
            ps.setString(8, null);
            ps.setString(9, String.valueOf(this.tipo));
            //EJECUTAR LA INSERCIÓN
            int x = ps.executeUpdate();
            if (x > 0) {//EXECUTEUPDATE DEVUELVE MÁS DE 0 EN CASO DE QUE LA INSERCIÓN SEA EXITOSA, SINO DEVUELVE 1
                JOptionPane.showMessageDialog(null, "Registro exitoso.");//POR ESO SI DEVUELVE MÁS DE 0 LE DAMOS ESTE MENSAJE DE INSERCIÓN EXITOSA
                registroExitoso = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro fallido" + e, "Error", JOptionPane.ERROR_MESSAGE);
            registroExitoso = false;
        }
        
        return registroExitoso;
    }
    
    @Override
    public boolean buscarPorEmail(String email, char tipo){
        boolean existeEmail = false;
        String sentenciaSQL = "SELECT pass FROM empleado WHERE email = '"+ email +"' AND tipo = '"+ tipo +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.setPass(rs.getString(1));
                existeEmail = true;
                EmpleadoGenerica.modificarEstado(email);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el correo electrónico.");
            existeEmail = false;
        }
        return existeEmail;
    }
    
    public DefaultTableModel mostrarEmpleados(){
        DefaultTableModel modelo = new  DefaultTableModel();
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Correo electrónico");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Tipo");
        modelo.addColumn("Estado");
        
        String sentenciaSQL = "SELECT nom, dni, email, tel, tipo, estado FROM empleado WHERE tipo = 'S';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL); 
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               this.setNom(rs.getString(1));
               this.setDni(rs.getString(2));
               this.setEmail(rs.getString(3));
               this.setTel(rs.getString(4));
               this.setTipo(rs.getString(5).charAt(0));
               this.setEstado(rs.getString(6).charAt(0));
               
               String estado = this.cambiarEstadoDeCharAString();
               this.separarNombreDeApellido();
               
               Object [] registro = {this.getNom(), this.getApe(), this.getDni(), this.getEmail(), this.getTel(), this.getTipo(), estado};
               modelo.addRow(registro);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró supervisores\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        return modelo;
    }
    
    
    public void eliminar(String dni){
        String sentenciaSQL = "DELETE FROM empleado WHERE dni = '"+ dni +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ps.executeUpdate(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void modificarPorNombre(String nomNuevo, String dni){
        String sentenciaSQL =  "UPDATE empleado SET nom = '"+ nomNuevo +"' WHERE dni = '"+ dni +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            int x = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación del nombre fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    @Override
    public void modificarPorDni(String dniNuevo, String dniViejo){
        String sentenciaSQL =  "UPDATE empleado SET dni = '"+ dniNuevo +"' WHERE dni = '"+ dniViejo +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            int x = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación del dni fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void modificarPorEmail(String emailNuevo, String emailViejo){
        String sentenciaSQL =  "UPDATE empleado SET email = '"+ emailNuevo +"' WHERE email = '"+ emailViejo +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            int x = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación del mail fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void modificarPorTel(String telNuevo, String dni){
        String sentenciaSQL =  "UPDATE empleado SET tel = '"+ telNuevo +"' WHERE dni = '"+ dni +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            int x = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación del teléfono fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public  DefaultComboBoxModel getNombresDeTurnos(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione una categoría");
        for (int i = 0; i < this.nombresDeTurnos.length; i++) {
            modelo.addElement(this.nombresDeTurnos[i]); 
        }
        return modelo;
    }
    
}
