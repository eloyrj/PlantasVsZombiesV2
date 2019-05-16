
package interfaz;


import Juego.Juego;
import Juego.Partida;
import Juego.Tablero;
import Personajes.*;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase Comandos controlará todos los comandos introducidos por teclado
 */
public class Comandos {
    

    /** Constructor de Comandos*/
    public Comandos() {
        
    }

    
    
    /** Método que pondrá todos los comandos introducidos por teclado en mayúscula
     * @param comando el comando introducido por el usuario
     * @return dicho comando en mayúscula
     */
    public String todoMayus(String comando){
        return comando.toUpperCase();
    }
    
    /** Método para leer los comandos introducidos por teclado por el usuario
     * @param entrada comando introducido por el usuario
     * @param j partida por iniciar
     */
    public void lecturaComando(String entrada, Juego j){
        entrada = todoMayus(entrada);
        String[] partesEntrada =entrada.split(" ");
        String modo = partesEntrada[0];
        
        Comandos c = j.getComandos();

        Excepciones dialog;

        /** El comando "G" servirá para plantar un Girasol
         */
        if ("G".equals(modo)){
            if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                if (j.getPartida() != null){
                    Girasol g = new Girasol();
                    int x = Integer.parseInt(partesEntrada[1]);
                    int y = Integer.parseInt(partesEntrada[2]);
                    g.addPlanta(x, y, j);
                    
                    g.setPosX(x);
                    g.setPosY(y);


                    
                }
                
            }

        } 
        /** El comando "L" servirá para plantar un Lanzaguisantes
         */
        else if ("L".equals(modo)){
                
            if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                if (j.getPartida() != null){
                    LanzaGuisantes l = new LanzaGuisantes();
                    int x = Integer.parseInt(partesEntrada[1]);
                    int y = Integer.parseInt(partesEntrada[2]);
                    l.addPlanta(x, y, j);
                    
                    l.setPosX(x);
                    l.setPosY(y);

                    
                }
            }
           
        }
        /** El comando "P" servirá para plantar un Petacereza
         */
        else if ("P".equals(modo)){
                
            if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                if (j.getPartida() != null){
                    Petacereza l = new Petacereza();
                    int x = Integer.parseInt(partesEntrada[1]);
                    int y = Integer.parseInt(partesEntrada[2]);
                    l.addPlanta(x, y, j);
                    
                    l.setPosX(x);
                    l.setPosY(y);

                    
                }
            }
            
        }
        /** El comando "N" servirá para plantar una Nuez
         */
        else if ("N".equals(modo)){
                
            if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                if (j.getPartida() != null){
                    Nuez l = new Nuez();
                    int x = Integer.parseInt(partesEntrada[1]);
                    int y = Integer.parseInt(partesEntrada[2]);
                    l.addPlanta(x, y, j);
                    
                    l.setPosX(x);
                    l.setPosY(y);

                    
                }
            }
            
        }
        
        /**El comando servirá para pasar el turno cada vez que el usuario pulse "enter"
         */
        else if ("".equals(modo)){
            if (j.getPartida() != null){
                j.getPartida().setTurno(j.getPartida().getTurno()+1);
                
            }
        }
        else   dialog = new Excepciones(new javax.swing.JFrame(), true,4);
    }
    
    /** Método para crear una nueva partida
     * @param j partida a crear
     * @param Dificultad la dificultad deseada por el usuario
     * @param x filas del tablero
     * @param y columnas del tablero
     */
    public void nuevaPartida(Juego j, String Dificultad , int x, int y){
        Tablero t = new Tablero(x,y);

        if (Dificultad.equals("BAJA")){
            Partida p = new Partida(50,0,Dificultad,t,5,10);  
            j.setPartida(p);
        }
        else if (Dificultad.equals("MEDIA")){
            Partida p = new Partida(50,0,Dificultad,t,15,7);
            j.setPartida(p);
        }
        else if (todoMayus(Dificultad).equals("ALTA")){
            Partida p = new Partida(50,0,Dificultad,t,25,5);  
            j.setPartida(p);
        }
        else if (todoMayus(Dificultad).equals("IMPOSIBLE")){
            Partida p = new Partida(50,0,Dificultad,t,50,5);
            j.setPartida(p);
        }
            
    }
    
    
}
