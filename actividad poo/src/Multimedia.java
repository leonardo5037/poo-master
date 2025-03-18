public class Multimedia {
    public static void main(String[] args) {
        Pelicula p = new Pelicula("Infinity war", 149.0, 2052415039);
        Series s = new Series("ANNE", 1188.0, 4);
        Cancion c = new Cancion("Aqui Estoy", 3.20, "rock");

        System.out.println(p);
        System.out.println(s);
        System.out.println(c);
    }
}

abstract class Media {
        double duracion;
        String nombre;

        public Media(String nombre, double duracion) {
            this.nombre = nombre;
            this.duracion = duracion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {          //COMPORTAMIENTO DE LA CLASE
            this.nombre = nombre;
        }

        public double getDuracion() {
            return duracion;
        }

        public void setDuracion(double duracion) {
            this.duracion = duracion;
        }

        @Override
        public String toString() {
            return "Media{" +
                    "duracion=" + duracion +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }

    class Pelicula extends Media {
        int recaudacion;

        public Pelicula(String nombre, double duracion, int recaudacion) {
            super(nombre, duracion);
            this.recaudacion = recaudacion;
        }

        public int getRecaudacion() {
            return recaudacion;
        }

        public void setRecaudacion(int recaudacion) {
            this.recaudacion = recaudacion;
        }

        @Override
        public String toString() {
            return "Pelicula{" +
                    "recaudacion=" + recaudacion +
                    ", duracion=" + duracion +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }

    class Series extends Media {
        private int temporadas;

        public Series(String nombre, double duracion, int temporadas) {
            super(nombre, duracion);
            this.setTemporadas(temporadas);

        }

        public int getTemporadas() {
            return temporadas;
        }

        public void setTemporadas(int temporadas) {
            this.temporadas = temporadas;
        }

        @Override
        public String toString() {
            return "Series{" +
                    "temporadas=" + temporadas +
                    ", duracion=" + duracion +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }

    class Cancion extends Media {
        private String genero_musical;

        public Cancion(String nombre, double duracion, String genero_musical) {
            super(nombre, duracion);
            this.setGenero_musical(genero_musical);
        }

        public String getGenero_musical() {
            return genero_musical;
        }

        public void setGenero_musical(String genero_musical) {
            this.genero_musical = genero_musical;
        }

        @Override
        public String toString() {
            return "Cancion{" +
                    "genero_musical='" + genero_musical + '\'' +
                    ", duracion=" + duracion +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }




    // VOY A HACER LA CLASE SERIE
