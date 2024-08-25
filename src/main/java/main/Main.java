package main;

import java.util.Scanner;
import mascota.Perro;
import persona.Persona;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la mascota: ");
        String nombrePerro = scanner.nextLine();

        System.out.print("Ingrese el nombre del papá ");
        String nombrePapa = scanner.nextLine();

        Perro perro1 = new Perro(nombrePerro);
        perro1.setVacunado(true);
        perro1.setEdad(5);
        perro1.setRaza("Labrador");
        perro1.setColor("Café");
        perro1.setNumeroPatas(4);

        System.out.println(perro1.getNombre() + " es un perro de raza " + perro1.getRaza() + " de color " + perro1.getColor() + " con " + perro1.getNumeroPatas() + " patas.");
        System.out.println(perro1.getNombre() + " tiene " + perro1.getEdad() + " años y " + (perro1.isVacunado() ? "está vacunado." : "no está vacunado."));

        //uso de metodos
        System.out.println("Acciones de " + perro1.getNombre() + ":");
        perro1.ladrar();

        Persona persona1 = new Persona(nombrePapa);
        persona1.setEdad(30);
        persona1.setSexo(true);


        System.out.println(persona1.getNombre() + " es papá de " + perro1.getNombre());
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años y es " + (persona1.getSexo() ? "hombre." : "mujer."));

        System.out.println(persona1.comprobarSexo());


    }
}
