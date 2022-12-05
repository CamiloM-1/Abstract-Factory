public class EstudiantePregrado extends Estudiante {
  public EstudiantePregrado(String nombre, String apellido, String carrera) {
    super(nombre, apellido, carrera);
  }

  public void mostrarEstudiante() {
    System.out.println("Nombre del estudiante: " + nombre + " " + apellido + "\nEstudiante de la carrera: " + carrera);
  }
}