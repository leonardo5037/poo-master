class Alumno {
    private String nombre;
    private String apellidos;
    private String numControl;

    public Alumno(String nombre, String apellidos, String numControl) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numControl = numControl;
    }

    public String getNumControl() {
        return numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + numControl + ")";
    }
}
