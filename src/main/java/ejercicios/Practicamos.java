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
