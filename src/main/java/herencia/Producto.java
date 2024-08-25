package herencia;

// Definición de la SUPERCLASE Productos
public class Producto {
    // Atributos protegidos: accesibles desde la misma clase, subclases y clases del mismo paquete
    protected String nombre;
    protected double precio;

    //atributos con private
    private String códigoDeNegocio;

    //Atributo publico
    public boolean aperturaDeTienda;

    // Constructor de la superclase vacio
    public Producto() {
    }

    // Constructor de la superclase con
    public Producto(String nombre, double precio, String códigoDeNegocio, boolean aperturaDeTienda) {
        this.nombre = nombre;
        this.precio = precio;
        this.códigoDeNegocio = "1234";
        this.aperturaDeTienda = true;
    }

    //getter y setter

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getCódigoDeNegocio(){
        return códigoDeNegocio;
    }

    public void setCódigoDeNegocio(String códigoDeNegocio){
        this.códigoDeNegocio = códigoDeNegocio;
    }


    // Método que muestra la información del producto
    public void mostrarInformacion() {
        System.out.println("Nombre del producto: " + nombre);
    }

    // Método que aplica un descuento al precio
    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
        System.out.println("Nuevo precio después del descuento: $" + precio);
    }
}
