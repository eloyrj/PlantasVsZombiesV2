
package Juego;

import java.io.Serializable;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase jugador nos permitirá conocer los datos del jugador en una partida*/
public class Jugador implements Serializable{
    /** Atributo que nos proporciona el nombre del jugador*/
    private String Nombre;
    /** Atributo que nos proporciona el DNI del jugador*/
    private String DNI;
    /** Atributo que nos indica si la partida se ha quedado sin finalizar*/
    private Partida partidaNoFin;
    /** Atributo que nos proporciona los puntos que posee el jugador*/
    private int[] puntosTotales; 
    /** Atributo que nos indica el número de partidas que ha jugado el jugador*/
    private int partidasJugadas ;
    /** Atributo que nos indica el número de partidas ganadas por el jugador*/
    private int partidasGanadas;
    /** Atributo que nos indica el número de partidas perdidas por el jugadosr*/
    private int partidasPerdidas;

    /** Constructor de Jugador
     * @param Nombre del jugador
     * @param DNI del jugador
     */
    public Jugador(String Nombre, String DNI) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        puntosTotales = new int[4] ;  
    }
    
    /** Método que actualizará todas las posibles vertientes que tiene una partida
     * @param p la partida en curso
     */
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
    
    /** Método que nos indica si se ha terminado una partida*/
    public void seTermino(){
        partidaNoFin = null;
    }
    
    /** Método que actualizará los puntos obtenidos una partida jugada
     * @param p la partida de la que se quieren recoger los puntos
     */
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
    
    /** Método que actualizará las partidas ganadas por el jugador
     * @param p la partida jugada y ganada
     */
    public void actualizarPartidasGanadas(Partida p){
        if (p.isGanada()) partidasGanadas += 1;
        
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
    
    
    /** Método que actualizará las partidas perdidas por el jugador
     * @param p la partida jugada y perdida
     */
    public void actualizarPartidasPerdidas(Partida p){
        if (!p.isGanada()) partidasPerdidas += 1;  
    }
    

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }
    
    /** Método que actualizará todas las partidas jugadas por el jugador*/
    public void actualizarPartidasJugadas(){
        partidasJugadas ++;
    }

    
    
    
}
