import java.io.*;

public class Ejemplo {
    public static void main(String[] args) {

        Casa[] depas = new Casa[3];

        depas[0] = new Casa("Mariana", 4, 2000.0);
        depas[1] = new Casa("Juan", 5, 6000.0);
        depas[2] = new Casa("Leo", 6, 3500.0);

        try {
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/Leonardo Garcia/OneDrive/Desktop/poo_ejemplo/casa.txt"));

            escribiendo_fichero.writeObject(depas);

            escribiendo_fichero.close();

            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:/Users/Leonardo Garcia/OneDrive/Desktop/poo_ejemplo/casa.txt"));

            recuperando_fichero.readObject();


        }catch (Exception e){

        }
    }
}

class Casa implements Serializable {
    String propietario;
    int num_habitaciones;
    double renta;

    public String getPropietario() {
        return propietario;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public double getRenta() {
        return renta;
    }

    public Casa(String propietario, int num_habitaciones, double renta) {
        this.propietario = propietario;
        this.num_habitaciones = num_habitaciones;
        this.renta = renta;
    }

    public String toString() {
        return propietario + "\n" + num_habitaciones + "\n" + renta;
    }



}

class Departamento extends Casa {
    String num_departamento;

    public Departamento(String propietario, int num_habitaciones, double renta, String num_departamento) {
        super(propietario, num_habitaciones, renta);
        this.num_departamento = num_departamento;
    }

    public String getNum_departamento() {
        return num_departamento;
    }

    public String toString() {
        return num_departamento + "\n" + super.toString();
    }
}
