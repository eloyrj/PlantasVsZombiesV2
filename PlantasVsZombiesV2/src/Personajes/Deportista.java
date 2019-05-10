
package Personajes;

import Juego.Juego;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */
public class Deportista extends Zombie{
    
        /** Constructor de Zombie Deportista
         */
        public Deportista() {
        super();
        /** El zombie Deportista avanza 1 casilla cada turno*/
        super.setVelocidad(1);
        /** Le resta una vida al enemigo cada turno que se encuentre frente a él*/
        super.setDaño(1);
        /** El zombie Deportista tendrá 2 vidas*/
        super.setVida(2);
        /** Turnos que lleva el Deportista en la partida*/
        super.setContador(0);
    }

    /** Método que controla el ataque de un zombie Deportista
     * @param j partida
     */
    @Override
    public void actua(Juego j) {
        if (this.getPosX()==1) j.fin();
        
        
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

    /** Metodo que permite atacar al Deportista
     * @param p personaje, en este caso el zombie tipo Deportista
     */
    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }

    /** Método que localiza al Deportista en el tablero
     * @return la posición del zombie Deportista y las vidas que le quedan */
    @Override
    public String localizador() {
        return "D(" + super.getVida()+")";
    }
    
}
