/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Excepciones.ExcepcionPlanta;
import Juego.Juego;

/**
 *
 * @author corte
 */
public class Petacereza extends Planta {

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
        super.setExcepcion(new ExcepcionPlanta());
        /** Atributo que cuenta los turnos que lleva el LanzaGuisantes en la partida*/
        super.setContador(0);
    }

    @Override
    public void addPlanta(int x, int y, Juego j) {
        if (getExcepcion().dentroTablero(x, y, j.getPartida().getTablero().lonX(), j.getPartida().getTablero().lonY()) && getExcepcion().casillaOcupada( j.getPartida().getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), j.getPartida().getSoles())){
            j.getPartida().getTablero().addT(x, y, this);        
            j.getPartida().setSoles(j.getPartida().getSoles()-getCoste());
            j.getPartida().setTurno(j.getPartida().getTurno()+1);
        }
    }

    @Override
    public void actua(Juego j) {
       if (getContador() % getFrecuencia() ==0){
            
            if ( this.getPosY()!= 0){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) instanceof Zombie  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ).muerto() && j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) != null){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1));
                }   
            }
            if (this.getPosY()!= j.getPartida().getTablero().lonY()){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1 ) instanceof Zombie  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ).muerto() && j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) != null){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1));
                }
            }
            if ( this.getPosX()!= 0 ){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ) instanceof Zombie  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ).muerto() && j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) != null){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY()));
                }
            }
            if ( this.getPosX()!= j.getPartida().getTablero().lonX()){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX()+1, super.getPosY() ) instanceof Zombie  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ).muerto() && j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) != null){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX()+1, super.getPosY()));
                }
            }
            this.setVida(0);
       }         
        
    }

    @Override
    public void Ataque(Personaje p) {
         p.setVida(p.getVida()-super.getDaño());
    }

    @Override
    public String localizador() {
        return "P(" + super.getVida()+")";
    }
    
}
