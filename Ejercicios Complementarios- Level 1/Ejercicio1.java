import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce un nombre: ");
        cadena = scan.nextLine();
        System.out.println("HOLA " + cadena + "!!!" );
        scan.close();
    }
}