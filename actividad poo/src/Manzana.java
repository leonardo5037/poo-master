public class Manzana {
    private String color;
    private String tamanio;
    private int precio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "color='" + color + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
