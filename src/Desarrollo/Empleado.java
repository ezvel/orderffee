package Desarrollo;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public abstract class Empleado {
    protected String cod;
    protected String nom;
    protected String ape;
    protected  String dni;
    protected String email;
    protected String pass;
    protected String tel;
    protected char tipo;
    protected char estado = 'I';
    protected String [] nombresDeTurnos = {"Mañana", "Tarde", "Noche"};

    public Empleado(String nom, String ape, String dni, String email, String pass, String tel, char tipo) {
        this.nom = nom;
        this.ape = ape;
        this.dni = dni;
        this.email = email;
        this.pass = pass;
        this.tel = tel;
        this.tipo = tipo;
    }

    public Empleado(String nom, String ape, String dni, String email, String pass, char tipo) {
        this.nom = nom;
        this.ape = ape;
        this.dni = dni;
        this.email = email;
        this.pass = pass;
        this.tipo = tipo;
    }

    public Empleado() {
    }
    
    
    public abstract String getPass();
    

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public abstract  DefaultComboBoxModel getNombresDeTurnos();
    
    public abstract void generarCodigo();
    public abstract boolean agregar();
    public abstract void modificarPorNombre(String nomNuevo, String nomViejo);
    public abstract void modificarPorDni(String dniNuevo, String dniViejo);
    public abstract void modificarPorEmail(String emailNuevo, String emailViejo);
    public abstract void modificarPorTel(String telNuevo, String telViejo);
    public abstract boolean buscarPorEmail(String email, char tipo);
    public abstract void setPass(String pass);
    public abstract DefaultTableModel mostrarEmpleados();   
            
}
