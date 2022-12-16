package Formularios;

import Desarrollo.EmpleadoGenerica;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class FormMenu extends javax.swing.JFrame {

    public FormMenu() {
        initComponents();
        FormComandas fc = new FormComandas();
        Escritorio.add(fc);
        fc.show();
        this.setLocationRelativeTo(null);
        EmpleadoGenerica.buscarPorEstado();
        switch (EmpleadoGenerica.getTipo()) {
            case 'O':
                this.LblConectado.setText( "Operador/a: " + EmpleadoGenerica.getNom());
                break;
            case 'S':
                this.LblConectado.setText("Supervisor/a: " + EmpleadoGenerica.getNom());
                break;    
        }
        
        this.setTitle("Orderffee");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/Imagenes/icon.png")));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        LblConectado = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(40, 40, 40));
        Escritorio.setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblConectado.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        LblConectado.setForeground(new java.awt.Color(51, 255, 51));
        LblConectado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(LblConectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1470, 40));

        Escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1497, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(0, 782, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuBar.setBackground(new java.awt.Color(40, 40, 40));
        menuBar.setBorder(null);
        menuBar.setForeground(new java.awt.Color(40, 40, 40));

        MenuArchivo.setBackground(new java.awt.Color(40, 40, 40));
        MenuArchivo.setBorder(null);
        MenuArchivo.setForeground(new java.awt.Color(255, 255, 255));
        MenuArchivo.setMnemonic('f');
        MenuArchivo.setText("Archivo");
        MenuArchivo.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(40, 40, 40));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Configuraciones");

        jMenuItem1.setBackground(new java.awt.Color(40, 40, 40));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(40, 40, 40));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        MenuArchivo.add(jMenu1);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMenuItem3);

        menuBar.add(MenuArchivo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormProductos frmOpe = new FormProductos();
        Escritorio.add(frmOpe);
        frmOpe.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormEmpleados fe = new FormEmpleados();
        Escritorio.add(fe);
        fe.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel LblConectado;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
