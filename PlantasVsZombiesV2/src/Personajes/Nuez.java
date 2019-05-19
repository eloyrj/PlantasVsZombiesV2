/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Excepciones.ExcepcionPlanta;
import Juego.Juego;
import java.io.Serializable;

/**
 *
 * @author corte
 */
public class Nuez extends Planta implements Serializable{

    public Nuez() {
        super();
        /** Tiene 3 unidades de vida*/
        super.setVida(10);
        /** Cuesta 50 soles*/
        super.setCoste(50);
        /** Lanza un guisante por turno*/
        super.setFrecuencia(0);
        /** Le resta una vida al enemigo por lanzamiento*/
        super.setDaño(0);
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
        //este personaje no actua solo es una barrara
    }

    @Override
    public void Ataque(Personaje p) {
        //este personaje no ataca
    }

    @Override
    public String localizador() {
        return "N(" + super.getVida()+")";
    }
    
}
