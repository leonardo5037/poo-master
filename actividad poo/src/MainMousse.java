public class MainMousse {
    public static void main(String[] args) {
        Mousse mousse1  = new Mousse("Logitech", true,400.0);   //INSTANCIAMIENTO = Mousse mousse1  = new Mousse("Logitech", true,400.0);
        Mousse mousse2 = new Mousse(false, 350.0, "Razer");     //OBJETO = m1
        Mousse mousse3 = new Mousse(500.99, "Microsoft", true); //CLASE = Mousse
        Mousse mousse4 = new Mousse("Genius", false);

        System.out.println(mousse1);
        System.out.println(mousse2);
        System.out.println(mousse3);
        System.out.println(mousse4);

        mousse4.setMarca("Microsoft");

        System.out.println(mousse4);
    }
}
