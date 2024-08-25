package herencia;

// Clase principal que contiene el método main para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Producto
        Producto nuevoProducto = new Producto();

        // Establecer los valores de los atributos del producto
        nuevoProducto.setNombre("pastel");
        nuevoProducto.setPrecio(10.0);
        nuevoProducto.setCódigoDeNegocio("9876");
        nuevoProducto.aperturaDeTienda = false;

        // Mostrar la información del producto

        nuevoProducto.mostrarInformacion();
        System.out.println("Código de negocio: " + nuevoProducto.getCódigoDeNegocio());

        // Crear una instancia de la clase Aseo VACIO
        Aseo shampoo = new Aseo();

        // Establecer los valores de los atributos del producto de la subclase Aseo
        shampoo.setNombre("jabón");
        shampoo.setPrecio(5.0);
        shampoo.setTipo("liquido");
        shampoo.setToxico(false);
        shampoo.setInflamable(false);

        // Mostrar la información del producto de la subclase Aseo

        shampoo.mostrarInformacion();
        System.out.println("Tipo de producto: " + shampoo.getTipo() );









    }
}
