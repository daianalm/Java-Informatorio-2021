import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        long factorial = 1;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = scan.nextInt();
        for (int i = num; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        scan.close();
    }
}
