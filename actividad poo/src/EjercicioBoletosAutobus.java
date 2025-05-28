import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int opcion;


        while (true) {
            System.out.println("======APLICACION AUTOBUS======");
            System.out.println("1. Ver disponibilidad de asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Desbloquear asiento");
            System.out.println("4. Obtener tickets o boleto");
            System.out.println("5. Cancelar ticket");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Asientos del autobus:");
                    autobus.mostrarAsientos();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Ingrese el numero del asiento que quiere reservar:");
                    int AsientoAReservar = sc.nextInt() - 1;
                    if(AsientoAReservar < 41 && AsientoAReservar > 0) {
                        if (autobus.reservarAsiento(AsientoAReservar) == true) {
                            System.out.println("El asiento fue reservado");
                            System.out.println();
                        }else{
                            System.out.println("El asiento ya esta reservado");
                            System.out.println();
                        }
                    }else {
                        System.out.println("El asiento no existe");
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el numero del asiento que quiere desbloquear:");
                    int AsientoADesbloquear = sc.nextInt() - 1;
                    if (autobus.DesbloquearAsiento(AsientoADesbloquear) == true) {
                        System.out.println("El asiento fue desbloqueado");
                        System.out.println();
                    }else{
                        System.out.println("El asiento no ha sido bloqueado");
                        System.out.println();
                    }
                    break;



            }
        }
    }
}


