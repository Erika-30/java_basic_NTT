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

        // 7. Uso de Arrays.binarySearch()
        int posicion = Arrays.binarySearch(desordenados, 9); // Buscar el número 9 en el arreglo ordenado
        System.out.println("Posición del número 9 en el arreglo ordenado: " + posicion);

        // 8. Uso de Arrays.copyOf()
        int[] copiaNumeros = Arrays.copyOf(numeros, 7); // Copiar los primeros 5 elementos del arreglo 'numeros' en un nuevo arreglo de tamaño 7
        System.out.println("Copia del arreglo con nuevos elementos inicializados a 0: " + Arrays.toString(copiaNumeros));

        // 9. Uso de Arrays.equals()
        int[] numeros2 = {1, 2, 10, 4, 5}; // Arreglo para comparación
        boolean sonIguales = Arrays.equals(numeros, numeros2); // Comparar si 'numeros' y 'numeros2' son iguales
        System.out.println("¿Son iguales los arreglos 'numeros' y 'numeros2'?: " + sonIguales);

        // 10. Uso de Arrays.fill()
        int[] vacios = new int[5];
        Arrays.fill(vacios, 7); // Llenar el arreglo 'vacios' con el valor 7
        System.out.println("Arreglo llenado con 7: " + Arrays.toString(vacios));

        // 11. Uso de Arrays.toString()
        System.out.println("Contenido del arreglo 'numeros': " + Arrays.toString(numeros)); // Convertir el arreglo a una cadena de texto

        // 12. Uso de Arrays.stream()
        System.out.println("Usando stream para imprimir cada número del arreglo 'numeros':");
        Arrays.stream(numeros).forEach(System.out::println); // Convertir el arreglo en un Stream y recorrerlo para imprimir cada elemento
    }
}

