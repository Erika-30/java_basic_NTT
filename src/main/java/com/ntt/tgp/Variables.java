package com.ntt.tgp;

public class Variables {
    public static void main(String[] args) {
        // Tipos de datos primitivos en Java
        int numeroEntero = 10;          // Tipo de dato int: Almacena números enteros (sin decimales)
        double numeroDecimal = 5.99;    // Tipo de dato double: Almacena números con decimales
        char caracter = 'A';            // Tipo de dato char: Almacena un solo carácter
        boolean esVerdadero = true;     // Tipo de dato boolean: Almacena valores de verdadero (true) o falso (false)

        // Tipo de dato String en Java (No es primitivo, pero se usa mucho)
        String texto = "Hola, NTT Data!";  // Tipo de dato String: Almacena cadenas de texto

        // Mostrando los valores de las variables
        System.out.println("El valor de numeroEntero es: " + numeroEntero);
        System.out.println("El valor de numeroDecimal es: " + numeroDecimal);
        System.out.println("El valor de caracter es: " + caracter);
        System.out.println("El valor de esVerdadero es: " + esVerdadero);
        System.out.println("El valor de texto es: " + texto);

        // Usando una variable en un bucle for
        for (int i = 1; i <= numeroEntero; i++) {
            System.out.println("i = " + i);
        }

        // Pasos para creación de una variable
        // Paso 1: Declarar la variable con el tipo de dato
        int nuevaVariable;

        // Paso 2: Inicializar la variable
        nuevaVariable = 20;

        // Paso 3: Ejecución
        System.out.println("El valor de nuevaVariable es: " + nuevaVariable);
    }
}