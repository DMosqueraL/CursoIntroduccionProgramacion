package ejerciciostema4;

/**
 * Ppara el Switch, deberás crear la variable estacion, y distintos case
 * para las cuatro estaciones del año. Dependiendo del valor de la variable
 * estacion se deberá mandar un mensaje por consola informando de la estación
 * en la que está. También habrá que poner un default para cuando el valor de
 * la variable no sea una estación.
 */
public class SwitchCase {
    public static void main(String[] args) {
        String estacion = "primavera";

        switch (estacion){
            case "primavera":
                System.out.println("Estás en primavera");
                break;
            case "verano":
                System.out.println("Estás en verano");
                break;
            case "otoño":
                System.out.println("Estás en otoño");
                break;
            case "invierno":
                System.out.println("Estás en invierno");
                break;
            default:
                System.out.println(estacion + ": Esto no es una estación");
                break;
        }
    }
}
