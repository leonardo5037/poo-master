import java.util.ArrayList;

class Artista {
    private String nombre;

    public Artista(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String toString() {
        return nombre;
    }
}

class Album {
    private String titulo_album;

    public Album(String titulo_album) {
        this.titulo_album = titulo_album;
    }
    public String getTitulo_album() {
        return titulo_album;
    }
    public String toString() {
        return titulo_album;
    }
}

class Cancion {
    private String titulo_cancion;
    Artista artista;
    Album album;

    public Cancion(String titulo_cancion, Artista artista, Album album) {
        this.titulo_cancion = titulo_cancion;
        this.artista = artista;
        this.album = album;
    }
    public String getTitulo_album() {
        return titulo_cancion;
    }
    public Artista getArtista() {
        return artista;
    }
    public Album getAlbum() {
        return album;
    }
    public String toString() {
        return (titulo_cancion + ", Artista: " + artista.getNombre() + ", Album: " + album.getTitulo_album());
    }
}

class Playlist {
    ArrayList<Cancion> canciones;

    public Playlist() {
        canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    public void mostrarCanciones() {
        for (int i = 0; i < canciones.size(); i++) {
            System.out.println(canciones.get(i));
        } System.out.println();
    }

}
public class Ejercicio_listado {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Artista markAntony = new Artista("Mark Antony");
        Album vol1 = new Album("Vol 1");
        Album vol2 = new Album("Vol 2");
        Cancion c1 = new Cancion("Flor Palida", markAntony, vol1);
        Cancion c2 = new Cancion("Vivir la vida", markAntony, vol2);

        playlist.agregarCancion(c1);
        playlist.agregarCancion(c2);
        playlist.mostrarCanciones();
        playlist.eliminarCancion(c1);
        playlist.mostrarCanciones();

    }
}
