class Asistencia {
    private Alumno alumno;
    private boolean presente;

    public Asistencia(Alumno alumno, boolean presente) {
        this.alumno = alumno;
        this.presente = presente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public boolean isPresente() {
        return presente;
    }

    @Override
    public String toString() {
        return alumno + " - Presente: " + (presente ? "Si" : "No");
    }
}