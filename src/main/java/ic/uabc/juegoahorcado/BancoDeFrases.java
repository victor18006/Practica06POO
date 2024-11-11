/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ic.uabc.juegoahorcado;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author VOM
 */

public class BancoDeFrases {
    private HashMap<String, String> frases;

    public BancoDeFrases() {
        frases = new HashMap<>();
        inicializarFrases();
    }

    // Método para inicializar el banco con frases y sus categorías
    private void inicializarFrases() {
        frases.put("fruta1", "Ensalada de Manzana");
        frases.put("fruta2", "Agua de Sandia");
        frases.put("fruta3", "Salsa de Aguacate");
        frases.put("numero1", "Dos bicicletas");
        frases.put("numero2", "Tres platos");
        frases.put("comida1", "Sopa");
        frases.put("comida2", "Comida china");
        frases.put("comida3", "Ramen");
    }

    // Método para obtener una frase aleatoria del banco
    public String obtenerFraseAleatoria() {
        Random random = new Random();
        Object[] valores = frases.values().toArray();
        return (String) valores[random.nextInt(valores.length)];
    }
}