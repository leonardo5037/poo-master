//AGREGAR MENU PARA LA BIBLIOTECA
//AGREGAR MENU PARA EL USUARIO


import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    private String nombre;
    private String id_usuario;
    ArrayList<Libro> libros_prestados;

    public Usuario(String nombre, String id_usuario) {
        this.nombre = nombre;
        this.id_usuario = id_usuario;
        libros_prestados = new ArrayList<>();
    }

    public void prestar_libro(Libro libro) {
        libros_prestados.add(libro);
    }

    public void devolver_libro(Libro id_libro){
        libros_prestados.remove(id_libro);
    }

    public void Mostrar_librosprestados(){
        System.out.println("Libros prestados por " + nombre + ":");
        for(int i = 0; i<libros_prestados.size(); i++){
            System.out.println(libros_prestados.get(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getId_usuario(){
        return id_usuario;
    }

    public String toString(){
        return nombre + " " + id_usuario;
    }
}

class Libro {
    private String titulo;
    private String autor;
    private String id_libro;
    private boolean disponible;

    public Libro(String titulo, String autor, String id_libro, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.id_libro = id_libro;
        this.disponible = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId_libro() {
        return id_libro;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String toString(){
        String estado = disponible ? "ocupado" : "disponible";
        return titulo + ", " + autor + ", " + "ID: " + id_libro + ", " + estado;
    }
}

class Biblioteca {
    ArrayList<Usuario> usuarios;
    ArrayList<Libro> libros;

    public Biblioteca() {
        usuarios = new ArrayList<>();
        libros = new ArrayList<>();
    }

    public void registar_usuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void registar_libro(Libro libro){
        libros.add(libro);
    }

    public void prestar_libro(String id_u, String id_libro){
        Usuario u_encontrado = null;
        Libro l_encontrado = null;

        for(Usuario usuario : usuarios){
            if(usuario.getId_usuario().equals(id_u)){
            u_encontrado = usuario;
            break;
            }
        }

        for(Libro libro : libros){
            if(libro.getId_libro().equals(id_libro)){
                l_encontrado = libro;
                break;
            }
        }

        if (u_encontrado != null && l_encontrado != null) {
            if(l_encontrado.isDisponible() == false){
                l_encontrado.setDisponible(true);
                u_encontrado.prestar_libro(l_encontrado);
            }
        }
    }

    public void devolver_libro(String id_libro){
        Libro libroDevolver = null;

        for (Libro libro : libros) {
            if(libro.getId_libro().equals(id_libro)){
                libroDevolver = libro;
                break;
            }
        }
        for (Usuario usuario : usuarios) {
            if(usuario.libros_prestados.contains(libroDevolver)){
                usuario.devolver_libro(libroDevolver);
                libroDevolver.setDisponible(false);
                return;
            }
        }
    }

    public void mostrar_librosBiblioteca(){
        System.out.println("<Libros en Biblioteca>");
        for (Libro libro : libros) {
            String estado = libro.isDisponible() ? "ocupado" : "disponible";
            String prestadoA = "";

            if (libro.isDisponible()) {
                for (Usuario usuario : usuarios) {
                    if (usuario.libros_prestados.contains(libro)) {
                        prestadoA = " (prestado a: " + usuario.getNombre() + ")";
                        break;
                    }
                }
            }

            System.out.println(libro.toString() + prestadoA);
        }
    }
}
public class EjercicioBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
        System.out.println("=== Biblioteca ===");
        System.out.println("1. REGISTRAR USUARIO");
        System.out.println("2. REGIRTRAR LIBRO");
        System.out.println("3. PRESTAR LIBRO");
        System.out.println("4. DEVOLVER LIBRO");
        System.out.println("5. MOSTRAR LIBROS");
        System.out.println("6. SALIR");
        System.out.println();
        System.out.println("Escoje una opcion: ");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Nombre del usuario: ");
                String nombre = sc.nextLine();
                System.out.println("ID del usuario: ");
                String id_usuario = sc.nextLine();
                biblioteca.registar_usuario(new Usuario(nombre, id_usuario));
                System.out.println("Usuario registrado exitosamente");
                System.out.println();
                break;

            case 2:
                System.out.println("Titulo del libro: ");
                String titulo = sc.nextLine();
                System.out.println("Autor del libro: ");
                String autor = sc.nextLine();
                System.out.println("ID del libro: ");
                String id_libro = sc.nextLine();
                biblioteca.registar_libro(new Libro(titulo, autor, id_libro, false));
                System.out.println();
                System.out.println("Libro registrado exitosamente");
                System.out.println();
                break;

            case 3:
                System.out.println("ID del Usuario ");
                String idUsuario = sc.nextLine();
                System.out.println("ID del libro: ");
                String idLibro = sc.nextLine();
                biblioteca.prestar_libro(idUsuario, idLibro);
                System.out.println();
                System.out.println("Libro prestado a " + idUsuario);
                System.out.println();
                break;

            case 4:
                System.out.println("ID del libro a devolver: ");
                String idLibroADevolver = sc.nextLine();
                biblioteca.devolver_libro(idLibroADevolver);
                System.out.println();
                System.out.println("Libro devuelto exitosamente");
                System.out.println();
                break;

            case 5:
                biblioteca.mostrar_librosBiblioteca();
                System.out.println();
                break;

            case 6:
                System.out.println("Saliendo...");
                System.out.println();
                break;
            }
        }while (opcion != 6);
    }
}

/*
        Usuario u1 = new Usuario("Leonardo", "1");
        Usuario u2 = new Usuario("Mariana", "2");
        Libro l1 = new Libro("El principito", "Antoine", "A", false);
        Libro l2 = new Libro("It", "Stephen Hawkings", "B", false);
        Libro l3 = new Libro("La luna llena", "Carmen", "C", false);
        Libro l4 = new Libro("Independencia", "Agustin de Iturbide", "D", false);


        biblioteca.registar_usuario(u1);
        biblioteca.registar_usuario(u2);
        biblioteca.registar_libro(l1);
        biblioteca.registar_libro(l2);
        biblioteca.registar_libro(l3);
        biblioteca.registar_libro(l4);


        biblioteca.prestar_libro("1", "A");
        biblioteca.prestar_libro("2", "B");

        biblioteca.mostrar_librosBiblioteca();
        */

