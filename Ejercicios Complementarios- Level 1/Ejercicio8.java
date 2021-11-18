import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Invocamos un objeto Scanner para ingresar datos desde el teclado
        Scanner scan = new Scanner (System.in);
        //declaramos las variables nombre de tipo String y edad de tipo int
        String nombre, apellido, ciudad, direccion;
        int edad;
       
       System.out.println("Ingrese su Nombre: ");
       nombre= scan.nextLine();
       System.out.println("Ingrese su Apellido: ");
       apellido = scan.nextLine();
       System.out.println("Ingrese su Ciudad: ");
       ciudad = scan.nextLine();
       System.out.println("Ingrese su Dirección: ");
       direccion = scan.nextLine();
       System.out.println("Ingrese su Edad: ");
       edad= scan.nextInt();

       System.out.println(ciudad + " - " + direccion+ " - "+edad+ " - " +nombre +" "+ apellido);
       scan.close();
       }
    }
       
        
