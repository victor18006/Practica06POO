/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic.uabc.juegoahorcado;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author VOM
 */

public class Ahorcado {

    protected List<Jugador> jugadores;
    protected Frase frase;
    protected HashSet<Character> letrasIntentadas;
    private int puntosObjetivo;
    private BancoDeFrases bancoDeFrases;
    private int contadorRonda;
    protected Jugador ganador;

    public Ahorcado(List<Jugador> jugadores, int puntosObjetivo) {
        this.jugadores = jugadores;
        this.letrasIntentadas = new HashSet<>();
        this.puntosObjetivo = puntosObjetivo;
        this.bancoDeFrases = new BancoDeFrases();  // Crear instancia de BancoDeFrases
        this.frase = new Frase(bancoDeFrases.obtenerFraseAleatoria());  // Asignar frase inicial
        contadorRonda = 0;
    }
    
    private void mostrarPuntajes() {
        System.out.println("Puntajes actuales:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + ": " + jugador.getPuntaje() + " puntos");
        }
    }
    
    public void clearLetrasIntentadas(){
        letrasIntentadas.clear();
    }
    
    public void nuevaFrase(){
    frase = new Frase(bancoDeFrases.obtenerFraseAleatoria());  // Obtener una nueva frase aleatoria
    }
    
    public boolean letraIntentada(char letra){
        return letrasIntentadas.contains(letra);
    }
    
    public void buscarGanador() {
        this.ganador = jugadores.stream().max((j1, j2) -> Integer.compare(j1.getPuntaje(), j2.getPuntaje())).orElse(null);  // Si la lista está vacía, ganador será null
    }
}