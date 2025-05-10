import java.io.*;

class Alumnos implements Serializable {
    private String nombre;
    private String apellido;
    private String semestre;

    public Alumnos(String nombre, String apellido, String semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getSemestre() {
        return semestre;
    }

    public String toString() {
        return nombre + " " + apellido + " " + semestre;
    }
}

public class EjercicioGuardarAlumno {
    public static void main(String[] args) {
        Alumnos alumno1 = new Alumnos("Leonardo", "Garcia", "Segundo Semestre");

        try {

            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:/Users/Leonardo Garcia/OneDrive/Desktop/poo_ejemplo/alumno1.txt"));
            salida.writeObject(alumno1);
            salida.close();

            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:/Users/Leonardo Garcia/OneDrive/Desktop/poo_ejemplo/alumno1.txt"));
            Alumnos AlumnoLeido = (Alumnos) entrada.readObject();
            entrada.close();

            System.out.println(AlumnoLeido);

        } catch (Exception e) {

        }
    }
}
