package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.DefaultListModel;

public class Producto {
    private String codProd;
    private String nom;
    private String categoria;
    private double precioUnit;
    private Conexion bdd = new Conexion();
    DefaultTableModel modelo;
    private PreparedStatement ps;
    private DefaultListModel modeloLista = new DefaultListModel();
    
   

    //CREAR UN VECTOR CON TODAS MIS CATEGORÍAS. DE MANERA DE ENVIÁRSELO
    //AL COMBOBOX DE FORMULARIO PARA QUE EN LA SELECCIÓN SE LO ENVÍE AL 
    //ATRIBUTO CATEGORÍA. PARA ASÍ CADA PRODUCTO TENGA UNA CATEGORÍA SELECCIONADA
    private String [] nombresDeCategorias = {"Cafés", "Infusiones", "Bebidas", "Chocolates", "Panadería"};
    
    //PENSÉ EN GENERAR LAS SIGUIENTES VARIABLES ESTÁTICAS. LA IDEA ES QUE 
    //VAYA INCREMENTANDO MIS CÓDIGO DE PRODUCTO: 001 - 002 - 003 - 004
    //LA ÚNICA MANERA QUE ESTO SE HAGA ES QUE LAS VARIABLES SEAN ESTÁTICAS (ATRIBUTOS)
    //Y QUE CUÁNDO SE EJECUTE EL MÉTODO DE ASIGNAR EL CÓDIGO DE PRODUCTO, SE INCREMENTE EN 1 
    //POR CADA CATEGORÍA. SI PERTENECE A LA CLASE GUARDARAN LOS ANTIGUOS VALORES SIN COMENZAR DE NUEVO EN 1
    private static int nroCodCaf = 0;
    private static int nroCodInf = 0;
    private static int nroCodBeb = 0;
    private static int nroCodCho = 0;
    private static int nroCodPan = 0;
    
    public Producto(String nom, String categoria, double precioUnit){
        this.nom = nom;
        this.categoria = categoria;
        this.precioUnit = precioUnit;
    }
    
    public Producto(){
    }
    
    //SETTEAR MIS VARIABLES ESTÁTICAS DE NRO DE INDICE DEL CÓDIGO DE PROD. SEGÚN CATEGORÍA
    public void setNroCodCaf(int nroCodCaf){
        Producto.nroCodCaf = nroCodCaf;
        System.out.println("El numero de codigo de cafe es: " + nroCodCaf);
    }

    public void setNroCodInf(int nroCodInf) {
        Producto.nroCodInf = nroCodInf;
    }

    public void setNroCodBeb(int nroCodBeb) {
        Producto.nroCodBeb = nroCodBeb;
    }

    public void setNroCodCho(int nroCodCho) {
        Producto.nroCodCho = nroCodCho;
    }

    public void setNroCodPan(int nroCodPan) {
        Producto.nroCodPan = nroCodPan;
    }
    
    public int getValorDeVarEstatica(){
        return Producto.nroCodCaf;
    }
    
    public double getPrecioUnitario(){
        return this.precioUnit;
    }

    
    //CREO MÉTODOS SETTERS PARA LLENAR MIS ATRIBUTOS DE MI SENTENCIA SELECT. NO LO
    //SOLO NECESITO DESDE MIS CLASES DE BÚSQUEDA. POR ESO VA EN PRIVADO
    private void setCodProdDesdeBusqueda(String codProd){
        this.codProd = codProd;
    }
    
    private void setNomDesdeBusqueda(String nom) {
        this.nom = nom;
    }

    private void setCategoriaDesdeBusqueda(String categoria) {
        this.categoria = categoria;
    }

    private void setPrecioUnitDesdeBusqueda(double precioUnit) {
        this.precioUnit = precioUnit;
    }
    
    public String getNombreProducto(){
        return this.nom;
    }

    public DefaultListModel getModeloLista() {
        return modeloLista;
    }
    
    
    
    //EN ESTE MÉTODO VOY A CARGAR CADA VALOR DEL VECTOR DEL NOMBRE DE LAS 
    //CATEGORÍAS A UN OBJETO QUE ENVIARÁ TODO ESOS VALORES AL COMBOBOX
    public DefaultComboBoxModel getNombresCategorias(){
        DefaultComboBoxModel nomCategoriasComboBox = new DefaultComboBoxModel();
        nomCategoriasComboBox.addElement("Seleccione una categoría");
        for (int i = 0; i < nombresDeCategorias.length; i++) {
            nomCategoriasComboBox.addElement(nombresDeCategorias[i]); 
        }
        return nomCategoriasComboBox;
    }
   
    //ESTABLECER EL CÓDIGO DEL PRODUCTO A PARTIR DE LA BÚSQUEDA DEL ÍNDICE DESDE
    //MI BASE DE DATOS
    
    /*
    public void setCodProd(String categoria){        
        String catProd = "";
        String codNrosCatProd = "";
        
        switch (categoria) {
            
            case "Cafés"://Categoría café
                catProd = "CAF"; //el nombre de la categoria: CAF
                nroCodCaf++;                
                System.out.println(nroCodCaf);
                if (nroCodCaf < 10) {codNrosCatProd = "000";}//menor a 10 con 000 ---> 0001 - 0002 - 0003
                else{
                    if (nroCodCaf < 100) {codNrosCatProd = "00";}//menor a 100 y mayor a 9 con 00 ---> 0010 - 0050 - 0099
                    else{
                        if (nroCodCaf < 1000) {codNrosCatProd = "0";}
                    }
                }
                this.codProd = "FF" + codNrosCatProd + nroCodCaf + catProd; //FF0001CAF - FF0010CAF - FF0100CAF
                nroCodCaf++;
            break;
            
            case "Infusiones":
                catProd = "INF";
                nroCodInf++;
                if (nroCodInf < 10) {codNrosCatProd = "000";}
                else{
                    if (nroCodInf < 100) {codNrosCatProd = "00";}
                    else{
                        if (nroCodInf < 1000) {codNrosCatProd = "0";}
                    }
                }
                this.codProd = "FF" + codNrosCatProd + nroCodInf + catProd; 
                nroCodInf++;
            break;
            
            case "Bebidas":
                catProd = "BEB";
                nroCodBeb++;
                if (nroCodBeb < 10) {codNrosCatProd = "000";}
                else{
                    if (nroCodBeb < 100) {codNrosCatProd = "00";}
                    else{
                        if (nroCodBeb < 1000) {codNrosCatProd = "0";}
                    }
                }
                this.codProd = "FF" + codNrosCatProd + nroCodBeb + catProd; 
                nroCodBeb++;
            break;
            
            case "Chocolates":
                catProd = "CHO";
                nroCodCho++;
                if (nroCodCho < 10) {codNrosCatProd = "000";}
                else{
                    if (nroCodCho < 100) {codNrosCatProd = "00";}
                    else{
                        if (nroCodCho < 1000) {codNrosCatProd = "0";}
                    }
                }
                this.codProd = "FF" + codNrosCatProd + nroCodCho + catProd; 
                nroCodCho++;
            break;
            
            case "Panadería":
                catProd = "PAN";
                nroCodPan++;
                if (nroCodPan < 10) {codNrosCatProd = "000";}
                else{
                    if (nroCodPan < 100) {codNrosCatProd = "00";}
                    else{
                        if (nroCodPan < 1000) {codNrosCatProd = "0";}
                    }
                }
                this.codProd = "FF" + codNrosCatProd + nroCodPan + catProd; 
                nroCodPan++;
            break;
        }        
    }
    */
/*
    public void setIndiceProductoSegunCategoria(String categoria){
        int indice = 0;
        String sentenciaSQL = "SELECT count(codProd) FROM productos WHERE categoria = '"+ categoria +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL); 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              indice = rs.getInt(1);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el índice \n" + e);
        }
        
        System.out.println("El indice desde el método es: " + indice);
        
        switch (categoria) {
            case "Cafés": this.setNroCodCaf(indice);break;
            case "Infusiones": this.setNroCodInf(indice);break;
            case "Bebidas": this.setNroCodBeb(indice);break;
            case "Chocolates": this.setNroCodCho(indice);break;
            case "Panadería": this.setNroCodPan(indice);break;
        }
        
    }
    */
    //MÉTODO INSERTAR
    public void agregarProd(){
        String sentenciaSQLInsertar = "INSERT INTO productos (nom,precioUnit,categoria) VALUES (?,?,?);";
        try {
            //PREPARAR LA SENTENCIA SQL A INSERTAR
            ps = bdd.getUse().prepareStatement(sentenciaSQLInsertar);
            //PASARLE LOS VALORES DE LOS ATRIBUTOS A LAS COLUMNAS CORRESPONDIENTES
            ps.setString(1, this.nom);
            ps.setDouble(2, this.precioUnit);
            ps.setString(3, this.categoria);
            //EJECUTAR LA INSERCIÓN
            int x = ps.executeUpdate();
            if (x > 0) {//EXECUTEUPDATE DEVUELVE MÁS DE 0 EN CASO DE QUE LA INSERCIÓN SEA EXITOSA, SINO DEVUELVE 1
                JOptionPane.showMessageDialog(null, "Inserción exitosa.");//POR ESO SI DEVUELVE MÁS DE 0 LE DAMOS ESTE MENSAJE DE INSERCIÓN EXITOSA
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inserción fallida" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    //MÉTODO MOSTRAR
    public DefaultTableModel mostrarProductos(){
        modelo = new DefaultTableModel();
        
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio unitario");
        modelo.addColumn("Categoria");
        
        String sentenciaSQL = "SELECT codProd, nom, precioUnit, categoria FROM productos;";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL); 
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               this.setCodProdDesdeBusqueda( rs.getString(1) );
               this.setNomDesdeBusqueda( rs.getString(2) );
               this.setPrecioUnitDesdeBusqueda( rs.getDouble(3) );
               this.setCategoriaDesdeBusqueda( rs.getString(4) );
               Object [] registro = {this.codProd, this.nom, this.precioUnit, this.categoria};
               this.modelo.addRow(registro);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró productos\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }    
        
        return modelo;
    }
    
    public boolean buscarPorCodigo(String codPro, String tipoTarea){
        boolean Existe = false;
        int codProd = Integer.parseInt(codPro);
        String sentenciaSQL = "";
        switch (tipoTarea) {
            case "config":
                sentenciaSQL = "SELECT codProd, nom, precioUnit, categoria FROM productos WHERE codProd = '"+ codProd +"';";                
                break;
            case "seleccion":
                sentenciaSQL = "SELECT nom FROM productos WHERE codProd LIKE '"+ codProd+ "%';";                
                break;
        }
             
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();
            
            switch (tipoTarea) {
                case "config":
                    if (rs.next()) {
                        this.setCodProdDesdeBusqueda(String.valueOf( rs.getInt(1)) );
                        this.setNomDesdeBusqueda( rs.getString(2) );
                        this.setPrecioUnitDesdeBusqueda( rs.getDouble(3) );
                        this.setCategoriaDesdeBusqueda( rs.getString(4) );
                        Existe = true;

                    }
                    break;
                case "seleccion":
                    while (rs.next()) {
                        modeloLista.addElement(rs.getString(1));
                        Existe = true;    
                    }
                    break;
            }
      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el producto.\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
            Existe = false;
        }
        
        return Existe;
    }
    
    public boolean buscarPorNombre(String nom, String tipoTarea){
        boolean Existe = false;
        String sentenciaSQL = "";
        switch (tipoTarea) {
            case "config":
                sentenciaSQL = "SELECT codProd, nom, precioUnit, categoria FROM productos WHERE nom = '"+ nom +"';";
                break;
            case "seleccion":
                sentenciaSQL = "SELECT nom FROM productos WHERE nom LIKE '"+ nom + "%';";
                break;
            case "obtener precio":
                sentenciaSQL = "SELECT precioUnit FROM productos WHERE nom LIKE '"+ nom + "';";
                break;
        }
       
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();

            switch (tipoTarea) {
                case "config":
                    if (rs.next()) {
                        this.setCodProdDesdeBusqueda( rs.getString(1) );
                        this.setNomDesdeBusqueda( rs.getString(2) );
                        this.setPrecioUnitDesdeBusqueda( rs.getDouble(3) );
                        this.setCategoriaDesdeBusqueda( rs.getString(4) );
                        Existe = true;    
                    }             
                    break;
                case "seleccion":
                    while (rs.next()) {
                        modeloLista.addElement(rs.getString(1));
                        Existe = true;    
                    } 
                    break;
                case "obtener precio":
                    if (rs.next()) {
                        this.setPrecioUnitDesdeBusqueda(rs.getDouble(1));
                        Existe = true;
                    }
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el producto.\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
            Existe = false;
        }
        
        return Existe;
    }
 
    
    public DefaultTableModel buscarPorCategoria(String categoria){
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio unitario");
        modelo.addColumn("Categoría");
        
        String sentenciaSQL = "SELECT codProd, nom, precioUnit, categoria FROM productos WHERE categoria = '"+ categoria +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                this.setCodProdDesdeBusqueda( rs.getString(1) );
                this.setNomDesdeBusqueda( rs.getString(2) );
                this.setPrecioUnitDesdeBusqueda( rs.getDouble(3) );
                this.setCategoriaDesdeBusqueda( rs.getString(4) );
            
                Object [] registro = {this.codProd, this.nom, this.precioUnit, this.categoria};
            
                modelo.addRow(registro);
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el producto.\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return modelo;        
    }
    
    public DefaultTableModel agregarModeloTabla(){
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio unitario");
        modelo.addColumn("Categoría");
                
        Object [] registro = {this.codProd, this.nom, this.precioUnit, this.categoria};
        modelo.addRow(registro);
        
        return modelo;
    }
    
    public boolean buscarPorCategorias(String categoria){
        String sentenciaSQL = "SELECT nom FROM productos WHERE categoria LIKE '"+ categoria + "%';";                
        boolean Existe = false;
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL); 
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modeloLista.addElement(rs.getString(1));
                Existe = true;    
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el producto.\n" + e, "Error", JOptionPane.ERROR_MESSAGE); 
            Existe = false;
        }
        
        return Existe;
        
    }
    
    //MÉTODO ELIMINAR
    public void eliminar(String codProd){
        String sentenciaSQL = "DELETE FROM productos WHERE codProd = '"+ codProd +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            ps.executeUpdate(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el producto\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //MÉTODOS MODIFICAR
    public void modificarPorNombre(String nomViejo, String nomNuevo){
        String sentenciaSQL =  "UPDATE productos SET nom = '"+ nomNuevo +"' WHERE nom = '"+ nomViejo +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            int x = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificarPorCategoria(String cod, String categoriaNueva){
        String sentenciaSQL = "UPDATE productos SET categoria = '"+ categoriaNueva +"' WHERE codProd = '"+ cod +"';"; 
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            int x = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public void modificarPorPrecioUnit(String cod, double precioUnitNuevo){
        String sentenciaSQL = "UPDATE productos SET precioUnit = '"+ precioUnitNuevo +"' WHERE codProd = '"+ cod +"';";
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL);
            int x = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Modificación fallida\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    
    public int buscar(String nom){
        int cod = 0;
        String sentenciaSQL = "SELECT codProd FROM productos WHERE nom = '" + nom + "';";                
        try {
            ps = bdd.getUse().prepareStatement(sentenciaSQL); 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cod = rs.getInt(1);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el producto.\n" + e, "Error", JOptionPane.ERROR_MESSAGE); 
        }
        
        return cod;
    }
    
    
}

