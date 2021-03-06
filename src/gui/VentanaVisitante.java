/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Guia;
import data.Visitante;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harold Díaz
 * Karl Weierstrass — 'When I wrote this, only God and I understood what I was doing. Now, God only knows.'
 */
public class VentanaVisitante extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVisitante
     */
    private DefaultTableModel modelo;
    static Visitante visitante;
    private Date fechaObtenida;
    //static ArrayList <Visitante> visitantesInteresados = new ArrayList <> ();
    //private Calendar fechaYHora;
    private String destino;
    private String tipoTour;
    private int duracionTour;
    
    public VentanaVisitante() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //cargarGuiasDisponibles(visitante);
        //spinnerFechaYHora.setModel(new SpinnerDateModel());
        //spinnerFechaYHora.setEditor(new JSpinner.DateEditor(spinnerFechaYHora, "dd/MM/yyyy"));

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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spinnerFechaYHora = new javax.swing.JSpinner();
        comboBoxTipoTour = new javax.swing.JComboBox<>();
        comboBoxDestino = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        spinnerHoraTour = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrueCity");
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Programar un viaje es muy fácil");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 40, 490, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Selecciona tu destino");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 160, 173, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("¿Cuántas horas quieres que dure el tour?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 250, 290, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Puedes ponerte en contacto con los siguientes usuarios para el tour");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 340, 580, 30);

        spinnerFechaYHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinnerFechaYHora.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.DAY_OF_MONTH));
        getContentPane().add(spinnerFechaYHora);
        spinnerFechaYHora.setBounds(80, 190, 260, 30);

        comboBoxTipoTour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboBoxTipoTour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comercial", "Cultural", "Ecológico", "Gastronómico", "Histórico", "Urbano" }));
        comboBoxTipoTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoTourActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxTipoTour);
        comboBoxTipoTour.setBounds(80, 290, 260, 30);

        comboBoxDestino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboBoxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Cali", "Cartagena", "Manizales", "Medellín" }));
        comboBoxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxDestino);
        comboBoxDestino.setBounds(470, 190, 260, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Elige una fecha y una hora para tu tour");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 160, 320, 30);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 370, 670, 130);

        botonBuscar.setBackground(new java.awt.Color(255, 102, 0));
        botonBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar);
        botonBuscar.setBounds(630, 300, 100, 30);

        spinnerHoraTour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinnerHoraTour.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));
        getContentPane().add(spinnerHoraTour);
        spinnerHoraTour.setBounds(680, 250, 50, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("¿Qué tipo de tour quieres realizar?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 250, 290, 30);

        botonVolver.setBackground(new java.awt.Color(51, 153, 255));
        botonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botonVolver);
        botonVolver.setBounds(30, 530, 100, 30);

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/logo.jpeg"))); // NOI18N
        getContentPane().add(labelLogo);
        labelLogo.setBounds(20, 20, 120, 120);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/ventanaUsuario.jpeg"))); // NOI18N
        getContentPane().add(labelFondo);
        labelFondo.setBounds(-200, -70, 1220, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDestinoActionPerformed

    private void comboBoxTipoTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoTourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTipoTourActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        if (Inicio.usuarioNuevo) {
            visitante = CrearPerfil.visitante;
            fechaObtenida = (Date) spinnerFechaYHora.getValue();
            //fechaObtenida = jDateChooser1.getDate();
            //fechaYHoraObtenidas = (Date) spinnerFechaYHora.getValue();
            Calendar cal = new GregorianCalendar();
            cal.setTime(fechaObtenida);
            //fechaYHoraObtenidas = jDateChooser1.getDate();
            //fechaObtenida.setHours((Integer) spinnerHoraDia.getValue());
            //System.out.println(fechaObtenida.toString());
            //fechaYHora = VentanaVisitante.convertirDateACalendar(fechaYHoraObtenidas);
            destino = (String) this.comboBoxDestino.getSelectedItem();
            tipoTour = (String) this.comboBoxTipoTour.getSelectedItem();
            duracionTour = (Integer) spinnerHoraTour.getValue();
            
            visitante.setFechaTour(cal);
            visitante.setDuracionMaxTour(duracionTour);
            visitante.setDestino(destino);
            cargarGuiasDisponibles(tipoTour);
        } else {
            visitante = Inicio.visitante;
            fechaObtenida = (Date) spinnerFechaYHora.getValue();
            //fechaObtenida = jDateChooser1.getDate();
            //fechaYHoraObtenidas = (Date) spinnerFechaYHora.getValue();
            Calendar cal = new GregorianCalendar();
            cal.setTime(fechaObtenida);
            //fechaYHoraObtenidas = jDateChooser1.getDate();
            //fechaObtenida.setHours((Integer) spinnerHoraDia.getValue());
            //System.out.println(fechaObtenida.toString());
            //fechaYHora = VentanaVisitante.convertirDateACalendar(fechaYHoraObtenidas);
            destino = (String) this.comboBoxDestino.getSelectedItem();
            tipoTour = (String) this.comboBoxTipoTour.getSelectedItem();
            duracionTour = (Integer) spinnerHoraTour.getValue();
            
            visitante.setFechaTour(cal);
            visitante.setDuracionMaxTour(duracionTour);
            visitante.setDestino(destino);
            cargarGuiasDisponibles(tipoTour);
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        Bienvenido a = new Bienvenido ();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed
    
    private void cargarGuiasDisponibles (String tipoTour) {
        String[] titulos = {"Nombre completo", "Nickname", "Género", "Número de teléfono"};
        String[] registro = new String[4];
        modelo = new DefaultTableModel(null, titulos);
        for (Guia guia : Inicio.listaGuias.values()) {
            if(guia.getCiudad().equals(visitante.getDestino()) && tipoTour.equals(guia.getTipoGuia())) {
                //visitantesInteresados = guia.getVisitantesInteresados();
                //guia.setVisitantesInteresados(visitantesInteresados);
                //guia.getVisitantesInteresados().add(visitante);
                registro[0] = guia.getNombre().concat(" " + guia.getApellido());
                registro[1] = guia.getNick();
                registro[2] = guia.getGenero();
                registro[3] = guia.getNumCelular();
                modelo.addRow(registro);
            }
        }
        tabla.setModel(modelo);
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
            java.util.logging.Logger.getLogger(VentanaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVisitante().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> comboBoxDestino;
    private javax.swing.JComboBox<String> comboBoxTipoTour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JSpinner spinnerFechaYHora;
    private javax.swing.JSpinner spinnerHoraTour;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables



}
