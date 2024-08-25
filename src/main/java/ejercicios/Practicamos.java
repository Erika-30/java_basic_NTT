package ejercicios;

public class Practicamos {
    public static void main(String[] args) {
        // Declarar el array con las notas
        int listaNotas[] = {12, 10, 10, 9};

        // Declarar la variable para el promedio
        double promedio = 0;

        // Sumar todos los elementos del array
        for (int i = 0; i < listaNotas.length; i++) {
            promedio = promedio + listaNotas[i]; // promedio = 0 + 12, promedio = 12 + 10, promedio = 22 + 10, promedio = 32 + 9
        }

        // Calcular el promedio
        promedio = promedio / listaNotas.length;

        // Imprimir el promedio
        System.out.println(promedio);

        int lista[] = {6, 9, -8, 23, 3, 100, 3}; // Declaración e inicialización de un array de enteros con valores específicos

        int nNum1 = lista[0]; // Inicializa nNum1 con el primer valor del array (en este caso, 6)
        int nNum2 = lista[0]; // Inicializa nNum2 con el primer valor del array (en este caso, 6)

        for (int i = 1; i < lista.length; i++) { // Bucle for que recorre el array desde el segundo elemento hasta el final
            if (lista[i] < nNum1) { // Comprueba si el valor actual del array es menor que nNum1
                nNum1 = lista[i]; // Si es menor, actualiza nNum1 con este nuevo valor
            }
            if (lista[i] > nNum2) { // Comprueba si el valor actual del array es mayor que nNum2
                nNum2 = lista[i]; // Si es mayor, actualiza nNum2 con este nuevo valor
            }
        }

        System.out.println("nNum1: " + nNum1 + ", nNum2: " + nNum2); // Imprime los valores de nNum1 (mínimo) y nNum2 (máximo) en la consola

    }
//    Inicio
//    // Declarar el array con las notas
//    Definir listaNotas como un arreglo de enteros = {12, 10, 10, 9}
//
//    // Declarar la variable para el promedio
//    Definir promedio como un número decimal = 0
//
//    // Sumar todos los elementos del array
//    Para i desde 0 hasta el tamaño de listaNotas - 1 hacer
//        promedio = promedio + listaNotas[i]
//    Fin Para
//
//    // Calcular el promedio
//    promedio = promedio / tamaño de listaNotas
//
//    // Imprimir el promedio
//    Imprimir promedio
//Fin



}
