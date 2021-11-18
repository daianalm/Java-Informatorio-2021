import java.util.*;

public class Ejercicio6{
     public static void main(String[] args) {

        HashSet<Empleado> empleado = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();

        empleado.add(new Empleado("Luis Martin", 12345678, 5, 100));
        empleado.add(new Empleado("Juan Martinez", 5678904, 7, 50));
        empleado.add(new Empleado("José Hermo", 31345679, 52, 8));
        empleado.add(new Empleado("Romina Ponce", 3276895, 54, 5));
        empleado.add(new Empleado("Facundo Miño", 3245675, 70, 4));

        System.out.println("\nEste programa calculará el sueldo de los siguientes empleados:\n");

        for (Empleado lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas trabajadas: " + lista.horasTrabajadas + " - Valor hora: " + lista.valorHora);
        }

        for (Empleado creartabla : empleado) {
            sueldo.put(creartabla.clave(), creartabla.valor());
        }
        System.out.println("\nLiquidación de sueldos:\n");
        sueldo.forEach((dni, valor) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + valor));
    }
}
        class Empleado {
            String nombre;
            int dni;
            float horasTrabajadas;
            float valorHora;
       

            public Empleado(String nombre, int dni, float horasTrabajadas, float valorHora) {
                this.nombre = nombre;
                this.dni = dni;
                this.horasTrabajadas = horasTrabajadas;
                this.valorHora = valorHora;
            }
       
            public int clave() {
                return this.dni;
            }
       
            public float valor() {
                return this.horasTrabajadas * this.valorHora;
            }   
        }
