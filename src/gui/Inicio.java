/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Usuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.Date;
import java.util.TreeMap;
import com.toedter.calendar.*;
import data.BaseDatos;
import data.Guia;
import data.Visitante;

/**
 *
 * @author Harold Díaz
 * Karl Weierstrass — 'When I wrote this, only God and I understood what I was doing. Now, God only knows.'
 */
public class Inicio extends javax.swing.JFrame {
    static TreeMap <String, Usuario> listaUsuarios = new TreeMap <>();
    static TreeMap <String, Guia> listaGuias = new TreeMap <> ();
    static TreeMap <String, Visitante> listaVisitantes = new TreeMap <> ();
    private String nombre;
    private String apellido;
    private String nick;
    private String email;
    private String clave;
    private String ciudad;
    private String genero;
    private Date fechaNacimiento = null;
    private String respuestaSeguridad;
    static Guia guia;
    static Visitante visitanteNuevo;
    static Visitante visitante;
    static boolean usuarioNuevo;

    public Inicio() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        /*
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/sources/img/fondo.PNG"));
        uno = new ImageIcon(uno.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        labelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        contrasenhaUsuarioNuevo = new javax.swing.JPasswordField();
        botonAceptar = new javax.swing.JButton();
        labelOlvidasteContrasenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelContrasenha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNuevoUsuario = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contrasenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        radioMasculino = new javax.swing.JRadioButton();
        radioFemenino = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPrimeraMascota = new javax.swing.JTextField();
        botonCrearUsuario = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrueCity");
        setName("frame1\n"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(490, 360, 260, 30);

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuario.setText("Usuario");
        getContentPane().add(labelUsuario);
        labelUsuario.setBounds(300, 30, 50, 25);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(350, 30, 120, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Pregunta de seguridad");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(370, 438, 260, 25);

        contrasenhaUsuarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenhaUsuarioNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(contrasenhaUsuarioNuevo);
        contrasenhaUsuarioNuevo.setBounds(370, 280, 180, 30);

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
        botonAceptar.setBounds(690, 30, 77, 30);

        labelOlvidasteContrasenha.setForeground(new java.awt.Color(255, 255, 255));
        labelOlvidasteContrasenha.setText("¿Olvidaste tu contraseña?");
        labelOlvidasteContrasenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelOlvidasteContrasenhaMousePressed(evt);
            }
        });
        getContentPane().add(labelOlvidasteContrasenha);
        labelOlvidasteContrasenha.setBounds(560, 65, 170, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Apellido");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(634, 140, 70, 14);

        labelContrasenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelContrasenha.setText("Contraseña");
        getContentPane().add(labelContrasenha);
        labelContrasenha.setBounds(480, 30, 70, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("E-mail");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 200, 100, 14);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(370, 160, 180, 30);

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido);
        txtApellido.setBounds(570, 160, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Ciudad de origen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(610, 260, 140, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Usuario (nick)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 200, 100, 14);

        txtNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNuevoUsuario);
        txtNuevoUsuario.setBounds(370, 220, 180, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(570, 220, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 140, 70, 14);

        contrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenhaActionPerformed(evt);
            }
        });
        getContentPane().add(contrasenha);
        contrasenha.setBounds(560, 30, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 260, 90, 14);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Cali", "Cartagena", "Manizales", "Medellín" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(570, 280, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Género");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(390, 325, 130, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(560, 325, 130, 14);

        buttonGroup1.add(radioMasculino);
        radioMasculino.setText("Masculino");
        radioMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(radioMasculino);
        radioMasculino.setBounds(370, 350, 90, 23);

        buttonGroup1.add(radioFemenino);
        radioFemenino.setText("Femenino");
        radioFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemeninoActionPerformed(evt);
            }
        });
        getContentPane().add(radioFemenino);
        radioFemenino.setBounds(370, 378, 90, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Registrarse");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(524, 100, 70, 25);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("¿Cuál fue el nombre de su primera mascota?");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(370, 475, 300, 14);

        txtPrimeraMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimeraMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrimeraMascota);
        txtPrimeraMascota.setBounds(370, 500, 240, 30);

        botonCrearUsuario.setBackground(new java.awt.Color(255, 102, 0));
        botonCrearUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearUsuario.setText("Crear Usuario");
        botonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrearUsuario);
        botonCrearUsuario.setBounds(630, 500, 120, 30);

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/logo.jpeg"))); // NOI18N
        getContentPane().add(labelLogo);
        labelLogo.setBounds(20, 20, 120, 120);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/fondo.jpeg"))); // NOI18N
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contrasenhaUsuarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenhaUsuarioNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenhaUsuarioNuevoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoUsuarioActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void contrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenhaActionPerformed

    private void radioMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMasculinoActionPerformed

    private void radioFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemeninoActionPerformed

    private void txtPrimeraMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimeraMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimeraMascotaActionPerformed

    private void botonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearUsuarioActionPerformed
        // TODO add your handling code here:
        listaUsuarios = BaseDatos.leerCSVUsuarios(listaUsuarios);
        listaGuias = BaseDatos.leerCSVGuias(listaUsuarios, listaGuias);
        
        listaVisitantes = Inicio.crearVisitantes(listaUsuarios);
        
        Date fecha = jDateChooser1.getDate();
        nombre = this.txtNombre.getText();
        apellido = this.txtApellido.getText();
        nick = this.txtNuevoUsuario.getText();
        clave = String.valueOf(this.contrasenhaUsuarioNuevo.getPassword());
        email = this.txtEmail.getText();
        ciudad = (String) this.jComboBox1.getSelectedItem();
        if (this.radioFemenino.isSelected()) {
            genero = this.radioFemenino.getText();
        } else {
            genero = this.radioMasculino.getText();
        }
        fechaNacimiento = fecha;
        respuestaSeguridad = this.txtPrimeraMascota.getText();
        
        if (listaUsuarios.containsKey(nick)) {
            JOptionPane.showMessageDialog(rootPane, "Este nick ya fue utilizado. Por favor ingresa otro",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!(nombre.length() > 0 && apellido.length() > 0 && nick.length() > 0 && email.length() > 0 
                && clave.length() > 0 && ciudad.length() > 0 && respuestaSeguridad.length() > 0 && fecha != null)) {
            JOptionPane.showMessageDialog(rootPane, "No puede dejar campos en blanco. Intenta de nuevo",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (email.length() <= 0 || email.indexOf('@') <= 1 || email.indexOf('.') <= 1 
                || email.endsWith("@") || email.endsWith(".") || email.endsWith(".@") || email.endsWith("@.")) {
            JOptionPane.showMessageDialog(rootPane, "Email inválido. Intenta de nuevo",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (nombre.contains(";") || apellido.contains(";") || nick.contains(";") || clave.contains(";") 
                || email.contains(";") || respuestaSeguridad.contains(";")) {
            JOptionPane.showMessageDialog(rootPane, "No ingreses caracteres inválidos. Intenta de nuevo",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Usuario usuario = new Usuario(nombre, apellido, nick, email, clave, ciudad, genero, fechaNacimiento, respuestaSeguridad);
            BaseDatos.guardarUsuario(usuario, listaUsuarios);
            guia = new Guia (usuario.getNombre(), usuario.getApellido(), usuario.getNick(), usuario.getEmail(), usuario.getClave(), usuario.getCiudad(), usuario.getGenero(), usuario.getFechaNacimiento(), usuario.getRespuestaSeguridad());
            visitanteNuevo = new Visitante (usuario.getNombre(), usuario.getApellido(), usuario.getNick(), usuario.getEmail(), usuario.getClave(), usuario.getCiudad(), usuario.getGenero(), usuario.getFechaNacimiento(), usuario.getRespuestaSeguridad());
            usuarioNuevo = true;
            //BaseDatos.guardarGuias(guiaNuevo, listaGuias);
            //listaVisitantes.put(visitanteNuevo.getNick(), visitanteNuevo);
            //BaseDatos.guardarGuias(guiaNuevo, listaGuias);
            JOptionPane.showMessageDialog(rootPane, "Usuario creado con éxito");
            CrearPerfil a = new CrearPerfil();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonCrearUsuarioActionPerformed

    private void labelOlvidasteContrasenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidasteContrasenhaMousePressed
        // TODO add your handling code here:
        OlvidasteTuContrasenha a = new OlvidasteTuContrasenha ();
        a.setVisible(true);
    }//GEN-LAST:event_labelOlvidasteContrasenhaMousePressed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
        listaUsuarios = BaseDatos.leerCSVUsuarios(listaUsuarios);
        listaGuias = BaseDatos.leerCSVGuias(listaUsuarios, listaGuias);
        listaVisitantes = BaseDatos.leerCSVInteresesVisitantes(listaUsuarios, listaVisitantes);
        if (!listaUsuarios.containsKey(txtUsuario.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Usuario no encontrado. Digite otra vez o regístrese",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!(String.valueOf(contrasenha.getPassword()).equals(listaUsuarios.get(txtUsuario.getText()).getClave()))) {
            JOptionPane.showMessageDialog(rootPane, "Contraseña incorrecta. Digite otra vez o cambie su contraseña",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            usuarioNuevo = false;
            visitante = listaVisitantes.get(txtUsuario.getText());
            //VentanaUsuario a = new VentanaUsuario ();
            //a.setVisible(true);
            guia = listaGuias.get(txtUsuario.getText());
            Bienvenido a = new Bienvenido ();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    
    /*
    static TreeMap <String, Guia> crearGuias (TreeMap <String, Usuario> listaUsuarios) {
        TreeMap <String, Guia> listaGuias = new TreeMap <> ();
        for (Usuario usuario : listaUsuarios.values()) {
            Guia guia;
            guia = new Guia (usuario.getNombre(), usuario.getApellido(), usuario.getNick(), usuario.getEmail(), usuario.getClave(), usuario.getCiudad(), usuario.getGenero(), usuario.getFechaNacimiento(), usuario.getRespuestaSeguridad());
            listaGuias.put(guia.getNick(), guia);
        }
        return listaGuias;
    }*/
    
    static TreeMap <String, Visitante> crearVisitantes (TreeMap <String, Usuario> listaUsuarios) {
        TreeMap <String, Visitante> listaVisitantes = new TreeMap <> ();
        for (Usuario usuario : listaUsuarios.values()) {
            Visitante visitante;
            visitante = new Visitante (usuario.getNombre(), usuario.getApellido(), usuario.getNick(), usuario.getEmail(), usuario.getClave(), usuario.getCiudad(), usuario.getGenero(), usuario.getFechaNacimiento(), usuario.getRespuestaSeguridad());
            listaVisitantes.put(visitante.getNick(), visitante);
        }
        return listaVisitantes;
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCrearUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField contrasenha;
    private javax.swing.JPasswordField contrasenhaUsuarioNuevo;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelContrasenha;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelOlvidasteContrasenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JRadioButton radioFemenino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNuevoUsuario;
    private javax.swing.JTextField txtPrimeraMascota;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    
}
