package ejerciciostema4;

/**
 * Crea un bucle While, este bucle tendrá que tener como condición que la variable
 * numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
 * Incrementar el valor de la variable en uno cada vez que se ejecute.
 * Mostrarlo por pantalla cada vez que se ejecute.
 */
public class BucleWhile {
    public static void main(String[] args) {
        Integer numeroWhile = -10;
        while (numeroWhile < 3){
            numeroWhile += 1;
            System.out.println("Estamos en: " +numeroWhile);
        }
    }
}
