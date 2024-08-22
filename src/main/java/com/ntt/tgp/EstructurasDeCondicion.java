package com.ntt.tgp;

public class EstructurasDeCondicion {
    public static void main(String[] args) {
        // Declaración de una variable inicializada con un valor para evaluar en las estructuras de control de flujo
        int numero = 5;

        // Estructura if
        // La sentencia if es una estructura de control de flujo que permite ejecutar un bloque de código si una condición es verdadera.
        if (numero > 0) {
            // En este caso, si el número es mayor a 0, se imprime el mensaje "El número es positivo."
            // Cuando la condición no se cumple, no se imprime nada.
            System.out.println("El número es positivo.");
        }

        // Estructura if-else
        // La sentencia if-else es una estructura de control de flujo que permite ejecutar un bloque de código si una condición es verdadera y otro bloque de código si la condición es falsa.
        if (numero % 2 == 0) {
            // En este caso, si el número es par, se imprime el mensaje "El número es par."
            System.out.println("El número es par.");
        } else {
            // Si la condición no se cumple, se imprime el mensaje "El número es impar."
            System.out.println("El número es impar.");
        }

        // Estructura else-if combinada con operadores lógicos
        // La sentencia else-if permite evaluar múltiples condiciones en secuencia.
        if (numero < 0) {
            // En este caso, si el número es menor a 0, se imprime el mensaje "El número es negativo."
            System.out.println("El número es negativo.");
        } else if (numero == 0) {
            // Si el número es igual a 0, se imprime el mensaje "El número es cero."
            System.out.println("El número es cero.");
        } else if (numero > 0 && numero <= 5) {
            // Si el número es mayor a 0 y menor o igual a 5, se imprime el mensaje "El número es positivo y está entre 1 y 5."
            System.out.println("El número es positivo y está entre 1 y 5.");
        } else {
            // Si ninguna de las condiciones anteriores se cumple, se imprime el mensaje "El número es positivo y mayor a 5."
            System.out.println("El número es positivo y mayor a 5.");
        }

        // Estructura switch
        // La sentencia switch permite seleccionar entre múltiples bloques de código a ejecutar, basándose en el valor de una expresión.
        switch (numero) {
            case 1:
                // Si el número es 1, se imprime el mensaje "El número es uno."
                System.out.println("El número es uno.");
                break;
            case 2:
                // Si el número es 2, se imprime el mensaje "El número es dos."
                System.out.println("El número es dos.");
                break;
            case 3:
                // Si el número es 3, se imprime el mensaje "El número es tres."
                System.out.println("El número es tres.");
                break;
            case 4:
                // Si el número es 4, se imprime el mensaje "El número es cuatro."
                System.out.println("El número es cuatro.");
                break;
            case 5:
                // Si el número es 5, se imprime el mensaje "El número es cinco."
                System.out.println("El número es cinco.");
                break;
            default:
                // Si el número no está entre 1 y 5, se imprime el mensaje "El número no está entre 1 y 5."
                System.out.println("El número no está entre 1 y 5.");
                break;
        }
    }
}