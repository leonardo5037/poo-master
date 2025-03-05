import java.util.ArrayList;

class Vehiculo {
    String marca;
    String modelo;
    String anio;
    String motor;
    String no_ruedas;
    String tipo_de_combustible;
    String matricula;
}

class Motocicleta extends Vehiculo {
    String cc;
}
class Carro extends Vehiculo {
    int num_puertas;
}
public class Algo {
    public static void main(String[] args) {
        ArrayList<Vehiculo> motos = new ArrayList();
        Motocicleta motito = new Motocicleta();
        Carro carrito = new Carro();
        motos.add(motito);
        motos.add(carrito);
    }
}

