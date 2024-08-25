package herencia;

// Definición de la subclase Aseo que extiende la superclase Productos
public class Aseo extends Producto {
    // Atributos de la subclase Aseo
    private String tipo;
    private boolean toxico;
    private boolean inflamable;

    // Constructor de la subclase Aseo vacio
    public Aseo() {
    }
    // Constructor de la subclase Aseo con atributos
    public Aseo(String nombre, double precio, String tipo) {
        super(nombre, precio, "1234", true);
        this.tipo = tipo;
        this.toxico = false;
        this.inflamable = false;
    }

    //getter y setter
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public boolean getToxico(){
        return toxico;
    }

    public void setToxico(boolean toxico){
        this.toxico = toxico;
    }

    public boolean getInflamable(){
        return inflamable;
    }

    public void setInflamable(boolean inflamable){
        this.inflamable = inflamable;
    }

    // Método que muestra la información del producto de la subclase Aseo

    public void mostrarInformacion() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Tipo de producto: " + tipo);
    }

    // Método que aplica un descuento al precio del producto de la subclase Aseo

    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
    }

    // Método que verifica si el producto es tóxico

    public void verificarToxicidad() {
        if (toxico) {
            System.out.println("El producto es tóxico");
        } else {
            System.out.println("El producto no es tóxico");
        }
    }

}
