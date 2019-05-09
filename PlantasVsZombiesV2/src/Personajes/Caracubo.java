
package Personajes;

import Juego.Juego;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */
public class Caracubo extends Zombie{
    
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

    
    @Override
    public void actua(Juego j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
