/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.BaseDatos;
import data.Guia;
import data.Usuario;
import data.Visitante;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Harold Díaz
 */
public class OlvidasteTuContrasenha extends javax.swing.JFrame {

    /**
     * Creates new form OlvidasteTuContrasenha
     */
    
    private String nick;
    private String respuestaSeguridad;
    private String clave;
    private TreeMap <String, Usuario> listaUsuarios = new TreeMap <>();
    private TreeMap <String, Guia> listaGuias = new TreeMap <> ();
    private TreeMap <String, Visitante> listaVisitantes = new TreeMap <> ();
    
    public OlvidasteTuContrasenha() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrimeraMascota = new javax.swing.JTextField();
        contrasenha = new javax.swing.JPasswordField();
        labelFondo = new javax.swing.JLabel();

        setTitle("TrueCity");
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Recupera tu contraseña");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 220, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su nombre de usuario o nick");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 270, 25);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(20, 65, 250, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese su contraseña nueva");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 270, 25);

        botonAceptar.setBackground(new java.awt.Color(255, 102, 0));
        botonAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAceptar);
        botonAceptar.setBounds(300, 240, 77, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Cuál era el nombre de su primera mascota?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 105, 270, 25);

        txtPrimeraMascota.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrimeraMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimeraMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrimeraMascota);
        txtPrimeraMascota.setBounds(20, 130, 250, 30);

        contrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenhaActionPerformed(evt);
            }
        });
        getContentPane().add(contrasenha);
        contrasenha.setBounds(20, 195, 250, 30);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/miniFondo.jpeg"))); // NOI18N
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPrimeraMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimeraMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimeraMascotaActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
        listaUsuarios = BaseDatos.leerCSVUsuarios(listaUsuarios);
        nick = this.txtUsuario.getText();
        respuestaSeguridad = this.txtPrimeraMascota.getText();
        clave = String.valueOf(this.contrasenha.getPassword());
        if (!listaUsuarios.containsKey(nick)) {
            JOptionPane.showMessageDialog(rootPane, "Usuario no encontrado. Digite otra vez. ",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!respuestaSeguridad.equals(listaUsuarios.get(nick).getRespuestaSeguridad())) {
            JOptionPane.showMessageDialog(rootPane, "Su respuesta no coincide. Digite otra vez. ",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!(clave.length() > 0)) {
            JOptionPane.showMessageDialog(rootPane, "Su contraseña no puede ser vacía. Digite otra vez. ",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listaUsuarios.get(nick).setClave(clave);
            JOptionPane.showMessageDialog(rootPane, "Contraseña cambiada con éxito. Ingrese a la plataforma. ");
            BaseDatos.guardarUsuario(listaUsuarios.get(nick), listaUsuarios, listaGuias, listaVisitantes); //Aún guarda contraseñas viejas
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void contrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenhaActionPerformed

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
            java.util.logging.Logger.getLogger(OlvidasteTuContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OlvidasteTuContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OlvidasteTuContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OlvidasteTuContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlvidasteTuContrasenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JPasswordField contrasenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JTextField txtPrimeraMascota;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
