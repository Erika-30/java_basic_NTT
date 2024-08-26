package herencia;

public class Electrodomesticos {
    // Atributos de la superclase Electrodomesticos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constructor por defecto con valores predeterminados
    public Electrodomesticos() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'C';
        this.peso = 5;
    }

    // Constructor con precio y peso, el resto de los atributos con valores predeterminados
    public Electrodomesticos(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = "blanco";
        this.consumoEnergetico = 'C';
        this.peso = peso;
    }

    // Constructor con todos los atributos
    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
    }

    //metodos

    // Método privado para comprobar y asignar un consumo energético válido
    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'C') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'C'; // Valor por defecto si la letra no es válida
        }
    }

    // Método privado para comprobar y asignar un color válido
    private void comprobarColor(String color) {
        String colorMinuscula = color.toLowerCase();
        switch(colorMinuscula) {
            case "blanco":
            case "negro":
            case "rojo":
                this.color = colorMinuscula;
                break;
            default:
                this.color = "blanco"; // Valor por defecto si el color no es válido
                break;
        }
    }

    // Método para calcular el precio final según el consumo energético y el peso
    public double precioFinal() {
        double aumento = 0;

        // Aumenta el precio según el consumo energético
        switch(consumoEnergetico) {
            case 'A':
                aumento += 20;
                break;
            case 'B':
                aumento += 15;
                break;
            case 'C':
                aumento += 10;
                break;
        }

        // Aumenta el precio según el peso
        if (peso >= 0 && peso < 20) {
            aumento += 10;
        } else if (peso >= 20 && peso < 50) {
            aumento += 50;
        } else if (peso >= 50 && peso < 80) {
            aumento += 80;
        } else if (peso >= 80) {
            aumento += 100;
        }

        return precioBase + aumento;
    }

    // Getters y Setters de todos los atributos
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        comprobarColor(color); // Validación del color antes de asignarlo
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        comprobarConsumoEnergetico(consumoEnergetico); // Validación del consumo energético antes de asignarlo
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
