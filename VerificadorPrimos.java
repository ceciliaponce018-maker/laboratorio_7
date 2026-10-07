public class VerificadorPrimos {

    // LÓGICA DE NEGOCIO (Fase REFACTOR: Optimización eficiente)
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;

        int limite = (int) Math.sqrt(numero);
        for (int i = 3; i <= limite; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    // FRAMEWORK DE PRUEBAS UNITARIAS INTEGRADO
    public static void assertEquals(boolean esperado, boolean actual, String nombreTest) {
        if (esperado == actual) {
            System.out.println("PASO: " + nombreTest);
        } else {
            System.err.println("FALLO: " + nombreTest + " -> Esperaba: " + esperado + ", obtuvo: " + actual);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== INICIANDO PRUEBAS UNITARIAS (Ciclo TDD) ===");
        
        // Casos que deben dar False
        assertEquals(false, esPrimo(1), "Test numero 1 no es primo");
        assertEquals(false, esPrimo(0), "Test numero 0 no es primo");
        assertEquals(false, esPrimo(-5), "Test numero negativo no es primo");

        // Casos que deben dar True (Estos van a fallar en rojo)
        assertEquals(true, esPrimo(2), "Test numero 2 es primo");
        assertEquals(true, esPrimo(3), "Test numero 3 es primo");
        assertEquals(true, esPrimo(11), "Test numero 11 es primo");
    }
}
