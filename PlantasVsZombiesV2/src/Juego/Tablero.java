
package Juego;

import Personajes.Personaje;
import java.io.Serializable;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase Tablero es un array de arrays que almacena los personajes en la partida
 */
public class Tablero implements Serializable{
    
    /** Atributo que introduce un personaje en el tablero */
    private Personaje[][] tablero;

    
    /** Constructor de tablero
     * @param x que son las filas
     * @param y que son las columnas
     */
    public Tablero(int x, int y) {
        tablero = new Personaje[y][x];
    }

    public Personaje[][] getTablero() {
        return tablero;
    }
    public Personaje getTableroPos(int x,int y) {
        return tablero[y-1][x-1];
    }
    
    public void setTableroPos(int x,int y, Personaje p ) {
         tablero[y-1][x-1] = p;
    }
    
    public void setTablero(Personaje[][] tablero) {
        this.tablero = tablero;
    }
    
    
    /** Método que añade un personaje al tablero en las coordenadas x, y.
     * @param x las filas del tablero
     * @param y las columnas del tablero
     * @param p el personaje en el tablero
     */
    public void addT(int x, int y, Personaje p){
        tablero[y-1][x-1] = (Personaje) p;
    }
    
    
    
    /** Método que mide la longitud de la variable x
     * @return la longitud de la variable x
     */
    public int lonX(){
        return tablero[1].length;
    }
    
    /** Método que mide la longitud de la variable y
     * @return la longitud de la variable y
     */
    public int lonY(){
        return tablero.length;
    }
    
}
