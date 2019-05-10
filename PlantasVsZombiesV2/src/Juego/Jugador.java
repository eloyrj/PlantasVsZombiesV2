
package Juego;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */
public class Jugador {
    private String Nombre;
    private String DNI;
    private int puntos; 
    private int partidasGanadas;
    private int partidasPerdidas;

    public Jugador(String Nombre, String DNI, int puntos, int partidasGanadas, int partidasPerdidas) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.puntos = puntos;
        this.partidasGanadas = partidasGanadas;
        this.partidasPerdidas = partidasPerdidas;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
    
    
}
