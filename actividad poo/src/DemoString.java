import java.util.Scanner;

public class DemoString {

    public static void main(String[] args) {

        String frase = "LeO-AndA-En-bUSCa-DeL-   AMoR   ";
        String frase_nueva = frase.toUpperCase();
        String[] resultado = frase_nueva.split("-");

        for(String s : resultado) {
                System.out.println(s.equals("AMOR"));
        }



        /*
        String nombre = new String("Shakira");
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.length());

       for (int i = 0; i < nombre.length(); i++) {
           System.out.println(nombre.charAt(i));
       }

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        nombre = nombre.toUpperCase();
        System.out.println(nombre);
        System.out.println(nombre.equals("SHAKIRA"));

        */

        //Crear uan rutina para dada una frase, buscar si existe la palabra "AMOR"

        // TAREA: CREAR UNA CLASE QUE RECIBA UN NUMERO ENTRE 0 Y 9999 y TENGA UN METODO PARA IMPRIMIR LA CANTIDAD CON LETRA.
        //EJEMPLO: 1950
        //SALIDA: Mil Seiscientos Cincuenta
    }
}
