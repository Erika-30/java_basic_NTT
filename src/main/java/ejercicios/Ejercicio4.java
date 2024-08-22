package ejercicios;

import java.util.List;
import java.util.Scanner; // Importa la clase Scanner que permite leer datos desde la consola

public class Ejercicio4 { // Definimos la clase Ejercicio4
    public static void main(String[] args) { // Método principal que ejecuta el programa
        // Crear una instancia de Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de términos de la secuencia de Fibonacci a calcular
        System.out.print("Ingrese el número de términos de la secuencia de Fibonacci a calcular: ");
        int n = scanner.nextInt(); // Lee el número entero ingresado por el usuario y lo almacena en la variable n

        // Inicializar los primeros dos números de la secuencia de Fibonacci
        int a = 0; // El primer número de la secuencia es 0
        int b = 1; // El segundo número de la secuencia es 1

        // Estructura for para iterar n veces
        for (int i = 0; i < n; i++) { // El bucle se ejecutará n veces
            // Imprimir el valor actual de Fibonacci
            System.out.println("Ejecución " + (i + 1) + ":");
            System.out.println("Fibonacci número " + i + ": " + a);

            // Calcular el siguiente valor de Fibonacci
            int c = a + b; // Sumar los dos últimos valores para obtener el siguiente
            System.out.println("Calculando siguiente valor: " + a + " + " + b + " = " + c);

            // Actualizar los valores de 'a' y 'b'
            a = b;         // Actualizar el valor de 'a' al valor de 'b'
            b = c;         // Actualizar el valor de 'b' al nuevo valor calculado 'c'
            System.out.println("Actualizando valores - a: " + a + ", b: " + b);
        }

//        List.of("hoal", "mundo").stream().map(jj->s).forEach(System.out::println);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}