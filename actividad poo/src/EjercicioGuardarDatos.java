// Diseñe un programa que permita guardar en un arreglo datos estadisticos de partidos de futbol.
// cada equipo es un objeto que contiene su propia estadistica

class EquipoFutbol{
    String nombre;
    int goles;
    int faltas;
    int tiros_libres;

    public EquipoFutbol(String nombre, int goles, int faltas, int tiros_libres) {
        this.nombre = nombre;
        this.goles = goles;
        this.faltas = faltas;
        this.tiros_libres = tiros_libres;
    }

    public String toString() {
        return nombre + "        Goles = " + goles +  " Faltas = " + faltas + " Tiros_Libres = " + tiros_libres;
    }
}
class Partido {
    String nombrePartido;
    EquipoFutbol equipo1;
    EquipoFutbol equipo2;

    public Partido(String nombre, EquipoFutbol e1, EquipoFutbol e2) {
        this.nombrePartido = nombre;
        equipo1 = e1;
        equipo2 = e2;
    }

    public String toString() {
        return nombrePartido + '\n' + equipo1 + '\n' + equipo2;
    }
}

public class EjercicioGuardarDatos {
    public static void main(String[] args) {
        EquipoFutbol e1 = new EquipoFutbol("America", 0, 10, 2);
        EquipoFutbol e2 = new EquipoFutbol("Toluca", 2, 5, 6);
        Partido p1 = new Partido("America vs Toluca",e1,e2 );

        System.out.println(p1);

    }
}

