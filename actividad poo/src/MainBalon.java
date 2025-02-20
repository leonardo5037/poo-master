public class MainBalon {
    public static void main(String[] args) {
        Balon balon1 = new Balon();
        Balon balon2 = new Balon();

        balon1.setTipo("Futbol");
        balon2.setTipo("Basketball");

        balon1.setColor("Blanco y Negro");
        balon2.setColor("Naranja");

        balon1.setInflado(true);
        balon2.setInflado(false);

        System.out.println(balon1);
        System.out.println(balon2);
    }
}
