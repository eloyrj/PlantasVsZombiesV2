
package Personajes;

import Excepciones.ExcepcionPlanta;
import Juego.Juego;

/**
 *
 * @author Eloy Rodríguez y María Chantal 
 */

/** Esta clase controlará el efecto de la planta tipo Petacereza dentro de la partida
*/
public class Petacereza extends Planta {

    /** Constructor de Petacereza
     */
    public Petacereza() {
        super();
        /** Tiene 3 unidades de vida*/
        super.setVida(2);
        /** Cuesta 50 soles*/
        super.setCoste(50);
        /** explota al segundo turno */
        super.setFrecuencia(2);
        /** Le resta una vida al enemigo por lanzamiento*/
        super.setDaño(2);
        /** Atributo que llama a las posibles excepciones que puede tener este personaje */
        super.setExcepcion(new ExcepcionPlanta());
        /** Atributo que cuenta los turnos que lleva el LanzaGuisantes en la partida*/
        super.setContador(-1);
    }

    /** Método que permite plantar Petacerezas
     * @param x coordenada x dentro del tablero donde se quiere situar 
     * @param y coordenada y dentro del tablero donde se quiere situar
     * @param j partida en curso
    */
    @Override
    public void addPlanta(int x, int y, Juego j) {
        if (getExcepcion().dentroTablero(x, y, j.getPartida().getTablero().lonX(), j.getPartida().getTablero().lonY()) && getExcepcion().casillaOcupada( j.getPartida().getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), j.getPartida().getSoles())){
            j.getPartida().getTablero().addT(x, y, this);        
            j.getPartida().setSoles(j.getPartida().getSoles()-getCoste());
            j.getPartida().setTurno(j.getPartida().getTurno()+1);
        }
    }

    /**Método que controla el ataque explosivo del Petacerezas
     * @param j partida en curso
     */
    @Override
    public void actua(Juego j) {
       if (getContador() % getFrecuencia() ==0){
            
            if ( this.getPosY()!= 1){
                if ( j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) instanceof Zombie  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ).muerto()){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1));
                }   
            }
            if (this.getPosY()!= j.getPartida().getTablero().lonY()){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1 ) instanceof Zombie  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1 ).muerto()){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1));
                }
            }
            if ( this.getPosX()!= 1 ){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ) instanceof Zombie  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ).muerto() ){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY()));
                }
            }
            if ( this.getPosX()!= j.getPartida().getTablero().lonX()){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX()+1, super.getPosY()) instanceof Zombie  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX()+1, super.getPosY() ).muerto()){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX()+1, super.getPosY()));
                }
            }
            this.setVida(0);
       }         
        
    }

    /** Método que permite explotar al Petacereza
     * @param p personaje, en este caso el LanzaGuisantes
     */ 
    @Override
    public void Ataque(Personaje p) {
         p.setVida(p.getVida()-super.getDaño());
         
    }

    
    
    
}
