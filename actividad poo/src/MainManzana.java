public class MainManzana {
    public static void main(String[] args) {
        Manzana m1 = new Manzana();
        Manzana m2 = new Manzana();

        m1.setColor("Amarilla");
        m2.setColor("Roja");

        m1.setPrecio(16);
        m2.setPrecio(20);

        m1.setTamanio("Mediana");
        m2.setTamanio("Grande");

        System.out.println(m1);
        System.out.println(m2);
    }
}
