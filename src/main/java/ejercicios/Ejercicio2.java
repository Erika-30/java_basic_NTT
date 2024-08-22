package ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        // declarar
        int a;

        // inicializar
        a = 4;

        //ejecutarla validacion

        switch (a) {
            case 0:
                System.out.println("Haz marcado la opción Llamar.");
                break;
            case 1:
                System.out.println("Haz marcado la opción Enviar mensaje.");
                break;
            case 2:
                System.out.println("Haz marcado la opción Apagar.");
                break;
            case 3:
                System.out.println("Haz marcado la opción Reiniciar.");
                break;
            case 4:
                System.out.println("Haz marcado la opción Autodestruir.");
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
     }
}
