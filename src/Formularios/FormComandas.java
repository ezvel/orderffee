package Formularios;

import Desarrollo.Comanda;
import Desarrollo.DetalleComanda;
import Desarrollo.EmpleadoGenerica;
import Desarrollo.Mesa;
import Desarrollo.Operador;
import java.awt.Color;
import Desarrollo.Producto;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Desarrollo.EmpleadoGenerica;

public class FormComandas extends javax.swing.JInternalFrame {

    private int nroMesa;
    private int nroMesaEscogido = 0;
    private Mesa m = new Mesa();
    private DetalleComanda dc = new DetalleComanda();
    private int nroComandaDesdeTablaPendientes;
    private int nroComandaDesdeTablaFinalizadas;
    private int nroMesaDesdeTablaPendientes;
    
    public FormComandas() {
        initComponents();
        this.LblTitulo.setText("Seleccione la mesa");
        
        this.calcularEstadoMesa1();
        this.calcularEstadoMesa2();
        this.calcularEstadoMesa3();
        this.calcularEstadoMesa4();
        this.calcularEstadoMesa5();
        this.calcularEstadoMesa6();
        this.calcularEstadoMesa7();
        this.calcularEstadoMesa8();
        this.calcularEstadoMesa9();
        
        this.BtnSeleccionarProdCancelar.setEnabled(false);
        this.BtnSeleccionarProdConfirmar.setEnabled(false);
        
        this.TxtBuscarProdPorNombre.setEnabled(false);
        this.TxtBuscarProdPorCodigo.setEnabled(false);
        this.TxtBuscarProdPorCategoria.setEnabled(false);
        this.LblNroComanda.setText(String.valueOf( dc.getNroComanda() ));
        this.LblNroMesa.setText(String.valueOf(nroMesaEscogido));

        this.BtnSeleccionarProducto.setEnabled(false);
        this.BtnReiniciar.setEnabled(false);
        this.BtnAceptarMesa.setEnabled(false);
        
        this.BtnComandaEntregada.setEnabled(false);
        this.BtnComandaFinalizada.setEnabled(false);
        
        int nroCom = dc.getNroComanda();
        
        
        this.BtnGenerarComanda.setEnabled(false);
        
        Comanda co = new Comanda();
        this.TablaComandasPendientes.setModel( co.mostrarComandasPendientes() );
        
        EmpleadoGenerica.buscarPorEstado();
        
        if (EmpleadoGenerica.getTipo() == 'S') {
            this.BtnSeleccionarMesa.setEnabled(false);
            this.BtnSeleccionarProducto.setEnabled(false);
            this.BtnGenerarComanda.setEnabled(false);
            this.BtnMisComandas.setEnabled(false);
            this.BtnMesa1.setEnabled(false);
            this.BtnMesa2.setEnabled(false);
            this.BtnMesa3.setEnabled(false);
            this.BtnMesa4.setEnabled(false);
            this.BtnMesa5.setEnabled(false);
            this.BtnMesa6.setEnabled(false);
            this.BtnMesa7.setEnabled(false);
            this.BtnMesa8.setEnabled(false);
            this.BtnMesa9.setEnabled(false);
        }
        
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PnlCabecera = new javax.swing.JPanel();
        PnlMenuCabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PnlMenuCuerpo = new javax.swing.JPanel();
        BtnGenerarComanda = new javax.swing.JButton();
        BtnMisComandas = new javax.swing.JButton();
        BtnMisComandasFinalizadas = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnSeleccionarMesa = new javax.swing.JButton();
        BtnSeleccionarProducto = new javax.swing.JButton();
        PnlContenido = new javax.swing.JPanel();
        PnlContenidoSeleccionarMesa = new javax.swing.JPanel();
        BtnMesa1 = new javax.swing.JButton();
        BtnMesa2 = new javax.swing.JButton();
        BtnMesa3 = new javax.swing.JButton();
        BtnMesa4 = new javax.swing.JButton();
        BtnMesa5 = new javax.swing.JButton();
        BtnMesa6 = new javax.swing.JButton();
        BtnMesa7 = new javax.swing.JButton();
        BtnMesa8 = new javax.swing.JButton();
        BtnMesa9 = new javax.swing.JButton();
        BtnAceptarMesa = new javax.swing.JButton();
        BtnReiniciar = new javax.swing.JButton();
        PnlContenidoMisComandas = new javax.swing.JPanel();
        PnlContenidoSeleccionarProducto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaProductos = new javax.swing.JList<>();
        SpnCantidadProductos = new javax.swing.JSpinner();
        BtnSeleccionarProdAceptar = new javax.swing.JButton();
        TxtBuscarProdPorNombre = new javax.swing.JTextField();
        TxtBuscarProdPorCodigo = new javax.swing.JTextField();
        TxtBuscarProdPorCategoria = new javax.swing.JTextField();
        LblBuscarProdPorNombre = new javax.swing.JLabel();
        LblBuscarProdPorCodigo = new javax.swing.JLabel();
        LblBuscarProdPorCategoria = new javax.swing.JLabel();
        LblCantidadProductos = new javax.swing.JLabel();
        PnlSubtotal = new javax.swing.JPanel();
        LblSubtotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnSeleccionarProdConfirmar = new javax.swing.JButton();
        BtnSeleccionarProdCancelar = new javax.swing.JButton();
        RbtnBuscarProdPorNombre = new javax.swing.JRadioButton();
        RbtnBuscarPorPorCodigo = new javax.swing.JRadioButton();
        RbtnBuscarProdPorCategoria = new javax.swing.JRadioButton();
        BtnCancelarProducto = new javax.swing.JButton();
        PnlContenidoGenerarComanda = new javax.swing.JPanel();
        BtnGenerarComand = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LblTotalComanda = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnAgregarProd = new javax.swing.JButton();
        PnlContenidoComandasPendientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaComandasPendientes = new javax.swing.JTable();
        PnlDetalleComandasPendiente = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaDetalleComandasPendientes = new javax.swing.JTable();
        BtnComandaEntregada = new javax.swing.JButton();
        BtnComandaFinalizada = new javax.swing.JButton();
        PnlContenidoComandasFinalizadas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaComandasFinalizadas = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaDetalleComandasFinalizadas = new javax.swing.JTable();
        PnlContenidoMostrarTitulo = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        PnlNroComanda = new javax.swing.JPanel();
        LblNroMesa = new javax.swing.JLabel();
        PnlNroMesa = new javax.swing.JPanel();
        LblNroComanda = new javax.swing.JLabel();
        LblNroMesaTit = new javax.swing.JLabel();
        LblNroComandaTit = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlCabecera.setBackground(new java.awt.Color(30, 30, 30));
        PnlCabecera.setPreferredSize(new java.awt.Dimension(1490, 50));

        javax.swing.GroupLayout PnlCabeceraLayout = new javax.swing.GroupLayout(PnlCabecera);
        PnlCabecera.setLayout(PnlCabeceraLayout);
        PnlCabeceraLayout.setHorizontalGroup(
            PnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1510, Short.MAX_VALUE)
        );
        PnlCabeceraLayout.setVerticalGroup(
            PnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PnlCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, -1));

        PnlMenuCabecera.setBackground(new java.awt.Color(255, 204, 0));
        PnlMenuCabecera.setForeground(new java.awt.Color(240, 240, 240));
        PnlMenuCabecera.setPreferredSize(new java.awt.Dimension(300, 80));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mis comandas");

        javax.swing.GroupLayout PnlMenuCabeceraLayout = new javax.swing.GroupLayout(PnlMenuCabecera);
        PnlMenuCabecera.setLayout(PnlMenuCabeceraLayout);
        PnlMenuCabeceraLayout.setHorizontalGroup(
            PnlMenuCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuCabeceraLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PnlMenuCabeceraLayout.setVerticalGroup(
            PnlMenuCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMenuCabeceraLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        getContentPane().add(PnlMenuCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 310, -1));

        PnlMenuCuerpo.setBackground(new java.awt.Color(0, 50, 50));

        BtnGenerarComanda.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnGenerarComanda.setText("GENERAR COMANDA");
        BtnGenerarComanda.setPreferredSize(new java.awt.Dimension(101, 28));
        BtnGenerarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarComandaActionPerformed(evt);
            }
        });

        BtnMisComandas.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnMisComandas.setText("MIS COMANDAS");
        BtnMisComandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMisComandasActionPerformed(evt);
            }
        });

        BtnMisComandasFinalizadas.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnMisComandasFinalizadas.setText("FINALIZADOS");
        BtnMisComandasFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMisComandasFinalizadasActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnSeleccionarMesa.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnSeleccionarMesa.setText("SELECCIONAR MESA");
        BtnSeleccionarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarMesaActionPerformed(evt);
            }
        });

        BtnSeleccionarProducto.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnSeleccionarProducto.setText("SELECCIONAR PRODUCTO");
        BtnSeleccionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlMenuCuerpoLayout = new javax.swing.GroupLayout(PnlMenuCuerpo);
        PnlMenuCuerpo.setLayout(PnlMenuCuerpoLayout);
        PnlMenuCuerpoLayout.setHorizontalGroup(
            PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGenerarComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMisComandas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMisComandasFinalizadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSeleccionarMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(BtnSeleccionarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlMenuCuerpoLayout.setVerticalGroup(
            PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuCuerpoLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(BtnSeleccionarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSeleccionarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnGenerarComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMisComandas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMisComandasFinalizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(PnlMenuCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 300, 630));

        PnlContenido.setBackground(new java.awt.Color(240, 240, 240));
        PnlContenido.setLayout(new java.awt.CardLayout());

        PnlContenidoSeleccionarMesa.setBackground(new java.awt.Color(240, 240, 240));
        PnlContenidoSeleccionarMesa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnMesa1.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa1.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa1.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa1.setText("1");
        BtnMesa1.setMaximumSize(new java.awt.Dimension(150, 150));
        BtnMesa1.setMinimumSize(new java.awt.Dimension(150, 150));
        BtnMesa1.setPreferredSize(new java.awt.Dimension(150, 150));
        BtnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa1ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 120, 120));

        BtnMesa2.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa2.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa2.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa2.setText("2");
        BtnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa2ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 120, 120));

        BtnMesa3.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa3.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa3.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa3.setText("3");
        BtnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa3ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 120, 120));

        BtnMesa4.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa4.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa4.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa4.setText("4");
        BtnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa4ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 120, 120));

        BtnMesa5.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa5.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa5.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa5.setText("5");
        BtnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa5ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 120, 120));

        BtnMesa6.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa6.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa6.setText("6");
        BtnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa6ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 120, 120));

        BtnMesa7.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa7.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa7.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa7.setText("7");
        BtnMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa7ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 120, 120));

        BtnMesa8.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa8.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa8.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa8.setText("8");
        BtnMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa8ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 120, 120));

        BtnMesa9.setBackground(new java.awt.Color(200, 200, 200));
        BtnMesa9.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnMesa9.setForeground(new java.awt.Color(0, 0, 0));
        BtnMesa9.setText("9");
        BtnMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa9ActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 120, 120));

        BtnAceptarMesa.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        BtnAceptarMesa.setForeground(new java.awt.Color(0, 0, 0));
        BtnAceptarMesa.setText("ACEPTAR");
        BtnAceptarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarMesaActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnAceptarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 180, 60));

        BtnReiniciar.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        BtnReiniciar.setForeground(new java.awt.Color(0, 0, 0));
        BtnReiniciar.setText("REINICIAR");
        BtnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReiniciarActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarMesa.add(BtnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 180, 60));

        PnlContenidoMisComandas.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoMisComandas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PnlContenidoSeleccionarMesa.add(PnlContenidoMisComandas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 630));

        PnlContenido.add(PnlContenidoSeleccionarMesa, "card2");

        PnlContenidoSeleccionarProducto.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoSeleccionarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaProductos.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ListaProductos.setSelectionBackground(new java.awt.Color(255, 204, 0));
        ListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaProductos);

        PnlContenidoSeleccionarProducto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 720, 220));

        SpnCantidadProductos.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        SpnCantidadProductos.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        SpnCantidadProductos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpnCantidadProductosStateChanged(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(SpnCantidadProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 380, 60));

        BtnSeleccionarProdAceptar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnSeleccionarProdAceptar.setForeground(new java.awt.Color(0, 0, 0));
        BtnSeleccionarProdAceptar.setText("ACEPTAR");
        BtnSeleccionarProdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarProdAceptarActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(BtnSeleccionarProdAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 560, 60));

        TxtBuscarProdPorNombre.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtBuscarProdPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarProdPorNombreActionPerformed(evt);
            }
        });
        TxtBuscarProdPorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarProdPorNombreKeyTyped(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(TxtBuscarProdPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 380, 60));

        TxtBuscarProdPorCodigo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtBuscarProdPorCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarProdPorCodigoKeyTyped(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(TxtBuscarProdPorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 380, 60));

        TxtBuscarProdPorCategoria.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtBuscarProdPorCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarProdPorCategoriaKeyTyped(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(TxtBuscarProdPorCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 380, 60));

        LblBuscarProdPorNombre.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblBuscarProdPorNombre.setForeground(new java.awt.Color(0, 0, 0));
        LblBuscarProdPorNombre.setText("Buscar por nombre");
        PnlContenidoSeleccionarProducto.add(LblBuscarProdPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 68, -1, 20));

        LblBuscarProdPorCodigo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblBuscarProdPorCodigo.setForeground(new java.awt.Color(0, 0, 0));
        LblBuscarProdPorCodigo.setText("Buscar por código");
        PnlContenidoSeleccionarProducto.add(LblBuscarProdPorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 30));

        LblBuscarProdPorCategoria.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblBuscarProdPorCategoria.setForeground(new java.awt.Color(0, 0, 0));
        LblBuscarProdPorCategoria.setText("Buscar por categoría");
        PnlContenidoSeleccionarProducto.add(LblBuscarProdPorCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 30));

        LblCantidadProductos.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblCantidadProductos.setForeground(new java.awt.Color(0, 0, 0));
        LblCantidadProductos.setText("Cantidad");
        PnlContenidoSeleccionarProducto.add(LblCantidadProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 30));

        PnlSubtotal.setBackground(new java.awt.Color(60, 60, 60));

        LblSubtotal.setBackground(new java.awt.Color(60, 60, 60));
        LblSubtotal.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        LblSubtotal.setForeground(new java.awt.Color(240, 240, 240));
        LblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("$");

        javax.swing.GroupLayout PnlSubtotalLayout = new javax.swing.GroupLayout(PnlSubtotal);
        PnlSubtotal.setLayout(PnlSubtotalLayout);
        PnlSubtotalLayout.setHorizontalGroup(
            PnlSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSubtotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, Short.MAX_VALUE)
                .addComponent(LblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlSubtotalLayout.setVerticalGroup(
            PnlSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSubtotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PnlContenidoSeleccionarProducto.add(PnlSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 720, 60));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mis productos");
        PnlContenidoSeleccionarProducto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Subtotal");
        PnlContenidoSeleccionarProducto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        BtnSeleccionarProdConfirmar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnSeleccionarProdConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        BtnSeleccionarProdConfirmar.setText("CONFIRMAR");
        BtnSeleccionarProdConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarProdConfirmarActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(BtnSeleccionarProdConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 339, 360, 40));

        BtnSeleccionarProdCancelar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnSeleccionarProdCancelar.setForeground(new java.awt.Color(0, 0, 0));
        BtnSeleccionarProdCancelar.setText("CANCELAR");
        BtnSeleccionarProdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarProdCancelarActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(BtnSeleccionarProdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 339, 350, 40));

        RbtnBuscarProdPorNombre.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtnBuscarProdPorNombre);
        RbtnBuscarProdPorNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbtnBuscarProdPorNombreMouseClicked(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(RbtnBuscarProdPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        RbtnBuscarPorPorCodigo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtnBuscarPorPorCodigo);
        RbtnBuscarPorPorCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbtnBuscarPorPorCodigoMouseClicked(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(RbtnBuscarPorPorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        RbtnBuscarProdPorCategoria.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtnBuscarProdPorCategoria);
        RbtnBuscarProdPorCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbtnBuscarProdPorCategoriaMouseClicked(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(RbtnBuscarProdPorCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        BtnCancelarProducto.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnCancelarProducto.setForeground(new java.awt.Color(0, 0, 0));
        BtnCancelarProducto.setText("CANCELAR");
        BtnCancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarProductoActionPerformed(evt);
            }
        });
        PnlContenidoSeleccionarProducto.add(BtnCancelarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 560, 60));

        PnlContenido.add(PnlContenidoSeleccionarProducto, "card3");

        PnlContenidoGenerarComanda.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoGenerarComanda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnGenerarComand.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnGenerarComand.setForeground(new java.awt.Color(0, 0, 0));
        BtnGenerarComand.setText("GENERAR COMANDA");
        BtnGenerarComand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarComandActionPerformed(evt);
            }
        });
        PnlContenidoGenerarComanda.add(BtnGenerarComand, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 670, 60));

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        TablaDetalle.setSelectionBackground(new java.awt.Color(255, 204, 0));
        TablaDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(TablaDetalle);

        PnlContenidoGenerarComanda.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 330));

        jPanel2.setBackground(new java.awt.Color(60, 60, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("$");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        LblTotalComanda.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        LblTotalComanda.setForeground(new java.awt.Color(240, 240, 240));
        LblTotalComanda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(LblTotalComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, 80));

        PnlContenidoGenerarComanda.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 460, 100));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TOTAL A ABONAR");
        PnlContenidoGenerarComanda.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 390, 280, -1));

        BtnAgregarProd.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnAgregarProd.setForeground(new java.awt.Color(0, 0, 0));
        BtnAgregarProd.setText("+");
        BtnAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarProdActionPerformed(evt);
            }
        });
        PnlContenidoGenerarComanda.add(BtnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 670, 60));

        PnlContenido.add(PnlContenidoGenerarComanda, "card4");

        PnlContenidoComandasPendientes.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoComandasPendientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaComandasPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        TablaComandasPendientes.setSelectionBackground(new java.awt.Color(255, 204, 0));
        TablaComandasPendientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaComandasPendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaComandasPendientesMousePressed(evt);
            }
        });
        TablaComandasPendientes.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                TablaComandasPendientesVetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(TablaComandasPendientes);

        PnlContenidoComandasPendientes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 270));

        PnlDetalleComandasPendiente.setBackground(new java.awt.Color(200, 200, 200));
        PnlDetalleComandasPendiente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaDetalleComandasPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        TablaDetalleComandasPendientes.setSelectionBackground(new java.awt.Color(255, 204, 0));
        TablaDetalleComandasPendientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(TablaDetalleComandasPendientes);

        PnlDetalleComandasPendiente.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 250));

        PnlContenidoComandasPendientes.add(PnlDetalleComandasPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 760, 250));

        BtnComandaEntregada.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnComandaEntregada.setForeground(new java.awt.Color(0, 0, 0));
        BtnComandaEntregada.setText("ENTREGADO");
        BtnComandaEntregada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComandaEntregadaActionPerformed(evt);
            }
        });
        PnlContenidoComandasPendientes.add(BtnComandaEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 390, 60));

        BtnComandaFinalizada.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnComandaFinalizada.setForeground(new java.awt.Color(0, 0, 0));
        BtnComandaFinalizada.setText("FINALIZADO");
        BtnComandaFinalizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComandaFinalizadaActionPerformed(evt);
            }
        });
        PnlContenidoComandasPendientes.add(BtnComandaFinalizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 390, 60));

        PnlContenido.add(PnlContenidoComandasPendientes, "card6");

        PnlContenidoComandasFinalizadas.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoComandasFinalizadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaComandasFinalizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        TablaComandasFinalizadas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaComandasFinalizadas.setSelectionBackground(new java.awt.Color(255, 204, 0));
        TablaComandasFinalizadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaComandasFinalizadas.setShowHorizontalLines(true);
        TablaComandasFinalizadas.getTableHeader().setReorderingAllowed(false);
        TablaComandasFinalizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaComandasFinalizadasMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(TablaComandasFinalizadas);
        if (TablaComandasFinalizadas.getColumnModel().getColumnCount() > 0) {
            TablaComandasFinalizadas.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaComandasFinalizadas.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        PnlContenidoComandasFinalizadas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 320));

        TablaDetalleComandasFinalizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        TablaDetalleComandasFinalizadas.setSelectionBackground(new java.awt.Color(255, 204, 0));
        TablaDetalleComandasFinalizadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(TablaDetalleComandasFinalizadas);

        PnlContenidoComandasFinalizadas.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 1060, 250));

        PnlContenido.add(PnlContenidoComandasFinalizadas, "card7");

        getContentPane().add(PnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 1200, 630));

        PnlContenidoMostrarTitulo.setBackground(new java.awt.Color(200, 200, 200));
        PnlContenidoMostrarTitulo.setPreferredSize(new java.awt.Dimension(1197, 80));
        PnlContenidoMostrarTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTitulo.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        PnlContenidoMostrarTitulo.add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        PnlNroComanda.setBackground(new java.awt.Color(60, 60, 60));
        PnlNroComanda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNroMesa.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        LblNroMesa.setForeground(new java.awt.Color(255, 255, 255));
        LblNroMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PnlNroComanda.add(LblNroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        PnlContenidoMostrarTitulo.add(PnlNroComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 60, 60));

        PnlNroMesa.setBackground(new java.awt.Color(60, 60, 60));
        PnlNroMesa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNroComanda.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        LblNroComanda.setForeground(new java.awt.Color(255, 255, 255));
        LblNroComanda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PnlNroMesa.add(LblNroComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 60));

        PnlContenidoMostrarTitulo.add(PnlNroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 120, 60));

        LblNroMesaTit.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        LblNroMesaTit.setForeground(new java.awt.Color(0, 0, 0));
        LblNroMesaTit.setText("N° Mesa");
        PnlContenidoMostrarTitulo.add(LblNroMesaTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        LblNroComandaTit.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        LblNroComandaTit.setForeground(new java.awt.Color(0, 0, 0));
        LblNroComandaTit.setText("N° Comanda");
        PnlContenidoMostrarTitulo.add(LblNroComandaTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        getContentPane().add(PnlContenidoMostrarTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        EmpleadoGenerica.modificarEstadoInactivo();
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnSeleccionarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarMesaActionPerformed
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoSeleccionarMesa);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        this.LblTitulo.setText(null);
        this.LblTitulo.setText("Seleccione la mesa");
    }//GEN-LAST:event_BtnSeleccionarMesaActionPerformed

    private void BtnSeleccionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarProductoActionPerformed
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoSeleccionarProducto);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        this.LblTitulo.setText(null);
        this.LblTitulo.setText("Seleccione los productos y escoga la cantidad");
        
    }//GEN-LAST:event_BtnSeleccionarProductoActionPerformed

    private void BtnGenerarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarComandaActionPerformed
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoGenerarComanda);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        this.LblTitulo.setText(null);
        this.LblTitulo.setText("Confirme la comanda");
        
        int nroComanda = dc.getNroComanda();
        this.TablaDetalle.setModel(dc.mostrarDetalleComanda(nroComanda));
        
        int nroCom = dc.getNroComanda();
        int totalCom = dc.totalComanda(nroCom);
        this.LblTotalComanda.setText(String.valueOf(totalCom));
        
                
        int cantProdEnDetalle = dc.getCantidadProductosEnDetalle(nroComanda);
        
        if (cantProdEnDetalle == 0) {
            this.BtnGenerarComand.setEnabled(false);
        }else{
            this.BtnGenerarComand.setEnabled(true);
        }
    }//GEN-LAST:event_BtnGenerarComandaActionPerformed

    private void BtnMisComandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMisComandasActionPerformed
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoComandasPendientes);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        this.LblTitulo.setText(null);
        this.LblTitulo.setText("Mis comandas pendientes");
        
        Comanda co = new Comanda();
        this.TablaComandasPendientes.setModel( co.mostrarComandasPendientes() );
    }//GEN-LAST:event_BtnMisComandasActionPerformed

    private void BtnMisComandasFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMisComandasFinalizadasActionPerformed
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoComandasFinalizadas);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        this.LblTitulo.setText(null);
        this.LblTitulo.setText("Mis comandas finalizadas");
        Comanda c = new Comanda();
        this.TablaComandasFinalizadas.setModel(c.mostrarComandasFinalizadas());
    }//GEN-LAST:event_BtnMisComandasFinalizadasActionPerformed

    private void TxtBuscarProdPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarProdPorNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarProdPorNombreActionPerformed

    private void BtnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa1ActionPerformed
        this.BtnMesa1.setForeground(Color.WHITE);
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        nroMesa = 1;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa1ActionPerformed

    private void BtnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa2ActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(Color.WHITE);
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        nroMesa = 2;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa2ActionPerformed

    private void BtnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa3ActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(Color.WHITE);
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        nroMesa = 3;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa3ActionPerformed

    private void BtnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa4ActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(Color.WHITE);
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        nroMesa = 4;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa4ActionPerformed

    private void BtnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa5ActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(Color.WHITE);
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        nroMesa = 5;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa5ActionPerformed

    private void BtnMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa7ActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(Color.WHITE);
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        nroMesa = 7;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa7ActionPerformed

    private void BtnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa6ActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(Color.WHITE);
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        nroMesa = 6;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa6ActionPerformed

    private void BtnMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa8ActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(Color.WHITE);
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        nroMesa = 8;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa8ActionPerformed

    private void BtnMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa9ActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(Color.WHITE);
        nroMesa = 9;
        this.BtnAceptarMesa.setEnabled(true);
    }//GEN-LAST:event_BtnMesa9ActionPerformed

    private void BtnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReiniciarActionPerformed
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        m.setEstadoMesa(nroMesaEscogido, "Desocupada");
        
        switch (nroMesaEscogido) {
            case 1: this.calcularEstadoMesa1(); break;
            case 2: this.calcularEstadoMesa2(); break;
            case 3: this.calcularEstadoMesa3(); break;
            case 4: this.calcularEstadoMesa4(); break;
            case 5: this.calcularEstadoMesa5(); break;
            case 6: this.calcularEstadoMesa6(); break;
            case 7: this.calcularEstadoMesa7(); break;
            case 8: this.calcularEstadoMesa8(); break;
            case 9: this.calcularEstadoMesa9(); break;
        }    
        
        nroMesaEscogido = 0;
        this.LblNroMesa.setText(String.valueOf( nroMesaEscogido) );
        this.BtnAceptarMesa.setEnabled(false);
        this.BtnReiniciar.setEnabled(false);
        
        this.BtnSeleccionarProducto.setEnabled(false);
        
        this.BtnGenerarComanda.setEnabled(false);
        
    }//GEN-LAST:event_BtnReiniciarActionPerformed

    private void BtnAceptarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarMesaActionPerformed
        this.BtnSeleccionarProducto.setEnabled(true);
        
        String estadoMesa;
        
        switch (nroMesa) {
            case 1: estadoMesa = this.calcularEstadoMesa1(); break;
            case 2: estadoMesa = this.calcularEstadoMesa2(); break;
            case 3: estadoMesa = this.calcularEstadoMesa3(); break;
            case 4: estadoMesa = this.calcularEstadoMesa4(); break;
            case 5: estadoMesa = this.calcularEstadoMesa5(); break;
            case 6: estadoMesa = this.calcularEstadoMesa6(); break;
            case 7: estadoMesa = this.calcularEstadoMesa7(); break;
            case 8: estadoMesa = this.calcularEstadoMesa8(); break;
            case 9: estadoMesa = this.calcularEstadoMesa9(); break;
            default: estadoMesa = "";
        }
        
                
        if (estadoMesa.equals("Ocupada")) {
            JOptionPane.showMessageDialog(null,"No puede seleccionar una mesa que está ocupada.");
        }else{
            nroMesaEscogido = nroMesa;
            this.LblNroMesa.setText(String.valueOf(nroMesaEscogido));
            m.setEstadoMesa(nroMesaEscogido, "Ocupada");
            
            switch (nroMesaEscogido) {
                case 1: this.calcularEstadoMesa1(); break;
                case 2: this.calcularEstadoMesa2(); break;
                case 3: this.calcularEstadoMesa3(); break;
                case 4: this.calcularEstadoMesa4(); break;
                case 5: this.calcularEstadoMesa5(); break;
                case 6: this.calcularEstadoMesa6(); break;
                case 7: this.calcularEstadoMesa7(); break;
                case 8: this.calcularEstadoMesa8(); break;
                case 9: this.calcularEstadoMesa9(); break;
            }
            
            this.BtnAceptarMesa.setEnabled(false);
            this.BtnReiniciar.setEnabled(true);
            
            this.BtnMesa1.setForeground(new Color(0, 0, 0));
            this.BtnMesa2.setForeground(new Color(0, 0, 0));
            this.BtnMesa3.setForeground(new Color(0, 0, 0));
            this.BtnMesa4.setForeground(new Color(0, 0, 0));
            this.BtnMesa5.setForeground(new Color(0, 0, 0));
            this.BtnMesa6.setForeground(new Color(0, 0, 0));
            this.BtnMesa7.setForeground(new Color(0, 0, 0));
            this.BtnMesa8.setForeground(new Color(0, 0, 0));
            this.BtnMesa9.setForeground(new Color(0, 0, 0));
        }
        
        
        this.BtnGenerarComanda.setEnabled(true);
        
        int nroComanda = dc.getNroComanda();
        int cantProdEnDetalle = dc.getCantidadProductosEnDetalle(nroComanda);
        
        if (cantProdEnDetalle == 0) {
            this.BtnGenerarComand.setEnabled(false);
        }else{
            this.BtnGenerarComand.setEnabled(true);
        }
        
  
    }//GEN-LAST:event_BtnAceptarMesaActionPerformed

    private void TxtBuscarProdPorNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarProdPorNombreKeyTyped
        Producto p = new Producto();
        DefaultListModel modelo = new DefaultListModel();
        String nom = this.TxtBuscarProdPorNombre.getText();
        String producto;
        if (nom.isEmpty()) {
            producto = "Producto inexistente";
            modelo.addElement(producto);
            this.ListaProductos.setModel(modelo);
        }else{
            if ( p.buscarPorNombre(nom, "seleccion") == true) {
                this.ListaProductos.setModel( p.getModeloLista() );
            }else{
                producto = "Producto inexistente";
                modelo.addElement(producto);
                this.ListaProductos.setModel(modelo);
            }
        }
    }//GEN-LAST:event_TxtBuscarProdPorNombreKeyTyped

    private void TxtBuscarProdPorCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarProdPorCodigoKeyTyped
        Producto p = new Producto();
        DefaultListModel modelo = new DefaultListModel();
        String cod = this.TxtBuscarProdPorCodigo.getText();
        String producto;
        
        if (cod.isEmpty()) {
            producto = "Producto inexistente";
            modelo.addElement(producto);
            this.ListaProductos.setModel(modelo);
        }else{
            if ( p.buscarPorCodigo(cod, "seleccion") == true) {
                this.ListaProductos.setModel( p.getModeloLista() );
            }else{
                producto = "Producto inexistente";
                modelo.addElement(producto);
                this.ListaProductos.setModel(modelo);
            }
        }       
    }//GEN-LAST:event_TxtBuscarProdPorCodigoKeyTyped

    private void TxtBuscarProdPorCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarProdPorCategoriaKeyTyped
        Producto p = new Producto();
        DefaultListModel modelo = new DefaultListModel();
        String categoria = this.TxtBuscarProdPorCategoria.getText();
        String producto;
        
        if (categoria.isEmpty()) {
            producto = "Producto inexistente";
            modelo.addElement(producto);
            this.ListaProductos.setModel(modelo);
        }else{
            if ( p.buscarPorCategorias(categoria) == true) {
                this.ListaProductos.setModel( p.getModeloLista() );
            }else{
                producto = "Producto inexistente";
                modelo.addElement(producto);
                this.ListaProductos.setModel(modelo);
            }
        }                
    }//GEN-LAST:event_TxtBuscarProdPorCategoriaKeyTyped

    private void BtnSeleccionarProdConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarProdConfirmarActionPerformed
        Producto p = new Producto();
        String producto = this.ListaProductos.getSelectedValue();
        int cantidad = Integer.parseInt( String.valueOf( this.SpnCantidadProductos.getValue() ) );
        this.BtnSeleccionarProdCancelar.setEnabled(true);
        this.ListaProductos.setEnabled(false);
        this.RbtnBuscarPorPorCodigo.setEnabled(false);
        this.RbtnBuscarProdPorCategoria.setEnabled(false);
        this.RbtnBuscarProdPorNombre.setEnabled(false);
        this.TxtBuscarProdPorNombre.setEnabled(false);
        this.TxtBuscarProdPorCodigo.setEnabled(false);
        this.TxtBuscarProdPorCategoria.setEnabled(false);
        if ( p.buscarPorNombre(producto, "obtener precio") == true) {
            this.LblSubtotal.setText(String.valueOf(p.getPrecioUnitario() ));
            
        }   
        this.BtnSeleccionarProdCancelar.setEnabled(true);
        this.BtnSeleccionarProdConfirmar.setEnabled(false);
        this.BtnSeleccionarProdAceptar.setEnabled(true);
        this.BtnCancelarProducto.setEnabled(true);
    }//GEN-LAST:event_BtnSeleccionarProdConfirmarActionPerformed

    private void ListaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaProductosMouseClicked
       this.BtnSeleccionarProdConfirmar.setEnabled(true);
    }//GEN-LAST:event_ListaProductosMouseClicked

    private void BtnSeleccionarProdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarProdCancelarActionPerformed
        this.ListaProductos.setEnabled(true);
        this.LblSubtotal.setText(null);
        this.RbtnBuscarPorPorCodigo.setEnabled(true);
        this.RbtnBuscarProdPorCategoria.setEnabled(true);
        this.RbtnBuscarProdPorNombre.setEnabled(true);
        this.TxtBuscarProdPorNombre.setEnabled(true);
        this.TxtBuscarProdPorCodigo.setEnabled(true);
        this.TxtBuscarProdPorCategoria.setEnabled(true);
        this.BtnSeleccionarProdCancelar.setEnabled(false);
        this.BtnSeleccionarProdConfirmar.setEnabled(true);
        this.BtnSeleccionarProdAceptar.setEnabled(false);

    }//GEN-LAST:event_BtnSeleccionarProdCancelarActionPerformed

    private void RbtnBuscarProdPorNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnBuscarProdPorNombreMouseClicked
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Producto inexistente");
        this.ListaProductos.setModel(modelo);
        this.ListaProductos.setEnabled(true);        
        if (this.RbtnBuscarProdPorNombre.isSelected()) {
            this.TxtBuscarProdPorNombre.setEnabled(true);
            this.TxtBuscarProdPorCodigo.setEnabled(false);
            this.TxtBuscarProdPorCategoria.setEnabled(false);
            this.TxtBuscarProdPorCodigo.setText(null);
            this.TxtBuscarProdPorCategoria.setText(null);
        }
    }//GEN-LAST:event_RbtnBuscarProdPorNombreMouseClicked

    private void RbtnBuscarPorPorCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnBuscarPorPorCodigoMouseClicked
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Producto inexistente");
        this.ListaProductos.setModel(modelo);
        this.ListaProductos.setEnabled(true);        
        if (this.RbtnBuscarPorPorCodigo.isSelected()) {
            this.TxtBuscarProdPorNombre.setEnabled(false);
            this.TxtBuscarProdPorCodigo.setEnabled(true);
            this.TxtBuscarProdPorCategoria.setEnabled(false); 
            this.TxtBuscarProdPorNombre.setText(null);
            this.TxtBuscarProdPorCategoria.setText(null);
        }
    }//GEN-LAST:event_RbtnBuscarPorPorCodigoMouseClicked

    private void RbtnBuscarProdPorCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnBuscarProdPorCategoriaMouseClicked
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Producto inexistente");
        this.ListaProductos.setModel(modelo);
        this.ListaProductos.setEnabled(true);        
        if (this.RbtnBuscarProdPorCategoria.isSelected()) {
            this.TxtBuscarProdPorNombre.setEnabled(false);
            this.TxtBuscarProdPorCodigo.setEnabled(false);
            this.TxtBuscarProdPorCategoria.setEnabled(true);    
            this.TxtBuscarProdPorNombre.setText(null);
            this.TxtBuscarProdPorCodigo.setText(null);
        }
    }//GEN-LAST:event_RbtnBuscarProdPorCategoriaMouseClicked

    private void BtnGenerarComandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarComandActionPerformed
       this.BtnSeleccionarMesa.setEnabled(true);       
       LocalDate fechaComanda = LocalDate.now();
       LocalTime horaComanda = LocalTime.now();
       
       DetalleComanda dc = new DetalleComanda();
       int nroCom = dc.getNroComanda();
       int totalCom = dc.totalComanda(nroCom);
       
       java.sql.Date fechaComandaSql = Date.valueOf(fechaComanda);
       java.sql.Time horaComandaSql = Time.valueOf(horaComanda);
       Operador o = new Operador();
       String codOpe = o.buscarOperadorActivo();
       
       Comanda c = new Comanda(nroMesaEscogido, fechaComandaSql, horaComandaSql, codOpe , totalCom);        
       c.insertar();
       Comanda co = new Comanda();
       this.TablaComandasPendientes.setModel( co.mostrarComandasPendientes() );
       
       
       this.BtnSeleccionarProducto.setEnabled(false);
       this.BtnGenerarComanda.setEnabled(false);
       
       this.BtnGenerarComand.setEnabled(false);
       
       int nroCom2 = dc.getNroComanda();
      
       nroMesaEscogido = 0;
       this.LblNroMesa.setText(String.valueOf(nroMesaEscogido));
       
       this.BtnAceptarMesa.setEnabled(false);
       this.BtnReiniciar.setEnabled(false);
       
    }//GEN-LAST:event_BtnGenerarComandActionPerformed

    private void BtnSeleccionarProdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarProdAceptarActionPerformed
        Producto p = new Producto();
        String nombreProducto = this.ListaProductos.getSelectedValue();
        Object cantObject = this.SpnCantidadProductos.getValue();
        int cantidad = Integer.parseInt( String.valueOf(cantObject));
        double subtotal = Double.parseDouble(this.LblSubtotal.getText());
        
        int codProd = p.buscar(nombreProducto);
        
        DetalleComanda d = new DetalleComanda();
        
        DetalleComanda dc = new DetalleComanda(codProd, cantidad, subtotal,d.getNroComanda());
        dc.insertar();
        
        Comanda co = new Comanda();
        co.mostrarComandasPendientes();
       
        int nroComanda = dc.getNroComanda();
        this.TablaDetalle.setModel(dc.mostrarDetalleComanda(nroComanda));
        
        this.TxtBuscarProdPorCategoria.setText(null);
        this.TxtBuscarProdPorCodigo.setText(null);
        this.TxtBuscarProdPorNombre.setText(null);
                
        DefaultListModel modelo = new DefaultListModel();
        String producto;
        producto = "Producto inexistente";
        modelo.addElement(producto);
        this.ListaProductos.setModel(modelo);
        this.BtnSeleccionarProdAceptar.setEnabled(false);
        
        this.SpnCantidadProductos.setValue(1);
        
        this.ListaProductos.setEnabled(true);
        this.LblSubtotal.setText(null);
        this.RbtnBuscarPorPorCodigo.setEnabled(true);
        this.RbtnBuscarProdPorCategoria.setEnabled(true);
        this.RbtnBuscarProdPorNombre.setEnabled(true);
        this.TxtBuscarProdPorNombre.setEnabled(true);
        this.TxtBuscarProdPorCodigo.setEnabled(true);
        this.TxtBuscarProdPorCategoria.setEnabled(true);
        this.BtnCancelarProducto.setEnabled(false);
        
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoGenerarComanda);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        
        int nroCom = dc.getNroComanda();
        int totalCom = dc.totalComanda(nroCom);
        this.LblTotalComanda.setText(String.valueOf(totalCom));
        
        int cantProdEnDetalle = dc.getCantidadProductosEnDetalle(nroComanda);
        
        if (cantProdEnDetalle == 0) {
            this.BtnGenerarComand.setEnabled(false);
        }else{
            this.BtnGenerarComand.setEnabled(true);
        }
 
        
    }//GEN-LAST:event_BtnSeleccionarProdAceptarActionPerformed

    private void SpnCantidadProductosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpnCantidadProductosStateChanged
        Producto p = new Producto();
        String producto = this.ListaProductos.getSelectedValue();
        double precioUnit = 0;
        if ( p.buscarPorNombre(producto, "obtener precio") == true) {
                precioUnit = p.getPrecioUnitario();
        }
        
        int cantidad = Integer.parseInt(String.valueOf( this.SpnCantidadProductos.getValue() ));
        double subtotal = precioUnit * cantidad;
        this.LblSubtotal.setText(String.valueOf( subtotal ));
 
    }//GEN-LAST:event_SpnCantidadProductosStateChanged

    private void BtnCancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarProductoActionPerformed
        this.TxtBuscarProdPorCategoria.setText(null);
        this.TxtBuscarProdPorCodigo.setText(null);
        this.TxtBuscarProdPorNombre.setText(null);
        this.BtnSeleccionarProdCancelar.setEnabled(false);
        this.BtnCancelarProducto.setEnabled(false);
        this.BtnSeleccionarProdAceptar.setEnabled(false);
        
        DefaultListModel modelo = new DefaultListModel();
        String producto;
        producto = "Producto inexistente";
        modelo.addElement(producto);
        this.ListaProductos.setModel(modelo);
        
        this.SpnCantidadProductos.setValue(1);
        
        this.ListaProductos.setEnabled(true);
        this.LblSubtotal.setText(null);
        this.RbtnBuscarPorPorCodigo.setEnabled(true);
        this.RbtnBuscarProdPorCategoria.setEnabled(true);
        this.RbtnBuscarProdPorNombre.setEnabled(true);
        this.TxtBuscarProdPorNombre.setEnabled(true);
        this.TxtBuscarProdPorCodigo.setEnabled(true);
        this.TxtBuscarProdPorCategoria.setEnabled(true);
        
    }//GEN-LAST:event_BtnCancelarProductoActionPerformed

    private void BtnAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarProdActionPerformed
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoSeleccionarProducto);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
    }//GEN-LAST:event_BtnAgregarProdActionPerformed

    private void TablaComandasPendientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaComandasPendientesMousePressed
        int fila = this.TablaComandasPendientes.rowAtPoint(evt.getPoint());
        
        nroComandaDesdeTablaPendientes = Integer.parseInt( String.valueOf( this.TablaComandasPendientes.getValueAt(fila, 0) ) );
        String estadoDesdeTablaPendientes =  String.valueOf( this.TablaComandasPendientes.getValueAt(fila, 6) );
        nroMesaDesdeTablaPendientes =  Integer.parseInt( String.valueOf( this.TablaComandasPendientes.getValueAt(fila, 1) ) );
        
        if (estadoDesdeTablaPendientes.equals("Entregado")) {
            this.BtnComandaFinalizada.setEnabled(true);
        }else{
            this.BtnComandaFinalizada.setEnabled(false);
        }
        
        if (estadoDesdeTablaPendientes.equals("Pendiente")) {
            this.BtnComandaEntregada.setEnabled(true);
        }else{
            this.BtnComandaEntregada.setEnabled(false);
        }
        
        DetalleComanda dc = new DetalleComanda();
        this.TablaDetalleComandasPendientes.setModel( dc.mostrarDetalleComanda(nroComandaDesdeTablaPendientes) );
    
    }//GEN-LAST:event_TablaComandasPendientesMousePressed

    private void BtnComandaEntregadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComandaEntregadaActionPerformed
        Comanda c = new Comanda();
        c.modificarEstado(nroComandaDesdeTablaPendientes, "Entregado");
        this.TablaComandasPendientes.setModel( c.mostrarComandasPendientes() );
        this.BtnComandaEntregada.setEnabled(false);
    }//GEN-LAST:event_BtnComandaEntregadaActionPerformed

    private void BtnComandaFinalizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComandaFinalizadaActionPerformed
        Comanda c = new Comanda();
        c.modificarEstado(nroComandaDesdeTablaPendientes, "Finalizado");
        this.TablaComandasPendientes.setModel( c.mostrarComandasPendientes() );
        this.TablaComandasFinalizadas.setModel(c.mostrarComandasFinalizadas());
        this.BtnComandaFinalizada.setEnabled(false);
        
        this.BtnMesa1.setForeground(new Color(0, 0, 0));
        this.BtnMesa2.setForeground(new Color(0, 0, 0));
        this.BtnMesa3.setForeground(new Color(0, 0, 0));
        this.BtnMesa4.setForeground(new Color(0, 0, 0));
        this.BtnMesa5.setForeground(new Color(0, 0, 0));
        this.BtnMesa6.setForeground(new Color(0, 0, 0));
        this.BtnMesa7.setForeground(new Color(0, 0, 0));
        this.BtnMesa8.setForeground(new Color(0, 0, 0));
        this.BtnMesa9.setForeground(new Color(0, 0, 0));
        
        
        
        m.setEstadoMesa(nroMesaDesdeTablaPendientes, "Desocupada");
        
        switch (nroMesaDesdeTablaPendientes) {
            case 1: this.calcularEstadoMesa1(); break;
            case 2: this.calcularEstadoMesa2(); break;
            case 3: this.calcularEstadoMesa3(); break;
            case 4: this.calcularEstadoMesa4(); break;
            case 5: this.calcularEstadoMesa5(); break;
            case 6: this.calcularEstadoMesa6(); break;
            case 7: this.calcularEstadoMesa7(); break;
            case 8: this.calcularEstadoMesa8(); break;
            case 9: this.calcularEstadoMesa9(); break;
        }    
        
        nroMesaEscogido = 0;
        this.LblNroMesa.setText(String.valueOf( nroMesaEscogido) );
        this.LblNroComanda.setText(String.valueOf( dc.getNroComanda() ));

        this.BtnAceptarMesa.setEnabled(false);
        this.BtnReiniciar.setEnabled(false);
    }//GEN-LAST:event_BtnComandaFinalizadaActionPerformed

    private void TablaComandasPendientesVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_TablaComandasPendientesVetoableChange
    }//GEN-LAST:event_TablaComandasPendientesVetoableChange

    private void TablaComandasFinalizadasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaComandasFinalizadasMousePressed
        int fila = this.TablaComandasFinalizadas.rowAtPoint(evt.getPoint());
        
        nroComandaDesdeTablaFinalizadas = Integer.parseInt( String.valueOf( this.TablaComandasFinalizadas.getValueAt(fila, 0) ) );
        
        DetalleComanda dc = new DetalleComanda();
        this.TablaDetalleComandasFinalizadas.setModel( dc.mostrarDetalleComanda(nroComandaDesdeTablaFinalizadas) );        
    }//GEN-LAST:event_TablaComandasFinalizadasMousePressed

    private String calcularEstadoMesa1(){
        String estadoMesa;
        String estadoMesa1 = m.getEstadoMesa(1);
        
        if (estadoMesa1.equals("Ocupada")) {
            this.BtnMesa1.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa1.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }

        return estadoMesa;
    }
    
    private String calcularEstadoMesa2(){
        String estadoMesa;
        String estadoMesa2 = m.getEstadoMesa(2);
        
        if (estadoMesa2.equals("Ocupada")) {
            this.BtnMesa2.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa2.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }
        
        return estadoMesa;
    }
    
    private String calcularEstadoMesa3(){
        String estadoMesa;
        String estadoMesa3 = m.getEstadoMesa(3);
        
        if (estadoMesa3.equals("Ocupada")) {
            this.BtnMesa3.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa3.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }
        
        return estadoMesa;
    }
    
    private String calcularEstadoMesa4(){
        String estadoMesa;
        String estadoMesa4 = m.getEstadoMesa(4);
        
        if (estadoMesa4.equals("Ocupada")) {
            this.BtnMesa4.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa4.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }
        
        return estadoMesa;
    }
    
    private String calcularEstadoMesa5(){
        String estadoMesa;
        String estadoMesa5 = m.getEstadoMesa(5);

        if (estadoMesa5.equals("Ocupada")) {
            this.BtnMesa5.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa5.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }
                
        return estadoMesa;
    }
    
    private String calcularEstadoMesa6(){
        String estadoMesa;
        String estadoMesa6 = m.getEstadoMesa(6);

        if (estadoMesa6.equals("Ocupada")) {
            this.BtnMesa6.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa6.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }        
                
        return estadoMesa;
    }
    
    private String calcularEstadoMesa7(){
        String estadoMesa;
        String estadoMesa7 = m.getEstadoMesa(7);

        if (estadoMesa7.equals("Ocupada")) {
            this.BtnMesa7.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa7.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }
        
        return estadoMesa;
    }
    
    private String calcularEstadoMesa8(){
        String estadoMesa;
        String estadoMesa8 = m.getEstadoMesa(8);
        
        if (estadoMesa8.equals("Ocupada")) {
            this.BtnMesa8.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa8.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }
        
        return estadoMesa;
    }
    
    private String calcularEstadoMesa9(){
        String estadoMesa;
        String estadoMesa9 = m.getEstadoMesa(9);  
        
        if (estadoMesa9.equals("Ocupada")) {
            this.BtnMesa9.setBackground(Color.RED);
            estadoMesa = "Ocupada";
        }else{
            this.BtnMesa9.setBackground(Color.GREEN);
            estadoMesa = "Desocupada";
        }
        
        return estadoMesa;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptarMesa;
    private javax.swing.JButton BtnAgregarProd;
    private javax.swing.JButton BtnCancelarProducto;
    private javax.swing.JButton BtnComandaEntregada;
    private javax.swing.JButton BtnComandaFinalizada;
    private javax.swing.JButton BtnGenerarComand;
    private javax.swing.JButton BtnGenerarComanda;
    private javax.swing.JButton BtnMesa1;
    private javax.swing.JButton BtnMesa2;
    private javax.swing.JButton BtnMesa3;
    private javax.swing.JButton BtnMesa4;
    private javax.swing.JButton BtnMesa5;
    private javax.swing.JButton BtnMesa6;
    private javax.swing.JButton BtnMesa7;
    private javax.swing.JButton BtnMesa8;
    private javax.swing.JButton BtnMesa9;
    private javax.swing.JButton BtnMisComandas;
    private javax.swing.JButton BtnMisComandasFinalizadas;
    private javax.swing.JButton BtnReiniciar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSeleccionarMesa;
    private javax.swing.JButton BtnSeleccionarProdAceptar;
    private javax.swing.JButton BtnSeleccionarProdCancelar;
    private javax.swing.JButton BtnSeleccionarProdConfirmar;
    private javax.swing.JButton BtnSeleccionarProducto;
    private javax.swing.JLabel LblBuscarProdPorCategoria;
    private javax.swing.JLabel LblBuscarProdPorCodigo;
    private javax.swing.JLabel LblBuscarProdPorNombre;
    private javax.swing.JLabel LblCantidadProductos;
    private javax.swing.JLabel LblNroComanda;
    private javax.swing.JLabel LblNroComandaTit;
    private javax.swing.JLabel LblNroMesa;
    private javax.swing.JLabel LblNroMesaTit;
    private javax.swing.JLabel LblSubtotal;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblTotalComanda;
    private javax.swing.JList<String> ListaProductos;
    private javax.swing.JPanel PnlCabecera;
    private javax.swing.JPanel PnlContenido;
    private javax.swing.JPanel PnlContenidoComandasFinalizadas;
    private javax.swing.JPanel PnlContenidoComandasPendientes;
    private javax.swing.JPanel PnlContenidoGenerarComanda;
    private javax.swing.JPanel PnlContenidoMisComandas;
    private javax.swing.JPanel PnlContenidoMostrarTitulo;
    private javax.swing.JPanel PnlContenidoSeleccionarMesa;
    private javax.swing.JPanel PnlContenidoSeleccionarProducto;
    private javax.swing.JPanel PnlDetalleComandasPendiente;
    private javax.swing.JPanel PnlMenuCabecera;
    private javax.swing.JPanel PnlMenuCuerpo;
    private javax.swing.JPanel PnlNroComanda;
    private javax.swing.JPanel PnlNroMesa;
    private javax.swing.JPanel PnlSubtotal;
    private javax.swing.JRadioButton RbtnBuscarPorPorCodigo;
    private javax.swing.JRadioButton RbtnBuscarProdPorCategoria;
    private javax.swing.JRadioButton RbtnBuscarProdPorNombre;
    private javax.swing.JSpinner SpnCantidadProductos;
    private javax.swing.JTable TablaComandasFinalizadas;
    private javax.swing.JTable TablaComandasPendientes;
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JTable TablaDetalleComandasFinalizadas;
    private javax.swing.JTable TablaDetalleComandasPendientes;
    private javax.swing.JTextField TxtBuscarProdPorCategoria;
    private javax.swing.JTextField TxtBuscarProdPorCodigo;
    private javax.swing.JTextField TxtBuscarProdPorNombre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
