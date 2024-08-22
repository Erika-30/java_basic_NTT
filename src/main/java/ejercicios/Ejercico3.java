package ejercicios;

public class Ejercico3 {
    public static void main(String[] args) {
        // declarar variables
        float a;
        float b;
        int contador = 0;
        int maxIteraciones = 10; // Limitar el número de iteraciones

        // inicializar el valor de las variables
        a = 100.6f;
        b = 4.5f;

        // ejecutar la validacion
        do {
            System.out.println("El valor de a es: " + a);
            a = a / b;
            System.out.println(a);
            System.out.println("El valor de b es: " + b);
            contador++;

            // Condición adicional para salir del bucle
            if (a < 1.0f) {
                System.out.println("El valor de a es menor que 1.0, saliendo del bucle.");
                break;
            }

        } while (a >= b && contador < maxIteraciones);

        if (contador >= maxIteraciones) {
            System.out.println("Se alcanzó el número máximo de iteraciones.");
        }
    }
}