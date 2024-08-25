package Persona;

public class Persona {
    // Atributos

    private String nombre;
    private int edad;
    private boolean sexo;
    private double peso;
    private double altura;

    //constructor
    //sin atributos
    public Persona(String nombre){
        this.nombre = nombre;
    }

    //con atributos
    public Persona(String nombre, int edad, boolean sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }




}
