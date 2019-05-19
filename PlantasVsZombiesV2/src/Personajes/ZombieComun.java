
package Personajes;

import Juego.Juego;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Esta clase controlará el ataque de los zombies durante la partida*/
public class ZombieComun extends Zombie {

    /** Constructor de ZombieComun
     */
    public ZombieComun() {
        super();
        /** El zombie Común avanza 1 casilla cada 2 turnos*/
        super.setVelocidad(2);
        /** Le resta una vida al enemigo cada turno que se encuentre frente a él*/
        super.setDaño(1);
        /** El zombie Común tendrá 5 vidas*/
        super.setVida(5);
        /** Turnos que lleva el ZombieComun en la partida*/
        super.setContador(0);
    }
    
    /** Mñetodo que permite atacar al ZombieComún
     * @param p personaje, en este caso el zombie tipo Común
     */
    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }

    /** Método que localiza al ZombieComún en el tablero
     * @return la posición del zombie Común y las vidas que le quedan */
    @Override
    public String localizador() {
        return "Z(" + super.getVida()+")";
    }

    /** Método que controla el ataque de un ZombieComún
     * @param j partida
     */
    @Override
    public void actua(Juego j) {
        
        
        
        if (j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY()) == null){
            if (getContador() % getVelocidad() ==0){
                j.getPartida().getTablero().setTableroPos(super.getPosX(), super.getPosY(), null) ;
                j.getPartida().getTablero().setTableroPos(super.getPosX()-1, super.getPosY(), this);
                this.setPosX(super.getPosX()-1);
            }
        }
        
        else{
            if ( this.getPosX()!= 1 ){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ) instanceof Planta  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ).muerto()){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY()));
                }
            }
        }
    }
}  
