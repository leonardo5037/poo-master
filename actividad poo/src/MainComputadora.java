import java.sql.SQLOutput;

public class MainComputadora {
    public static void main(String[] args) {
        Computadora pc1 = new Computadora();
        Computadora pc2 = new Computadora();

        pc1.setMarca("Asus");
        pc2.setMarca("Hp");

        pc1.setMemoria_ram(24);
        pc2.setMemoria_ram(16);

        pc1.setAlmacenamiento(1028);
        pc2.setAlmacenamiento(500);

        pc1.setProcesador("Intel Core 5");
        pc2.setProcesador("AMD Ryzen 7");

        pc1.setTarjeta_grafica("NVIDIA GeForce RTX 3050");
        pc2.setTarjeta_grafica("Intel Iris Xe Graohics");

        System.out.println(pc1);
        System.out.println(pc2);
    }
}
