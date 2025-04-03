import java.util.ArrayList;

class Visita {
    String motivo;
    String fecha;

    public Visita (String motivo, String fecha){
        this.motivo = motivo;
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

class mascota {
    String Nombre;
    String Tipo;
    ArrayList<Visita> Visitas;

    public mascota (String Nombre, String Tipo){
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        Visitas = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void agregarVisita(Visita visita){
        Visitas.add(visita);
    }

    public void mostrarVisitas(){
        System.out.println("Mascota: " + Nombre + " - " + Tipo);
        for(int i=0; i<Visitas.size(); i++){
            Visita visita = Visitas.get(i);
            System.out.println("Visita " + (i+1) + ": " + visita.getFecha() + "    Motivo: " + visita.getMotivo());
        }
        System.out.println();
    }
}

public class VisitaVeterinario {
    public static void main(String[] args) {
        mascota m1 = new mascota("Chispas", "Perro");
        m1.agregarVisita(new Visita("Vacuna", "10 de Junio del 2024"));
        m1.agregarVisita(new Visita("Vacuna", "21 de Noviembre del 2024"));
        m1.agregarVisita(new Visita("limpieza nasal", "28 de Diciembre del 2024"));

        mascota m2 = new mascota("Wilson", "Gato");
        m2.agregarVisita(new Visita("Vacuna", "20 de Enero del 2025"));
        m2.agregarVisita(new Visita("Chequeo", "6 de Febrero del 2025"));
        m2.agregarVisita(new Visita("Desparasitacion","13 de Julio de 2025"));

        m1.mostrarVisitas();
        m2.mostrarVisitas();
    }
}
