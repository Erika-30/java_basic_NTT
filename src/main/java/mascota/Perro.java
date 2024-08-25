package mascota;

public class Perro {

    // Atributos
    private String nombre; // Con private, los getters y setters son la única forma de acceder y manipular estos atributos.
    private boolean vacunado; // Con private, los getters y setters son la única forma de acceder y manipular estos atributos.
    private int edad; // Con private, los getters y setters son la única forma de acceder y manipular estos atributos.
    private String raza; // Con private, los getters y setters son la única forma de acceder y manipular estos atributos.
    private String color; // Con private, los getters y setters son la única forma de acceder y manipular estos atributos.
    private int numeroPatas; // Con private, los getters y setters son la única forma de acceder y manipular estos atributos.


    // Constructor
    public Perro(String nombre, boolean vacunado, int edad, String raza, String color, int numeroPatas) {
        this.nombre = nombre;
        this.vacunado = vacunado;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }


}