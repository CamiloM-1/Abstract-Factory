public class EstudianteEspecializacion extends Estudiante {
  public EstudianteEspecializacion(String nombre, String apellido, String carrera, String especializacion) {
    super(nombre, apellido, carrera, especializacion);
  }

  public void mostrarEstudiante() {
    System.out.println("Nombre del estudiante: " + nombre + " " + apellido + "\nEstudiante de la carrera: " + carrera
        + "\nEspecialización: " + especializacion);
  }
}