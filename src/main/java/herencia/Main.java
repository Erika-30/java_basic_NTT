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

        // Crear una instancia de la clase Electrodomesticos sin
        Electrodomesticos electrodomestico = new Electrodomesticos();

        // Establecer los valores de los atributos del producto de la subclase Electrodomesticos
        electrodomestico.precioBase = 200;
        electrodomestico.color = "negro";

        // Crear una lavadora con el constructor por defecto
        Lavadora lavadora1 = new Lavadora();
        System.out.println("Precio final de la lavadora 1: " + lavadora1.precioFinal() + " €");

        // Crear una lavadora con precio y peso, usando valores por defecto para el resto
        Lavadora lavadora2 = new Lavadora(200, 40);
        System.out.println("Precio final de la lavadora 2: " + lavadora2.precioFinal() + " €");

        // Crear una lavadora con todos los atributos especificados
        Lavadora lavadora3 = new Lavadora(300, "negro", 'A', 70, 35);
        System.out.println("Precio final de la lavadora 3: " + lavadora3.precioFinal() + " €");


    }
}
