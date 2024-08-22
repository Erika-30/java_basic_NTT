package ejercicios;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Ejercico1 {
    //DECLARAR LA VARIABLE “DIVISION1” CUYO VALOR SEA IGUAL A
    //LA DIVISIÓN ENTRE LA VARIABLE “C” Y “B” RESPECTIVAMENTE;
    //Y VALIDAR SI EL RESULTADO ES UN NUMERO POSITIVO,
    //NEGATIVO, IGUAL A CERO O DIVISIÓN NO POSIBLE.

    public static void main(String[] args) {
        // declarar variables
        int c;
        int b;
        int division1;

        //inicializar variables
        c = 10;
        b = 3;
        //ejecucion de la operacion

        if (b != 0) { //validar si el divisor es diferente de cero
            division1 = c / b; //realizar la division
            if (division1 > 0) { //validar si el resultado de la division es positivo
                System.out.println("El resultado de la division es positivo");
            } else if (division1 < 0) { //validar si el resultado de la division es negativo
                System.out.println("El resultado de la division es negativo");
            } else { //validar si el resultado de la division es cero
                System.out.println("El resultado de la division es cero");
            }
        } else { //validar si el divisor es cero
            System.out.println("Division no posible");
        }

        //Ejercicio: Verificar si un Número es Par, Impar, y Determinar su Signo
        //declarar variables
        int s;

        // inicializar variables
        s= 5;
        // ejecucion de la validacion
        if (s > 0) { //validar si el numero es positivo
            System.out.println("El numero es positivo");
            if (s % 2 == 0) { //validar si el numero es par
                System.out.println("El numero es par");
            } else { //validar si el numero es impar
                System.out.println("El numero es impar");
            }
        } else if (s < 0) { //validar si el numero es negativo
            System.out.println("El numero es negativo");
        } else { //validar si el numero es cero
            System.out.println("El numero es cero");
        }


    }

}
