
package interfaz;

import Juego.Juego;
import Juego.LecturaEscritura;
import Juego.Tablero;
import Personajes.*;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase-interfaz JuegoI controlará todo lo necesario para jugar una partida.
*/
public class JuegoI extends javax.swing.JFrame {

    /** Atributo que pertmite jugar una partida. */
    private Juego juego;
    /** Atributo que creará un tablero en interfaz.*/
    private JLabel[][] tableroI;
    /** Atributo que permite leer los datos del jugador.*/
    private LecturaEscritura le;
    
    /** Constructor de JuegoI
     * @param j partida en curso
     * @throws java.io.FileNotFoundException señala que un intento de abrir el archivo
        * indicado por un nombre de ruta especificado ha fallado.
     * @throws java.lang.ClassNotFoundException se lanza cuando una aplicación intenta cargar en una clase a través de su 
         * nombre de cadena usando ciertos métodos de los cuales no se puede encontrar una para la clase con el nombre especificado.
     */
    public JuegoI(Juego j) throws IOException, FileNotFoundException, ClassNotFoundException {
        juego = j;
        tableroI = new JLabel[5][9];
        le= new LecturaEscritura();
        le.leerDatos();
        juego.setTotalEnemigos(juego.getPartida().getEnemigosAparecidos());
        
        initComponents();
        botonesTransparentes();
        actualizarCasillas();
        progreso();
        
        progres.setMaximum(juego.getPartida().getEnemigos());
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        ayuda.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        normas.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        perdio.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        gano.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        salir.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        salirGuardar.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        
        ImageIcon sol = new ImageIcon("src/img/sol.png");
        ImageIcon imagen = new ImageIcon(sol.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(imagen);
        
        ImageIcon mano = new ImageIcon("src/img/mano.png");
        ImageIcon zombie = new ImageIcon(mano.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(),Image.SCALE_DEFAULT));
        jLabel23.setIcon(zombie);
        
        ImageIcon gano = new ImageIcon("src/img/dialogo.jpg");
        ImageIcon Gano = new ImageIcon(gano.getImage().getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(),Image.SCALE_DEFAULT));
        jLabel24.setIcon(Gano);
        
        ImageIcon perdio = new ImageIcon("src/img/dialogo.jpg");
        ImageIcon Perdio = new ImageIcon(perdio.getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(),Image.SCALE_DEFAULT));
        jLabel25.setIcon(Perdio);
        
        ImageIcon ayuda = new ImageIcon("src/img/blank.jpg");
        ImageIcon Ayuda = new ImageIcon(ayuda.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(),Image.SCALE_DEFAULT));
        jLabel27.setIcon(Ayuda);
        
        ImageIcon normas = new ImageIcon("src/img/blank.jpg");
        ImageIcon Normas = new ImageIcon(normas.getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(),Image.SCALE_DEFAULT));
        jLabel28.setIcon(Normas);
        
        ImageIcon gs = new ImageIcon("src/img/dialogo3.jpg");
        ImageIcon GS = new ImageIcon(gs.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(),Image.SCALE_DEFAULT));
        jLabel32.setIcon(GS);
        
        ImageIcon salir = new ImageIcon("src/img/dialogo4.jpg");
        ImageIcon Salir = new ImageIcon(salir.getImage().getScaledInstance(jLabel34.getWidth(), jLabel34.getHeight(),Image.SCALE_DEFAULT));
        jLabel34.setIcon(Salir);
       
        ImageIcon tablero = new ImageIcon("src/img/tablero.jpg");
        ImageIcon cesped = new ImageIcon(tablero.getImage().getScaledInstance(tableroJ.getWidth(), tableroJ.getHeight(),Image.SCALE_DEFAULT));
        tableroJ.setIcon(cesped);
        
        jLabel3.setText(Integer.toString(juego.getPartida().getTurno()));
        jLabel2.setText(Integer.toString(juego.getPartida().getSoles()));
        juego.setTurnosTotales(juego.getPartida().getTurnoInicial()+30);
        
        
    }
    
    /** Método que permitirá poner los botones de la interfaz transparentes.
     */
    public void botonesTransparentes(){
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setBorderPainted(false);
        
        jButton6.setOpaque(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setBorderPainted(false);
        
        jButton8.setOpaque(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setBorderPainted(false);
        
        jButton9.setOpaque(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setBorderPainted(false);
        
        jButton10.setOpaque(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setBorderPainted(false);
        
        jButton11.setOpaque(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setBorderPainted(false);
        
        jButton12.setOpaque(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setBorderPainted(false);
        
        
        
    }
    /** Método que permitirá rellenar las casillas del tablero mediante coordenadas.
     */
    public void rellenar(){
        tableroI[0][0]= c11;
        tableroI[1][0]= c12;
        tableroI[2][0]= c13;
        tableroI[3][0]= c14;
        tableroI[4][0]= c15;
        tableroI[0][1]= c21;
        tableroI[1][1]= c22;
        tableroI[2][1]= c23;
        tableroI[3][1]= c24;
        tableroI[4][1]= c25;
        tableroI[0][2]= c31;
        tableroI[1][2]= c32;
        tableroI[2][2]= c33;
        tableroI[3][2]= c34;
        tableroI[4][2]= c35;
        tableroI[0][3]= c41;
        tableroI[1][3]= c42;
        tableroI[2][3]= c43;
        tableroI[3][3]= c44;
        tableroI[4][3]= c45;
        tableroI[0][4]= c51;
        tableroI[1][4]= c52;
        tableroI[2][4]= c53;
        tableroI[3][4]= c54;
        tableroI[4][4]= c55;
        tableroI[0][5]= c61;
        tableroI[1][5]= c62;
        tableroI[2][5]= c63;
        tableroI[3][5]= c64;
        tableroI[4][5]= c65;
        tableroI[0][6]= c71;
        tableroI[1][6]= c72;
        tableroI[2][6]= c73;
        tableroI[3][6]= c74;
        tableroI[4][6]= c75;
        tableroI[0][7]= c81;
        tableroI[1][7]= c82;
        tableroI[2][7]= c83;
        tableroI[3][7]= c84;
        tableroI[4][7]= c85;
        tableroI[0][8]= c91;
        tableroI[1][8]= c92;
        tableroI[2][8]= c93;
        tableroI[3][8]= c94;
        tableroI[4][8]= c95;
        
        
    }
    
    
    /** Método que irá rellenando la progress bar a medida que avancen los zombies.
     */
    public void progreso(){
        progres.setValue(juego.getTotalEnemigos());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gano = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        perdio = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ayuda = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        normas = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        salirGuardar = new javax.swing.JDialog();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        salir = new javax.swing.JDialog();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        c11 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        c13 = new javax.swing.JLabel();
        c14 = new javax.swing.JLabel();
        c15 = new javax.swing.JLabel();
        c21 = new javax.swing.JLabel();
        c31 = new javax.swing.JLabel();
        c51 = new javax.swing.JLabel();
        c61 = new javax.swing.JLabel();
        c71 = new javax.swing.JLabel();
        c81 = new javax.swing.JLabel();
        c91 = new javax.swing.JLabel();
        c41 = new javax.swing.JLabel();
        c22 = new javax.swing.JLabel();
        c23 = new javax.swing.JLabel();
        c24 = new javax.swing.JLabel();
        c25 = new javax.swing.JLabel();
        c32 = new javax.swing.JLabel();
        c33 = new javax.swing.JLabel();
        c34 = new javax.swing.JLabel();
        c35 = new javax.swing.JLabel();
        c42 = new javax.swing.JLabel();
        c43 = new javax.swing.JLabel();
        c44 = new javax.swing.JLabel();
        c45 = new javax.swing.JLabel();
        c52 = new javax.swing.JLabel();
        c53 = new javax.swing.JLabel();
        c54 = new javax.swing.JLabel();
        c55 = new javax.swing.JLabel();
        c62 = new javax.swing.JLabel();
        c63 = new javax.swing.JLabel();
        c64 = new javax.swing.JLabel();
        c65 = new javax.swing.JLabel();
        c72 = new javax.swing.JLabel();
        c73 = new javax.swing.JLabel();
        c74 = new javax.swing.JLabel();
        c75 = new javax.swing.JLabel();
        c82 = new javax.swing.JLabel();
        c83 = new javax.swing.JLabel();
        c84 = new javax.swing.JLabel();
        c85 = new javax.swing.JLabel();
        c92 = new javax.swing.JLabel();
        c93 = new javax.swing.JLabel();
        c94 = new javax.swing.JLabel();
        c95 = new javax.swing.JLabel();
        tableroJ = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        gSBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        progres = new javax.swing.JProgressBar();
        jLabel23 = new javax.swing.JLabel();

        gano.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        gano.setMinimumSize(new java.awt.Dimension(490, 193));
        gano.getContentPane().setLayout(null);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gano.getContentPane().add(jButton2);
        jButton2.setBounds(190, 120, 100, 40);

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENHORABUENA, LO HAS CONSEGUIDO , O NO ;)");
        gano.getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 70, 430, 36);

        jLabel24.setMaximumSize(new java.awt.Dimension(490, 193));
        jLabel24.setMinimumSize(new java.awt.Dimension(490, 193));
        jLabel24.setPreferredSize(new java.awt.Dimension(490, 193));
        gano.getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 0, 490, 193);

        perdio.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        perdio.setMinimumSize(new java.awt.Dimension(490, 193));
        perdio.getContentPane().setLayout(null);

        jButton3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        perdio.getContentPane().add(jButton3);
        jButton3.setBounds(190, 130, 100, 40);

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BUENO LO CONSEGUISTE, ");
        perdio.getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 40, 240, 50);

        jLabel26.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("HAS LLEGADO AL FINAL DE TU VIDA, POR FIN");
        perdio.getContentPane().add(jLabel26);
        jLabel26.setBounds(70, 80, 400, 40);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dialogo.jpg"))); // NOI18N
        perdio.getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 0, 490, 193);

        ayuda.setMinimumSize(new java.awt.Dimension(678, 427));
        ayuda.getContentPane().setLayout(null);

        jLabel15.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel15.setText("Ayuda para jugar a Plantas vs Zombies: ");
        ayuda.getContentPane().add(jLabel15);
        jLabel15.setBounds(90, 40, 462, 32);

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel16.setText("- G <columna> <fila> : colocar girasol.");
        ayuda.getContentPane().add(jLabel16);
        jLabel16.setBounds(180, 120, 320, 17);

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel17.setText("- L <columna> <fila> : colocar LanzaGuisantes.");
        ayuda.getContentPane().add(jLabel17);
        jLabel17.setBounds(180, 150, 350, 17);

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel18.setText("- N <columna> <fila> : colocar una Nuez.");
        ayuda.getContentPane().add(jLabel18);
        jLabel18.setBounds(180, 180, 340, 17);

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel19.setText("- P <columna> <fila> : colocar un Petacereza.");
        ayuda.getContentPane().add(jLabel19);
        jLabel19.setBounds(180, 210, 360, 17);

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel20.setText("- Pulsa Enviar para pasar turno.");
        ayuda.getContentPane().add(jLabel20);
        jLabel20.setBounds(180, 240, 340, 17);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ayuda.getContentPane().add(jButton7);
        jButton7.setBounds(230, 330, 240, 60);
        ayuda.getContentPane().add(jLabel27);
        jLabel27.setBounds(0, 0, 678, 427);

        normas.setMinimumSize(new java.awt.Dimension(678, 427));
        normas.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel6.setText("- El objetivo del juego es eliminar a los Zombies que aparecen por la derecha mediante el uso de ");
        normas.getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 50, 670, 40);

        jLabel7.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel7.setText("Normas para jugar a Plantas vs Zombies: ");
        normas.getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 20, 466, 36);

        jLabel8.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel8.setText("- Los soles se usan como unidad de dinero. Necesitas soles para comprar Girasoles y LanzaGuisantes.");
        normas.getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 100, 656, 19);

        jLabel9.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel9.setText("- Los Girasoles cuestan 20 soles y, a su vez, producen 20 soles más cada 2 turnos de la partida.");
        normas.getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 130, 602, 18);

        jLabel10.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel10.setText("- Para plantarlas, tienes que seleccionar la casilla en la que quieres plantarlo. ¿Cómo? Con coordenadas ");
        normas.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 270, 687, 18);

        jLabel11.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel11.setText("- Por su parte, los LanzaGuisantes cuestan 50 soles y son los capaces de matar a los zombies.");
        normas.getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 160, 591, 18);

        jLabel12.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel12.setText("- Visualiza la casilla en la que quieres plantar y teclea el número de columna y luego de fila. ");
        normas.getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 290, 733, 18);

        jLabel13.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel13.setText("- Las nueces cuestan 50 soles y, pero estas aguantan mucho ya que tienen 10 puntos de vida.");
        normas.getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 190, 593, 18);

        jLabel14.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel14.setText("- Los petacerezas cuestan 50 soles y, estos explotan a los dos turnos de ser plantados haciendo ");
        normas.getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 220, 608, 18);

        jLabel29.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel29.setText("plantas como armas.");
        normas.getContentPane().add(jLabel29);
        jLabel29.setBounds(20, 80, 620, 14);

        jLabel30.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel30.setText("daño a todas las casillas adyacentes.");
        normas.getContentPane().add(jLabel30);
        jLabel30.setBounds(20, 240, 320, 20);

        jLabel31.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel31.setText("Al pulsar enter aparecerá.");
        normas.getContentPane().add(jLabel31);
        jLabel31.setBounds(20, 310, 310, 14);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        normas.getContentPane().add(jButton6);
        jButton6.setBounds(270, 340, 150, 40);

        jLabel28.setMaximumSize(new java.awt.Dimension(678, 427));
        jLabel28.setMinimumSize(new java.awt.Dimension(678, 427));
        jLabel28.setPreferredSize(new java.awt.Dimension(678, 427));
        normas.getContentPane().add(jLabel28);
        jLabel28.setBounds(0, 0, 678, 427);

        salirGuardar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        salirGuardar.setMinimumSize(new java.awt.Dimension(490, 193));
        salirGuardar.getContentPane().setLayout(null);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        salirGuardar.getContentPane().add(jButton8);
        jButton8.setBounds(60, 120, 120, 40);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        salirGuardar.getContentPane().add(jButton9);
        jButton9.setBounds(290, 120, 140, 40);

        jLabel33.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("y guardar la partida?");
        salirGuardar.getContentPane().add(jLabel33);
        jLabel33.setBounds(130, 60, 340, 40);

        jLabel21.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("¿Seguro que deseas salir ");
        salirGuardar.getContentPane().add(jLabel21);
        jLabel21.setBounds(100, 40, 330, 28);

        jLabel32.setMaximumSize(new java.awt.Dimension(490, 193));
        jLabel32.setMinimumSize(new java.awt.Dimension(490, 193));
        jLabel32.setPreferredSize(new java.awt.Dimension(490, 193));
        salirGuardar.getContentPane().add(jLabel32);
        jLabel32.setBounds(0, 0, 490, 193);

        salir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        salir.setMinimumSize(new java.awt.Dimension(490, 193));
        salir.getContentPane().setLayout(null);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        salir.getContentPane().add(jButton10);
        jButton10.setBounds(30, 120, 130, 50);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        salir.getContentPane().add(jButton11);
        jButton11.setBounds(350, 120, 110, 40);

        jLabel22.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("¿Seguro que deseas salir?");
        salir.getContentPane().add(jLabel22);
        jLabel22.setBounds(90, 50, 322, 28);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        salir.getContentPane().add(jButton12);
        jButton12.setBounds(200, 120, 102, 40);

        jLabel34.setMaximumSize(new java.awt.Dimension(490, 193));
        jLabel34.setMinimumSize(new java.awt.Dimension(490, 193));
        jLabel34.setPreferredSize(new java.awt.Dimension(490, 193));
        salir.getContentPane().add(jLabel34);
        jLabel34.setBounds(0, 0, 490, 193);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setMinimumSize(new java.awt.Dimension(1150, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 520));
        jPanel1.setLayout(null);

        c11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c11.setPreferredSize(new java.awt.Dimension(95, 94));
        c11.setRequestFocusEnabled(false);
        jPanel1.add(c11);
        c11.setBounds(20, 22, 94, 93);

        c12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c12.setPreferredSize(new java.awt.Dimension(95, 94));
        c12.setRequestFocusEnabled(false);
        jPanel1.add(c12);
        c12.setBounds(20, 121, 94, 93);

        c13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c13.setPreferredSize(new java.awt.Dimension(95, 94));
        c13.setRequestFocusEnabled(false);
        jPanel1.add(c13);
        c13.setBounds(20, 220, 94, 93);

        c14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c14.setPreferredSize(new java.awt.Dimension(95, 94));
        c14.setRequestFocusEnabled(false);
        jPanel1.add(c14);
        c14.setBounds(20, 319, 94, 93);

        c15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true));
        c15.setPreferredSize(new java.awt.Dimension(95, 94));
        c15.setRequestFocusEnabled(false);
        jPanel1.add(c15);
        c15.setBounds(20, 418, 94, 93);

        c21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c21.setPreferredSize(new java.awt.Dimension(95, 94));
        c21.setRequestFocusEnabled(false);
        jPanel1.add(c21);
        c21.setBounds(120, 22, 94, 93);

        c31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c31.setPreferredSize(new java.awt.Dimension(95, 94));
        c31.setRequestFocusEnabled(false);
        jPanel1.add(c31);
        c31.setBounds(220, 22, 94, 93);

        c51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c51.setPreferredSize(new java.awt.Dimension(95, 94));
        c51.setRequestFocusEnabled(false);
        jPanel1.add(c51);
        c51.setBounds(420, 22, 94, 93);

        c61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c61.setPreferredSize(new java.awt.Dimension(95, 94));
        c61.setRequestFocusEnabled(false);
        jPanel1.add(c61);
        c61.setBounds(520, 22, 94, 93);

        c71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c71.setPreferredSize(new java.awt.Dimension(95, 94));
        c71.setRequestFocusEnabled(false);
        jPanel1.add(c71);
        c71.setBounds(620, 22, 94, 93);

        c81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c81.setPreferredSize(new java.awt.Dimension(95, 94));
        c81.setRequestFocusEnabled(false);
        jPanel1.add(c81);
        c81.setBounds(720, 22, 94, 93);

        c91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c91.setPreferredSize(new java.awt.Dimension(95, 94));
        c91.setRequestFocusEnabled(false);
        jPanel1.add(c91);
        c91.setBounds(820, 22, 94, 93);

        c41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c41.setPreferredSize(new java.awt.Dimension(95, 94));
        c41.setRequestFocusEnabled(false);
        jPanel1.add(c41);
        c41.setBounds(320, 22, 94, 93);

        c22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c22.setPreferredSize(new java.awt.Dimension(95, 94));
        c22.setRequestFocusEnabled(false);
        jPanel1.add(c22);
        c22.setBounds(120, 121, 94, 93);

        c23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c23.setPreferredSize(new java.awt.Dimension(95, 94));
        c23.setRequestFocusEnabled(false);
        jPanel1.add(c23);
        c23.setBounds(120, 220, 94, 93);

        c24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c24.setPreferredSize(new java.awt.Dimension(95, 94));
        c24.setRequestFocusEnabled(false);
        jPanel1.add(c24);
        c24.setBounds(120, 319, 94, 93);

        c25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c25.setPreferredSize(new java.awt.Dimension(95, 94));
        c25.setRequestFocusEnabled(false);
        jPanel1.add(c25);
        c25.setBounds(120, 418, 94, 93);

        c32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c32.setPreferredSize(new java.awt.Dimension(95, 94));
        c32.setRequestFocusEnabled(false);
        jPanel1.add(c32);
        c32.setBounds(220, 121, 94, 93);

        c33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c33.setPreferredSize(new java.awt.Dimension(95, 94));
        c33.setRequestFocusEnabled(false);
        jPanel1.add(c33);
        c33.setBounds(220, 220, 94, 93);

        c34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c34.setPreferredSize(new java.awt.Dimension(95, 94));
        c34.setRequestFocusEnabled(false);
        jPanel1.add(c34);
        c34.setBounds(220, 319, 94, 93);

        c35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c35.setPreferredSize(new java.awt.Dimension(95, 94));
        c35.setRequestFocusEnabled(false);
        jPanel1.add(c35);
        c35.setBounds(220, 418, 94, 93);

        c42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c42.setPreferredSize(new java.awt.Dimension(95, 94));
        c42.setRequestFocusEnabled(false);
        jPanel1.add(c42);
        c42.setBounds(320, 121, 94, 93);

        c43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c43.setPreferredSize(new java.awt.Dimension(95, 94));
        c43.setRequestFocusEnabled(false);
        jPanel1.add(c43);
        c43.setBounds(320, 220, 94, 93);

        c44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c44.setPreferredSize(new java.awt.Dimension(95, 94));
        c44.setRequestFocusEnabled(false);
        jPanel1.add(c44);
        c44.setBounds(320, 319, 94, 93);

        c45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c45.setPreferredSize(new java.awt.Dimension(95, 94));
        c45.setRequestFocusEnabled(false);
        jPanel1.add(c45);
        c45.setBounds(320, 418, 94, 93);

        c52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c52.setPreferredSize(new java.awt.Dimension(95, 94));
        c52.setRequestFocusEnabled(false);
        jPanel1.add(c52);
        c52.setBounds(420, 121, 94, 93);

        c53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c53.setPreferredSize(new java.awt.Dimension(95, 94));
        c53.setRequestFocusEnabled(false);
        jPanel1.add(c53);
        c53.setBounds(420, 220, 94, 93);

        c54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c54.setPreferredSize(new java.awt.Dimension(95, 94));
        c54.setRequestFocusEnabled(false);
        jPanel1.add(c54);
        c54.setBounds(420, 319, 94, 93);

        c55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c55.setPreferredSize(new java.awt.Dimension(95, 94));
        c55.setRequestFocusEnabled(false);
        jPanel1.add(c55);
        c55.setBounds(420, 418, 94, 93);

        c62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c62.setPreferredSize(new java.awt.Dimension(95, 94));
        c62.setRequestFocusEnabled(false);
        jPanel1.add(c62);
        c62.setBounds(520, 121, 94, 93);

        c63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c63.setPreferredSize(new java.awt.Dimension(95, 94));
        c63.setRequestFocusEnabled(false);
        jPanel1.add(c63);
        c63.setBounds(520, 220, 94, 93);

        c64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c64.setPreferredSize(new java.awt.Dimension(95, 94));
        c64.setRequestFocusEnabled(false);
        jPanel1.add(c64);
        c64.setBounds(520, 319, 94, 93);

        c65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c65.setPreferredSize(new java.awt.Dimension(95, 94));
        c65.setRequestFocusEnabled(false);
        jPanel1.add(c65);
        c65.setBounds(520, 418, 94, 93);

        c72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c72.setPreferredSize(new java.awt.Dimension(95, 94));
        c72.setRequestFocusEnabled(false);
        jPanel1.add(c72);
        c72.setBounds(620, 121, 94, 93);

        c73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c73.setPreferredSize(new java.awt.Dimension(95, 94));
        c73.setRequestFocusEnabled(false);
        jPanel1.add(c73);
        c73.setBounds(620, 220, 94, 93);

        c74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c74.setPreferredSize(new java.awt.Dimension(95, 94));
        c74.setRequestFocusEnabled(false);
        jPanel1.add(c74);
        c74.setBounds(620, 319, 94, 93);

        c75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c75.setPreferredSize(new java.awt.Dimension(95, 94));
        c75.setRequestFocusEnabled(false);
        jPanel1.add(c75);
        c75.setBounds(620, 418, 94, 93);

        c82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c82.setPreferredSize(new java.awt.Dimension(95, 94));
        c82.setRequestFocusEnabled(false);
        jPanel1.add(c82);
        c82.setBounds(720, 121, 94, 93);

        c83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c83.setPreferredSize(new java.awt.Dimension(95, 94));
        c83.setRequestFocusEnabled(false);
        jPanel1.add(c83);
        c83.setBounds(720, 220, 94, 93);

        c84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c84.setPreferredSize(new java.awt.Dimension(95, 94));
        c84.setRequestFocusEnabled(false);
        jPanel1.add(c84);
        c84.setBounds(720, 319, 94, 93);

        c85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c85.setPreferredSize(new java.awt.Dimension(95, 94));
        c85.setRequestFocusEnabled(false);
        jPanel1.add(c85);
        c85.setBounds(720, 418, 94, 93);

        c92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c92.setPreferredSize(new java.awt.Dimension(95, 94));
        c92.setRequestFocusEnabled(false);
        jPanel1.add(c92);
        c92.setBounds(820, 121, 94, 93);

        c93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c93.setPreferredSize(new java.awt.Dimension(95, 94));
        c93.setRequestFocusEnabled(false);
        jPanel1.add(c93);
        c93.setBounds(820, 220, 94, 93);

        c94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c94.setPreferredSize(new java.awt.Dimension(95, 94));
        c94.setRequestFocusEnabled(false);
        jPanel1.add(c94);
        c94.setBounds(820, 319, 94, 93);

        c95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        c95.setPreferredSize(new java.awt.Dimension(95, 94));
        c95.setRequestFocusEnabled(false);
        jPanel1.add(c95);
        c95.setBounds(820, 418, 94, 93);
        jPanel1.add(tableroJ);
        tableroJ.setBounds(0, 0, 930, 530);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 36)); // NOI18N
        jLabel2.setText("1");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 48)); // NOI18N
        jLabel3.setText("1");

        jToolBar1.setRollover(true);

        gSBtn.setText("Guardar y salir");
        gSBtn.setFocusable(false);
        gSBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gSBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gSBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gSBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(gSBtn);
        jToolBar1.add(jSeparator2);

        jButton4.setText("Ayuda");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator1);

        jButton5.setText("Reglas");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        progres.setForeground(new java.awt.Color(107, 228, 21));

        jLabel23.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(enviar)
                .addGap(202, 202, 202)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(progres, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(progres, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /** Método que, al pulsar el botón "enviar", plantará la planta seleccionada en las coordenadas
     * introducidas por el usuario.
     */
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if (juego.isFinMalo()) finLose();
        juego.getComandos().lecturaComando(jTextField1.getText(), juego);
        juego.actualizar(juego);
        actualizarCasillas();
        jLabel3.setText(Integer.toString(juego.getPartida().getTurno()));
        jLabel2.setText(Integer.toString(juego.getPartida().getSoles()));
        jTextField1.setText(null);
        progreso();
        if (juego.getPartida() !=null) if (juego.getTurnosTotales() == juego.getPartida().getTurno()) juego.setFin(true);
        if (juego.isFin()) finWin();
        if (juego.isFinMalo()) finLose();
        
    }//GEN-LAST:event_enviarActionPerformed
    /** Método que, al pulsar "aceptar" en el cuadro de diálogo que aparece una vez 
     * ganas la partida, nos llevará de vuelta al menú del juego guardando los puntos obtenidos.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        juego.getJugador().actualizar(juego.getPartida());
        le.borrarJugador(juego.getJugador().getDNI());
        le.añadirJugador(juego.getJugador());
        juego.getJugador().seTermino();
        try {
            le.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(JuegoI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        gano.dispose();
        MenuJuego mj = new MenuJuego(juego.getJugador());
    }//GEN-LAST:event_jButton2ActionPerformed
    /** Método que, al pulsar "aceptar" en el cuadro de diálogo que aparece una vez 
     * pierdes la partida, nos llevará de vuelta al menú del juego.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        juego.getJugador().actualizar(juego.getPartida());
        juego.getJugador().seTermino();
        le.borrarJugador(juego.getJugador().getDNI());
        le.añadirJugador(juego.getJugador());
        
        try {
            le.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(JuegoI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        perdio.dispose();
        MenuJuego mj = new MenuJuego(juego.getJugador());
    }//GEN-LAST:event_jButton3ActionPerformed
    /** Método que, al pulsar "ayuda", nos abrirá un cuadro de diálogo con la ayuda necesaria para
     * poder jugar la partida.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ayuda.setLocationRelativeTo(this);
        ayuda.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        ayuda.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    /** Método que, al pulsar "aceptar" dentro del cuadro de diálogo de Normas, cerrará el cuadro.
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        normas.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed
    /** Método que, al pulsar "Normas", nos abrirá un cuadro de diálogo con las normas del juego.
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        normas.setLocationRelativeTo(this);
        normas.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        normas.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    /** Método que, al pulsar "aceptar" dentro del cuadro de diálogo de Ayuda, cerrará el cuadro. 
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ayuda.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    /** Método que, al pulsar "aceptar" dentro del cuadro de diálogo que aprece al pulsar el botón de
     * guardar y salir, nos guardará los datos recolectados en la partida y nos llevará de vuelta al
     * menú principal del juego. 
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        juego.getPartida().setEnemigosAparecidos(juego.getTotalEnemigos());
        juego.getJugador().setPartidaNoFin(juego.getPartida());
        le.borrarJugador(juego.getJugador().getDNI());
        le.añadirJugador(juego.getJugador());
        try {
            le.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(JuegoI.class.getName()).log(Level.SEVERE, null, ex);
        }
        MenuJuego mj = new MenuJuego(juego.getJugador());
        this.dispose();
        salirGuardar.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed
    /** Método que, al pulsar "cancelar" dentro del cuadro de diálogo que aparece al pulsar el botón de 
     * guardar y salir, nos cerrará el cuadro y nos llevará de vuelta a la partida
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        salirGuardar.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed
    /** Método que, al pulsar la X en la esquina superior derecha de la pantalla, nos mostrará el cuadro
     * de diálogo de Salir en el centro de la pantalla. 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salir.setLocationRelativeTo(this);
        salir.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    /** Método que, al pulsar Guardar Salir en la esquina superior derecha de la pantalla, nos mostrará 
     * el cuadro de diálogo de Guardar Salir en el centro de la pantalla. 
     */
    private void gSBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gSBtnActionPerformed
        salirGuardar.setLocationRelativeTo(this);
        salirGuardar.setVisible(true);
    }//GEN-LAST:event_gSBtnActionPerformed
    /** Método que, al pulsar "guardar y salir" dentro del cuadro de diálogo que aparece al pulsar la X en la esquina 
     * superior derecha de la pantalla, nos llevará de vuelta al menú principal del juego guardando la partida sin
     * finalizar.
     */
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        juego.getPartida().setEnemigosAparecidos(juego.getTotalEnemigos());
        juego.getJugador().setPartidaNoFin(juego.getPartida());
        le.borrarJugador(juego.getJugador().getDNI());
        le.añadirJugador(juego.getJugador());
        try {
            le.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(JuegoI.class.getName()).log(Level.SEVERE, null, ex);
        }
        MenuJuego mj = new MenuJuego(juego.getJugador());
        this.dispose();
        salir.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed
    /** Método que, al pulsar "canceal" dentro del cuadro de diálogo que aparece al pulsar la X en la esquina 
     * superior derecha de la pantalla, nos cerrará el cuadro para volver a la partida.
     */
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        salir.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed
    /** Método que, al pulsar "salir" dentro del cuadro de diálogo que aparece al pulsar la X en la esquina 
     * superior derecha de la pantalla, nos llevará de vuelta al menú principal del juego. 
     */
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        MenuJuego mj = new MenuJuego(juego.getJugador());
        this.dispose();
        salir.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed
    
    /** Método que guardará los datos y puntos del jugador al ganar una partida.
     */
    public void finWin(){
        enviar.setVisible(false);
        juego.getPartida().ganada();
        juego.getPartida().calcularPuntos();
        gano.setLocationRelativeTo(this);
        gano.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        gano.setVisible(true);
        
    }
    
    /** Método que guardará los datos del jugador al perder una partida.
     */
    public void finLose(){
        enviar.setVisible(false);
        perdio.setLocationRelativeTo(this);
        perdio.setIconImage(new ImageIcon("src/img/icono.png").getImage());
        perdio.setVisible(true);

    }
    
    /** Método que actualizará las casillas del tablero a cada turno que pasa
     * También se incluirán las imágenes relativas al personaje en cada casilla. 
     */
    public void actualizarCasillas(){
        rellenar();
        Tablero t = juego.getPartida().getTablero();
        for (int i = 0; i<t.lonY();i++){
            for (int j = 0 ;j<t.lonX();j++){
                if (t.getTableroPos(j+1, i+1)!= null){
                    if (t.getTableroPos(j+1, i+1) instanceof Girasol ){
                        ImageIcon f = new ImageIcon("src/img/girasol.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof LanzaGuisantes ){
                        ImageIcon f = new ImageIcon("src/img/Lanzagisantes.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof Nuez ){
                        ImageIcon f = new ImageIcon("src/img/nuez.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof Petacereza ){
                        ImageIcon f = new ImageIcon("src/img/petacereza.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof ZombieComun){
                        ImageIcon f = new ImageIcon("src/img/zombiecomun.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof Deportista ){
                        ImageIcon f = new ImageIcon("src/img/deportista.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof Caracubo ){
                        ImageIcon f = new ImageIcon("src/img/caracubo.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                }
                else tableroI[i][j].setIcon(null);
            }
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ayuda;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c13;
    private javax.swing.JLabel c14;
    private javax.swing.JLabel c15;
    private javax.swing.JLabel c21;
    private javax.swing.JLabel c22;
    private javax.swing.JLabel c23;
    private javax.swing.JLabel c24;
    private javax.swing.JLabel c25;
    private javax.swing.JLabel c31;
    private javax.swing.JLabel c32;
    private javax.swing.JLabel c33;
    private javax.swing.JLabel c34;
    private javax.swing.JLabel c35;
    private javax.swing.JLabel c41;
    private javax.swing.JLabel c42;
    private javax.swing.JLabel c43;
    private javax.swing.JLabel c44;
    private javax.swing.JLabel c45;
    private javax.swing.JLabel c51;
    private javax.swing.JLabel c52;
    private javax.swing.JLabel c53;
    private javax.swing.JLabel c54;
    private javax.swing.JLabel c55;
    private javax.swing.JLabel c61;
    private javax.swing.JLabel c62;
    private javax.swing.JLabel c63;
    private javax.swing.JLabel c64;
    private javax.swing.JLabel c65;
    private javax.swing.JLabel c71;
    private javax.swing.JLabel c72;
    private javax.swing.JLabel c73;
    private javax.swing.JLabel c74;
    private javax.swing.JLabel c75;
    private javax.swing.JLabel c81;
    private javax.swing.JLabel c82;
    private javax.swing.JLabel c83;
    private javax.swing.JLabel c84;
    private javax.swing.JLabel c85;
    private javax.swing.JLabel c91;
    private javax.swing.JLabel c92;
    private javax.swing.JLabel c93;
    private javax.swing.JLabel c94;
    private javax.swing.JLabel c95;
    private javax.swing.JButton enviar;
    private javax.swing.JButton gSBtn;
    private javax.swing.JDialog gano;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog normas;
    private javax.swing.JDialog perdio;
    private javax.swing.JProgressBar progres;
    private javax.swing.JDialog salir;
    private javax.swing.JDialog salirGuardar;
    private javax.swing.JLabel tableroJ;
    // End of variables declaration//GEN-END:variables
}