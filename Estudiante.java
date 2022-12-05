public abstract class Estudiante{
  protected String nombre;
  protected String apellido;
  protected String carrera;
  protected String especializacion;
  protected String maestria;
  protected String tipo_maestria;

  public Estudiante(String nombre, String apellido, String carrera)
    {
    this.nombre = nombre;
    this.apellido = apellido;
    this.carrera = carrera;
  }

 public Estudiante (String nombre, String apellido, String carrera, String especializacion){
    this.nombre = nombre;
    this.apellido = apellido;
    this.carrera = carrera;
    this.especializacion = especializacion;
  }

  public Estudiante (String nombre, String apellido, String carrera, String maestria, String tipo_maestria){
    this.nombre = nombre;
    this.apellido = apellido;
    this.carrera = carrera;
    this.maestria = maestria;
    this.tipo_maestria = tipo_maestria;
  }

  public abstract void mostrarEstudiante();
}


