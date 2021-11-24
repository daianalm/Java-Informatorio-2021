import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {

  public static void main(String[] args) {
    List<Alumno> alumnos =
        List.of(
            new Alumno("Homero", "Simpson", LocalDate.of(1925, 11, 1)),
            new Alumno("Romina", "Martinez", LocalDate.of(1986, 11, 24)),
            new Alumno("Julia", "Martinez", LocalDate.of(1980, 2, 19)),
            new Alumno("Daiana", "Martinez", LocalDate.of(1983, 1, 20)),
            new Alumno("Nancy", "Hermosilla", LocalDate.of(1974, 7, 7)),
            new Alumno("Federico", "Martinez", LocalDate.of(1980, 9, 1)));
    Map<String, Integer> edades = new HashMap<>();
    for (Alumno alumno : alumnos) {
      edades.put(
          alumno.getApellido() + " " + alumno.getNombre(),
          alumno.getNacimiento().until(LocalDate.now()).getYears());
    }
    System.out.println(edades);
  }
}