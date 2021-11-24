import java.time.LocalDate;
public class Alumno {
  private final String nombre;
  private final String apellido;
  private final LocalDate nacimiento;

  public Alumno(String nombre, String apellido, LocalDate nacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.nacimiento = nacimiento;
  }
  public String getNombre() {
    return nombre;
  }
  public String getApellido() {
    return apellido;
  }
  public LocalDate getNacimiento() {
    return nacimiento;
  }
}