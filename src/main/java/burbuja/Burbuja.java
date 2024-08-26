package burbuja;

import java.util.ArrayList;

public class Burbuja {

    // Atributo para almacenar la lista de enteros
    private ArrayList<Integer> listaEnteros;

    // Constructor que inicializa la lista
    // Se ejecuta cuando se crea un objeto de la clase Burbuja.
    public Burbuja(ArrayList<Integer> lista) {
        this.listaEnteros = lista; // Asigna la lista pasada como parámetro al atributo listaEnteros
    }

    // Método para ordenar la lista utilizando el algoritmo de burbuja
    public void ordenamientoBurbuja() {
        // Inicia un bucle que recorre la lista desde el segundo elemento hasta el final
        for (int i = 1; i < listaEnteros.size(); i++) {
            // Segundo bucle que recorre la lista hasta el penúltimo elemento en cada iteración de i
            for (int j = 0; j < listaEnteros.size() - i; j++) {
                // Compara elementos adyacentes, si el actual es mayor que el siguiente, se intercambian
                if (listaEnteros.get(j) > listaEnteros.get(j + 1)) {
                    // Almacena el valor del elemento actual en una variable auxiliar
                    int auxiliar = listaEnteros.get(j);
                    // Intercambia el valor del elemento actual con el siguiente
                    listaEnteros.set(j, listaEnteros.get(j + 1));
                    // Coloca el valor almacenado en la variable auxiliar en la posición del siguiente elemento
                    listaEnteros.set(j + 1, auxiliar);
                }
            }
        }
        // El método finaliza cuando la lista está completamente ordenada
    }

    // Método para imprimir los elementos de la lista
    public void imprimirArreglo() {
        // Bucle que recorre todos los elementos de la lista y los imprime
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i)); // Imprime el elemento actual
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear una lista de enteros para probar
        // Este es el primer paso que se ejecuta al iniciar el programa
        ArrayList<Integer> listaPrueba = new ArrayList<>();
        listaPrueba.add(5); // Añade 5 a la lista
        listaPrueba.add(3); // Añade 3 a la lista
        listaPrueba.add(8); // Añade 8 a la lista
        listaPrueba.add(4); // Añade 4 a la lista
        listaPrueba.add(2); // Añade 2 a la lista

        // Crear un objeto de la clase Burbuja, pasando la listaPrueba como argumento
        // Llama al constructor que inicializa el atributo listaEnteros
        Burbuja burbuja = new Burbuja(listaPrueba);

        // Imprimir el arreglo antes de ordenar
        // Muestra la lista en su estado original
        System.out.println("Antes de ordenar:");
        burbuja.imprimirArreglo(); // Llama al método que imprime la lista

        // Ordenar la lista usando el método de ordenamiento burbuja
        // Aquí es donde se aplica el algoritmo de ordenamiento
        burbuja.ordenamientoBurbuja();

        // Imprimir el arreglo después de ordenar
        // Muestra la lista después de haber sido ordenada
        System.out.println("Después de ordenar:");
        burbuja.imprimirArreglo(); // Llama al método que imprime la lista ordenada
    }
}

