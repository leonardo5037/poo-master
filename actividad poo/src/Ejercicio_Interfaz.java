import org.w3c.dom.Node;

import javax.swing.*;

/*
    Crear una interfaz llamada Conectable con los metodos:
        - conectarDerecha
        - conectarIzquierda

    Crear una clase concreta llamada Nodo que contenga los campos
        - nombre
        - valor

        Implementar en la clase Nodo la interfaz, de tal manera que un nodo en la izquierda se conecte con el nodo a su
        derecha y automaticamente el nodo a su derecha se conecte con el nodo izquierdo.
        De igual manera si el nodo a la derecha se conecta al de la izquierda, automaticamente el nodo izquierdo se
        conecta a la derecha.
 */

public class Ejercicio_Interfaz {

    public static void main(String[] args) {
    Nodo n1 = new Nodo("A", 0.0);
    Nodo n2 = new Nodo("B", 0.0);

    n1.conectarDerecha(n2);

    System.out.println(n1);
    System.out.println(n2);
    }

    interface Conectable {
        public void conectarDerecha(Nodo nodo);

        public void conectarIzquierda(Nodo nodo);
    }

    static class Nodo implements Conectable {
        String nombre;
        double valor;
        Nodo Izquierda;
        Nodo Derecha;

        public Nodo getIzquierda() {
            return Izquierda;
        }

        public Nodo getDerecha() {
            return Derecha;
        }

        public Nodo(String nombre, double valor) {
            this.nombre = nombre;
            this.valor = valor;
        }

        public void conectarDerecha(Nodo nodo) {
            this.Derecha = nodo;
            if (nodo != null && nodo.Izquierda != this) {
                nodo.conectarIzquierda(this);
            }
        }

        public void conectarIzquierda(Nodo nodo) {
            this.Izquierda = nodo;
            if (nodo != null && nodo.Derecha != this) {
                nodo.conectarDerecha(this);
            }
        }
        public String toString() {
            String izquierda = "No esta conectado";
            String derecha = "No esta conectado";
            if (Izquierda != null) {izquierda = Izquierda.nombre;}
            if (Derecha != null) {derecha = Derecha.nombre;}
            return ("Nodo '" + nombre + "' = {valor= " + valor + ", Izquierda= " + izquierda + ", Derecha= " + derecha + "}");
        }
    }
}
