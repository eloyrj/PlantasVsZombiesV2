
package Juego;


import interfaz.Comandos;
import Excepciones.ExcepcionJuego;
import Personajes.Caracubo;
import Personajes.Deportista;
import Personajes.Zombie;
import Personajes.ZombieComun;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;



/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase Juego engloba todos los comandos, excepciones y partidas que habrá al iniciar una partida
*/
public class Juego {
    /** Atributo para controlar los comandos introducidos por teclado de la partida*/
    private Comandos comandos;
    /** Atributo que indica la partida a jugar*/
    private Partida partida;
    /** Atributo que controla las excepciones que puede tener el juego*/
    private ExcepcionJuego excepcionJuego;
    /** Atributo que cuenta el número de Zombies que aparecerán en la partida*/
    private int totalEnemigos;
    /** Atributo que cuenta los turnos que tendrá la partida en total*/
    private int turnosTotales;
    /** Atributo que controla el turno anterior al actual*/
    private int turnoAnt;
    
    private HashMap<String, Jugador> jugadores = new HashMap<>();
    


    /** Constructor de Juego
     * @param comandos comandos del juego
     * @param excepcionJuego excepciones del juego
     */
    public Juego(Comandos comandos, ExcepcionJuego excepcionJuego) {
        this.comandos = comandos;
        this.excepcionJuego = excepcionJuego;
    }

    public Comandos getComandos() {
        return comandos;
    }

    public void setComandos(Comandos comandos) {
        this.comandos = comandos;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public ExcepcionJuego getExcepcionJuego() {
        return excepcionJuego;
        
    }

    public int getTotalEnemigos() {
        return totalEnemigos;
    }

    public void setTotalEnemigos(int totalEnemigos) {
        this.totalEnemigos = totalEnemigos;
    }
    
    

    public int getTurnosTotales() {
        return turnosTotales;
    }

    public void setTurnosTotales(int turnosTotales) {
        this.turnosTotales = turnosTotales;
    }
    
    

    public void setExcepcionJuego(ExcepcionJuego excepcionJuego) {
        this.excepcionJuego = excepcionJuego;
    }

    public HashMap<String, Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashMap<String, Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void añadirJugador(Jugador j){
        String dni = j.getDNI();
        jugadores.put(dni, j);
    }
    
    public Jugador buscarJugador(String dni){
        return jugadores.get(dni);
    } 
    
    public void guardarDatos() throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("fichero.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(jugadores);
        fos.close();
    }
    public void leerDatos() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("fichero.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        jugadores = (HashMap<String, Jugador>) ois.readObject();
        fis.close();
    }
    
    /** Método que actualiza la partida a cada turno que pasa
     * @param j partida en curso
    */
    public void actualizar(Juego j){
        if (j.getPartida() != null){
                if (turnoAnt != j.getPartida().getTurno()){
                    turnoAnt = j.getPartida().getTurno();
                    for (int i =0; i< j.getPartida().getTablero().lonY();i++){
                        for (int p =0 ; p < j.getPartida().getTablero().lonX() ; p++){
                            if (j.getPartida().getTablero().getTableroPos(p+1, i+1) != null && !j.getPartida().getTablero().getTableroPos(p+1, i+1).muerto()){
                                j.getPartida().getTablero().getTableroPos(p+1, i+1).setContador(j.getPartida().getTablero().getTableroPos(p+1, i+1).getContador()+1);
                                j.getPartida().getTablero().getTableroPos(p+1, i+1).actua(j);
                            }
                            else if (j.getPartida().getTablero().getTableroPos(p+1, i+1) != null && j.getPartida().getTablero().getTableroPos(p+1, i+1).muerto()){
                                j.getPartida().getTablero().setTableroPos(p+1, i+1,null);
                            }
                        }
                    }
                    if (getPartida().getTurno()>getPartida().getTurnoInicial() && totalEnemigos < getPartida().getEnemigos() ){
                        int zombiesRonda = (int) (Math.random() * getPartida().getTablero().lonY());
                        int zombiesGenerados=0;
                        int tipoZombie = (int) (Math.random()*3);
                        for (int i = 0; i<zombiesRonda; i++){
                            int pos =(int) (Math.random() * getPartida().getTablero().lonY()) + 1;
                            Zombie z ;
                            switch (tipoZombie) {
                                case 0:
                                    z = new ZombieComun();
                                    break;
                                case 1:
                                    z = new Caracubo();
                                    break;
                                default:
                                    z = new Deportista();
                                    break;
                            }
                            
                            if (getPartida().getTablero().getTableroPos(getPartida().getTablero().lonX(),pos) == null){
                                getPartida().getTablero().addT(getPartida().getTablero().lonX(), pos, z);
                                z.setPosX(getPartida().getTablero().lonX());
                                z.setPosY(pos);
                                zombiesGenerados++;
                            }
                        }
                        totalEnemigos += zombiesGenerados;
                    }                      
                }
        }
        
    }
}
