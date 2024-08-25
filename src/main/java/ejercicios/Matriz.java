package ejercicios;

public class Matriz {

    public static void main(String[] args) {
        // Declarar e inicializar la matriz de notas
        int[][] matriz = {
                {1, 2, 3, 4, 5},   // Fila 0
                {2, 4, 6, 8, 10},  // Fila 1
                {3, 6, 9, 12, 15}  // Fila 2
        };

        System.out.println(matriz.length);

        // Llamar a los métodos para obtener las posiciones del valor máximo y mínimo
        int[] maxPosicion = encontrarMaximo(matriz);  // Encuentra la posición del valor máximo
        //int[] maxPosicion = encontrarMaximo(matriz); devuelve un array de dos elementos en la siguiente forma: [fila, columna]
        int[] minPosicion = encontrarMinimo(matriz);  // Encuentra la posición del valor mínimo

        // Imprimir los resultados del valor máximo y su posición
        System.out.println("El mayor número es " + matriz[maxPosicion[0]][maxPosicion[1]] +
                // Imprimir los resultados del valor máximo y su posición
                " y se encuentra en la fila " + maxPosicion[0] + ", columna " + maxPosicion[1]);

        // Imprimir los resultados del valor mínimo y su posición
        System.out.println("El menor número es " + matriz[minPosicion[0]][minPosicion[1]] +
                " y se encuentra en la fila " + minPosicion[0] + ", columna " + minPosicion[1]);
    }

    // Método para encontrar la posición del valor máximo en la matriz
    public static int[] encontrarMaximo(int[][] matriz) {
        int maxValor = matriz[0][0]; // Inicializar con el primer valor de la matriz
        int[] posicion = {0, 0};     // Inicializar la posición del máximo valor

        // Recorrer cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {  // comienza en 0, termina en 2 y se incrementa de 1 en 1
            // Recorrer cada columna de la fila actual
            for (int j = 0; j < matriz[i].length; j++) { // comienza en 0, termina en 4 y se incrementa de 1 en 1
                // Si el valor actual es mayor que el valor máximo encontrado
                if (matriz[i][j] > maxValor) { // matriz[0][0] = 1
                    maxValor = matriz[i][j];  // Actualizar el valor máximo
                    posicion[0] = i;          // Actualizar la fila del valor máximo
                    posicion[1] = j;          // Actualizar la columna del valor máximo
                }
            }
        }
        return posicion;  // Devolver la posición del valor máximo
    }

    // Método para encontrar la posición del valor mínimo en la matriz
    public static int[] encontrarMinimo(int[][] matriz) {
        int minValor = matriz[0][0]; // Inicializar con el primer valor de la matriz
        int[] posicion = {0, 0};     // Inicializar la posición del mínimo valor

        // Recorrer cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // Recorrer cada columna de la fila actual
            for (int j = 0; j < matriz[i].length; j++) { //ubicacion de la columna
                // Si el valor actual es menor que el valor mínimo encontrado
                if (matriz[i][j] < minValor) {
                    minValor = matriz[i][j];  // Actualizar el valor mínimo
                    posicion[0] = i;          // Actualizar la fila del valor mínimo
                    posicion[1] = j;          // Actualizar la columna del valor mínimo
                }
            }
        }
        return posicion;  // Devolver la posición del valor mínimo
    }
}

