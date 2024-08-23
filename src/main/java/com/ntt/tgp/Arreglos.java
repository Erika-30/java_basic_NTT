package com.ntt.tgp;

import java.util.Arrays;
import java.util.List;

public class Arreglos {

    public static void main(String[] args) {

        // 1. Declaración e Inicialización de Arreglos
        int[] numeros = {1, 2, 3, 4, 5}; // Declaración e inicialización de un arreglo de enteros
        String[] palabras = new String[3]; // Declaración de un arreglo de cadenas con tamaño 3 (valores por defecto null)

        // Inicialización del arreglo 'palabras'
        palabras[0] = "Judith ";
        palabras[1] = "Está";
        palabras[2] = "Aprendiendo Java";

        // 2. Acceso a Elementos del Arreglo
        System.out.println("Primer número: " + numeros[0]); // Acceder al primer elemento del arreglo 'numeros'
        System.out.println("Segunda palabra: " + palabras[1]); // Acceder al segundo elemento del arreglo 'palabras'

        // 3. Modificación de Elementos del Arreglo
        numeros[2] = 10; // Modificar el tercer elemento del arreglo 'numeros'
        System.out.println("Nuevo valor en la posición 2: " + numeros[2]);

        // 4. Recorrer Arreglos
        // Recorrido con bucle for clásico
        System.out.println("Recorrido con for clásico:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Recorrido con bucle for-each
        System.out.println("Recorrido con for-each:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // 5. Uso de Arrays.asList()
        // Convertir un arreglo en una lista
        List<String> listaDePalabras = Arrays.asList(palabras);
        System.out.println("Lista convertida desde el arreglo: " + listaDePalabras);

        // 6. Uso de Arrays.sort()
        int[] desordenados = {5, 2, 9, 1, 3};
        Arrays.sort(desordenados); // Ordenar el arreglo
        System.out.println("Arreglo ordenado: " + Arrays.toString(desordenados));



    }
}

