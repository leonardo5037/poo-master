
//AUN LE FALTA, No agrega un nuevo vehiculo despues de haber agregado recientemente 3 vehiculos

import java.util.ArrayList;

abstract class Vehiculo {
    String num_placa;
    String marca;

    public Vehiculo(String num_placa, String marca) {
        this.num_placa = num_placa;
        this.marca = marca;
    }

    public String getNum_placa() {
        return num_placa;
    }

    public String getMarca() {
        return marca;
    }
}

class Coche extends Vehiculo {
    public Coche(String num_placa, String marca) {
        super(num_placa, marca);
    }

    @Override
    public String toString() {
        return "Coche [Numero de placa: " + num_placa + ", Marca: " + marca + "]";
    }
}

class Moto extends Vehiculo {
    public Moto(String num_placa, String marca) {
        super(num_placa, marca);
    }

    @Override
    public String toString() {
        return "Motocicleta [Numero de placa: " + num_placa + ", Marca: " + marca + "]";
    }
}

class Ticket {
    Vehiculo vehiculo;
    String fecha;
    String hora;

    public Ticket(Vehiculo vehiculo, String fecha, String hora) {
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "Ticket: " + vehiculo + ", Fecha: " + fecha + ", Hora: " + hora;
    }
}

class Cajon {
    private boolean ocupado = false;

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        this.ocupado = true;
    }

    public void desocupar() {
        this.ocupado = false;
    }
}

class EstacionamientoParking {
    private ArrayList<Cajon> cajones;
    private ArrayList<Ticket> tickets;

    public EstacionamientoParking() {
        cajones = new ArrayList<>();
        tickets = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            cajones.add(new Cajon());
            tickets.add(null);
        }
    }

    public Ticket agregarVehiculo(Vehiculo vehiculo, String fecha, String hora) {
        for (int i = 0; i < cajones.size(); i++) {
            if (!cajones.get(i).isOcupado()) {
                cajones.get(i).ocupar();
                Ticket ticket = new Ticket(vehiculo, fecha, hora);
                tickets.set(i, ticket);
                System.out.println("Ticket agregado: " + ticket);
                return ticket;
            }
        }
        System.out.println("No se puede agregar el vehículo, no hay cajones disponibles.");
        return null;
    }

    public boolean eliminarVehiculo(String numPlaca) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (ticket != null && ticket.getVehiculo().getNum_placa().equals(numPlaca)) {
                cajones.get(i).desocupar();
                tickets.set(i, null);
                return true;
            }
        }
        return false;
    }

    public void imprimirCajones() {
        System.out.println("ESTACIONAMIENTO:");
        for (int i = 0; i < cajones.size(); i++) {
            String estado = cajones.get(i).isOcupado() ? "ocupado" : "desocupado";
            System.out.println("Cajón #" + (i + 1) + ": " + estado);
        }
    }
}

public class Estacionamiento {
    public static void main(String[] args) {
        EstacionamientoParking estacionamiento = new EstacionamientoParking();

        Coche coche1 = new Coche("ABC123", "Toyota");
        Moto moto1 = new Moto("XYZ789", "Yamaha");
        Moto moto2 = new Moto("ABC123", "Toyota");

        estacionamiento.agregarVehiculo(coche1, "02/04/2025", "10:00:00");
        estacionamiento.agregarVehiculo(moto1, "02/04/2025", "10:05:00");
        estacionamiento.agregarVehiculo(moto2, "02/04/2025", "10:06:00");

        estacionamiento.eliminarVehiculo("ABC123");

        estacionamiento.imprimirCajones();
    }
}