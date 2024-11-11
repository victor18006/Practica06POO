/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic.uabc.juegoahorcado;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

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

    public Ahorcado(List<Jugador> jugadores, int puntosObjetivo) {
        this.jugadores = jugadores;
        this.letrasIntentadas = new HashSet<>();
        this.puntosObjetivo = puntosObjetivo;
        this.bancoDeFrases = new BancoDeFrases();  // Crear instancia de BancoDeFrases
        this.frase = new Frase(bancoDeFrases.obtenerFraseAleatoria());  // Asignar frase inicial
        contadorRonda = 0;
    }

    //pasar logica a control
    /*public void jugarRonda() {
        boolean rondaTerminada = false;
        while (!rondaTerminada) {
            //for (Jugador jugador : jugadores) {
                //System.out.println("\nTurno de " + jugador.getNombre());
                //System.out.println("Puntos al momento: " + jugador.getPuntaje());
                //System.out.println("Frase: " + frase.mostrarFrase());
                System.out.print("Ingresa una letra: ");
                char letra = new Scanner(System.in).next().charAt(0);

                if (letrasIntentadas.contains(letra)) {
                    System.out.println("Letra ya utilizada. (Menos 3 puntos)");
                    jugador.modificarPuntaje(-3);
                    //System.out.println("\nJugador " + jugador.getNombre() + ", puntos al momento: " + jugador.getPuntaje());
                } else {
                    letrasIntentadas.add(letra);
                    if (frase.adivinarLetra(letra)) {
                        int apariciones = frase.contarApariciones(letra);
                        jugador.modificarPuntaje(3 * apariciones);
                        System.out.println("¡Adivinaste una letra! Puntos ganados: " + (3 * apariciones));
                        //System.out.println("Frase: " + frase.mostrarFrase());
                        //System.out.println("\nJugador " + jugador.getNombre() + ", puntos al momento: " + jugador.getPuntaje());
                    } else {
                        jugador.modificarPuntaje(-1);
                        System.out.println("La letra no está en la frase. (Menos -1 punto)");
                        //System.out.println("\nJugador " + jugador.getNombre() + ", puntos al momento: " + jugador.getPuntaje());
                    }

                    if (frase.fraseCompleta()) {
                        System.out.println("¡Frase completada!");
                        jugador.modificarPuntaje(5);
                        rondaTerminada = true;
                        break;
                    }
                }
            //}
        }
    }*/
    
    //pasar logica a ControlAhorcado
    /*public void iniciarJuego() {
        //while (jugadores.stream().noneMatch(j -> j.getPuntaje() >= puntosObjetivo)) {
            //letrasIntentadas.clear();
            //frase = new Frase(bancoDeFrases.obtenerFraseAleatoria());  // Obtener una nueva frase aleatoria
            //contadorRonda++;
            //System.out.println("\nRonda " + contadorRonda + ":");
            //jugarRonda();
            //System.out.println("Puntaje Objetivo: " + puntosObjetivo);
            //mostrarPuntajes();
        //}
        
        Jugador ganador = jugadores.stream().max((j1, j2) -> Integer.compare(j1.getPuntaje(), j2.getPuntaje())).orElse(null);
        if (ganador != null) {
            System.out.println("¡El ganador es " + ganador.getNombre() + " con " + ganador.getPuntaje() + " puntos!");
        }
    }*/
    
    
    //metodo para mostrar en recuadro puntajes al momento
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
    /*if (letrasIntentadas.contains(letra)) {
                    System.out.println("Letra ya utilizada. (Menos 3 puntos)");
                    jugador.modificarPuntaje(-3);
                    //System.out.println("\nJugador " + jugador.getNombre() + ", puntos al momento: " + jugador.getPuntaje());
                } else {
                    letrasIntentadas.add(letra);
                    if (frase.adivinarLetra(letra)) {
                        int apariciones = frase.contarApariciones(letra);
                        jugador.modificarPuntaje(3 * apariciones);
                        System.out.println("¡Adivinaste una letra! Puntos ganados: " + (3 * apariciones));
                        //System.out.println("Frase: " + frase.mostrarFrase());
                        //System.out.println("\nJugador " + jugador.getNombre() + ", puntos al momento: " + jugador.getPuntaje());
                    } else {
                        jugador.modificarPuntaje(-1);
                        System.out.println("La letra no está en la frase. (Menos -1 punto)");
                        //System.out.println("\nJugador " + jugador.getNombre() + ", puntos al momento: " + jugador.getPuntaje());
                    }

                    if (frase.fraseCompleta()) {
                        System.out.println("¡Frase completada!");
                        jugador.modificarPuntaje(5);
                        rondaTerminada = true;
                        break;
                    }
    */
}