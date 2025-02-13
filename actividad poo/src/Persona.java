public class Persona {
    String nombre;
    int edad;
    double peso;
    double estatura;
    String genero;

    double calcular_imc(){
        return peso/(estatura*estatura);
    }

    String obtener_dato(){
        String cad = "";
        cad = cad+"persona{nombre: "+nombre+"; ";
        cad = cad+"edad: "+edad+"; ";
        cad = cad+"estatura: "+estatura+"; ";
        cad = cad+"peso: "+peso+"; ";
        cad = cad+"genero: "+genero+"} ";
        return cad;
    }


}
