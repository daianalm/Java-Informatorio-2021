import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese número entero: ");
        int num = scan.nextInt();

        for(int i=1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+ "");
            }
            System.out.println("");
            scan.close();
        }
    }
 }