
package Juego;

import java.io.Serializable;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */
public class Jugador implements Serializable{
    private String Nombre;
    private String DNI;
    private Partida partidaNoFin;
    private int[] puntosTotales; 
    private int partidasJugadas ;
    private int partidasGanadas;
    private int partidasPerdidas;

    public Jugador(String Nombre, String DNI) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        puntosTotales = new int[4] ;
        
        
    }
    public void actualizar(Partida p){
        actualizarPartidasGanadas(p);
        actualizarPartidasJugadas();
        actualizarPartidasPerdidas(p);
        actualizarPuntosTotales(p);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int[] getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int[] puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public Partida getPartidaNoFin() {
        return partidaNoFin;
    }

    public void setPartidaNoFin(Partida partidaNoFin) {
        this.partidaNoFin = partidaNoFin;
    }
    
    public void seTermino(){
        partidaNoFin = null;
    }
    
    public void actualizarPuntosTotales(Partida p){
        
            switch(p.getDificultad()){
                case("BAJA"):
                    puntosTotales[0]+=p.getPuntos();
                    break;
                    
                case("MEDIA"):
                    puntosTotales[1]+=p.getPuntos();
                    break;
                    
                case("ALTA"):
                    puntosTotales[2]+=p.getPuntos();
                    break;
                    
                case("IMPOSIBLE"):
                    puntosTotales[3]+=p.getPuntos();
                    break;
                
            }
        
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }
    
    public void actualizarPartidasGanadas(Partida p){
        
        
            if (p.isGanada())
                partidasGanadas += 1;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
    
    public void actualizarPartidasPerdidas(Partida p){
        
            if (!p.isGanada())
                partidasPerdidas += 1;
    }
    

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }
    
    public void actualizarPartidasJugadas(){
        partidasJugadas ++;
    }

    
    
    
}
