package ejerciciostema4;

/**
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */
public class CondicionalIf {
    public static void main(String[] args) {
        Integer numeroIf = 0;

        if(numeroIf > 0){
            System.out.println("El número es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
