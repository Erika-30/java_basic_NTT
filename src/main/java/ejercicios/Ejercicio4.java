package ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Número de términos de la secuencia de Fibonacci a calcular
        int n = 10;

        // Variables para almacenar los valores de Fibonacci
        int a = 0, b = 1, c;

        // Estructura for para iterar n veces
        for (int i = 0; i < n; i++) {
            // Imprimir el valor actual de Fibonacci
            System.out.println("Fibonacci número " + i + ": " + a);

            // Calcular el siguiente valor de Fibonacci
            c = a + b; // Sumar los dos últimos valores para obtener el siguiente
            a = b;     // Actualizar el valor de 'a' al valor de 'b'
            b = c;     // Actualizar el valor de 'b' al nuevo valor calculado 'c'
        }
    }
}