
package Ventanas;


public class pantallaprincipal extends javax.swing.JFrame {


    public pantallaprincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnServicios = new javax.swing.JButton();
        btnTratamientos = new javax.swing.JButton();
        btnEspecialista = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnExpedienteClinico = new javax.swing.JButton();
        btnRealizarConsulta = new javax.swing.JButton();
        btnReservarCitas = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnServicios.setBackground(java.awt.SystemColor.activeCaption);
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/72_Servicios.png"))); // NOI18N
        btnServicios.setText("Servicios");
        btnServicios.setFocusable(false);
        btnServicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnServicios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

        btnTratamientos.setBackground(java.awt.SystemColor.activeCaption);
        btnTratamientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/72_Tratamientos.png"))); // NOI18N
        btnTratamientos.setText("Tratamientos");
        btnTratamientos.setFocusable(false);
        btnTratamientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTratamientos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTratamientosActionPerformed(evt);
            }
        });

        btnEspecialista.setBackground(java.awt.SystemColor.activeCaption);
        btnEspecialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/72_Especialista.png"))); // NOI18N
        btnEspecialista.setText("Especialista");
        btnEspecialista.setFocusable(false);
        btnEspecialista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecialistaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(java.awt.SystemColor.activeCaption);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/72_Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnExpedienteClinico.setBackground(java.awt.SystemColor.activeCaption);
        btnExpedienteClinico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/72_expedienteClinico.png"))); // NOI18N
        btnExpedienteClinico.setText("Expediente Clinico");
        btnExpedienteClinico.setFocusable(false);
        btnExpedienteClinico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExpedienteClinico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExpedienteClinico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpedienteClinicoActionPerformed(evt);
            }
        });

        btnRealizarConsulta.setBackground(java.awt.SystemColor.activeCaption);
        btnRealizarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/72_Citas2.png"))); // NOI18N
        btnRealizarConsulta.setText("Consultas");
        btnRealizarConsulta.setFocusable(false);
        btnRealizarConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRealizarConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRealizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarConsultaActionPerformed(evt);
            }
        });

        btnReservarCitas.setBackground(java.awt.SystemColor.activeCaption);
        btnReservarCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/72_consulta_dental.png"))); // NOI18N
        btnReservarCitas.setText("Reservar Citas");
        btnReservarCitas.setFocusable(false);
        btnReservarCitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReservarCitas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReservarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarCitasActionPerformed(evt);
            }
        });

        btnPacientes.setBackground(java.awt.SystemColor.activeCaption);
        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/72_Pacientes.png"))); // NOI18N
        btnPacientes.setText("Pacientes");
        btnPacientes.setBorder(null);
        btnPacientes.setFocusable(false);
        btnPacientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPacientes.setRolloverEnabled(false);
        btnPacientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReservarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRealizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExpedienteClinico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTratamientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEspecialista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExpedienteClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTratamientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEspecialista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        jMenu1.setText("Pacientes");

        jMenuItem1.setText("Agregar/ Modificar");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Citas");

        jMenuItem2.setText("Gestionar Citas");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Reservar Citas");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Medicamentos");

        jMenu6.setText("Medicinas");

        jMenuItem4.setText("Agregar / Modificar");
        jMenu6.add(jMenuItem4);

        jMenu3.add(jMenu6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        jMenuItem5.setText("Pacientes");
        jMenu4.add(jMenuItem5);

        jMenuItem8.setText("Citas Medicas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Especialistas");
        jMenu4.add(jMenuItem9);

        jMenuItem7.setText("Tratamientos");
        jMenu4.add(jMenuItem7);

        jMenuItem6.setText("Servicios");
        jMenu4.add(jMenuItem6);

        jMenuItem10.setText("Medicamentos");
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 387, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
     

    }//GEN-LAST:event_btnPacientesActionPerformed

    private void btnReservarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarCitasActionPerformed

    }//GEN-LAST:event_btnReservarCitasActionPerformed

    private void btnRealizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarConsultaActionPerformed

    }//GEN-LAST:event_btnRealizarConsultaActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed

    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnTratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTratamientosActionPerformed

    }//GEN-LAST:event_btnTratamientosActionPerformed

    private void btnEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecialistaActionPerformed

    }//GEN-LAST:event_btnEspecialistaActionPerformed

    private void btnExpedienteClinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpedienteClinicoActionPerformed


    }//GEN-LAST:event_btnExpedienteClinicoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      

    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEspecialista;
    private javax.swing.JButton btnExpedienteClinico;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnRealizarConsulta;
    private javax.swing.JButton btnReservarCitas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnTratamientos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
