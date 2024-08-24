package com.ntt.tgp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Clase ficticia Persona para el ejemplo
class Persona { // Clase Persona con dos atributos: nombre y edad
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos de acceso para los atributos de la clase Persona
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }

    // Método toString para imprimir la información de la persona
    // Este método se invoca automáticamente al imprimir un objeto Persona
    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

public class Arreglos {

    public static void main(String[] args) {

        // 1. Declaración e Inicialización de Arreglos

        // Arreglo de enteros
        int[] numeros = {1, 2, 3, 4, 5}; // Declaración e inicialización de un arreglo de enteros de forma directa con valores específicos

        // Arreglo de cadenas (Strings)
        String[] palabras = new String[3]; // Declaración de un arreglo de cadenas con tamaño 3, pero sin valores iniciales (valores por defecto null)

        // Inicialización del arreglo 'palabras'
        palabras[0] = "Judith";
        palabras[1] = "Está";
        palabras[2] = "Aprendiendo Java";

        // Arreglo de caracteres
        char[] letras = {'A', 'B', 'C', 'D'}; // Declaración e inicialización de un arreglo de caracteres

        // Arreglo de números decimales (doubles)
        double[] decimales = {1.1, 2.2, 3.3, 4.4}; // Declaración e inicialización de un arreglo de números decimales

        // Arreglo de valores booleanos
        boolean[] respuestas = {true, false, true}; // Declaración e inicialización de un arreglo de valores booleanos

        // Arreglo de objetos (Ejemplo: Personas)
        Persona[] personas = new Persona[2]; // Declaración de un arreglo de objetos Persona con tamaño 2
        personas[0] = new Persona("Ana", 25); // Inicialización de los objetos en el arreglo
        personas[1] = new Persona("Luis", 30);

        // 2. Acceso a Elementos del Arreglo
        System.out.println("Primer número: " + numeros[0]); // Acceder al primer elemento del arreglo 'numeros'
        System.out.println("Segunda palabra: " + palabras[1]); // Acceder al segundo elemento del arreglo 'palabras'
        System.out.println("Primera letra: " + letras[0]); // Acceder al primer elemento del arreglo 'letras'
        System.out.println("Primer decimal: " + decimales[0]); // Acceder al primer elemento del arreglo 'decimales'
        System.out.println("Primera respuesta: " + respuestas[0]); // Acceder al primer valor booleano del arreglo 'respuestas'
        System.out.println("Nombre de la primera persona: " + personas[0].getNombre()); // Acceder al nombre del primer objeto Persona en el arreglo

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
        for (String p : palabras) {
            System.out.println(p);
        }

        // Recorrer arreglo de caracteres con for-each
        System.out.println("Recorrido de caracteres con for-each:");
        for (char letra : letras) {
            System.out.println(letra);
        }

        // 5. Uso de Arrays.asList()
        List<String> listaDePalabras = new ArrayList<>(Arrays.asList(palabras));
        listaDePalabras.add("hoy"); // Ahora puedes agregar elementos
        listaDePalabras.set(1, "Es"); // También puedes modificar elementos existentes

        System.out.println("Lista modificada: " + listaDePalabras);

        // 6. Uso de Arrays.sort()
        //Arrays.sort(array); // Ordenar un arreglo de forma ascendente
        // Ejemplo 1: Ordenar un array de enteros en orden ascendente
        int[] desordenados = {5, 2, 9, 1, 3};
        Arrays.sort(desordenados); // Ordenar el array en orden ascendente (menor a mayor)
        System.out.println("Arreglo ordenado en orden ascendente: " + Arrays.toString(desordenados));

        // Ejemplo 2: Ordenar un array de enteros en orden descendente
        Integer[] numerosDesc = {5, 2, 9, 1, 3}; // Usamos Integer en lugar de int porque Arrays.sort() requiere un tipo de objeto (no primitivo)

        Arrays.sort(numerosDesc, Collections.reverseOrder()); //Arrays.sort con dos argumentos
        //Arrays.sort(array, comparator);

        // Ordenar en orden descendente (mayor a menor)
        // Collections es una clase de utilidad que proporciona métodos para trabajar con colecciones y arrays
        //.reverseOrder()) es un método estático que devuelve un comparador que impone el orden inverso del comparador natural
        //Collections.reverseOrder() devuelve un comparador que impone el orden inverso del comparador natural

        System.out.println("Arreglo ordenado en orden descendente: " + Arrays.toString(numerosDesc));

        // Ejemplo 3: Ordenar un array de cadenas en orden alfabético (ascendente)
        String[] palabrasOrdenadas = {"Banana", "Manzana", "Cereza"};
        Arrays.sort(palabrasOrdenadas); // Ordenar en orden alfabético
        System.out.println("Palabras ordenadas alfabéticamente: " + Arrays.toString(palabrasOrdenadas));

        // Ejemplo 4: Ordenar un array de cadenas en orden alfabético inverso (descendente)
        Arrays.sort(palabrasOrdenadas, Collections.reverseOrder()); // Ordenar en orden alfabético inverso
        System.out.println("Palabras ordenadas en orden inverso: " + Arrays.toString(palabrasOrdenadas));

        // Ejemplo 5: Ordenar un array de objetos personalizados (Personas) por edad en orden ascendente
        Persona[] personasOrdenadas = {
                new Persona("Ana", 30),
                new Persona("Luis", 25),
                new Persona("Marta", 28)
        };
        Arrays.sort(personasOrdenadas, Comparator.comparingInt(Persona::getEdad)); // Ordenar personas por edad en orden ascendente (menor a mayor)
        System.out.println("Personas ordenadas por edad (ascendente): " + Arrays.toString(personasOrdenadas));

        // Ejemplo 6: Ordenar un array de objetos personalizados (Personas) por edad en orden descendente
        //Comparator.comparingInt(Persona::getEdad) devuelve un comparador que compara los objetos Persona por su edad
        //sintaix: Arrays.sort(array, comparator);
        Arrays.sort(personasOrdenadas, Comparator.comparingInt(Persona::getEdad).reversed()); // Ordenar personas por edad en orden descendente (mayor a menor)
        System.out.println("Personas ordenadas por edad (descendente): " + Arrays.toString(personasOrdenadas));

        // 7. Uso de Arrays.binarySearch()
        //sintaxis Arrays.binarySearch(array, valor);
        // requisito: el arreglo debe estar ordenado de menor a mayor
        int posicion = Arrays.binarySearch(desordenados, 9); // Buscar el número 9 en el arreglo ordenado
        System.out.println("Posición del número 9 en el arreglo ordenado: " + posicion);

        // Ejemplo 2: Buscar un elemento en un arreglo de cadenas
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        Arrays.sort(nombres); // Ordenar el array en orden alfabético
        int posicionBuscada = Arrays.binarySearch(nombres, "Marta"); // Buscar "Marta" en el array
        System.out.println("Posición de 'Marta' en el arreglo ordenado: " + posicionBuscada);

        // 8. Uso de Arrays.copyOf()
        int[] numbers = {1, 2, 3, 4, 5}; // Array original

        // Copiar el array 'numeros' en un nuevo array de tamaño 7
        int[] copiaNumeros = Arrays.copyOf(numbers, 7);

        // Asignar valores a los dos elementos adicionales
        copiaNumeros[5] = 6; // Asignar el valor 6 al sexto elemento
        copiaNumeros[6] = 7; // Asignar el valor 7 al séptimo elemento

        // Imprimir el array completo
        System.out.println("Copia del arreglo con valores asignados a los elementos añadidos: " + Arrays.toString(copiaNumeros));

        // 9. Uso de Arrays.equals()
        int[] numeros2 = {1, 2, 10, 4, 5}; // Arreglo para comparación
        boolean sonIguales = Arrays.equals(numbers, numeros2); // Comparar si 'numeros' y 'numeros2' son iguales
        System.out.println("¿Son iguales los arreglos 'numbers' y 'numeros2'?: " + sonIguales);

        // 10. Uso de Arrays.fill() // Llenar un arreglo con un valor específico
        int[] vacios2 = new int[5]; // Arreglo vacío de tamaño 5
        Arrays.fill(vacios2, 7); // Llenar el arreglo 'vacios' con el valor 7
        System.out.println("Arreglo llenado con 7: " + Arrays.toString(vacios2));

        // Caso 1: Llenar todo el arreglo con un valor específico
        int[] vacios = new int[5]; // Arreglo vacío de tamaño 5
        Arrays.fill(vacios, 7); // Llenar el arreglo 'vacios' con el valor 7
        System.out.println("Caso 1 - Arreglo llenado con 7: " + Arrays.toString(vacios));
        // Resultado: [7, 7, 7, 7, 7]

        // Caso 2: Llenar solo una parte del arreglo con un valor específico
        int[] numeros3 = {0, 1, 2, 3, 4, 5}; // Arreglo inicial con valores específicos
        Arrays.fill(numeros3, 1, 4, 9); // Llenar posiciones 1 a 3 con el valor 9 (4 no se incluye)
        System.out.println("Caso 2 - Arreglo con parte llenada con 9: " + Arrays.toString(numeros3));
        // Resultado: [0, 9, 9, 9, 4, 5]

        // Caso 3: Reemplazar valores específicos con valores diferentes
        int[] otrosNumeros = {0, 1, 2, 3, 4, 5}; // Arreglo inicial con valores específicos
        otrosNumeros[2] = 9; // Reemplazar el valor en la posición 2 con 9
        otrosNumeros[3] = 8; // Reemplazar el valor en la posición 3 con 8
        System.out.println("Caso 3 - Arreglo con posiciones 2 y 3 reemplazadas con 9 y 8: " + Arrays.toString(otrosNumeros));
        // Resultado: [0, 1, 9, 8, 4, 5]

        // Caso 4: Llenar el arreglo de manera parcial y luego asignar valores distintos a otras posiciones
        int[] mixto = new int[7]; // Arreglo vacío de tamaño 7
        Arrays.fill(mixto, 0, 4, 5); // Llenar posiciones 0 a 3 con el valor 5
        mixto[4] = 10; // Reemplazar la posición 4 con 10
        mixto[5] = 15; // Reemplazar la posición 5 con 15
        mixto[6] = 20; // Reemplazar la posición 6 con 20
        System.out.println("Caso 4 - Arreglo mixto con fill parcial y asignaciones: " + Arrays.toString(mixto));
        // Resultado: [5, 5, 5, 5, 10, 15, 20]

        // 11. Uso de Arrays.toString() // Convertir un arreglo en una cadena de texto
        //sintaxis: Arrays.toString(array);
        System.out.println("Contenido del arreglo 'numeros': " + Arrays.toString(numeros)); // Convertir el arreglo a una cadena de texto
        // Resultado: [1, 2, 10, 4, 5]

        // 12. Uso de Arrays.stream()
        //sintaxis: Arrays.stream(array).forEach(System.out::println);
        //stream() convierte el arreglo en un Stream, stream es una secuencia de elementos que admite operaciones de agregación y secuenciales
        System.out.println("Usando stream para imprimir cada número del arreglo 'numeros':"); // Imprimir cada elemento del arreglo 'numeros'
        Arrays.stream(numeros).forEach(System.out::println); // Convertir el arreglo en un Stream y recorrerlo para imprimir cada elemento
    }
}
