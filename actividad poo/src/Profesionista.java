public class Profesionista {
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String area_profesion;
    private boolean capacidad_liderazgo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getArea_profesion() {
        return area_profesion;
    }

    public void setArea_profesion(String area_profesion) {
        this.area_profesion = area_profesion;
    }

    public Boolean getCapacidad_liderazgo() {
        return capacidad_liderazgo;
    }

    public void setCapacidad_liderazgo(Boolean capacidad_liderazgo) {
        this.capacidad_liderazgo = capacidad_liderazgo;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", area_profesion='" + area_profesion + '\'' +
                ", capacidad_liderazgo='" + capacidad_liderazgo + '\'' +
                '}';
    }
}
