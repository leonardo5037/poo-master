import java.sql.SQLOutput;

public class MainAsignatura {
    public static void main(String[] args) {
        Asignatura poo = new Asignatura();
        poo.setNombre("Programacion orientada a objetos");
        poo.setClave("AED-1286");
        poo.setCreditos(5);
        poo.setTeoricas(2);
        poo.setPracticas(3);

        System.out.println(poo);

    }
}
