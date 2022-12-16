package Formularios;

import Desarrollo.Empleado;
import Desarrollo.EmpleadoGenerica;
import Desarrollo.Operador;
import Desarrollo.Supervisor;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class FormEmpleados extends javax.swing.JInternalFrame {

    private String dniParaEliminarEmpleado;
    
    private String nomViejo;
    private String apeViejo;
    private String dniViejo;
    private String emailViejo;
    private String telViejo = "";
    private String turnoViejo;
    private String nomApeViejo;
    private String tel;
    
    public FormEmpleados() {
        initComponents();
        
        Empleado o = new Operador();
        Empleado s = new Supervisor();
        
        this.TablaOperadores.setModel(o.mostrarEmpleados());
        this.TablaSupervisores.setModel(s.mostrarEmpleados());
        
        this.BtnEliminar.setEnabled(false);
        this.BtnModificar.setEnabled(false);
        
         EmpleadoGenerica.buscarPorEstado();
         
         this.TablaOperadores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         this.TablaSupervisores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
         this.TxtNombreModificar.setEnabled(false);
         this.TxtApellidoModificar.setEnabled(false);
         this.TxtDniModificar.setEnabled(false);
         this.TxtEmailModificar.setEnabled(false);
         this.TxtTelefonoModificar.setEnabled(false);
         this.CboxTurnoModificar.setEnabled(false);
         
         this.CboxTurnoModificar.setModel(o.getNombresDeTurnos());
         
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlCabecera = new javax.swing.JPanel();
        PnlMenuCabecera = new javax.swing.JPanel();
        LblTituloMenuCabecera = new javax.swing.JLabel();
        PnlMenuCuerpo = new javax.swing.JPanel();
        BtnOperadores = new javax.swing.JButton();
        BtnSupervisores = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        PnlContenido = new javax.swing.JPanel();
        PnlContenidoOperadores = new javax.swing.JPanel();
        PnlContenidoMostrarTituloOperadores = new javax.swing.JPanel();
        LblTituloOperadores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaOperadores = new javax.swing.JTable();
        PnlContenidoModificar = new javax.swing.JPanel();
        PnlContenidoMostrarTituloModificar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LblNombreModificar = new javax.swing.JLabel();
        LblApellidoModificar = new javax.swing.JLabel();
        LblDniModificar = new javax.swing.JLabel();
        LblEmailModificar = new javax.swing.JLabel();
        LblTelefonoModificar = new javax.swing.JLabel();
        LblTurnoModificar = new javax.swing.JLabel();
        TxtNombreModificar = new javax.swing.JTextField();
        TxtApellidoModificar = new javax.swing.JTextField();
        TxtDniModificar = new javax.swing.JTextField();
        TxtEmailModificar = new javax.swing.JTextField();
        TxtTelefonoModificar = new javax.swing.JTextField();
        BtnAceptarModificar = new javax.swing.JButton();
        CheckNombreModificar = new javax.swing.JCheckBox();
        CheckApellidoModificar = new javax.swing.JCheckBox();
        CheckDniModificar = new javax.swing.JCheckBox();
        CboxTurnoModificar = new javax.swing.JComboBox<>();
        CheckEmailModificar = new javax.swing.JCheckBox();
        CheckTelefonoModificar = new javax.swing.JCheckBox();
        CheckTurnoModificar = new javax.swing.JCheckBox();
        PnlContenidoSupervisores = new javax.swing.JPanel();
        PnlContenidoMostrarTituloSupervisores = new javax.swing.JPanel();
        LblTituloSupervisores = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaSupervisores = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlCabecera.setBackground(new java.awt.Color(30, 30, 30));
        PnlCabecera.setPreferredSize(new java.awt.Dimension(1490, 50));

        javax.swing.GroupLayout PnlCabeceraLayout = new javax.swing.GroupLayout(PnlCabecera);
        PnlCabecera.setLayout(PnlCabeceraLayout);
        PnlCabeceraLayout.setHorizontalGroup(
            PnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1520, Short.MAX_VALUE)
        );
        PnlCabeceraLayout.setVerticalGroup(
            PnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PnlCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 50));

        PnlMenuCabecera.setBackground(new java.awt.Color(255, 204, 0));
        PnlMenuCabecera.setPreferredSize(new java.awt.Dimension(300, 80));

        LblTituloMenuCabecera.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        LblTituloMenuCabecera.setForeground(new java.awt.Color(0, 0, 0));
        LblTituloMenuCabecera.setText("Empleados");

        javax.swing.GroupLayout PnlMenuCabeceraLayout = new javax.swing.GroupLayout(PnlMenuCabecera);
        PnlMenuCabecera.setLayout(PnlMenuCabeceraLayout);
        PnlMenuCabeceraLayout.setHorizontalGroup(
            PnlMenuCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMenuCabeceraLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(LblTituloMenuCabecera)
                .addGap(74, 74, 74))
        );
        PnlMenuCabeceraLayout.setVerticalGroup(
            PnlMenuCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuCabeceraLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LblTituloMenuCabecera)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(PnlMenuCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 50, 330, -1));

        PnlMenuCuerpo.setBackground(new java.awt.Color(0, 50, 50));
        PnlMenuCuerpo.setPreferredSize(new java.awt.Dimension(101, 28));

        BtnOperadores.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnOperadores.setText("OPERADORES");
        BtnOperadores.setPreferredSize(new java.awt.Dimension(101, 28));
        BtnOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOperadoresActionPerformed(evt);
            }
        });

        BtnSupervisores.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnSupervisores.setText("SUPERVISORES");
        BtnSupervisores.setPreferredSize(new java.awt.Dimension(101, 28));
        BtnSupervisores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSupervisoresActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setPreferredSize(new java.awt.Dimension(101, 28));
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnModificar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.setPreferredSize(new java.awt.Dimension(101, 28));
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.setPreferredSize(new java.awt.Dimension(101, 28));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlMenuCuerpoLayout = new javax.swing.GroupLayout(PnlMenuCuerpo);
        PnlMenuCuerpo.setLayout(PnlMenuCuerpoLayout);
        PnlMenuCuerpoLayout.setHorizontalGroup(
            PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSupervisores, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PnlMenuCuerpoLayout.setVerticalGroup(
            PnlMenuCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMenuCuerpoLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(BtnOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSupervisores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        getContentPane().add(PnlMenuCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 300, 630));

        PnlContenido.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenido.setLayout(new java.awt.CardLayout());

        PnlContenidoOperadores.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoOperadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlContenidoMostrarTituloOperadores.setBackground(new java.awt.Color(200, 200, 200));

        LblTituloOperadores.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        LblTituloOperadores.setForeground(new java.awt.Color(0, 0, 0));
        LblTituloOperadores.setText("Operadores");

        javax.swing.GroupLayout PnlContenidoMostrarTituloOperadoresLayout = new javax.swing.GroupLayout(PnlContenidoMostrarTituloOperadores);
        PnlContenidoMostrarTituloOperadores.setLayout(PnlContenidoMostrarTituloOperadoresLayout);
        PnlContenidoMostrarTituloOperadoresLayout.setHorizontalGroup(
            PnlContenidoMostrarTituloOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoMostrarTituloOperadoresLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(LblTituloOperadores)
                .addContainerGap(1008, Short.MAX_VALUE))
        );
        PnlContenidoMostrarTituloOperadoresLayout.setVerticalGroup(
            PnlContenidoMostrarTituloOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoMostrarTituloOperadoresLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LblTituloOperadores)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        PnlContenidoOperadores.add(PnlContenidoMostrarTituloOperadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 80));

        TablaOperadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        TablaOperadores.setSelectionBackground(new java.awt.Color(255, 204, 0));
        TablaOperadores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaOperadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaOperadoresMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaOperadores);

        PnlContenidoOperadores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1190, 630));

        PnlContenido.add(PnlContenidoOperadores, "card2");

        PnlContenidoModificar.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlContenidoMostrarTituloModificar.setBackground(new java.awt.Color(200, 200, 200));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Modificar datos");

        javax.swing.GroupLayout PnlContenidoMostrarTituloModificarLayout = new javax.swing.GroupLayout(PnlContenidoMostrarTituloModificar);
        PnlContenidoMostrarTituloModificar.setLayout(PnlContenidoMostrarTituloModificarLayout);
        PnlContenidoMostrarTituloModificarLayout.setHorizontalGroup(
            PnlContenidoMostrarTituloModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoMostrarTituloModificarLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(963, Short.MAX_VALUE))
        );
        PnlContenidoMostrarTituloModificarLayout.setVerticalGroup(
            PnlContenidoMostrarTituloModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlContenidoMostrarTituloModificarLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        PnlContenidoModificar.add(PnlContenidoMostrarTituloModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 80));

        LblNombreModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblNombreModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblNombreModificar.setText("NOMBRE");
        PnlContenidoModificar.add(LblNombreModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        LblApellidoModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblApellidoModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblApellidoModificar.setText("APELLIDO");
        PnlContenidoModificar.add(LblApellidoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 30));

        LblDniModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblDniModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblDniModificar.setText("DNI");
        PnlContenidoModificar.add(LblDniModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, 30));

        LblEmailModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblEmailModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblEmailModificar.setText("EMAIL");
        PnlContenidoModificar.add(LblEmailModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, 50));

        LblTelefonoModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblTelefonoModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblTelefonoModificar.setText("TELÉFONO");
        PnlContenidoModificar.add(LblTelefonoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 298, -1, 30));

        LblTurnoModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblTurnoModificar.setForeground(new java.awt.Color(0, 0, 0));
        LblTurnoModificar.setText("TURNO");
        PnlContenidoModificar.add(LblTurnoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 388, -1, 30));

        TxtNombreModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoModificar.add(TxtNombreModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 390, 50));

        TxtApellidoModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoModificar.add(TxtApellidoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 390, 50));

        TxtDniModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoModificar.add(TxtDniModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 390, 50));

        TxtEmailModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoModificar.add(TxtEmailModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 390, 50));

        TxtTelefonoModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoModificar.add(TxtTelefonoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 390, 50));

        BtnAceptarModificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnAceptarModificar.setForeground(new java.awt.Color(0, 0, 0));
        BtnAceptarModificar.setText("ACEPTAR");
        BtnAceptarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarModificarActionPerformed(evt);
            }
        });
        PnlContenidoModificar.add(BtnAceptarModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 520, 190, 70));

        CheckNombreModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckNombreModificarMouseClicked(evt);
            }
        });
        PnlContenidoModificar.add(CheckNombreModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        CheckApellidoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckApellidoModificarMouseClicked(evt);
            }
        });
        PnlContenidoModificar.add(CheckApellidoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        CheckDniModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckDniModificarMouseClicked(evt);
            }
        });
        PnlContenidoModificar.add(CheckDniModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 383, -1, 40));

        CboxTurnoModificar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        PnlContenidoModificar.add(CboxTurnoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 419, 390, 50));

        CheckEmailModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckEmailModificarMouseClicked(evt);
            }
        });
        PnlContenidoModificar.add(CheckEmailModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        CheckTelefonoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckTelefonoModificarMouseClicked(evt);
            }
        });
        PnlContenidoModificar.add(CheckTelefonoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        CheckTurnoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckTurnoModificarMouseClicked(evt);
            }
        });
        PnlContenidoModificar.add(CheckTurnoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        PnlContenido.add(PnlContenidoModificar, "card3");

        PnlContenidoSupervisores.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenidoSupervisores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlContenidoMostrarTituloSupervisores.setBackground(new java.awt.Color(200, 200, 200));

        LblTituloSupervisores.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        LblTituloSupervisores.setForeground(new java.awt.Color(0, 0, 0));
        LblTituloSupervisores.setText("Supervisores");

        javax.swing.GroupLayout PnlContenidoMostrarTituloSupervisoresLayout = new javax.swing.GroupLayout(PnlContenidoMostrarTituloSupervisores);
        PnlContenidoMostrarTituloSupervisores.setLayout(PnlContenidoMostrarTituloSupervisoresLayout);
        PnlContenidoMostrarTituloSupervisoresLayout.setHorizontalGroup(
            PnlContenidoMostrarTituloSupervisoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenidoMostrarTituloSupervisoresLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(LblTituloSupervisores)
                .addContainerGap(988, Short.MAX_VALUE))
        );
        PnlContenidoMostrarTituloSupervisoresLayout.setVerticalGroup(
            PnlContenidoMostrarTituloSupervisoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlContenidoMostrarTituloSupervisoresLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(LblTituloSupervisores)
                .addGap(21, 21, 21))
        );

        PnlContenidoSupervisores.add(PnlContenidoMostrarTituloSupervisores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 80));

        TablaSupervisores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        TablaSupervisores.setSelectionBackground(new java.awt.Color(255, 204, 0));
        TablaSupervisores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaSupervisores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaSupervisoresMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TablaSupervisores);

        PnlContenidoSupervisores.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1190, 630));

        PnlContenido.add(PnlContenidoSupervisores, "card4");

        getContentPane().add(PnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 1190, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnOperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOperadoresActionPerformed
        Empleado o = new Operador();
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoOperadores);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        this.BtnEliminar.setEnabled(false);
        this.BtnModificar.setEnabled(false);
        this.TablaOperadores.clearSelection();
        this.TablaOperadores.setModel(o.mostrarEmpleados());
    }//GEN-LAST:event_BtnOperadoresActionPerformed

    private void BtnSupervisoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSupervisoresActionPerformed
        Empleado s = new Supervisor();
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoSupervisores);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        this.BtnEliminar.setEnabled(false);
        this.BtnModificar.setEnabled(false);
        this.TablaSupervisores.clearSelection();
        this.TablaSupervisores.setModel(s.mostrarEmpleados());
    }//GEN-LAST:event_BtnSupervisoresActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        this.PnlContenido.removeAll();
        this.PnlContenido.add(this.PnlContenidoModificar);
        this.PnlContenido.repaint();
        this.PnlContenido.revalidate();
        
        EmpleadoGenerica.buscarPorEstado();
        char tipoEmp = EmpleadoGenerica.getTipo();
        
        this.TxtNombreModificar.setText(nomViejo);
        this.TxtApellidoModificar.setText(apeViejo);
        this.TxtDniModificar.setText(dniViejo);
        this.TxtEmailModificar.setText(emailViejo);
        this.TxtTelefonoModificar.setText(telViejo);
        Object turno = turnoViejo;
        this.CboxTurnoModificar.setSelectedItem(turno); 
        
        this.CheckNombreModificar.setSelected(false);
        this.CheckApellidoModificar.setSelected(false);
        this.CheckDniModificar.setSelected(false);
        this.CheckEmailModificar.setSelected(false);
        this.CheckTurnoModificar.setSelected(false);
        this.CheckTelefonoModificar.setSelected(false);
        
        this.TxtNombreModificar.setEnabled(false);
        this.TxtApellidoModificar.setEnabled(false);
        this.TxtDniModificar.setEnabled(false);
        this.TxtEmailModificar.setEnabled(false);
        this.TxtTelefonoModificar.setEnabled(false);
        this.CboxTurnoModificar.setEnabled(false);
        
        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        Supervisor s = new Supervisor();
        Operador o = new Operador();
        try {
            int siNoCancelar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este producto?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (siNoCancelar == JOptionPane.YES_OPTION) {
                    s.eliminar(dniParaEliminarEmpleado);
                    this.TablaSupervisores.setModel(s.mostrarEmpleados());
                    this.TablaOperadores.setModel(o.mostrarEmpleados());
                }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error\n" + e);
        }
        
        this.BtnEliminar.setEnabled(false);
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void TablaOperadoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaOperadoresMousePressed
        int fila = this.TablaOperadores.rowAtPoint(evt.getPoint());
        
        dniParaEliminarEmpleado = String.valueOf( this.TablaOperadores.getValueAt(fila, 2) );
        String estado = String.valueOf(this.TablaOperadores.getValueAt(fila, 7));
        
        nomViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 0));
        apeViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 1));
        dniViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 2));
        emailViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 3));
        String tel = String.valueOf(this.TablaOperadores.getValueAt(fila, 4));
        turnoViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 5));
        
        if (tel.equals(null)) {
            telViejo = null;
        }else{
            telViejo = tel;
        }
        
        if (EmpleadoGenerica.getTipo() == 'S') {
            this.BtnEliminar.setEnabled(true);
            this.BtnModificar.setEnabled(false);
        }else{
            if (estado == "Conectado") {
                this.BtnModificar.setEnabled(true);
            }else{
                this.BtnModificar.setEnabled(false);
            }
            this.BtnEliminar.setEnabled(false);
        }
        
    }//GEN-LAST:event_TablaOperadoresMousePressed

    private void TablaSupervisoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaSupervisoresMousePressed
        
        int fila = this.TablaOperadores.rowAtPoint(evt.getPoint());
        
        dniParaEliminarEmpleado = String.valueOf( this.TablaSupervisores.getValueAt(fila, 2) );
        String estado = String.valueOf( this.TablaSupervisores.getValueAt(fila, 6) );
        
        nomViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 0));
        apeViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 1));
        nomApeViejo = apeViejo + ", " + nomViejo;
        dniViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 2));
        emailViejo = String.valueOf(this.TablaOperadores.getValueAt(fila, 3));
        tel = String.valueOf(this.TablaOperadores.getValueAt(fila, 4));
        turnoViejo = "Seleccione una categoría";
        
        if (tel.equals(null)) {
            telViejo = null;
        }else{
            telViejo = tel;
        }
        
        if (EmpleadoGenerica.getTipo() == 'S') {
            if (estado == "Conectado") {
                this.BtnEliminar.setEnabled(true);
                this.BtnModificar.setEnabled(true);
                this.CheckTurnoModificar.setEnabled(false);
            }else{
                this.BtnEliminar.setEnabled(false);
                this.BtnModificar.setEnabled(false);
            }
        }else{
            this.BtnModificar.setEnabled(false);
            this.BtnEliminar.setEnabled(false);
        }
        
    }//GEN-LAST:event_TablaSupervisoresMousePressed

    private void BtnAceptarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarModificarActionPerformed
        EmpleadoGenerica.buscarPorEstado();
        char tipoEmp = EmpleadoGenerica.getTipo();
        
        
        if (
                !this.TxtNombreModificar.isEnabled() && !this.TxtApellidoModificar.isEnabled() && !this.TxtDniModificar.isEnabled() &&
                !this.TxtEmailModificar.isEnabled() && !this.TxtTelefonoModificar.isEnabled() && !this.CboxTurnoModificar.isEnabled()
           ) 
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una opción.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if ( (this.TxtNombreModificar.isEnabled() && !this.TxtApellidoModificar.isEnabled() ) || (!this.TxtNombreModificar.isEnabled() && this.TxtApellidoModificar.isEnabled()) ) 
            {
                JOptionPane.showMessageDialog(null, "Si selecciona el nombre debe seleccionar también el apellido.");
            }
            else
            {
                if ( (this.TxtNombreModificar.getText().isEmpty()) || (this.TxtApellidoModificar.getText().isEmpty()) || (this.TxtDniModificar.getText().isEmpty())
                     || (this.TxtEmailModificar.getText().isEmpty()) || (this.TxtTelefonoModificar.getText().isEmpty())   
                    ) 
                {
                    JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos");
                }
                else
                {
                    if (tipoEmp == 'S') 
                   
                {
                    Empleado s = new Supervisor();
                    if (this.TxtNombreModificar.isEnabled() && this.TxtApellidoModificar.isEnabled()) 
                    {
                        String nomNuevo = this.TxtApellidoModificar.getText() + ", " + this.TxtNombreModificar.getText();
                        s.modificarPorNombre(nomNuevo,  dniParaEliminarEmpleado);
                        System.out.println(nomApeViejo);
                        System.out.println(nomNuevo);
                        System.out.println( dniParaEliminarEmpleado);
                        this.TablaSupervisores.setModel(s.mostrarEmpleados());
                    }
                
                    if (this.TxtDniModificar.isEnabled()) 
                    {
                        String dniNuevo = this.TxtDniModificar.getText();
                        s.modificarPorDni(dniNuevo, dniViejo);
                        this.TablaSupervisores.setModel(s.mostrarEmpleados());
                    }
                
                    if (this.TxtEmailModificar.isEnabled()) 
                    {
                        String emailNuevo = this.TxtEmailModificar.getText();
                        s.modificarPorEmail(emailNuevo, emailViejo);
                        this.TablaSupervisores.setModel(s.mostrarEmpleados());
                    }
                
                    if (this.TxtTelefonoModificar.isEnabled()) 
                    {
                        String telNuevo = this.TxtTelefonoModificar.getText();
                        s.modificarPorTel(telNuevo, dniParaEliminarEmpleado);
                        this.TablaSupervisores.setModel(s.mostrarEmpleados());
                    }
                
                }
                else
                {
                    Empleado o = new Operador();
                    if (this.TxtNombreModificar.isEnabled() && this.TxtApellidoModificar.isEnabled()) 
                    {
                        String nomNuevo = this.TxtApellidoModificar.getText() + ", " + this.TxtNombreModificar.getText();
                        o.modificarPorNombre(nomNuevo,  dniParaEliminarEmpleado);
                        this.TablaOperadores.setModel(o.mostrarEmpleados());
                    }
                
                    if (this.TxtDniModificar.isEnabled()) {
                        String dniNuevo = this.TxtDniModificar.getText();
                        o.modificarPorDni(dniNuevo, dniViejo);
                        this.TablaOperadores.setModel(o.mostrarEmpleados());
                    }
                
                    if (this.TxtEmailModificar.isEnabled()) {
                        String emailNuevo = this.TxtEmailModificar.getText();
                        o.modificarPorEmail(emailNuevo, emailViejo);
                        this.TablaOperadores.setModel(o.mostrarEmpleados());
                    }
                
                    if (this.TxtTelefonoModificar.isEnabled()) {
                        String telNuevo = this.TxtTelefonoModificar.getText();
                        o.modificarPorTel(telNuevo, dniParaEliminarEmpleado);
                        this.TablaOperadores.setModel(o.mostrarEmpleados());
                    }
                
                    if (this.CboxTurnoModificar.isEnabled()) 
                    {
                        if (this.CboxTurnoModificar.getSelectedItem().equals("Seleccione un turno")) 
                        {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar un turno");
                        }
                        else
                        {
                            Operador ope = new Operador();
                            String turnoNuevo = String.valueOf( this.CboxTurnoModificar.getSelectedItem() );
                            ope.modificarPorTurno(turnoNuevo, turnoViejo);
                            this.TablaOperadores.setModel(o.mostrarEmpleados());
                        }
                    }
                }
                
                    this.TxtNombreModificar.setText(null);
                    this.TxtApellidoModificar.setText(null);
                    this.TxtDniModificar.setText(null);
                    this.TxtEmailModificar.setText(null);
                    this.TxtTelefonoModificar.setText(null);
                    this.CboxTurnoModificar.setSelectedIndex(0);

                    this.TxtNombreModificar.setEnabled(false);
                    this.TxtApellidoModificar.setEnabled(false);
                    this.TxtDniModificar.setEnabled(false);
                    this.TxtEmailModificar.setEnabled(false);
                    this.TxtTelefonoModificar.setEnabled(false);
                    this.CboxTurnoModificar.setEnabled(false);

                    this.CheckNombreModificar.setSelected(false);
                    this.CheckApellidoModificar.setSelected(false);
                    this.CheckDniModificar.setSelected(false);
                    this.CheckEmailModificar.setSelected(false);
                    this.CheckTurnoModificar.setSelected(false);
                    this.CheckTelefonoModificar.setSelected(false);
            
                }
            }    
        } 
        
        
    }//GEN-LAST:event_BtnAceptarModificarActionPerformed

    private void CheckNombreModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckNombreModificarMouseClicked
        if (this.CheckNombreModificar.isSelected()) {
           this.TxtNombreModificar.setEnabled(true); 
        }else{
            this.TxtNombreModificar.setEnabled(false);
            this.TxtNombreModificar.setText(nomViejo);
        }
    }//GEN-LAST:event_CheckNombreModificarMouseClicked

    private void CheckApellidoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckApellidoModificarMouseClicked
        if (this.CheckApellidoModificar.isSelected()) {
           this.TxtApellidoModificar.setEnabled(true); 
        }else{
            this.TxtApellidoModificar.setEnabled(false);
            this.TxtApellidoModificar.setText(apeViejo);
        }
    }//GEN-LAST:event_CheckApellidoModificarMouseClicked

    private void CheckDniModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckDniModificarMouseClicked
        if (this.CheckDniModificar.isSelected()) {
           this.TxtDniModificar.setEnabled(true); 
        }else{
            this.TxtDniModificar.setEnabled(false);
            this.TxtDniModificar.setText(dniViejo);
        }
    }//GEN-LAST:event_CheckDniModificarMouseClicked

    private void CheckEmailModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckEmailModificarMouseClicked
        if (this.CheckEmailModificar.isSelected()) {
           this.TxtEmailModificar.setEnabled(true); 
        }else{
            this.TxtEmailModificar.setEnabled(false);
            this.TxtEmailModificar.setText(emailViejo);
        }
    }//GEN-LAST:event_CheckEmailModificarMouseClicked

    private void CheckTelefonoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckTelefonoModificarMouseClicked
        if (this.CheckTelefonoModificar.isSelected()) {
           this.TxtTelefonoModificar.setEnabled(true); 
        }else{
            this.TxtTelefonoModificar.setEnabled(false);
            this.TxtTelefonoModificar.setText(telViejo);
        }
    }//GEN-LAST:event_CheckTelefonoModificarMouseClicked

    private void CheckTurnoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckTurnoModificarMouseClicked
        if (this.CheckTurnoModificar.isSelected()) {
           this.CboxTurnoModificar.setEnabled(true); 
        }else{
            this.CboxTurnoModificar.setEnabled(false);
            this.CboxTurnoModificar.setSelectedItem(turnoViejo);
        }
    }//GEN-LAST:event_CheckTurnoModificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptarModificar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnOperadores;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSupervisores;
    private javax.swing.JComboBox<String> CboxTurnoModificar;
    private javax.swing.JCheckBox CheckApellidoModificar;
    private javax.swing.JCheckBox CheckDniModificar;
    private javax.swing.JCheckBox CheckEmailModificar;
    private javax.swing.JCheckBox CheckNombreModificar;
    private javax.swing.JCheckBox CheckTelefonoModificar;
    private javax.swing.JCheckBox CheckTurnoModificar;
    private javax.swing.JLabel LblApellidoModificar;
    private javax.swing.JLabel LblDniModificar;
    private javax.swing.JLabel LblEmailModificar;
    private javax.swing.JLabel LblNombreModificar;
    private javax.swing.JLabel LblTelefonoModificar;
    private javax.swing.JLabel LblTituloMenuCabecera;
    private javax.swing.JLabel LblTituloOperadores;
    private javax.swing.JLabel LblTituloSupervisores;
    private javax.swing.JLabel LblTurnoModificar;
    private javax.swing.JPanel PnlCabecera;
    private javax.swing.JPanel PnlContenido;
    private javax.swing.JPanel PnlContenidoModificar;
    private javax.swing.JPanel PnlContenidoMostrarTituloModificar;
    private javax.swing.JPanel PnlContenidoMostrarTituloOperadores;
    private javax.swing.JPanel PnlContenidoMostrarTituloSupervisores;
    private javax.swing.JPanel PnlContenidoOperadores;
    private javax.swing.JPanel PnlContenidoSupervisores;
    private javax.swing.JPanel PnlMenuCabecera;
    private javax.swing.JPanel PnlMenuCuerpo;
    private javax.swing.JTable TablaOperadores;
    private javax.swing.JTable TablaSupervisores;
    private javax.swing.JTextField TxtApellidoModificar;
    private javax.swing.JTextField TxtDniModificar;
    private javax.swing.JTextField TxtEmailModificar;
    private javax.swing.JTextField TxtNombreModificar;
    private javax.swing.JTextField TxtTelefonoModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
