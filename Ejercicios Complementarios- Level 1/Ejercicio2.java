import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        //Declaración de variables
        int n1, n2;
        Scanner scan = new Scanner(System.in);

        //Leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = scan.nextInt();

        //Leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = scan.nextInt();

        //mostrar resultado
        System.out.println("Ha introducido los números: " +n1 + " y " +n2);

        //Realizamos cálculos y mostramos en pantalla
        System.out.println("La suma de números es " + (n1 + n2));
        System.out.println("La resta de números es " + (n1 - n2));
        System.out.println("La multiplicación de números es " + (n1 * n2));
        System.out.println("La división de números es " + (n1 / n2));
        System.out.println("El resto de la división es " + (n1 % n2));
        scan.close();
    }
}
