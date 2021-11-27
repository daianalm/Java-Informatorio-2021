import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumno("Daiana", "Simpson", LocalDate.of(1956, 5, 12)),
                new Alumno("Federico", "Simpson", LocalDate.of(1990, 2, 10)),
                new Alumno("Romina", "Simpson", LocalDate.of(2001, 3, 30)),
                new Alumno("Nancy", "Bouvier", LocalDate.of(1971, 2, 5)),
                new Alumno("Luisina", "Monroe", LocalDate.of(1945, 7, 21)),
                new Alumno("Jose", "Simpson", LocalDate.of(1970, 11, 11)));
        Map<String, Integer> alumnosConEdades = alumnos.stream()
                .collect(Collectors
                        .toMap(p-> (p.getName() + " " + p.getSurname()),
                                p -> Ejercicio5.getEdad(p.getBirthday())));
        System.out.println(alumnosConEdades);
    }
    public static Integer getEdad(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
