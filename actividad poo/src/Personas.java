class Personas {
    private String nombre;
    private Personas izquierda;
    private Personas derecha;
    public Personas(String nombre) {
        this.nombre = nombre;
    }
    public void asignarIzquierda(Personas p) {
        this.izquierda = p;
        p.derecha = this;
    }
    public void asignarDerecha(Personas p) {
        this.derecha = p;
        p.izquierda = this;
    }
    public void mostrarConexiones() {
        String izq;
        if (izquierda != null) {
            izq = izquierda.nombre;
        } else {
            izq = "Nadie";
        }
        String der;
        if (derecha != null) {
            der = derecha.nombre;
        } else {
            der = "Nadie";
        }
        System.out.println(nombre + " tiene a la izquierda a " + izq + " y a la derecha a " + der);
    }

    public static void main(String[] args) {
        Personas p1 = new Personas("Mariana");
        Personas p2 = new Personas("Wendy");
        Personas p3 = new Personas("Leonardo");

        p1.asignarDerecha(p2);
        p2.asignarDerecha(p3);

        p1.mostrarConexiones();
        p2.mostrarConexiones();
        p3.mostrarConexiones();
    }
}
