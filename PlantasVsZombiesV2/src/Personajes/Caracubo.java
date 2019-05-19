
package Personajes;

import Juego.Juego;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */
public class Caracubo extends Zombie {
    
    /** Constructor de zombie Caracubo
     */
    public Caracubo() {
        super();
        /** El zombie Caracubo avanza 1 casilla cada 4 turnos*/
        super.setVelocidad(4);
        /** Le resta una vida al enemigo cada turno que se encuentre frente a él*/
        super.setDaño(1);
        /** El zombie Caracubo tendrá 8 vidas*/
        super.setVida(8);
        /** Turnos que lleva el Caracubo en la partida*/
        super.setContador(0);
    }
    
    /** Método que controla el ataque de un zombie Deportista
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
    
    
    /** Metodo que permite atacar al Caracubo
     * @param p personaje, en este caso el zombie tipo Caracubo
     */
    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }
    
    
    /** Método que localiza al Caracubo en el tablero
     * @return la posición del zombie Caracubo y las vidas que le quedan */
    @Override
    public String localizador() {
        return "C(" + super.getVida()+")";
    }

    
    
    
}
