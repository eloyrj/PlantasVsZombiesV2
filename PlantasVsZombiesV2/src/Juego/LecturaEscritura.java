/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author eloy
 */
public class LecturaEscritura {
    /** Atributo que controla los jugadores registrados en el juego*/
    private HashMap<String, Jugador> jugadores ;
    

    public LecturaEscritura() {
        jugadores = new HashMap<>();
        
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
    
    public void borrarJugador(String dni){
        jugadores.remove(dni);
    }

    
    
    
    public void guardarDatos() throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("jugadores.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(jugadores);
        fos.close();
    }
    
    public void leerDatos() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("jugadores.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        jugadores = (HashMap<String, Jugador>) ois.readObject();
        fis.close();
        
    }
}
