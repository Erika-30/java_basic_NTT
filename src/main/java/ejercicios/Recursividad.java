package ejercicios;

public class Recursividad {
    public static void main(String[] args) {
        // Ejemplo 1: Cálculo del factorial de un número
        int numeroFactorial = 5; // Se define el número para el cual queremos calcular el factorial
        int resultadoFactorial = factorial(numeroFactorial); // Se llama al método factorial con el número 5
        System.out.println("El factorial de " + numeroFactorial + " es: " + resultadoFactorial); // Se imprime el resultado final del factorial

        // Ejemplo 2: Cálculo de la suma de los números de 1 a n
        int numeroSuma = 5; // Se define el número hasta el cual queremos sumar
        int resultadoSuma = sumaRecursiva(numeroSuma); // Se llama al método sumaRecursiva con el número 5
        System.out.println("La suma de los números de 1 a " + numeroSuma + " es: " + resultadoSuma); // Se imprime el resultado final de la suma

        double capitalInicial = 1000.0; // Capital inicial invertido en el banco
        double tasaInteres = 0.05; // Tasa de interés anual (5%)
        int años = 5; // Número de años de la inversión

        double montoFinal = calcularInteresCompuesto(capitalInicial, tasaInteres, años); // Se llama al método recursivo para calcular el monto final
        System.out.println("El monto final después de " + años + " años es: " + montoFinal); // Se imprime el resultado final

        // Ejemplo 4: Cálculo de la potencia de un número
        int base = 2; // Base de la potencia
        int exponente = 3; // Exponente de la potencia
        int resultadoPotencia = potencia(base, exponente); // Se llama al método potencia con base 2 y exponente 3
        System.out.println(base + " elevado a la " + exponente + " es: " + resultadoPotencia); // Se imprime el resultado final de la potencia
    }

    // Método recursivo para calcular el factorial de un número
    public static int factorial(int n) {
        // Caso base: si n es 1, el factorial de 1 es 1, no hay más llamadas recursivas
        if (n == 1) {
            System.out.println("Caso base alcanzado: factorial(" + n + ") = 1");
            return 1; // Aquí termina la recursión y se retorna 1
        } else {
            // Llamada recursiva: el método se llama a sí mismo con (n-1)
            // El factorial de n se calcula como n * factorial(n-1)
            int resultado = n * factorial(n - 1); // se llama as{i mismo con n-1 cuantas veces sea necesario hasta llegar al caso base
            System.out.println("Retornando factorial(" + n + ") = " + resultado);
            return resultado; // Se retorna el resultado al siguiente nivel de la recursión
        }
    }

    // Método recursivo para calcular la suma de todos los números desde 1 hasta n
    public static int sumaRecursiva(int n) {
        // Caso base: si n es 1, la suma de 1 es 1, no hay más llamadas recursivas
        if (n == 1) {
            System.out.println("Caso base alcanzado: sumaRecursiva(" + n + ") = 1");
            return 1; // Aquí termina la recursión y se retorna 1
        } else {
            // Llamada recursiva: el método se llama a sí mismo con (n-1)
            // La suma de los números hasta n se calcula como n + sumaRecursiva(n-1)
            int suma = n + sumaRecursiva(n - 1); // Se suma n con la llamada recursiva
            System.out.println("Retornando sumaRecursiva(" + n + ") = " + suma);
            return suma; // Se retorna el resultado al siguiente nivel de la recursión
        }
    }

    // Método recursivo para calcular el interés compuesto
    public static double calcularInteresCompuesto(double capital, double tasa, int años) {
        // Caso base: si años es 0, no se aplica interés adicional y se devuelve el capital inicial
        if (años == 0) {
            System.out.println("Caso base alcanzado: no se aplican más intereses.");
            return capital;
        } else {
            // Llamada recursiva: el método se llama a sí mismo con un año menos y el capital incrementado por el interés de ese año
            double nuevoCapital = capital * (1 + tasa);
            System.out.println("Año " + años + ": capital acumulado = " + nuevoCapital);
            return calcularInteresCompuesto(nuevoCapital, tasa, años - 1);
        }
    }

    // Método recursivo para calcular la potencia de un número
    public static int potencia(int base, int exponente) {
        // Caso base: cualquier número elevado a la potencia 0 es 1
        if (exponente == 0) {
            System.out.println("Caso base alcanzado: " + base + "^" + exponente + " = 1");
            return 1;
        } else {
            // Llamada recursiva: base^exponente = base * base^(exponente-1)
            int resultado = base * potencia(base, exponente - 1);
            System.out.println("Retornando " + base + "^" + exponente + " = " + resultado);
            return resultado;
        }
    }

//    Llamada a potencia(2, 3): dos al cubo
//    exponente != 0, entonces:
//    resultado = 2 * potencia(2, 2)
//
//    Llamada a potencia(2, 2):
//    exponente != 0, entonces:
//    resultado = 2 * potencia(2, 1)
//
//    Llamada a potencia(2, 1):
//    exponente != 0, entonces:
//    resultado = 2 * potencia(2, 0)
//
//    Llamada a potencia(2, 0):
//    exponente == 0, entonces:
//    RETORNAR 1 (este es el caso base)
//
//    Resolviendo la recursión:
//    potencia(2, 1) retorna 2 * 1 = 2
//    potencia(2, 2) retorna 2 * 2 = 4
//    potencia(2, 3) retorna 2 * 4 = 8

}