package Formularios;

import Desarrollo.Empleado;
import java.awt.Color;
import javax.swing.JOptionPane;
import Desarrollo.Operador;
import Desarrollo.Supervisor;
import java.awt.Dimension;
import Formularios.FormMenu;
import Formularios.FormInicio;
import java.awt.Toolkit;

public class FormInicio extends javax.swing.JFrame {
    
    private boolean hayNumero = false;
    private boolean hayLetrasMayus = false;
    private boolean hayCaracterEspecial = false;
    private String pass = "";
    private int intentos;
    
    Operador o = new Operador();
    
    public FormInicio() {
        initComponents();
        this.TxtNomReg.setEnabled(false);
        this.TxtDniReg.setEnabled(false);
        this.TxtTelReg.setEnabled(false);
        this.TxtPassReg.setEnabled(false);
        this.TxtApeReg.setEnabled(false);
        this.TxtEmailReg.setEnabled(false);
        this.CboxTurnoReg.setEnabled(false);
        this.CboxTurnoReg.setModel(o.insertarTurnos());
        this.CboxTurnoReg.setSelectedIndex(0);
        this.LblFuerteDebilEsperarValidacion();
        intentos = 3;
        this.LblIntentosLogueo.setText("Intentos: " + intentos + "/3");
        this.TxtEmailInicio.setEnabled(true);
        this.TxtPassInicio.setEnabled(true);
        this.BtnInicio.setEnabled(false);
        this.PnlBase.removeAll();
        this.PnlBase.add(this.PnlIniciarSesion);
        this.PnlBase.repaint();
        this.PnlBase.revalidate();
        this.BtnRegistro.setEnabled(false);
        this.setLocationRelativeTo(null);
        
        this.setTitle("Orderffee");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/Imagenes/icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BtnIniciarSesion = new javax.swing.JButton();
        BtnRegistrarse = new javax.swing.JButton();
        PnlBase = new javax.swing.JPanel();
        PnlRegistrarse = new javax.swing.JPanel();
        LblNomReg = new javax.swing.JLabel();
        LblApeReg = new javax.swing.JLabel();
        LblDniReg = new javax.swing.JLabel();
        LblEmailReg = new javax.swing.JLabel();
        LblTelReg = new javax.swing.JLabel();
        LblTurnoReg = new javax.swing.JLabel();
        LblPassReg = new javax.swing.JLabel();
        TxtNomReg = new javax.swing.JTextField();
        TxtApeReg = new javax.swing.JTextField();
        TxtDniReg = new javax.swing.JTextField();
        TxtEmailReg = new javax.swing.JTextField();
        TxtTelReg = new javax.swing.JTextField();
        CboxTurnoReg = new javax.swing.JComboBox<>();
        TxtPassReg = new javax.swing.JPasswordField();
        RbtnSoyOperador = new javax.swing.JRadioButton();
        RbtnSoySupervisor = new javax.swing.JRadioButton();
        BtnRegistro = new javax.swing.JButton();
        LblCamposObligatorios = new javax.swing.JLabel();
        LblFuerteDebil = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnValidarPass = new javax.swing.JButton();
        BtnConfirmarTipoEmpleado = new javax.swing.JButton();
        BtnCancelarTipoEmpleado = new javax.swing.JButton();
        PnlIniciarSesion = new javax.swing.JPanel();
        LblEmailInicio = new javax.swing.JLabel();
        LblPassInicio = new javax.swing.JLabel();
        TxtEmailInicio = new javax.swing.JTextField();
        TxtPassInicio = new javax.swing.JPasswordField();
        BtnInicio = new javax.swing.JButton();
        LblValidacionInicio = new javax.swing.JLabel();
        LblIntentosLogueo = new javax.swing.JLabel();
        RbtnSoyOperadorIniSesion = new javax.swing.JRadioButton();
        RbtnSoySupervisorIniSesion = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 50, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnIniciarSesion.setBackground(new java.awt.Color(255, 204, 0));
        BtnIniciarSesion.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnIniciarSesion.setForeground(new java.awt.Color(30, 30, 30));
        BtnIniciarSesion.setText("INICIAR SESIÓN");
        BtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(BtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 651, 100));

        BtnRegistrarse.setBackground(new java.awt.Color(255, 204, 0));
        BtnRegistrarse.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        BtnRegistrarse.setForeground(new java.awt.Color(30, 30, 30));
        BtnRegistrarse.setText("REGISTRARSE");
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 670, 100));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        PnlBase.setBackground(new java.awt.Color(255, 255, 255));
        PnlBase.setLayout(new java.awt.CardLayout());

        PnlRegistrarse.setBackground(new java.awt.Color(0, 50, 50));
        PnlRegistrarse.setForeground(new java.awt.Color(30, 30, 30));
        PnlRegistrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNomReg.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblNomReg.setForeground(new java.awt.Color(240, 240, 240));
        LblNomReg.setText("NOMBRE(*)");
        PnlRegistrarse.add(LblNomReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        LblApeReg.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblApeReg.setForeground(new java.awt.Color(240, 240, 240));
        LblApeReg.setText("APELLIDO(*)");
        PnlRegistrarse.add(LblApeReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        LblDniReg.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblDniReg.setForeground(new java.awt.Color(240, 240, 240));
        LblDniReg.setText("DNI(*)");
        PnlRegistrarse.add(LblDniReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        LblEmailReg.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblEmailReg.setForeground(new java.awt.Color(240, 240, 240));
        LblEmailReg.setText("CORREO ELECTRÓNIC0(*)");
        PnlRegistrarse.add(LblEmailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        LblTelReg.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblTelReg.setForeground(new java.awt.Color(240, 240, 240));
        LblTelReg.setText("TELÉFONO");
        PnlRegistrarse.add(LblTelReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        LblTurnoReg.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblTurnoReg.setForeground(new java.awt.Color(240, 240, 240));
        LblTurnoReg.setText("SELECCIONE SU TURNO(*)");
        PnlRegistrarse.add(LblTurnoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, -1));

        LblPassReg.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblPassReg.setForeground(new java.awt.Color(240, 240, 240));
        LblPassReg.setText("INGRESE UNA CONTRASEÑA(*)");
        PnlRegistrarse.add(LblPassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        TxtNomReg.setBackground(new java.awt.Color(0, 40, 40));
        TxtNomReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtNomReg.setForeground(new java.awt.Color(240, 240, 240));
        TxtNomReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40), 10));
        TxtNomReg.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtNomReg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PnlRegistrarse.add(TxtNomReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 380, 50));

        TxtApeReg.setBackground(new java.awt.Color(0, 40, 40));
        TxtApeReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtApeReg.setForeground(new java.awt.Color(240, 240, 240));
        TxtApeReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40), 10));
        TxtApeReg.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtApeReg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PnlRegistrarse.add(TxtApeReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 380, 50));

        TxtDniReg.setBackground(new java.awt.Color(0, 40, 40));
        TxtDniReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtDniReg.setForeground(new java.awt.Color(240, 240, 240));
        TxtDniReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40), 10));
        TxtDniReg.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtDniReg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PnlRegistrarse.add(TxtDniReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 380, 50));

        TxtEmailReg.setBackground(new java.awt.Color(0, 40, 40));
        TxtEmailReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtEmailReg.setForeground(new java.awt.Color(240, 240, 240));
        TxtEmailReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40), 10));
        TxtEmailReg.setCaretColor(new java.awt.Color(240, 240, 240));
        TxtEmailReg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PnlRegistrarse.add(TxtEmailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 380, 50));

        TxtTelReg.setBackground(new java.awt.Color(0, 40, 40));
        TxtTelReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtTelReg.setForeground(new java.awt.Color(240, 240, 240));
        TxtTelReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40), 10));
        TxtTelReg.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtTelReg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PnlRegistrarse.add(TxtTelReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 380, 50));

        CboxTurnoReg.setBackground(new java.awt.Color(0, 40, 40));
        CboxTurnoReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CboxTurnoReg.setForeground(new java.awt.Color(240, 240, 240));
        CboxTurnoReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40)));
        PnlRegistrarse.add(CboxTurnoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 380, 50));

        TxtPassReg.setBackground(new java.awt.Color(0, 40, 40));
        TxtPassReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtPassReg.setForeground(new java.awt.Color(240, 240, 240));
        TxtPassReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40), 10));
        TxtPassReg.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtPassReg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtPassReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPassRegKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtPassRegKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPassRegKeyTyped(evt);
            }
        });
        PnlRegistrarse.add(TxtPassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 380, 50));

        RbtnSoyOperador.setBackground(new java.awt.Color(0, 50, 50));
        buttonGroup1.add(RbtnSoyOperador);
        RbtnSoyOperador.setForeground(new java.awt.Color(240, 240, 240));
        RbtnSoyOperador.setText("SOY OPERADOR");
        RbtnSoyOperador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbtnSoyOperadorMouseClicked(evt);
            }
        });
        RbtnSoyOperador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RbtnSoyOperadorKeyTyped(evt);
            }
        });
        PnlRegistrarse.add(RbtnSoyOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 190, 50));

        RbtnSoySupervisor.setBackground(new java.awt.Color(0, 50, 50));
        buttonGroup1.add(RbtnSoySupervisor);
        RbtnSoySupervisor.setForeground(new java.awt.Color(240, 240, 240));
        RbtnSoySupervisor.setText("SOY SUPERVISOR");
        RbtnSoySupervisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbtnSoySupervisorMouseClicked(evt);
            }
        });
        PnlRegistrarse.add(RbtnSoySupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, 190, 50));

        BtnRegistro.setBackground(new java.awt.Color(255, 204, 0));
        BtnRegistro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnRegistro.setForeground(new java.awt.Color(30, 30, 30));
        BtnRegistro.setText("REGISTRARSE");
        BtnRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });
        PnlRegistrarse.add(BtnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 820, 60));

        LblCamposObligatorios.setBackground(new java.awt.Color(0, 50, 50));
        LblCamposObligatorios.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LblCamposObligatorios.setText("Campos obligatorios(*)");
        PnlRegistrarse.add(LblCamposObligatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, -1, -1));

        LblFuerteDebil.setBackground(new java.awt.Color(0, 50, 50));
        LblFuerteDebil.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LblFuerteDebil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblFuerteDebil.setOpaque(true);
        LblFuerteDebil.setPreferredSize(new java.awt.Dimension(10, 30));
        PnlRegistrarse.add(LblFuerteDebil, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 140, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("(*) La contraseña tiene que tener al menos 8 dígitos, 1 número, 1 mayúscula y 1 caracter especial");
        PnlRegistrarse.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, -1, -1));

        BtnValidarPass.setBackground(new java.awt.Color(255, 204, 0));
        BtnValidarPass.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnValidarPass.setForeground(new java.awt.Color(0, 0, 0));
        BtnValidarPass.setText("VALIDAR");
        BtnValidarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidarPassActionPerformed(evt);
            }
        });
        PnlRegistrarse.add(BtnValidarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 110, 40));

        BtnConfirmarTipoEmpleado.setBackground(new java.awt.Color(255, 204, 0));
        BtnConfirmarTipoEmpleado.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnConfirmarTipoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        BtnConfirmarTipoEmpleado.setText("CONFIRMAR");
        BtnConfirmarTipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarTipoEmpleadoActionPerformed(evt);
            }
        });
        PnlRegistrarse.add(BtnConfirmarTipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 170, 40));

        BtnCancelarTipoEmpleado.setBackground(new java.awt.Color(255, 204, 0));
        BtnCancelarTipoEmpleado.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnCancelarTipoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        BtnCancelarTipoEmpleado.setText("CANCELAR");
        BtnCancelarTipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarTipoEmpleadoActionPerformed(evt);
            }
        });
        PnlRegistrarse.add(BtnCancelarTipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 180, 40));

        PnlBase.add(PnlRegistrarse, "card3");

        PnlIniciarSesion.setBackground(new java.awt.Color(0, 50, 50));
        PnlIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblEmailInicio.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblEmailInicio.setForeground(new java.awt.Color(240, 240, 240));
        LblEmailInicio.setText("INGRESE SU CORREO ELECTRÓNICO");
        PnlIniciarSesion.add(LblEmailInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        LblPassInicio.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LblPassInicio.setForeground(new java.awt.Color(240, 240, 240));
        LblPassInicio.setText("INGRESE SU CONTRASEÑA");
        PnlIniciarSesion.add(LblPassInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        TxtEmailInicio.setBackground(new java.awt.Color(0, 40, 40));
        TxtEmailInicio.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtEmailInicio.setForeground(new java.awt.Color(240, 240, 240));
        TxtEmailInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40), 10));
        TxtEmailInicio.setCaretColor(new java.awt.Color(240, 240, 240));
        PnlIniciarSesion.add(TxtEmailInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 620, 70));

        TxtPassInicio.setBackground(new java.awt.Color(0, 40, 40));
        TxtPassInicio.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtPassInicio.setForeground(new java.awt.Color(240, 240, 240));
        TxtPassInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 40), 10));
        TxtPassInicio.setCaretColor(new java.awt.Color(240, 240, 240));
        PnlIniciarSesion.add(TxtPassInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 620, 70));

        BtnInicio.setBackground(new java.awt.Color(255, 204, 0));
        BtnInicio.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(30, 30, 30));
        BtnInicio.setText("INICIAR SESIÓN");
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });
        PnlIniciarSesion.add(BtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 620, 60));
        PnlIniciarSesion.add(LblValidacionInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        LblIntentosLogueo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LblIntentosLogueo.setForeground(new java.awt.Color(240, 240, 240));
        PnlIniciarSesion.add(LblIntentosLogueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        RbtnSoyOperadorIniSesion.setBackground(new java.awt.Color(0, 50, 50));
        buttonGroup3.add(RbtnSoyOperadorIniSesion);
        RbtnSoyOperadorIniSesion.setForeground(new java.awt.Color(240, 240, 240));
        RbtnSoyOperadorIniSesion.setText("SOY OPERADOR");
        RbtnSoyOperadorIniSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbtnSoyOperadorIniSesionMouseClicked(evt);
            }
        });
        PnlIniciarSesion.add(RbtnSoyOperadorIniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, -1));

        RbtnSoySupervisorIniSesion.setBackground(new java.awt.Color(0, 50, 50));
        buttonGroup3.add(RbtnSoySupervisorIniSesion);
        RbtnSoySupervisorIniSesion.setForeground(new java.awt.Color(240, 240, 240));
        RbtnSoySupervisorIniSesion.setText("SOY SUPERVISOR");
        RbtnSoySupervisorIniSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbtnSoySupervisorIniSesionMouseClicked(evt);
            }
        });
        PnlIniciarSesion.add(RbtnSoySupervisorIniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, -1, -1));

        PnlBase.add(PnlIniciarSesion, "card2");

        getContentPane().add(PnlBase, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSesionActionPerformed
        this.PnlBase.removeAll();
        this.PnlBase.add(this.PnlIniciarSesion);
        this.PnlBase.repaint();
        this.PnlBase.revalidate();
    }//GEN-LAST:event_BtnIniciarSesionActionPerformed

    private void BtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseActionPerformed
        this.PnlBase.removeAll();
        this.PnlBase.add(this.PnlRegistrarse);
        this.PnlBase.repaint();
        this.PnlBase.revalidate();
    }//GEN-LAST:event_BtnRegistrarseActionPerformed

    private void BtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroActionPerformed
        
        if (
                (this.TxtNomReg.getText().isEmpty()) || (this.TxtDniReg.getText().isEmpty()) || (String.valueOf(this.TxtPassReg.getPassword()).isEmpty()) ||
                (this.TxtApeReg.getText().isEmpty()) || (this.TxtEmailReg.getText().isEmpty())        
           ) 
        {
            JOptionPane.showMessageDialog(null, "Complete los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);   
        }else{
            if (hayNumero && hayLetrasMayus && hayCaracterEspecial && pass.length() >= 8) {
                boolean hayRegistroExitoso = false;
                //HACEMOS LA CARGA DE DATOS AL CONSTRUCTOR
                //SI ES OPERADOR CARGARÁ UN CONSTRUCTOR. SI ES OPERADOR O SUPERVISOR Y NO CARGÓ EL TELÉFONO SE PODRÁ SETEAR MÁS ADELANTE
                if (this.RbtnSoyOperador.isSelected()) {
                    if (this.CboxTurnoReg.getSelectedItem().equals("Seleccione un turno")) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un turno para el operador", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                        if (this.TxtTelReg.getText().isEmpty()) {
                        String nom = this.TxtNomReg.getText();
                        String ape = this.TxtApeReg.getText();
                        String dni = this.TxtDniReg.getText();
                        String email = this.TxtEmailReg.getText();
                        String turno = String.valueOf(this.CboxTurnoReg.getSelectedItem());
                        String pass = String.valueOf(this.TxtPassReg.getPassword()); 
                        Empleado ope = new Operador(turno, nom, ape, dni, email, pass, 'O');
                        ope.generarCodigo();
                        hayRegistroExitoso = ope.agregar();
                        if (hayRegistroExitoso) {
                            this.TxtNomReg.setText(null);
                            this.TxtApeReg.setText(null);
                            this.TxtDniReg.setText(null);
                            this.TxtEmailReg.setText(null);
                            this.TxtTelReg.setText(null);
                            this.CboxTurnoReg.setSelectedIndex(0);
                            this.TxtPassReg.setText(null);
                            this.BtnRegistro.setEnabled(false);
                        }
                        this.desactivarCajas();
                        this.LblFuerteDebilEsperarValidacion();
                        }else{
                            String nom = this.TxtNomReg.getText();
                            String ape = this.TxtApeReg.getText();
                            String dni = this.TxtDniReg.getText();
                            String email = this.TxtEmailReg.getText();
                            String tel = this.TxtTelReg.getText();
                            String turno = String.valueOf(this.CboxTurnoReg.getSelectedItem());
                            String pass = String.valueOf(this.TxtPassReg.getPassword()); 
                            Empleado ope = new Operador(turno, nom, ape, dni, email, pass, tel, 'O');
                            ope.generarCodigo();
                            hayRegistroExitoso = ope.agregar();
                            if (hayRegistroExitoso) {
                                this.TxtNomReg.setText(null);
                                this.TxtApeReg.setText(null);
                                this.TxtDniReg.setText(null);
                                this.TxtEmailReg.setText(null);
                                this.TxtTelReg.setText(null);
                                this.CboxTurnoReg.setSelectedIndex(0);
                                this.TxtPassReg.setText(null);
                                this.BtnRegistro.setEnabled(false);
                            }
                            this.desactivarCajas();
                            this.LblFuerteDebilEsperarValidacion();
                        }
                    }        
                }else{
                    if (this.TxtTelReg.getText().isEmpty()) {
                        String nom = this.TxtNomReg.getText();
                        String ape = this.TxtApeReg.getText();
                        String dni = this.TxtDniReg.getText();
                        String email = this.TxtEmailReg.getText();
                        String pass = String.valueOf(this.TxtPassReg.getPassword());    
                        Empleado sup = new Supervisor(nom, ape, dni, email, pass, 'S');
                        sup.generarCodigo();
                        hayRegistroExitoso = sup.agregar();
                        if (hayRegistroExitoso) {
                            this.TxtNomReg.setText(null);
                            this.TxtApeReg.setText(null);
                            this.TxtDniReg.setText(null);
                            this.TxtEmailReg.setText(null);
                            this.TxtTelReg.setText(null);
                            this.CboxTurnoReg.setSelectedIndex(0);
                            this.TxtPassReg.setText(null);
                            this.BtnRegistro.setEnabled(false);
                        }
                        this.desactivarCajas();
                        this.LblFuerteDebilEsperarValidacion();
                    }else{
                        String nom = this.TxtNomReg.getText();
                        String ape = this.TxtApeReg.getText();
                        String dni = this.TxtDniReg.getText();
                        String email = this.TxtEmailReg.getText();
                        String tel = this.TxtTelReg.getText();
                        String pass = String.valueOf(this.TxtPassReg.getPassword());  
                        Empleado sup = new Supervisor(nom, ape, dni, email, pass, tel, 'S');
                        sup.generarCodigo();
                        hayRegistroExitoso = sup.agregar();
                        if (hayRegistroExitoso) {
                            this.TxtNomReg.setText(null);
                            this.TxtApeReg.setText(null);
                            this.TxtDniReg.setText(null);
                            this.TxtEmailReg.setText(null);
                            this.TxtTelReg.setText(null);
                            this.CboxTurnoReg.setSelectedIndex(0);
                            this.TxtPassReg.setText(null);
                            this.BtnRegistro.setEnabled(false);
                        }
                        this.desactivarCajas();
                        this.LblFuerteDebilEsperarValidacion();
                    }
                }
 
            }
        }
    }//GEN-LAST:event_BtnRegistroActionPerformed

    private void TxtPassRegKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPassRegKeyReleased
        //this.validarSeguridadContrasena(this.TxtPassReg.getText());
    }//GEN-LAST:event_TxtPassRegKeyReleased

    private void TxtPassRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPassRegKeyPressed
        
    }//GEN-LAST:event_TxtPassRegKeyPressed

    private void TxtPassRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPassRegKeyTyped

    }//GEN-LAST:event_TxtPassRegKeyTyped

    private void BtnValidarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidarPassActionPerformed
        hayNumero = false;
        hayLetrasMayus = false;
        hayCaracterEspecial = false;
    
        String [] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String [] letrasMayusculas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String [] caracteresEspeciales = {"|", "°", "¬", "!", "\"", "#", "$", "%", "&", "/", "(", ")", "=", "?", "¿", "¡", "+", "*", "~", "{", "[", "^", "}", "]", "-","_", ".", ":", ",", ";",">", "<"};
                
        pass = String.valueOf(this.TxtPassReg.getPassword());
        System.out.println(pass);
    //VERIFICAR SI HAY UN NÚMERO
        for (int i = 0; i < numeros.length; i++) {
            if (pass.indexOf(numeros[i]) != -1) {
                hayNumero = true;
                break;
            }
        }
        
    //VERIFICAR SI HAY UNA LETRA EN MAYÚSCULA
        for (int i = 0; i < letrasMayusculas.length; i++) {
            if (pass.indexOf(letrasMayusculas[i]) != -1) {
                hayLetrasMayus = true;
                break;
            }
       }

    //VERIFICAR SI HAY CARACTER ESPECIAL
        for (int i = 0; i < caracteresEspeciales.length; i++) {
            if (pass.indexOf(caracteresEspeciales[i]) != -1) {
                hayCaracterEspecial = true;
                break;
            }
        } 
                
        
        //VERIFICAR SI POR LO MENOS HAY 8 CARACTERES        
        System.out.println(hayNumero);
        System.out.println(hayLetrasMayus);
        System.out.println(hayCaracterEspecial);
        
        //LLEVAR EL MENSAJE CORRESPONDIENTE SI ES DEBIL O FUE
        if (String.valueOf(this.TxtPassReg.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "No podemos validar un campo vacío", "Error", JOptionPane.ERROR_MESSAGE);    
        }else{
            if (hayNumero && hayLetrasMayus && hayCaracterEspecial && pass.length() >= 8) {
                this.LblFuerteDebil.setText("Fuerte");
                this.LblFuerteDebil.setBackground(Color.GREEN);
                this.LblFuerteDebil.setForeground(Color.WHITE);
                this.BtnRegistro.setEnabled(true);
            }else{
                this.LblFuerteDebil.setText("Debil");
                this.LblFuerteDebil.setBackground(Color.RED);
                this.LblFuerteDebil.setForeground(Color.WHITE);
                JOptionPane.showMessageDialog(null, "Debe incluir al menos:\n8 caractéres cómo mínimo\n1 letra mayúscula\n1 número\n1 caracter especial", "Aviso", JOptionPane.WARNING_MESSAGE);
            }            
        }       
    }//GEN-LAST:event_BtnValidarPassActionPerformed

    private void RbtnSoyOperadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RbtnSoyOperadorKeyTyped
        
    }//GEN-LAST:event_RbtnSoyOperadorKeyTyped

    private void RbtnSoyOperadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnSoyOperadorMouseClicked

    }//GEN-LAST:event_RbtnSoyOperadorMouseClicked

    private void RbtnSoySupervisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnSoySupervisorMouseClicked

    }//GEN-LAST:event_RbtnSoySupervisorMouseClicked

    private void BtnConfirmarTipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarTipoEmpleadoActionPerformed
        if (this.RbtnSoyOperador.isSelected()) {
            this.TxtNomReg.setEnabled(true);
            this.TxtDniReg.setEnabled(true);
            this.TxtTelReg.setEnabled(true);
            this.TxtPassReg.setEnabled(true);
            this.TxtApeReg.setEnabled(true);
            this.TxtEmailReg.setEnabled(true);
            this.CboxTurnoReg.setEnabled(true);
            this.RbtnSoySupervisor.setEnabled(false);
        }else{
            this.TxtNomReg.setEnabled(true);
            this.TxtDniReg.setEnabled(true);
            this.TxtTelReg.setEnabled(true);
            this.TxtPassReg.setEnabled(true);
            this.TxtApeReg.setEnabled(true);
            this.TxtEmailReg.setEnabled(true);
            this.CboxTurnoReg.setSelectedIndex(0);
            this.CboxTurnoReg.setEnabled(false);
            this.RbtnSoyOperador.setEnabled(false);
        }
    }//GEN-LAST:event_BtnConfirmarTipoEmpleadoActionPerformed

    private void BtnCancelarTipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarTipoEmpleadoActionPerformed
        this.desactivarCajas();
    }//GEN-LAST:event_BtnCancelarTipoEmpleadoActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        boolean ExisteEmail = false;
        this.LblIntentosLogueo.setText("Intentos: " + intentos + "/3");
        if ( (this.TxtEmailInicio.getText().isEmpty() ) || (String.valueOf(this.TxtPassInicio.getPassword())).isEmpty() ) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if (intentos > 0) {
                if (this.RbtnSoyOperadorIniSesion.isSelected()) {
                    Empleado o = new Operador();
                    ExisteEmail = o.buscarPorEmail(this.TxtEmailInicio.getText(), 'O');

                    if (ExisteEmail) {
                        String pass = o.getPass();
                        if (String.valueOf(this.TxtPassInicio.getPassword()).equals(pass)) {
                            this.setVisible(false);
                            FormMenu frmPrincipal = new FormMenu();
                            frmPrincipal.setVisible(true);
                            frmPrincipal.setMinimumSize(new Dimension(1200, 800));
                        }else{
                            intentos--;
                            this.LblIntentosLogueo.setText("Intentos: " + intentos + "/3");
                            JOptionPane.showMessageDialog(null, "La contraseña no coincide", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "El email no existe\nAsegurese que es el mail correcto\nAsegurese que es el mail pertenece a la categoría supervisor", "Error", JOptionPane.ERROR_MESSAGE);
                    } 

                }else{
                    Empleado s = new Supervisor();
                    ExisteEmail = s.buscarPorEmail(this.TxtEmailInicio.getText(), 'S');
                    if (ExisteEmail) {
                        String pass = s.getPass();
                        if (String.valueOf(this.TxtPassInicio.getPassword()).equals(pass)) {
                           this.setVisible(false);
                            FormMenu frmPrincipal = new FormMenu();
                            frmPrincipal.setVisible(true);
                            frmPrincipal.setMinimumSize(new Dimension(1200, 800)); 
                        }else{
                            JOptionPane.showMessageDialog(null, "La contraseña no coincide", "Error", JOptionPane.ERROR_MESSAGE);
                            intentos--;
                            this.LblIntentosLogueo.setText("Intentos: " + intentos + "/3");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "El email no existe\nAsegurese que es el mail correcto\nAsegurese que es el mail pertenece a la categoría supervisor", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else{
                this.TxtEmailInicio.setEnabled(false);
                this.TxtPassInicio.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Se ha superado los intentos.\nCierre, abra el programa y vuelve a intenarlo.", "Error", JOptionPane.ERROR_MESSAGE);
            }            
        }
 
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void RbtnSoyOperadorIniSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnSoyOperadorIniSesionMouseClicked
        this.BtnInicio.setEnabled(true);
    }//GEN-LAST:event_RbtnSoyOperadorIniSesionMouseClicked

    private void RbtnSoySupervisorIniSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbtnSoySupervisorIniSesionMouseClicked
        this.BtnInicio.setEnabled(true);
    }//GEN-LAST:event_RbtnSoySupervisorIniSesionMouseClicked
     
    public void desactivarCajas(){
        this.TxtNomReg.setEnabled(false);
        this.TxtDniReg.setEnabled(false);
        this.TxtTelReg.setEnabled(false);
        this.TxtPassReg.setEnabled(false);
        this.TxtApeReg.setEnabled(false);
        this.TxtEmailReg.setEnabled(false);
        this.CboxTurnoReg.setEnabled(false);
        this.RbtnSoyOperador.setEnabled(true);
        this.RbtnSoySupervisor.setEnabled(true);
        this.TxtNomReg.setText(null);
        this.TxtDniReg.setText(null);
        this.TxtTelReg.setText(null);
        this.TxtPassReg.setText(null);
        this.TxtApeReg.setText(null);
        this.TxtEmailReg.setText(null);
        this.CboxTurnoReg.setEnabled(false);
        this.CboxTurnoReg.setSelectedIndex(0);
    }
    
    public void LblFuerteDebilEsperarValidacion(){
        this.LblFuerteDebil.setText("...");
        this.LblFuerteDebil.setBackground(Color.GRAY);
        this.LblFuerteDebil.setForeground(Color.BLACK);
    }
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelarTipoEmpleado;
    private javax.swing.JButton BtnConfirmarTipoEmpleado;
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnRegistrarse;
    private javax.swing.JButton BtnRegistro;
    private javax.swing.JButton BtnValidarPass;
    private javax.swing.JComboBox<String> CboxTurnoReg;
    private javax.swing.JLabel LblApeReg;
    private javax.swing.JLabel LblCamposObligatorios;
    private javax.swing.JLabel LblDniReg;
    private javax.swing.JLabel LblEmailInicio;
    private javax.swing.JLabel LblEmailReg;
    private javax.swing.JLabel LblFuerteDebil;
    private javax.swing.JLabel LblIntentosLogueo;
    private javax.swing.JLabel LblNomReg;
    private javax.swing.JLabel LblPassInicio;
    private javax.swing.JLabel LblPassReg;
    private javax.swing.JLabel LblTelReg;
    private javax.swing.JLabel LblTurnoReg;
    private javax.swing.JLabel LblValidacionInicio;
    private javax.swing.JPanel PnlBase;
    private javax.swing.JPanel PnlIniciarSesion;
    private javax.swing.JPanel PnlRegistrarse;
    private javax.swing.JRadioButton RbtnSoyOperador;
    private javax.swing.JRadioButton RbtnSoyOperadorIniSesion;
    private javax.swing.JRadioButton RbtnSoySupervisor;
    private javax.swing.JRadioButton RbtnSoySupervisorIniSesion;
    private javax.swing.JTextField TxtApeReg;
    private javax.swing.JTextField TxtDniReg;
    private javax.swing.JTextField TxtEmailInicio;
    private javax.swing.JTextField TxtEmailReg;
    private javax.swing.JTextField TxtNomReg;
    private javax.swing.JPasswordField TxtPassInicio;
    private javax.swing.JPasswordField TxtPassReg;
    private javax.swing.JTextField TxtTelReg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
