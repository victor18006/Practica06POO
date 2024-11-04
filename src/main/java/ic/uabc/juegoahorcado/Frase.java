/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic.uabc.juegoahorcado;

import java.util.HashSet;

/**
 *
 * @author VOM
 */

public class Frase {
    private String frase;
    private HashSet<Character> letrasAdivinadas;

    public Frase(String frase) {
        this.frase = frase.toLowerCase(); // Convertimos la frase a minúsculas para evitar problemas de comparación
        this.letrasAdivinadas = new HashSet<>();
    }

    public boolean adivinarLetra(char letra) {
        letra = Character.toLowerCase(letra);
        if (frase.indexOf(letra) >= 0 && !letrasAdivinadas.contains(letra)) {
            letrasAdivinadas.add(letra);
            return true;
        }
        return false;
    }

    public int contarApariciones(char letra) {
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (c == letra) contador++;
        }
        return contador;
    }

    public boolean fraseCompleta() {
        for (char c : frase.toCharArray()) {
            if (c != ' ' && !letrasAdivinadas.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public String mostrarFrase() {
        StringBuilder builder = new StringBuilder();
        for (char c : frase.toCharArray()) {
            if (c == ' ' || letrasAdivinadas.contains(c)) {
                builder.append(c);
            } else {
                builder.append('_');
            }
        }
        return builder.toString();
    }
}