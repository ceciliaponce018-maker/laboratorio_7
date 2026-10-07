// Interfaz base: Abierta a la extensión, cerrada a la modificación (OCP)
interface Figura {
    double calcularArea();
}

// Implementación de Rectángulo
class Rectangulo implements Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
}

// Implementación de Triángulo
class Triangulo implements Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2.0;
    }
}

// NUEVA FIGURA: Demuestra que el sistema es escalable sin modificar las clases de arriba (OCP)
class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}

// Clase especializada únicamente en reportes: Principio de Responsabilidad Única (SRP)
class ReporteAreas {
    public static void imprimir(String nombre, Figura figura) {
        System.out.printf("El area del %s es: %.2f%n", nombre, figura.calcularArea());
    }
}

// Clase Principal
public class SistemaFigurasSOLID {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DISEÑADO CON PRINCIPIOS SOLID ===");

        Figura rectangulo = new Rectangulo(10.0, 5.0);
        Figura triangulo = new Triangulo(6.0, 4.0);
        Figura circulo = new Circulo(3.0);

        // Cada componente cumple un único rol (SRP)
        ReporteAreas.imprimir("rectangulo SOLID", rectangulo);
        ReporteAreas.imprimir("triangulo SOLID", triangulo);
        ReporteAreas.imprimir("circulo (Nueva Extension OCP)", circulo);
    }
}
