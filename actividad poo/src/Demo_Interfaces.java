public class Demo_Interfaces {
    //IMPLEMENTAR LA CLASE ABSTRACTA NUMERO EN NumeroConcreto
    //IMPLEMENTAR LOS METODOS DE LA INTERFAZ OPERACIONES
    //CREAR 2 OBJETOS DE TIPO NumeroConcreto
    //Sumar, restar, multiplicar y dividir los objetos utilizando los metodos

    public static void main(String[] args) {
        NumeroConcreto num1 = new NumeroConcreto();
        NumeroConcreto num2 = new NumeroConcreto();

        num1.valor = 400;
        num2.valor = 200;
        num1.sumar(num2);

        System.out.println(num1.valor);

    }
}

interface Operaciones{
    public void sumar(Numero otroNumero);
    public void restar(Numero otroNumero);
    public void multiplicar(Numero otroNumero);
    public void divEntera(Numero otroNumero);
}

abstract class Numero implements Operaciones{
 public int valor;
}

class NumeroConcreto extends Numero{ ;

    public void sumar(Numero otroNumero) {
    this.valor = this.valor + otroNumero.valor;
    }

    public void restar(Numero otroNumero) {
    this.valor = this.valor - otroNumero.valor;
    }

    public void multiplicar(Numero otroNumero) {
    this.valor = this.valor * otroNumero.valor;
    }

    public void divEntera(Numero otroNumero) {
    this.valor = (int)(this.valor / otroNumero.valor);
    }
}
