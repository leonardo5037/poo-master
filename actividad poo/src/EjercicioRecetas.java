import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Ingrediente implements Serializable {
    String nombreIng;

    public Ingrediente(String nombreIng) {
        this.nombreIng = nombreIng;
    }
    public String toString() {
        return nombreIng;
    }
}

class recetas implements Serializable {
    String nombre;
    ArrayList<Ingrediente> ingredientes;

    public recetas(String nombre) {
        this.nombre = nombre;
        ingredientes = new ArrayList<>();
    }

    public String toString() {
        return nombre;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

}

public class EjercicioRecetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("====OPCIONES====");
            System.out.println("1. Crear receta");
            System.out.println("2. Buscar receta");
            System.out.println("3. Eliminar receta");
            System.out.println("4. Salir");
            System.out.println();

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("nombre de la receta: ");
                    String nombre = sc.nextLine();
                    recetas receta1 = new recetas(nombre);
                    System.out.println("ingrese cada ingrediente: (Escribir fin para terminar)");
                    while (true) {
                        String nombre_ingrediente = sc.nextLine();
                        if (nombre_ingrediente.equals("fin")) {
                            break;
                        }
                        Ingrediente ingrediente = new Ingrediente(nombre_ingrediente);
                        receta1.addIngrediente(ingrediente);
                    }
                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/Leonardo Garcia/OneDrive/Desktop/poo_ejemplo/recetas/" + nombre + ".txt"));
                        oos.writeObject(receta1);
                        oos.close();
                    } catch (Exception e) {
                    }
                    System.out.println("SE CREO LA RECETA " +  nombre );
                    System.out.println();
                    break;

                case 2:
                    System.out.println("NOMBRE DE LA RECETA QUE QUIERES BUSCAR ");
                    String recetaABuscar = sc.nextLine();
                    File archivoBuscar = new File("C:/Users/Leonardo Garcia/OneDrive/Desktop/poo_ejemplo/recetas/" + recetaABuscar + ".txt");

                    if (archivoBuscar.exists()) {
                        try {
                            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/Leonardo Garcia/OneDrive/Desktop/poo_ejemplo/recetas/" + recetaABuscar + ".txt"));
                            recetas receta = (recetas) ois.readObject();
                            ois.close();

                            System.out.println("RECETA ENCONTRADA: " + receta);
                            System.out.println("INGREDIENTES DE LA RECETA: ");
                            for (Ingrediente ingrediente : receta.ingredientes) {
                                System.out.println(ingrediente);
                            }
                            System.out.println();
                        } catch (Exception e) {
                        } break;
                    }else{
                        System.out.println("NO EXISTE LA RECETA QUE BUSCAS ");
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("NOMBRE DE LA RECETA QUE QUIERES ELIMINAR: ");
                    String recetaAEliminar = sc.nextLine();
                    File archivoEliminar = new File("C:/Users/Leonardo Garcia/OneDrive/Desktop/poo_ejemplo/recetas/" + recetaAEliminar + ".txt");

                    if (archivoEliminar.exists()) {
                        archivoEliminar.delete();
                        System.out.println("RECETA ELIMINADA: " + recetaAEliminar);
                        System.out.println();
                        break;
                    } else {
                        System.out.println("NO EXISTE ESA RECETA ");
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println();
                    return;

                default:
                    System.out.println("OPCION NO VALIDA");
            }
        }
    }
}