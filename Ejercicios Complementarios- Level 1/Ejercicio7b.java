import java.util.Scanner;

public class Ejercicio7b {
   
    public static void main(String[] args) {
        Scanner str =new Scanner(System.in);
       
        System.out.println("Introduzca una palabra en minúscula, para convertirla en mayúscula: ");
        String palabra = str.nextLine();

        str.close();

        System.out.println(amayuscula(palabra));
    }

    public static String amayuscula(String str) {
        String palabra = "";
        for (int i = 0; i < str.length(); i++) {
        int v = str.charAt(i);
        if (v > 96 && v < 123) {
        v -= 32;
        }
        palabra+=(char)v;
       
        }
        return palabra;
    }
}