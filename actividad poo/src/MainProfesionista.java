public class MainProfesionista {
public static void main(String[] args) {
    Profesionista profesionista1 = new Profesionista();
    Profesionista profesionista2 = new Profesionista();

    profesionista1.setNombre("Leonardo");
    profesionista2.setNombre("Cristel");

    profesionista1.setApellido("Garcia");
    profesionista2.setApellido("Lara");

    profesionista1.setEdad(19);
    profesionista2.setEdad(18);

    profesionista1.setSexo("Masculino");
    profesionista2.setSexo("Femenino");

    profesionista1.setArea_profesion("Ciberseguridad");
    profesionista2.setArea_profesion("Diseño de programas");

    profesionista1.setCapacidad_liderazgo(true);
    profesionista2.setCapacidad_liderazgo(false);

    System.out.println(profesionista1.toString());
    System.out.println(profesionista2.toString());
}
}
