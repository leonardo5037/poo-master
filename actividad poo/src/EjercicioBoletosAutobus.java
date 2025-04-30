/*

 Crear una aplicacion para comprar boletos de autobus.
 Considere que el autobus como un objeto.
 Cada asiento es un objeto.
 El ticket es un objeto.
 El sistema tiene el siguiente menu de opciones:

 1. Ver disponibilidad de asientos:   Muestra todos los asientos ocupados y vacios
 2. Reservar asiento:                 Reserva el asiento bloqueando para que nadie pueda tomarlo
 3. Desbloquear asiento:              Elimina la reserva de un boleto dejandolo disponible
 4. Obtener el ticket o boleto:       Genera un ticket del asiento o asientos reservados
 5. Cancelar ticket:                  Libera el asiento y cancela el ticket colocando status cancelado
 6. Salir

*/
class Autobus {
    Asiento[] asientos;
    int numero_asientos = 40;
    public Autobus() {
        asientos = new Asiento[numero_asientos];
        for(int i = 0; i < numero_asientos; i++) {
            asientos[i] = new Asiento();
        }
    }

    public void mostrarAsientos(){
        for (int i = 0; i < asientos.length; i++) {
            System.out.println("Asiento " + (i + 1) + ": " + asientos[i]);
        }
    }

    public boolean reservarAsiento(int numero){
        if (numero >= 1 && numero <= numero_asientos && asientos[numero] != null) {
            if (!asientos[numero - 1].disponibilidad()) {
                asientos[numero - 1].reservar();
                return true;
            }
        }
        return false;
    }

    public boolean DesbloquearAsiento(int numero){
        if (numero >= 1 && numero <= numero_asientos){
            if (!asientos[numero - 1].disponibilidad()) {
                asientos[numero - 1].desbloquear();
                return true;
            }
        }
        return false;
    }
}

class Asiento {
    boolean disponible;

    public Asiento() {
        this.disponible = false;
    }

    public boolean disponibilidad() {
        return disponible;
    }

    public void reservar() {
        this.disponible = true;
    }

    public void desbloquear() {
        this.disponible = false;
    }

    public String toString() {
        return disponible ? "Ocupado" : "vacio";
    }

}

public class EjercicioBoletosAutobus {
    public static void main(String[] args) {
        Autobus autobus = new Autobus();

        autobus.reservarAsiento(4);
        autobus.reservarAsiento(10);
        autobus.reservarAsiento(5);
        autobus.mostrarAsientos();
    }

}
