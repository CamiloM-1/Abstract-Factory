public interface FabricarEstudiante{

  Estudiante crearEstudiantePregrado (String nombre, String apellido, String carrera);

Estudiante crearEstudianteEspecializacion (String nombre, String apellido, String carrera, String especializacion);

  Estudiante crearEstudianteMaestria (String nombre, String apellido, String carrera, String maestria, String tipo_maestria);
}