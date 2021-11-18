import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner mult = new Scanner(System.in);
        int i, num1, num2, producto;
        producto = 0;
        //Solicitamos datos
        System.out.print("Introduce el valor del primer número: ");
        num1 = mult.nextInt();
        mult.nextLine();
        System.out.print("Ingresa el valor del segundo número: ");
        num2 = mult.nextInt();
        mult.nextLine();
        for (i = 1; i<=num2; i++){
            producto = producto+num1;
        mult.close();
        }
        System.out.println("El resultado de: " + num1 + " * "+ num2+" = "+ producto);
    }
}
