public class FabricaEstudiantes implements FabricarEstudiante{
  public Estudiante crearEstudiantePregrado (String nombre, String apellido, String carrera){
    return new EstudiantePregrado(nombre, apellido, carrera);
  }

public Estudiante crearEstudianteEspecializacion (String nombre, String apellido, String carrera, String especializacion){
    return new EstudianteEspecializacion(nombre, apellido, carrera, especializacion);
  }

  public Estudiante crearEstudianteMaestria (String nombre, String apellido, String carrera, String maestria, String tipo_maestria){
    return new EstudianteMaestria(nombre, apellido, carrera, maestria, tipo_maestria);
  }
}