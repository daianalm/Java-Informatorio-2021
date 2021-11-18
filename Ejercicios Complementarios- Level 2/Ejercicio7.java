
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args) {
       int num1;
       int num2;
      
       ArrayList<String> sumaTotal = new ArrayList<String>();
       Scanner numIngresado = new Scanner(System.in);
       System.out.println("Ingrese su primer número, el menor: ");
       num1 = numIngresado.nextInt();
       numIngresado.nextLine();
       System.out.println("Ingrese un segundo número, mayor al primero: ");
       num2 = numIngresado.nextInt();
       numIngresado.nextLine();
       
       for(int i = num1; i< num2; i ++){
           if (i ==num1|| i == (num2-1)){
                sumaTotal.add(i + ". FizzBuzz");              
            }else if(num1 % 3 == 0){
                sumaTotal.add( i + ". Buzz");
            }else if (num1 % 2 == 0){
                sumaTotal.add(i+ ". Fizz");
            }else{
                System.out.println("Número no múltiplo de 2 ni de 3");
            }
        }
        for (int j = 0; j < sumaTotal.size(); j++){
            System.out.println(sumaTotal.get(j));
        }numIngresado.close();
    }}
