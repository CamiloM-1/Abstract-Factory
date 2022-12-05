import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    FabricarEstudiante fabrica = new FabricaEstudiantes();
    List<Estudiante> E_Pregrado = new ArrayList<Estudiante>();
    List<Estudiante> E_Especializacion = new ArrayList<Estudiante>();
    List<Estudiante> E_Maestria = new ArrayList<Estudiante>();
    String nombre;
    String apellido;
    String carrera;
    String especializacion;
    String maestria;
    String tipo_maestria;
    int tipo;
    System.out.println("¿Cuantos estudiantes va desea crear?");
    int cant_estudiantes = reader.nextInt();

    for (int i = 0; i < cant_estudiantes; i++) {
      System.out.println("\nSeleccione el tipo de estudiante: \nPregrado = 1 \nEspecialización = 2 \nMaestria = 3");
      tipo = reader.nextInt();

      switch (tipo) {
        case 1:
          System.out.print("Nombre del estudiante: ");
          nombre = reader.next();
          System.out.print("Apellido del estudiante: ");
          apellido = reader.next();
          System.out.print("Carrera del estudiante: ");
          carrera = reader.next();
          E_Pregrado.add(fabrica.crearEstudiantePregrado(nombre, apellido, carrera));
          break;
        case 2:
          System.out.print("Nombre del estudiante: ");
          nombre = reader.next();
          System.out.print("Apellido del estudiante: ");
          apellido = reader.next();
          System.out.print("Carrera del estudiante: ");
          carrera = reader.next();
          System.out.print("Especialización del estudiante: ");
          especializacion = reader.next();
          E_Especializacion.add(fabrica.crearEstudianteEspecializacion(nombre, apellido, carrera, especializacion));
          break;
        case 3:
          System.out.print("Nombre del estudiante: ");
          nombre = reader.next();
          System.out.print("Apellido del estudiante: ");
          apellido = reader.next();
          System.out.print("Carrera del estudiante: ");
          carrera = reader.next();
          System.out.print("Maestria del estudiante: ");
          maestria = reader.next();
          System.out.print("Tipo de maestria del estudiante: ");
          tipo_maestria = reader.next();
          E_Maestria.add(fabrica.crearEstudianteMaestria(nombre, apellido, carrera, maestria, tipo_maestria));
          break;
        default:
          System.out.println("\nOpcion incorrecta seleccione el tipo de estudiante");
          i--;
      }
    }
    System.out.println("\nEstudiantes de Pregrado:");
    E_Pregrado.forEach((e) -> {
      e.mostrarEstudiante();
    });
    System.out.println("\nEstudiantes de Especialización:");
    E_Especializacion.forEach((e) -> {
      e.mostrarEstudiante();
    });
    System.out.println("\nEstudiantes de Maestria:");
    E_Maestria.forEach((e) -> {
      e.mostrarEstudiante();
    });
  }
}