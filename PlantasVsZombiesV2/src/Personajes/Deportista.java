
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

    @Override
    public void actua(Juego j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
