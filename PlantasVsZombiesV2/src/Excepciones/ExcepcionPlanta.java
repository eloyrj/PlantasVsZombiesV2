
package Excepciones;

import Personajes.Personaje;
import interfaz.Excepciones;
import java.io.Serializable;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Controla las posibles excepciones que podemos encontrar a la hora de plantar las distintas plantas del juego
*/
public class ExcepcionPlanta implements Serializable{

    /** Constructor de ExcepcionPlanta
     */
    public ExcepcionPlanta() {
    }
    
    
    /** Método para controlar si se tienen los suficientes soles para poder plantar
     * @param coste lo que cuesta plantar un Girasol o un LanzaGuisantes
     * @param solesTotales los soles acumulados por el usuario en la partida
     * @return si no se tiene los soles suficientes
    */
    public boolean costePosible(int coste,int solesTotales){
        if (solesTotales >= coste) return true;
        else {
            Excepciones dialog = new Excepciones(new javax.swing.JFrame(), true,1);
            return false;
        }
        
    }
    
    /** Método para controlar si la casilla seleccionada por el usuario está libre u ocupada 
     * Se avisará mediante un cuadro de diálogo
     * @param p personaje (Girasol o LanzaGuisantes) que se quiere plantar
     * @return si la casilla está ocupada
    */
    public boolean casillaOcupada(Personaje p){
        if (p == null) return true;
        else {
            Excepciones dialog = new Excepciones(new javax.swing.JFrame(), true,2);
            return false;
        }
        
    }
    
    /** Método que controla si se introduce una coordenada fuera del tablero o si es inexistente
     * Se avisará mediante un cuadro de diálogo
     * @param x filas del tablero
     * @param y columnas del tablero
     * @param lTX filas no existentes en el tablero
     * @param lTY columnas no existentes en el tablero
     * @return si la posición existe
    */
    public boolean dentroTablero(int x, int y, int lTX,int lTY){
        if (lTX >= x && lTY >= y) return true;
        else {
            Excepciones dialog = new Excepciones(new javax.swing.JFrame(), true,3);
            return false;
        }
        
    }
    
    
}
