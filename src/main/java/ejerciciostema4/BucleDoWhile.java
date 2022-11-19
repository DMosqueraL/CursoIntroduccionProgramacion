package ejerciciostema4;

/**
 * Para el bucle Do While, deberás crear la misma estructura que en el While,
 * pero solo se debe ejecutar una vez.
 */
public class BucleDoWhile {
    public static void main(String[] args) {
        Integer numeroWhile = -10;
        do {
            numeroWhile += 1;
            System.out.println("Estamos en: " + numeroWhile);
        } while (numeroWhile > 3);
    }
}
