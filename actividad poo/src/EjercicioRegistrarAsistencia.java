import java.util.ArrayList;
import java.util.List;

public class EjercicioRegistrarAsistencia {
    private List<Alumno> alumno;
    private List<Asistencia> asistencias;

    public EjercicioRegistrarAsistencia() {
        alumno = new ArrayList<>();
        asistencias = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumnos) {
        this.alumno.add(alumnos);
    }

    public void registrarAsistencia(Alumno alumno, boolean presente) {
        asistencias.add(new Asistencia(alumno, presente));
    }

    public void mostrarAsistencia() {
        for (Asistencia asistencia : asistencias) {
            System.out.println(asistencia);
        }
    }

    public static void main(String[] args) {
        EjercicioRegistrarAsistencia registro = new EjercicioRegistrarAsistencia();

        Alumno n1 = new Alumno("Leonardo", "Garcia Ponce", "24020311");
        Alumno n2 = new Alumno("Cristel Ismerai", "Lara Garcia", "23019231");

        registro.agregarAlumno(n1);
        registro.agregarAlumno(n2);

        registro.registrarAsistencia(n1, true);
        registro.registrarAsistencia(n2, false);

        registro.mostrarAsistencia();
    }
}




