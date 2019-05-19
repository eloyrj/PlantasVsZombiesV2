
package Excepciones;

import Juego.Juego;
import interfaz.Excepciones;
import java.io.Serializable;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Controla las posibles excepciones que podemos encontrar en el juego 
*/
public class ExcepcionJuego implements Serializable {
    
    
    
    /**Constructor de ExcepcionJuego 
     */
    public ExcepcionJuego(){
    }
    
    
    /** Método que indicará si ya hay una partida creada o si se puede iniciar una nueva
    * @param j partida por crear
    * @return si hay una partida en curso o no
    */
    public boolean partidaCreada(Juego j) {
        if (j.getPartida() == null) return true;
        else return false;
        
    }
    
    
    /** Método para comprobar si el nivel introducido es válido
     * @param dificultad las dificultades permitidas en el juego
     * @return si la dificultad no existe
    */
    public boolean nivelValido(String dificultad){
        if(dificultad.equals("BAJA") || dificultad.equals("MEDIA") || dificultad.equals("ALTA") || dificultad.equals("IMPOSIBLE") ) return true;
        else return false;
        
    }
    
    /** Método para comprobar los comandos en cada turno
     * @param comandos los comandos introducidos por el usuario
     * @return si los datos no son válidos
    */
    public boolean comandoCompleto(String[] comandos){
        if (comandos.length == 3) return true; 
        else {
            Excepciones dialog = new Excepciones(new javax.swing.JFrame(), true,4);
            return false;
        }
        

    }
    
}
