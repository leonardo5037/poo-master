public class Boleta {
    String nombre;
    String semestre;
    int materia1;
    int materia2;
    int materia3;
    int materia4;
    int materia5;
    int materia6;
    int materia7;
    double promedio;



    double calcularPromedio() {
        return promedio=(materia1+materia2+materia3+materia4+materia5+materia6+materia7)/7;
    }
    String obtener_dato(){
        String cad = "";
        cad = cad + nombre+", ";
        cad = cad + semestre+", ";
        cad = cad+calcularPromedio();
        return cad;
        }
    }

