
package Juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase LecturaEscritura controlará los datos introducidos sobre el jugador*/
public class LecturaEscritura {
    
    /** Atributo que controla los jugadores registrados en el juego
     */
    private HashMap<String, Jugador> jugadores ;
    
    /** Constructor de LecturaEscritura*/
    public LecturaEscritura() {
        jugadores = new HashMap<>();
    }
    
    public HashMap<String, Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashMap<String, Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    /** Método que nos permitirá añadir un jugador
     * @param j el jugador a añadir
     */
    public void añadirJugador(Jugador j){
        jugadores.put(j.getDNI(), j);
    }
    
    /** Método que nos permitrá buscar a un jugador mediante su DNI
     * @param dni del jugador
     * @return el jugador buscado
     */
    public Jugador buscarJugador(String dni){
        return jugadores.get(dni);
    } 
    
    /** Método que nos permitirá borrar un jugador
     * @param dni del jugador
     */
    public void borrarJugador(String dni){
        jugadores.remove(dni);
    }

    
    /** Método que nos permitirá guardar los datos del jugador
     * @throws java.io.FileNotFoundException señala que un intento de abrir el archivo 
         * indicado por un nombre de ruta especificado ha fallado
     */
    public void guardarDatos() throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("jugadores.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(jugadores);
        fos.close();
    }
    
    /** Método que nos permitirá leer los datos del jugador
     * @throws java.io.FileNotFoundException señala que un intento de abrir el archivo
        * indicado por un nombre de ruta especificado ha fallado
     * @throws java.lang.ClassNotFoundException se lanza cuando una aplicación intenta cargar en una clase a través de su 
         * nombre de cadena usando ciertos métodos de los cuales no se puede encontrar una para la clase con el nombre especificado.
     */
    public void leerDatos() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("jugadores.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        jugadores = (HashMap<String, Jugador>) ois.readObject();
        fis.close();
        
    }
}
