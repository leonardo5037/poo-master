// Vamos a agregar un constructor a nuestra clase
// CONSTRUCTOR: Un metodo especial que es invocado
// en el proceso de instanciamiento de la clase.
// Es publico, se llama igual que la clase y no tiene
// tipo de retorno

import java.awt.*;

public class DemoConstructor_01 {
    String atributo1;
    double atributo2;
    String atributo3;

    public DemoConstructor_01() {//Este es un constructor por default aunque no lo veias existia
        System.out.println("Creando el objeto");
        atributo1 = "Valor del atributo 1";
    }

    public DemoConstructor_01(String valor) {                             //  (STRING)
        atributo1 = valor;
    }

    public DemoConstructor_01(String valor, String valor2) {               //  (STRING)
        atributo3 = valor;
        atributo1 = valor2;
    }

    public DemoConstructor_01(double valor1, String valor2) {              //  (DOUBLE, STRING)
        atributo2 = valor1;
        atributo1 = valor2;
    }

    public DemoConstructor_01(String valor2, double valor1) {              //  (STRING, DOUBLE)
        atributo2 = valor1;
        atributo1 = valor2;
    }
}
