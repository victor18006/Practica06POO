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
        frases.put("fruta1", "Ensalada de Manzana chica");
        frases.put("fruta2", "Agua de Sandia Dulce");
        frases.put("fruta3", "Salsa de Aguacate Verde");
        frases.put("numero1", "Dos bicicletas con Ruedas");
        frases.put("numero2", "Tres platos grandes blancos");
        frases.put("comida1", "Sopa de caracol del mar");
        frases.put("comida2", "Comida china de la plaza");
        frases.put("comida3", "Ramen con fideos y pollo");
    }

    // Método para obtener una frase aleatoria del banco
    public String obtenerFraseAleatoria() {
        Random random = new Random();
        Object[] valores = frases.values().toArray();
        return (String) valores[random.nextInt(valores.length)];
    }
}