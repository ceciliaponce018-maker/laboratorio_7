public class CalcularFiguras {

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public static void mostrarResultadoArea(String tipoFigura, double area) {
        System.out.printf("El area del %s es: %.2f%n", tipoFigura, area);
    }

    public static void main(String[] args) {
        double areaRectangulo = calcularAreaRectangulo(10.0, 5.0);
        mostrarResultadoArea("rectangulo", areaRectangulo);

        double areaTriangulo = calcularAreaTriangulo(6.0, 4.0);
        mostrarResultadoArea("triangulo", areaTriangulo);
    }
}
