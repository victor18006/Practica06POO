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
        frases.put("fruta", "Ensalda de Manzana");
        frases.put("fruta", "Agua de Sandia");
        frases.put("fruta", "Salsa de Aguacate");
        frases.put("numero", "Dos bicicletas");
        frases.put("numero", "Tres platos");
        frases.put("comida", "Sopa");
        frases.put("comida", "Comida china");
        frases.put("comida", "Ramen");
    }

    // Método para obtener una frase aleatoria del banco
    public String obtenerFraseAleatoria() {
        Random random = new Random();
        Object[] valores = frases.values().toArray();
        return (String) valores[random.nextInt(valores.length)];
    }
}