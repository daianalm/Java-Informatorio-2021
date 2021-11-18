 import java.util.Scanner;

 public class Ejercicio9{
     public static void main(String[] args){
    Scanner lector = new Scanner(System.in);
    String Texto="";
    String caracter="";
    int cont=0;
    
    System.out.println("Ingresa el texto: ");
    Texto = lector.nextLine();
    
    System.out.println("¿que caracter deseas contar? ");
    caracter = lector.nextLine();
    for (int i = 0; i < Texto.length(); i++) {
    if(Texto.charAt(i)== caracter.charAt(0) ){
    cont ++;
    }
    }
    
    if (cont != 0) {
    System.out.println("El caracter "+caracter.charAt(0)+ " se repite " + cont + " veces");
    }else{
    System.out.println("El caracter no se encuentra en este texto");
    lector.close();
    }
}
 }