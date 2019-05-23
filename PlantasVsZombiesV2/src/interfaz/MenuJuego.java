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
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author eloy
 */
public class MenuJuego extends javax.swing.JFrame {

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
        jDialog1.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        jFrame1.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        jFrame2.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        this.setVisible(true);
        ImageIcon indice = new ImageIcon("src/img/indice.jpg");
        ImageIcon inicio = new ImageIcon(indice.getImage().getScaledInstance(menuJ.getWidth(), menuJ.getHeight(),Image.SCALE_DEFAULT));
        menuJ.setIcon(inicio);
        if(J.getPartidaNoFin()!= null)continuar.setVisible(true);
        else continuar.setVisible(false);

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
        
        continuar.setOpaque(false);
        continuar.setContentAreaFilled(false);
        continuar.setBorderPainted(false);
        
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
        jFrame1 = new javax.swing.JFrame();
        fc = new javax.swing.JFileChooser();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        clasificacion = new javax.swing.JTable();
        CambiarUsuario = new javax.swing.JButton();
        Clasificacion = new javax.swing.JButton();
        NuevoJ = new javax.swing.JButton();
        NuevoDoc = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
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

        fc.setMaximumSize(new java.awt.Dimension(513, 424));
        fc.setMinimumSize(new java.awt.Dimension(513, 424));
        fc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame2.setMinimumSize(new java.awt.Dimension(911, 616));

        clasificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        clasificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clasificacionMouseClicked(evt);
            }
        });
        clasificacion.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                clasificacionInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1078, 744));
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
        CambiarUsuario.setBounds(550, 350, 370, 82);

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
        NuevoDoc.setBounds(550, 440, 340, 70);

        continuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/continuar.png"))); // NOI18N
        continuar.setFocusable(false);
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        getContentPane().add(continuar);
        continuar.setBounds(760, 590, 110, 50);
        getContentPane().add(menuJ);
        menuJ.setBounds(0, 10, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarUsuarioActionPerformed
        new MenuInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CambiarUsuarioActionPerformed

    private void ClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClasificacionActionPerformed
        Clasificacion tblC;
        try {
            tblC = new Clasificacion();
            tblC.setLocationRelativeTo(this);
            tblC.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_ClasificacionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        juego.getComandos().nuevaPartida(juego, "BAJA", 9, 5);
        try {
            JuegoI ij = new JuegoI(juego);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
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
        this.dispose();
        jDialog1.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        juego.getComandos().nuevaPartida(juego, "IMPOSIBLE", 9, 5);
        try {
            JuegoI ij = new JuegoI(juego);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        jDialog1.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void NuevoJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoJActionPerformed
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);


     
    }//GEN-LAST:event_NuevoJActionPerformed

    private void NuevoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoDocActionPerformed
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "txt");
        fc.setFileFilter(filtro);
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("*.doc", "doc");
        fc.setFileFilter(filtro2);
        fc.setSelectedFile(new File("Datos_Jugador"));
        int seleccion = fc.showOpenDialog(jFrame1);
        
        if(seleccion==JFileChooser.APPROVE_OPTION){
            File fichero = fc.getSelectedFile();
            
            Jugador j = juego.getJugador();
            String ruta = fichero.getAbsolutePath();
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
        }
        
    }//GEN-LAST:event_NuevoDocActionPerformed
    
    
    private void fcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcActionPerformed
        
    }//GEN-LAST:event_fcActionPerformed

    private void clasificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clasificacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clasificacionMouseClicked

    private void clasificacionInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_clasificacionInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_clasificacionInputMethodTextChanged

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        juego.setPartida(juego.getJugador().getPartidaNoFin());
        try {
            JuegoI ij = new JuegoI(juego);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_continuarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarUsuario;
    private javax.swing.JButton Clasificacion;
    private javax.swing.JButton NuevoDoc;
    private javax.swing.JButton NuevoJ;
    private javax.swing.JTable clasificacion;
    private javax.swing.JButton continuar;
    private javax.swing.JFileChooser fc;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menuJ;
    // End of variables declaration//GEN-END:variables
}
