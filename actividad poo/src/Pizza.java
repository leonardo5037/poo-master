public class Pizza {
    private String especialidad;
    private double precio;
    private String tamanio;


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Pizza(String especialidad, double precio, String tamanio) {
        this.especialidad = especialidad;
        this.precio = precio;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "especialidad='" + especialidad + '\'' +
                ", precio=" + precio +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
