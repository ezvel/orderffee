package Formularios;

import Desarrollo.Producto;
import Desarrollo.Supervisor;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Desarrollo.EmpleadoGenerica;
import javax.swing.ListSelectionModel;

public class FormProductos extends javax.swing.JInternalFrame {

    private String cod;
    private String nomViejo;
    private double precioUnitViejo;
    private String categoriaVieja;
    private boolean accedioSupervisor = false;
    
    public FormProductos() {
        initComponents();
        Producto p = new Producto();
        this.CboxCategoriaAgregar.setModel(p.getNombresCategorias());
        this.CboxCategoriaAgregar.setSelectedIndex(0);
        this.CboxCategoriaModificar.setModel(p.getNombresCategorias());
        this.CboxCategoriaModificar.setSelectedIndex(0);
        
        //AGREGAMOS AL COMBO BOX DE BÚSQUEDA LAS CATEGORÍAS
        this.CboxBuscarPorCategoria.setModel(p.getNombresCategorias());
        this.CboxBuscarPorCategoria.setSelectedIndex(0);
        
        this.Tabla.setModel(p.mostrarProductos());

        //TENGO QUE DEJAR MIS 3 MODOS DE BUSQUEDA EN FALSE PARA QUE SE ACTIVE EL QUE EL OPERADOR DECIDA
        //ACTIVAR POR MEDIO DEL LOS RADIO BOTONES
        this.TxtBuscarPorCodigo.setEnabled(false);
        this.TxtBuscarPorNombre.setEnabled(false);
        this.CboxBuscarPorCategoria.setEnabled(false);
        
        //DESACTIVAMOS LA OPCION BUSCAR HASTA QUE CUALQUIERA DE LOS CAMPOS  DE BÚSQUEDA ESTE LLENO
        this.BtnBuscar.setEnabled(false);
        
        //DESACTIVAR LOS CAMPOS DE MODIFICACIÓN. SOLAMENTE SE ACTIVARAN SEGÚN LOS CHECKBOX QUE EL OPERADOR PRESIONE
        this.TxtNomModificar.setEnabled(false);
        this.CboxCategoriaModificar.setEnabled(false);
        this.TxtPrecioUnitModificar.setEnabled(false);
        this.BtnAgregar.setEnabled(false);
        this.BtnModificar.setEnabled(false);
        this.BtnEliminar.setEnabled(false);
        
        
        EmpleadoGenerica.buscarPorEstado();
        
        if (EmpleadoGenerica.getTipo() == 'S') {
            this.BtnAgregar.setEnabled(true);
        }
        
        this.Tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        PnlCabecera = new javax.swing.JPanel();
        PnlMenuCabecera = new javax.swing.JPanel();
        LblTituloMenuCabecera = new javax.swing.JLabel();
        PnlMenuCuerpo = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnMostrar = new javax.swing.JButton();
        PnlContenido = new javax.swing.JPanel();
        PnlContenidoMostrar = new javax.swing.JPanel();
        PnlContenidoMostrarTitulo = new javax.swing.JPanel();
        LblMostrarTitulo = new javax.swing.JLabel();
        ScrollPnlTabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        LblBuscarPorCodigo = new javax.swing.JLabel();
        LblBuscarPorNombre = new javax.swing.JLabel();
        LblBuscarPorCategoria = new javax.swing.JLabel();
        CboxBuscarPorCategoria = new javax.swing.JComboBox<>();
        BtnBuscar = new javax.swing.JButton();
        TxtBuscarPorCodigo = new javax.swing.JTextField();
        TxtBuscarPorNombre = new javax.swing.JTextField();
        RbtnBuscarPorCodigo = new javax.swing.JRadioButton();
        RbtnBuscarPorNombre = new javax.swing.JRadioButton();
        RbtnBuscarPorCategoria = new javax.swing.JRadioButton();
        LblMiMetodoDeBusqueda = new javax.swing.JLabel();
        BtnVerTodo = new javax.swing.JButton();
        PnlContenidoModificar = new javax.swing.JPanel();
        PnlContenidoMofiicarTitulo = new javax.swing.JPanel();
        LblModificarTitulo = new javax.swing.JLabel();
        LblNomModificar = new javax.swing.JLabel();
        LblCategoriaModificar = new javax.swing.JLabel();
        LblPrecioUnitModificar = new javax.swing.JLabel();
        TxtNomModificar = new javax.swing.JTextField();
        TxtPrecioUnitModificar = new javax.swing.JTextField();
        CboxCategoriaModificar = new javax.swing.JComboBox<>();
        BtnAceptarModificar = new javax.swing.JButton();
        CheckModificarNombre = new javax.swing.JCheckBox();
        CheckModificarCategoria = new javax.swing.JCheckBox();
        CheckModificarPrecioUnit = new javax.swing.JCheckBox();
        PnlContenidoAgregar = new javax.swing.JPanel();
        PnlContenidoAgregarTitulo = new javax.swing.JPanel();
        LblAgregarTitulo = new javax.swing.JLabel();
        TxtNomAgregar = new javax.swing.JTextField();
        TxtPrecioUnitAgregar = new javax.swing.JTextField();
        CboxCategoriaAgregar = new javax.swing.JComboBox<>();
        LblNomAgregar = new javax.swing.JLabel();
        LblCategoriaAgregar = new javax.swing.JLabel();
        LblPrecioUnitAgregar = new javax.swing.JLabel();
        BtnAceptarAgregar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlCabecera.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout PnlCabeceraLayout = new javax.swing.GroupLayout(PnlCabecera);
        PnlCabecera.setLayout(PnlCabeceraLayout);
        PnlCabeceraLayout.setHorizontalGroup(
            PnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1490, Short.MAX_VALUE)
        );
        PnlCabeceraLayout.setVerticalGroup(
            PnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PnlCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 50));

        PnlMenuCabecera.setBackground(new java.awt.Color(255, 204, 0));
        PnlMenuCabecera.setPreferredSize(new java.awt.Dimension(300, 80));

        LblTituloMenuCabecera.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        LblTituloMenuCabecera.setForeground(new java.awt.Color(0, 0, 0));
        LblTituloMenuCabecera.setText("Productos");

        javax.swing.GroupLayout PnlMenuCabeceraLayout = new javax.swing.GroupLayout(PnlMenuCabecera);
        PnlMenuCabecera.setLayout(PnlMenuCabeceraLayout);
        PnlMenuCabeceraLayout.setHorizontalGroup(
            PnlMenuCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuCabeceraLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(LblTituloMenuCabecera)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        PnlMenuCabeceraLayout.setVerticalGroup(
            PnlMenuCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuCabeceraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblTituloMenuCabecera)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(PnlMenuCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        PnlMenuCuerpo.setBackground(new java.awt.Color(0, 50, 50));
        PnlMenuCuerpo.setPreferredSize(new java.awt.Dimension(300, 100));

        BtnEliminar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setPreferredSize(new java.awt.Dimension(276, 70));
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnModificar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.setPreferredSize(new java.awt.Dimension(276, 70));
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnAgregar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnAgregar.setText("AGREGAR");
        BtnAgregar.setPreferredSize(new java.awt.Dimension(79, 70));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.setPreferredSize(new java.awt.Dimension(79, 75));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnMostrar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnMostrar.setText("BUSCAR");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlMenuCuerpoLayout = new javax.swing.GroupLayout(PnlMenuCuerpo);
        PnlMenuCuerpo.setLayout(PnlMenuCuerpoLayout);
        PnlMenuCuerpoLayout.setHorizontalGroup(
            PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlMenuCuerpoLayout.setVerticalGroup(
            PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMenuCuerpoLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        getContentPane().add(PnlMenuCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, 640));

        PnlContenido.setLayout(new java.awt.CardLayout());

        PnlContenidoMostrar.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoMostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlContenidoMostrarTitulo.setBackground(new java.awt.Color(200, 200, 200));
        PnlContenidoMostrarTitulo.setPreferredSize(new java.awt.Dimension(100, 80));

        LblMostrarTitulo.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        LblMostrarTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LblMostrarTitulo.setText("Ver productos");

        javax.swing.GroupLayout PnlContenidoMostrarTituloLayout = new javax.swing.GroupLayout(PnlContenidoMostrarTitulo);
        PnlContenidoMostrarTitulo.setLayout(PnlContenidoMostrarTituloLayout);
        PnlContenidoMostrarTituloLayout.setHorizontalGroup(
            PnlContenidoMostrarTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoMostrarTituloLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(LblMostrarTitulo)
                .addContainerGap(997, Short.MAX_VALUE))
        );
        PnlContenidoMostrarTituloLayout.setVerticalGroup(
            PnlContenidoMostrarTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoMostrarTituloLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LblMostrarTitulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        PnlContenidoMostrar.add(PnlContenidoMostrarTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        Tabla.setSelectionBackground(new java.awt.Color(255, 204, 0));
        Tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
        });
        ScrollPnlTabla.setViewportView(Tabla);

        PnlContenidoMostrar.add(ScrollPnlTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1190, 430));

        LblBuscarPorCodigo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblBuscarPorCodigo.setForeground(new java.awt.Color(0, 0, 0));
        LblBuscarPorCodigo.setText("BUSCAR POR CÓDIGO");
        PnlContenidoMostrar.add(LblBuscarPorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        LblBuscarPorNombre.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblBuscarPorNombre.setForeground(new java.awt.Color(0, 0, 0));
        LblBuscarPorNombre.setText("BUSCAR POR NOMBRE");
        PnlContenidoMostrar.add(LblBuscarPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        LblBuscarPorCategoria.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblBuscarPorCategoria.setForeground(new java.awt.Color(0, 0, 0));
        LblBuscarPorCategoria.setText("BUSCAR POR CATEGORÍA");
        PnlContenidoMostrar.add(LblBuscarPorCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        CboxBuscarPorCategoria.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoMostrar.add(CboxBuscarPorCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 360, 50));

        BtnBuscar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        PnlContenidoMostrar.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 170, 50));

        TxtBuscarPorCodigo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoMostrar.add(TxtBuscarPorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 330, 50));

        TxtBuscarPorNombre.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoMostrar.add(TxtBuscarPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 330, 50));

        RbtnBuscarPorCodigo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtnBuscarPorCodigo);
        RbtnBuscarPorCodigo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        RbtnBuscarPorCodigo.setForeground(new java.awt.Color(0, 0, 0));
        RbtnBuscarPorCodigo.setText("BUSCAR POR CÓDIGO");
        RbtnBuscarPorCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RbtnBuscarPorCodigoMousePressed(evt);
            }
        });
        PnlContenidoMostrar.add(RbtnBuscarPorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        RbtnBuscarPorNombre.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtnBuscarPorNombre);
        RbtnBuscarPorNombre.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        RbtnBuscarPorNombre.setForeground(new java.awt.Color(0, 0, 0));
        RbtnBuscarPorNombre.setText("BUSCAR POR NOMBRE");
        RbtnBuscarPorNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RbtnBuscarPorNombreMousePressed(evt);
            }
        });
        PnlContenidoMostrar.add(RbtnBuscarPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        RbtnBuscarPorCategoria.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtnBuscarPorCategoria);
        RbtnBuscarPorCategoria.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        RbtnBuscarPorCategoria.setForeground(new java.awt.Color(0, 0, 0));
        RbtnBuscarPorCategoria.setText("BUSCAR POR CATEGORÍA");
        RbtnBuscarPorCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RbtnBuscarPorCategoriaMousePressed(evt);
            }
        });
        PnlContenidoMostrar.add(RbtnBuscarPorCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        LblMiMetodoDeBusqueda.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblMiMetodoDeBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        LblMiMetodoDeBusqueda.setText("MI MÉTODO DE BÚSQUEDA");
        PnlContenidoMostrar.add(LblMiMetodoDeBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        BtnVerTodo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnVerTodo.setForeground(new java.awt.Color(0, 0, 0));
        BtnVerTodo.setText("VER TODO");
        BtnVerTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerTodoActionPerformed(evt);
            }
        });
        PnlContenidoMostrar.add(BtnVerTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 170, 50));

        PnlContenido.add(PnlContenidoMostrar, "card2");

        PnlContenidoModificar.setBackground(new java.awt.Color(255, 255, 255));

        PnlContenidoMofiicarTitulo.setBackground(new java.awt.Color(200, 200, 200));
        PnlContenidoMofiicarTitulo.setPreferredSize(new java.awt.Dimension(1190, 80));

        LblModificarTitulo.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        LblModificarTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LblModificarTitulo.setText("Modificar producto");

        javax.swing.GroupLayout PnlContenidoMofiicarTituloLayout = new javax.swing.GroupLayout(PnlContenidoMofiicarTitulo);
        PnlContenidoMofiicarTitulo.setLayout(PnlContenidoMofiicarTituloLayout);
        PnlContenidoMofiicarTituloLayout.setHorizontalGroup(
            PnlContenidoMofiicarTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoMofiicarTituloLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LblModificarTitulo)
                .addContainerGap(926, Short.MAX_VALUE))
        );
        PnlContenidoMofiicarTituloLayout.setVerticalGroup(
            PnlContenidoMofiicarTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlContenidoMofiicarTituloLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(LblModificarTitulo)
                .addGap(22, 22, 22))
        );

        LblNomModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblNomModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblNomModificar.setText("NOMBRE");

        LblCategoriaModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblCategoriaModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblCategoriaModificar.setText("CATEGORIA");

        LblPrecioUnitModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblPrecioUnitModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblPrecioUnitModificar.setText("PRECIO UNITARIO");

        TxtNomModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        TxtPrecioUnitModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        CboxCategoriaModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        BtnAceptarModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnAceptarModificar.setForeground(new java.awt.Color(0, 0, 0));
        BtnAceptarModificar.setText("ACEPTAR");
        BtnAceptarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarModificarActionPerformed(evt);
            }
        });

        CheckModificarNombre.setBackground(new java.awt.Color(255, 255, 255));
        CheckModificarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckModificarNombreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckModificarNombreMousePressed(evt);
            }
        });
        CheckModificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckModificarNombreActionPerformed(evt);
            }
        });

        CheckModificarCategoria.setBackground(new java.awt.Color(255, 255, 255));
        CheckModificarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckModificarCategoriaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckModificarCategoriaMousePressed(evt);
            }
        });

        CheckModificarPrecioUnit.setBackground(new java.awt.Color(255, 255, 255));
        CheckModificarPrecioUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckModificarPrecioUnitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckModificarPrecioUnitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PnlContenidoModificarLayout = new javax.swing.GroupLayout(PnlContenidoModificar);
        PnlContenidoModificar.setLayout(PnlContenidoModificarLayout);
        PnlContenidoModificarLayout.setHorizontalGroup(
            PnlContenidoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoModificarLayout.createSequentialGroup()
                .addGroup(PnlContenidoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlContenidoMofiicarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlContenidoModificarLayout.createSequentialGroup()
                        .addGap(696, 696, 696)
                        .addComponent(BtnAceptarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlContenidoModificarLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(PnlContenidoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlContenidoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtPrecioUnitModificar)
                                .addComponent(CboxCategoriaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PnlContenidoModificarLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(CheckModificarCategoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(LblCategoriaModificar))
                                .addGroup(PnlContenidoModificarLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(CheckModificarPrecioUnit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(LblPrecioUnitModificar)))
                            .addComponent(TxtNomModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlContenidoModificarLayout.createSequentialGroup()
                                .addComponent(CheckModificarNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblNomModificar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlContenidoModificarLayout.setVerticalGroup(
            PnlContenidoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoModificarLayout.createSequentialGroup()
                .addComponent(PnlContenidoMofiicarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(PnlContenidoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CheckModificarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblNomModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNomModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(PnlContenidoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblCategoriaModificar)
                    .addComponent(CheckModificarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CboxCategoriaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(PnlContenidoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblPrecioUnitModificar)
                    .addComponent(CheckModificarPrecioUnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPrecioUnitModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(BtnAceptarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        PnlContenido.add(PnlContenidoModificar, "card3");

        PnlContenidoAgregar.setBackground(new java.awt.Color(255, 255, 255));

        PnlContenidoAgregarTitulo.setBackground(new java.awt.Color(200, 200, 200));
        PnlContenidoAgregarTitulo.setPreferredSize(new java.awt.Dimension(1190, 80));

        LblAgregarTitulo.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        LblAgregarTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LblAgregarTitulo.setText("Agregar producto");

        javax.swing.GroupLayout PnlContenidoAgregarTituloLayout = new javax.swing.GroupLayout(PnlContenidoAgregarTitulo);
        PnlContenidoAgregarTitulo.setLayout(PnlContenidoAgregarTituloLayout);
        PnlContenidoAgregarTituloLayout.setHorizontalGroup(
            PnlContenidoAgregarTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoAgregarTituloLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(LblAgregarTitulo)
                .addContainerGap(938, Short.MAX_VALUE))
        );
        PnlContenidoAgregarTituloLayout.setVerticalGroup(
            PnlContenidoAgregarTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlContenidoAgregarTituloLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(LblAgregarTitulo)
                .addGap(21, 21, 21))
        );

        TxtNomAgregar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        TxtPrecioUnitAgregar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtPrecioUnitAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioUnitAgregarActionPerformed(evt);
            }
        });

        CboxCategoriaAgregar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CboxCategoriaAgregar.setPreferredSize(new java.awt.Dimension(500, 400));
        CboxCategoriaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxCategoriaAgregarActionPerformed(evt);
            }
        });

        LblNomAgregar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblNomAgregar.setForeground(new java.awt.Color(0, 0, 0));
        LblNomAgregar.setText("NOMBRE");

        LblCategoriaAgregar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblCategoriaAgregar.setForeground(new java.awt.Color(0, 0, 0));
        LblCategoriaAgregar.setText("CATEGORÍA");

        LblPrecioUnitAgregar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblPrecioUnitAgregar.setForeground(new java.awt.Color(0, 0, 0));
        LblPrecioUnitAgregar.setText("PRECIO UNITARIO");

        BtnAceptarAgregar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnAceptarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        BtnAceptarAgregar.setText("ACEPTAR");
        BtnAceptarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlContenidoAgregarLayout = new javax.swing.GroupLayout(PnlContenidoAgregar);
        PnlContenidoAgregar.setLayout(PnlContenidoAgregarLayout);
        PnlContenidoAgregarLayout.setHorizontalGroup(
            PnlContenidoAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlContenidoAgregarTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PnlContenidoAgregarLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(LblNomAgregar))
            .addGroup(PnlContenidoAgregarLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(TxtNomAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PnlContenidoAgregarLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(LblCategoriaAgregar))
            .addGroup(PnlContenidoAgregarLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(CboxCategoriaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PnlContenidoAgregarLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(LblPrecioUnitAgregar))
            .addGroup(PnlContenidoAgregarLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(TxtPrecioUnitAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PnlContenidoAgregarLayout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(BtnAceptarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlContenidoAgregarLayout.setVerticalGroup(
            PnlContenidoAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoAgregarLayout.createSequentialGroup()
                .addComponent(PnlContenidoAgregarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(LblNomAgregar)
                .addGap(6, 6, 6)
                .addComponent(TxtNomAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblCategoriaAgregar)
                .addGap(1, 1, 1)
                .addComponent(CboxCategoriaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(LblPrecioUnitAgregar)
                .addGap(6, 6, 6)
                .addComponent(TxtPrecioUnitAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAceptarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PnlContenido.add(PnlContenidoAgregar, "card4");

        getContentPane().add(PnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 1190, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        Producto p = new Producto();
         try {
            int siNoCancelar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este producto?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (siNoCancelar == JOptionPane.YES_OPTION) {
                    p.eliminar(cod);
                }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error\n" + e);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
            this.PnlContenido.removeAll();
            this.PnlContenido.add(this.PnlContenidoAgregar);
            this.PnlContenido.repaint();
            this.PnlContenido.revalidate();
            
 
    }//GEN-LAST:event_BtnAgregarActionPerformed
    
    private void TxtPrecioUnitAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioUnitAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioUnitAgregarActionPerformed
    
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        this.PnlContenido.removeAll();
            this.PnlContenido.add(this.PnlContenidoModificar);
            this.PnlContenido.repaint();
            this.PnlContenido.revalidate();
            //TOMAR LOS VALORES DE LA SELECCIÓN DE LA TABLA A MODIFICAR
            this.TxtNomModificar.setText(nomViejo);
            this.TxtPrecioUnitModificar.setText(String.valueOf( precioUnitViejo) );
            this.CboxCategoriaModificar.setSelectedItem( categoriaVieja );
            
            this.TxtNomAgregar.setText(null);
            this.TxtPrecioUnitAgregar.setText(null);
            this.CboxCategoriaAgregar.setSelectedIndex(0);
       
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed
    
    private void CboxCategoriaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxCategoriaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxCategoriaAgregarActionPerformed
    
    private void BtnAceptarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarAgregarActionPerformed
        if (this.TxtNomAgregar.getText().isEmpty() || this.TxtPrecioUnitAgregar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error. No pueden haber campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            
            String nom = this.TxtNomAgregar.getText(); // !! ¿Cómo valido que no me ingrese números?
            String cat = String.valueOf(this.CboxCategoriaAgregar.getSelectedItem()); //CON EL GETSELECTEDITEM LE DIGO QUE ME OFREZCA EL ITEM ESPECIFICADO
            double precioUnit = Double.parseDouble( this.TxtPrecioUnitAgregar.getText() );
            //INSTANCIAMOS UN OBJETO DE LA CLASE PRODUCTO CON TODOS LOS PARÁMETROS, YA QUE TODOS LOS DATOS SON OBLIGATORIOS
            Producto p = new Producto(nom, cat, precioUnit);
            //EJECUTO EL MÉTODO QUE ASIGNE EL CÓDIGO DEL PRODUCTO
                
                
            
                                                
            p.agregarProd();
            
            this.TxtNomAgregar.setText(null);
            this.TxtPrecioUnitAgregar.setText(null);
            this.CboxCategoriaAgregar.setSelectedIndex(0);
    
        }
    }//GEN-LAST:event_BtnAceptarAgregarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        Producto p = new Producto();
        if (this.RbtnBuscarPorCodigo.isSelected()) {
            if (this.TxtBuscarPorCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puede quedar el campo \"búsqueda por código\" vacío", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                String cod = this.TxtBuscarPorCodigo.getText().toUpperCase();
                System.out.println(cod);
                if (p.buscarPorCodigo(cod, "config") == true) {
                    this.Tabla.setModel(p.agregarModeloTabla());
                }else{
                    JOptionPane.showMessageDialog(null, "Producto inexistente");
                    this.TxtBuscarPorCodigo.setText(null);
                }
            }
        }else{
            if (this.RbtnBuscarPorNombre.isSelected()) {
                if (this.TxtBuscarPorNombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No puede quedar el campo \"búsqueda por nombre\" vacío", "Error", JOptionPane.ERROR_MESSAGE);                    
                }else{
                    String nom = this.TxtBuscarPorNombre.getText();
                    System.out.println(nom);
                    if (p.buscarPorNombre(nom, "config") == true) {
                        this.Tabla.setModel(p.agregarModeloTabla());
                    }else{
                        JOptionPane.showMessageDialog(null, "Producto inexistente", "Error", JOptionPane.ERROR_MESSAGE);
                        this.TxtBuscarPorNombre.setText(null);
                    }
                }
            }else{
                if (this.CboxBuscarPorCategoria.getSelectedItem().equals("Seleccione una categoría")) {
                    JOptionPane.showMessageDialog(null, "Seleccione una categoría");
                }else{
                    String cat = String.valueOf( this.CboxBuscarPorCategoria.getSelectedItem() );
                    this.Tabla.setModel(p.buscarPorCategoria(cat));
                    this.CboxBuscarPorCategoria.setSelectedIndex(0);
                }
            }
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoMostrar);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        
        
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void RbtnBuscarPorCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnBuscarPorCodigoMousePressed
        this.TxtBuscarPorCodigo.setEnabled(true);
        this.TxtBuscarPorNombre.setEnabled(false);
        this.CboxBuscarPorCategoria.setEnabled(false);
        this.TxtBuscarPorNombre.setText(null);
        this.CboxBuscarPorCategoria.setSelectedIndex(0);
        this.BtnBuscar.setEnabled(true);
    }//GEN-LAST:event_RbtnBuscarPorCodigoMousePressed

    private void RbtnBuscarPorNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnBuscarPorNombreMousePressed
        this.TxtBuscarPorCodigo.setEnabled(false);
        this.TxtBuscarPorNombre.setEnabled(true);
        this.CboxBuscarPorCategoria.setEnabled(false);
        this.TxtBuscarPorCodigo.setText(null);
        this.CboxBuscarPorCategoria.setSelectedIndex(0);
        this.BtnBuscar.setEnabled(true);
    }//GEN-LAST:event_RbtnBuscarPorNombreMousePressed

    private void RbtnBuscarPorCategoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnBuscarPorCategoriaMousePressed
        this.TxtBuscarPorCodigo.setEnabled(false);
        this.TxtBuscarPorNombre.setEnabled(false);
        this.CboxBuscarPorCategoria.setEnabled(true);
        this.TxtBuscarPorNombre.setText(null);
        this.TxtBuscarPorCodigo.setText(null);
        this.BtnBuscar.setEnabled(true);
       
    }//GEN-LAST:event_RbtnBuscarPorCategoriaMousePressed

    private void BtnVerTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerTodoActionPerformed
        Producto p = new Producto();
        this.Tabla.setModel(p.mostrarProductos());
    }//GEN-LAST:event_BtnVerTodoActionPerformed

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        if (EmpleadoGenerica.getTipo() == 'S') {
            this.BtnEliminar.setEnabled(true);
            this.BtnModificar.setEnabled(true);
        }
        
        int fila = this.Tabla.rowAtPoint(evt.getPoint());
        
        cod = String.valueOf( this.Tabla.getValueAt(fila, 0) );
        nomViejo = String.valueOf(this.Tabla.getValueAt(fila, 1) );
        precioUnitViejo = Double.parseDouble(String.valueOf(this.Tabla.getValueAt(fila, 2)));
        categoriaVieja = String.valueOf(this.Tabla.getValueAt(fila, 3));
        
    }//GEN-LAST:event_TablaMousePressed

    private void CheckModificarNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckModificarNombreMousePressed
    
    }//GEN-LAST:event_CheckModificarNombreMousePressed

    private void CheckModificarCategoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckModificarCategoriaMousePressed

    }//GEN-LAST:event_CheckModificarCategoriaMousePressed

    private void CheckModificarPrecioUnitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckModificarPrecioUnitMousePressed

    }//GEN-LAST:event_CheckModificarPrecioUnitMousePressed

    
    private void CheckModificarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckModificarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckModificarNombreActionPerformed

    private void CheckModificarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckModificarNombreMouseClicked
        if (this.CheckModificarNombre.isSelected()) {
           this.TxtNomModificar.setEnabled(true); 
        }else{
            this.TxtNomModificar.setEnabled(false);
            this.TxtNomModificar.setText(nomViejo);
        }
    }//GEN-LAST:event_CheckModificarNombreMouseClicked

    private void CheckModificarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckModificarCategoriaMouseClicked
        if (this.CheckModificarCategoria.isSelected()) {
            this.CboxCategoriaModificar.setEnabled(true);  
        }else{
             this.CboxCategoriaModificar.setEnabled(false);
             this.CboxCategoriaModificar.setSelectedItem(categoriaVieja);
        }
    }//GEN-LAST:event_CheckModificarCategoriaMouseClicked

    private void CheckModificarPrecioUnitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckModificarPrecioUnitMouseClicked
        if (this.CheckModificarPrecioUnit.isSelected()) {
            this.TxtPrecioUnitModificar.setEnabled(true); 
        }else{
            this.TxtPrecioUnitModificar.setEnabled(false);  
            this.TxtPrecioUnitModificar.setText(String.valueOf(precioUnitViejo));
        }        
    }//GEN-LAST:event_CheckModificarPrecioUnitMouseClicked

    private void BtnAceptarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarModificarActionPerformed
        Producto p = new Producto();
        
        if (!this.TxtNomModificar.isEnabled() && !this.CboxCategoriaModificar.isEnabled() && !this.TxtPrecioUnitModificar.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una opción.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if ((this.TxtNomModificar.getText().isEmpty()) || this.TxtPrecioUnitModificar.getText().isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "No pueden quedar campos vacíos");
            }
            else
            {
                if (this.TxtNomModificar.isEnabled()) {
                   String nomNuevo = this.TxtNomModificar.getText();
                   p.modificarPorNombre(nomViejo, nomNuevo);   
                   this.Tabla.setModel(p.mostrarProductos());
               }

               if (this.CboxCategoriaModificar.isEnabled()) {
                   if (this.CboxCategoriaModificar.getSelectedItem().equals("Seleccione una categoría")) {
                       JOptionPane.showMessageDialog(null, "Seleccione una categoría");
                   }else{
                       String categoriaNueva = String.valueOf( this.CboxCategoriaModificar.getSelectedItem() );
                       p.modificarPorCategoria(cod, categoriaNueva);  
                       this.Tabla.setModel(p.mostrarProductos());
                   } 
               }

               if (this.TxtPrecioUnitModificar.isEnabled()) {
                   double precioUnitNuevo = Double.parseDouble( this.TxtPrecioUnitModificar.getText() );
                   p.modificarPorPrecioUnit(cod, precioUnitNuevo);
                   this.Tabla.setModel(p.mostrarProductos());
               }

               this.TxtNomModificar.setText(null);
               this.TxtPrecioUnitModificar.setText(null);
               this.CboxCategoriaModificar.setSelectedIndex(0);   
            }
        }  
    }//GEN-LAST:event_BtnAceptarModificarActionPerformed
    
    public void accedioSupervisor(boolean siNo){
        accedioSupervisor = siNo;
    }
    
    public JPanel getPanelContenido(){
        return this.PnlContenido;
    }
    
    public JPanel getPanelContenidoAgregar(){
        return this.PnlContenidoAgregar;
    }
    
    public JPanel getPanelContenidoModificar(){
        return this.PnlContenidoModificar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptarAgregar;
    private javax.swing.JButton BtnAceptarModificar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnVerTodo;
    private javax.swing.JComboBox<String> CboxBuscarPorCategoria;
    private javax.swing.JComboBox<String> CboxCategoriaAgregar;
    private javax.swing.JComboBox<String> CboxCategoriaModificar;
    private javax.swing.JCheckBox CheckModificarCategoria;
    private javax.swing.JCheckBox CheckModificarNombre;
    private javax.swing.JCheckBox CheckModificarPrecioUnit;
    private javax.swing.JLabel LblAgregarTitulo;
    private javax.swing.JLabel LblBuscarPorCategoria;
    private javax.swing.JLabel LblBuscarPorCodigo;
    private javax.swing.JLabel LblBuscarPorNombre;
    private javax.swing.JLabel LblCategoriaAgregar;
    private javax.swing.JLabel LblCategoriaModificar;
    private javax.swing.JLabel LblMiMetodoDeBusqueda;
    private javax.swing.JLabel LblModificarTitulo;
    private javax.swing.JLabel LblMostrarTitulo;
    private javax.swing.JLabel LblNomAgregar;
    private javax.swing.JLabel LblNomModificar;
    private javax.swing.JLabel LblPrecioUnitAgregar;
    private javax.swing.JLabel LblPrecioUnitModificar;
    private javax.swing.JLabel LblTituloMenuCabecera;
    private javax.swing.JPanel PnlCabecera;
    private javax.swing.JPanel PnlContenido;
    private javax.swing.JPanel PnlContenidoAgregar;
    private javax.swing.JPanel PnlContenidoAgregarTitulo;
    private javax.swing.JPanel PnlContenidoModificar;
    private javax.swing.JPanel PnlContenidoMofiicarTitulo;
    private javax.swing.JPanel PnlContenidoMostrar;
    private javax.swing.JPanel PnlContenidoMostrarTitulo;
    private javax.swing.JPanel PnlMenuCabecera;
    private javax.swing.JPanel PnlMenuCuerpo;
    private javax.swing.JRadioButton RbtnBuscarPorCategoria;
    private javax.swing.JRadioButton RbtnBuscarPorCodigo;
    private javax.swing.JRadioButton RbtnBuscarPorNombre;
    private javax.swing.JScrollPane ScrollPnlTabla;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtBuscarPorCodigo;
    private javax.swing.JTextField TxtBuscarPorNombre;
    private javax.swing.JTextField TxtNomAgregar;
    private javax.swing.JTextField TxtNomModificar;
    private javax.swing.JTextField TxtPrecioUnitAgregar;
    private javax.swing.JTextField TxtPrecioUnitModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
