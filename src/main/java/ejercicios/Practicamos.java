package ejercicios;

public class Practicamos {
    public static void main(String[] args) {
        // Declarar el array con las notas
        int listaNotas[] = {12, 10, 10, 9};

        // Declarar la variable para el promedio
        double promedio = 0;

        // Sumar todos los elementos del array
        for (int i = 0; i < listaNotas.length; i++) {
            promedio = promedio + listaNotas[i];
        }

        // Calcular el promedio
        promedio = promedio / listaNotas.length;

        // Imprimir el promedio
        System.out.println(promedio);
    }
}
