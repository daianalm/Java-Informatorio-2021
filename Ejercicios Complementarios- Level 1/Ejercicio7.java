import java.util.Scanner;
//Este ejercicio sólo imprime letras, en el 7.b se encuentra para palabras completas
//Al principio no salía el ejercicio original y de prueba salió este
//7-b devuelve palabras completas en mayúsculas

public class Ejercicio7 {
  public static void main(String[] args){
    char C;
    Scanner reader = new Scanner(System.in);
    System.out.printf("Ingrese una letra en minúscula: ");
    C = reader.next().charAt(0);

    if (C>='A' && C <= 'Z'){
      C = (char)(C - (int) 'A'+ (int) 'a');
      }
      System.out.printf("En mayúscula es: %C%n", C);
      reader.close();
    }
  } 
