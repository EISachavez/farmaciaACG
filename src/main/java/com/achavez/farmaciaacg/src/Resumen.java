/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.achavez.farmaciaacg.src;

import com.achavez.farmaciaacg.dto.PedidoDTO;
import javax.swing.ImageIcon;

/**
 *
 * @author delph
 */
public class Resumen extends javax.swing.JFrame {

    /**
     * Creates new form Resumen
     */
    public Resumen() {
        initComponents();
        //this.setIconImage(new ImageIcon(getClass().getResource("../resources/images/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbInicial = new javax.swing.JLabel();
        lbDirPrincipal = new javax.swing.JLabel();
        lbDirSecundaria = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resumen del pedido");
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(941, 360));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(44, 62, 80));
        Background.setPreferredSize(new java.awt.Dimension(941, 360));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(159, 225, 1));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Pedido al distribuidor ");

        lbInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbInicial.setForeground(new java.awt.Color(255, 255, 255));
        lbInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInicial.setText("X unidades del T M");

        lbDirPrincipal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDirPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lbDirPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDirPrincipal.setText("principal");

        lbDirSecundaria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDirSecundaria.setForeground(new java.awt.Color(255, 255, 255));
        lbDirSecundaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDirSecundaria.setText("secundaria");

        btnCancelar.setBackground(new java.awt.Color(79, 43, 43));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 37, 2));
        btnCancelar.setText("Cancelar pedido");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(43, 79, 43));
        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Enviar pedido");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDirPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbDirSecundaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 299, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbInicial)
                .addGap(34, 34, 34)
                .addComponent(lbDirPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDirSecundaria)
                .addGap(28, 28, 28)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 370));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        HistoricoPedidos hPedidos = new HistoricoPedidos();
        hPedidos.almacenarPedido(pedido);
        System.out.println("Pedido enviado con las siguientes caracteristicas: ");
        this.pedido.pedidoToString();        
        this.dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public void setPedido(PedidoDTO pedido){
        this.pedido = pedido;
        lbTitulo.setText("Pedido al distribuidor " + pedido.getDistribuidor());
        lbInicial.setText(pedido.getCantidadMedicamento() + " unidades del " + pedido.getTipoMedicamento() + " " + pedido.getNombreMedicamento());
        if(pedido.getSucursalPrincipal() != null && pedido.getSucursalSecundaria() != null){
            lbDirPrincipal.setText("Para la farmacia situada en " + pedido.getSucursalPrincipal());
            lbDirSecundaria.setText("y para la situada en " + pedido.getSucursalSecundaria());
        } else if(pedido.getSucursalPrincipal() != null && pedido.getSucursalSecundaria() == null){
            lbDirPrincipal.setText("Para la farmacia situada en " + pedido.getSucursalPrincipal());
            lbDirSecundaria.setText("");
        } else if(pedido.getSucursalPrincipal() == null && pedido.getSucursalSecundaria() != null){
            lbDirPrincipal.setText("Para la farmacia situada en " + pedido.getSucursalSecundaria());
            lbDirSecundaria.setText("");
        } 
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resumen().setVisible(true);
            }
        });
    }
    
    private PedidoDTO pedido = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lbDirPrincipal;
    private javax.swing.JLabel lbDirSecundaria;
    private javax.swing.JLabel lbInicial;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
