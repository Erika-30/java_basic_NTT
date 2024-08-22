package ejercicios;

import java.util.Arrays;


public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = "los conejos son felices";

        Arrays.stream(frase.split(" ")).forEach(palabra -> System.out.println(palabra + "\n" + palabra.length()));

    }
}