import java.io.FileInputStream;
    /*
    MANEJO DE EXCEPCIONES
    ATENCION DE LA EXCEPCION

    EXCEPCIONES NO VERIFICADAS: significa que java no conoce de antemano que el codigo generara un error
    EXCEPCIONES VERIFICADAS: significa que el lenguaje ya conoce que ese error puede ocurrir.
    Las EXCEPCIONES tambien son clases
    Las EXCEPCIONES se pueden manejar/atender o transferirla

    Un ERROR es aquello de lo que no te puedes recuperar, ejemplo(pantallazo azul, se va la luz)
    el finally se ocupa para cuando ocurra o no ocurra la excepcion, es decir, se ejecuta si o si
    public class DemoExcepciones {

    public static void main(String[] args) {
        PruebaExcepcion pe = new PruebaExcepcion();
        try {
            pe.creaArreglo();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Mi mensaje de excepcion");
        }


        try {
           int arreglo[] = new int[10];
           // int suma = 10/0;
           arreglo[1] = 20;
        } catch (ArrayIndexOutOfBoundsException excepcion) {
           System.out.println("Te pasaste de los limites del arreglo");
        } finally {
            System.out.println("Hasta luego");
        } catch (Exception e){
           System.out.println("Ocurrio un error diferente");
        }


        // String ruta = "Persona.java";
        // FileInputStream fis = new FileInputStream(ruta);

    }
}

class PruebaExcepcion{
    public static void main(String[] args) throws IndexOutOfBoundsException {
        int arreglo[] = new int[10];
        arreglo[11] = 20;
    }
}
*/