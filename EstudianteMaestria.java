public class EstudianteMaestria extends Estudiante {
  public EstudianteMaestria(String nombre, String apellido, String carrera, String maestria, String tipo_maestria) {
    super(nombre, apellido, carrera, maestria, tipo_maestria);
  }

  public void mostrarEstudiante() {
    System.out.println("Nombre del estudiante: " + nombre + " " + apellido + "\nEstudiante de la carrera: " + carrera
        + "\nMaestria: " + maestria + "\nTipo de maestria: " + tipo_maestria);
  }
}