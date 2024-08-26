package herencia;

// La clase Lavadora hereda de la clase Electrodomesticos
public class Lavadora extends Electrodomesticos {
    // Atributo específico de la clase Lavadora
    private double carga;

    // Constructor por defecto
    public Lavadora() {
        super(); // Llama al constructor por defecto de la clase padre
        this.carga = 5; // Valor por defecto para carga
    }

    // Constructor con precio y peso, el resto de atributos por defecto
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso); // Llama al constructor de la clase padre con precioBase y peso
        this.carga = 5; // Valor por defecto para carga
    }

    // Constructor con carga y el resto de atributos heredados
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso); // Llama al constructor completo de la clase padre
        this.carga = carga;
    }

    // Getter y Setter para el atributo carga
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    // Sobrescritura del método precioFinal para considerar el aumento según la carga
    @Override
    public double precioFinal() {
        // Llama al método precioFinal de la superclase para obtener el precio base según Electrodomesticos
        double precioFinal = super.precioFinal();

        // Aumenta 50 € si la carga es mayor de 30 kg
        if (this.carga > 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
