/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Excepciones.ExcepcionJuego;
import Juego.Juego;
import Juego.Jugador;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author eloy
 */
public class MenuJuego extends javax.swing.JFrame {

    private Jugador j;
    private Juego juego;
    
    /**
     * Creates new form MenuJuego
     */
    public MenuJuego(Jugador J) {
        initComponents();
        botonesTransparentes();
        
        juego = new Juego(new Comandos(),new ExcepcionJuego()); 
        juego.setJugador(J);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        this.setVisible(true);
        ImageIcon indice = new ImageIcon("src/img/indice.jpg");
        ImageIcon inicio = new ImageIcon(indice.getImage().getScaledInstance(menuJ.getWidth(), menuJ.getHeight(),Image.SCALE_DEFAULT));
        menuJ.setIcon(inicio);

    }
    public void botonesTransparentes(){
        NuevoJ.setOpaque(false);
        NuevoJ.setContentAreaFilled(false);
        NuevoJ.setBorderPainted(false);
        
        Clasificacion.setOpaque(false);
        Clasificacion.setContentAreaFilled(false);
        Clasificacion.setBorderPainted(false);
        
        CambiarUsuario.setOpaque(false);
        CambiarUsuario.setContentAreaFilled(false);
        CambiarUsuario.setBorderPainted(false);
        
        NuevoDoc.setOpaque(false);
        NuevoDoc.setContentAreaFilled(false);
        NuevoDoc.setBorderPainted(false);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        CambiarUsuario = new javax.swing.JButton();
        Clasificacion = new javax.swing.JButton();
        NuevoJ = new javax.swing.JButton();
        NuevoDoc = new javax.swing.JButton();
        menuJ = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(601, 193));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 24)); // NOI18N
        jLabel1.setText("ELIGE TU DIFICULDAD");

        jButton3.setText("FACIL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("MEDIA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ALTA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("IMPOSIBLE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(50, 50, 50))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        CambiarUsuario.setBackground(new java.awt.Color(14, 113, 236));
        CambiarUsuario.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 36)); // NOI18N
        CambiarUsuario.setForeground(new java.awt.Color(254, 254, 254));
        CambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CambiarUsuario);
        CambiarUsuario.setBounds(530, 350, 370, 82);

        Clasificacion.setBackground(new java.awt.Color(14, 113, 236));
        Clasificacion.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 36)); // NOI18N
        Clasificacion.setForeground(new java.awt.Color(254, 254, 254));
        Clasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClasificacionActionPerformed(evt);
            }
        });
        getContentPane().add(Clasificacion);
        Clasificacion.setBounds(520, 260, 410, 82);

        NuevoJ.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 36)); // NOI18N
        NuevoJ.setForeground(new java.awt.Color(254, 254, 254));
        NuevoJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoJActionPerformed(evt);
            }
        });
        getContentPane().add(NuevoJ);
        NuevoJ.setBounds(530, 130, 410, 100);

        NuevoDoc.setBackground(new java.awt.Color(14, 113, 236));
        NuevoDoc.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 36)); // NOI18N
        NuevoDoc.setForeground(new java.awt.Color(254, 254, 254));
        NuevoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoDocActionPerformed(evt);
            }
        });
        getContentPane().add(NuevoDoc);
        NuevoDoc.setBounds(550, 440, 340, 82);
        getContentPane().add(menuJ);
        menuJ.setBounds(-30, 10, 1090, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarUsuarioActionPerformed
        new MenuInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CambiarUsuarioActionPerformed

    private void ClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClasificacionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        juego.getComandos().nuevaPartida(juego, "BAJA", 9, 5);
        try {
            JuegoI ij = new JuegoI(juego);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        jDialog1.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        juego.getComandos().nuevaPartida(juego, "MEDIA", 9, 5);
        try {
            JuegoI ij = new JuegoI(juego);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        jDialog1.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        juego.getComandos().nuevaPartida(juego, "ALTA", 9, 5);
        try {
            JuegoI ij = new JuegoI(juego);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        jDialog1.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        juego.getComandos().nuevaPartida(juego, "IMPOSIBLE", 9, 5);
        try {
            JuegoI ij = new JuegoI(juego);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        jDialog1.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void NuevoJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoJActionPerformed
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);


     
    }//GEN-LAST:event_NuevoJActionPerformed

    private void NuevoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoDocActionPerformed
        Jugador j = juego.getJugador();
        String ruta = "/home/eloy/Documentos/datos_jugador.txt";
        File datosJugador = new File(ruta);
        BufferedWriter bw;
        
        
        
        try {
            bw = new BufferedWriter(new FileWriter(datosJugador));
            bw.write("Nombre: "+ j.getNombre());
            bw.newLine();
            bw.write("DNI: "+ j.getDNI());
            bw.newLine();
            bw.write("Partidas jugadas: "+ j.getPartidasJugadas());
            bw.newLine();
            bw.write("Partidas ganadas: "+ j.getPartidasGanadas());
            bw.newLine();
            bw.write("Partidas perdidas: "+ j.getPartidasPerdidas());
            bw.newLine();
            bw.write("Puntos totales en dificultad baja: "+ j.getPuntosTotales()[0]);
            bw.newLine();
            bw.write("Puntos totales en dificultad media: "+ j.getPuntosTotales()[1]);
            bw.newLine();
            bw.write("Puntos totales en dificultad dificil: "+ j.getPuntosTotales()[2]);
            bw.newLine();
            bw.write("Puntos totales en dificultad imposible: "+ j.getPuntosTotales()[3]);
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_NuevoDocActionPerformed

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
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuJuego(new Jugador("nombre","dni")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarUsuario;
    private javax.swing.JButton Clasificacion;
    private javax.swing.JButton NuevoDoc;
    private javax.swing.JButton NuevoJ;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel menuJ;
    // End of variables declaration//GEN-END:variables
}
