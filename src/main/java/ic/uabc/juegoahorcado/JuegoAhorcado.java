/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ic.uabc.juegoahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author VOM
 */

public class JuegoAhorcado {
    
    public static void main(String[] args) {
        int numeroJugadores;
        Scanner scanner = new Scanner(System.in);

        do{
        System.out.print("Ingresa el número de jugadores (2-4): ");
        numeroJugadores = scanner.nextInt();
        }while(numeroJugadores<2 || numeroJugadores >4);
        List<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= numeroJugadores; i++) {
            System.out.print("Ingresa el nombre del jugador " + i + ": ");
            jugadores.add(new Jugador(scanner.next()));
        }

        System.out.print("Ingresa el puntaje a alcanzar: ");
        int puntosObjetivo = scanner.nextInt();

        Ahorcado ahorcado = new Ahorcado(jugadores, puntosObjetivo);
        ahorcado.iniciarJuego();
    }
}