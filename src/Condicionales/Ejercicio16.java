import java.util.*;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = consola.nextInt();
        String conversor = Integer.toString(numero);
        if (conversor.length() <= 5){
            int ultimoDigito = numero%10;
            System.out.println("El ultimo digito del numero " + numero + " es " + ultimoDigito + ".");
        }
        else {
            System.out.println("El numero " + numero + " tiene mas de 5 digitos.");
        }
    }
}
