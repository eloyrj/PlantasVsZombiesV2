
package Juego;

import java.util.ArrayList;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */
public class Jugador {
    private String Nombre;
    private String DNI;
    private ArrayList<Partida> partidas ;
    private int[] puntosTotales; 
    private int partidasJugadas ;
    private int partidasGanadas;
    private int partidasPerdidas;

    public Jugador(String Nombre, String DNI) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        puntosTotales = new int[4] ;
        partidas = new ArrayList<>();
        
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
    
    public void actualizarPuntosTotales(){
        for (int i = 0;i < partidas.size(); i++){
            switch(partidas.get(i).getDificultad()){
                case("BAJA"):
                    puntosTotales[0]+=partidas.get(i).getPuntos();
                    break;
                    
                case("MEDIA"):
                    puntosTotales[1]+=partidas.get(i).getPuntos();
                    break;
                    
                case("ALTA"):
                    puntosTotales[2]+=partidas.get(i).getPuntos();
                    break;
                    
                case("IMPOSIBLE"):
                    puntosTotales[3]+=partidas.get(i).getPuntos();
                    break;
                
            }
        }
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }
    
    public void actualizarPartidasGanadas(){
        int ganadas = 0;
        for (int i = 0; i<partidas.size(); i++ ){
            if (partidas.get(i).isGanada())
                ganadas++;
        }
        partidasGanadas = ganadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
    
    public void actualizarPartidasPerdidas(){
        int perdidas = 0;
        for (int i = 0; i<partidas.size(); i++ ){
            if (!partidas.get(i).isGanada())
                perdidas++;
        }
        partidasPerdidas = perdidas;
    }
    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }
    public void addPartida(Partida p){
        partidas.add(p);
    }

    public int getPartidasJugadas() {
        actualizarPartidasJugadas();
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }
    
    public void actualizarPartidasJugadas(){
        partidasJugadas = partidas.size();
    }
    
    
    
    
}
