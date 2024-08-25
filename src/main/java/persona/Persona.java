package persona;

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
    //encapsulamiento
    //getters y setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public boolean getSexo(){
        return sexo;
    }

    public void setSexo(boolean sexo){
        this.sexo = sexo;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    //metodos

    public int calcularIMC(){
        double imc = peso / (altura * altura);
        if(imc < 20){
            return -1;
        }else if(imc >= 20 && imc <= 25){
            return 0;
        }else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    public String comprobarSexo(){
        return sexo ? "Hombre" : "Mujer";
    }




}
