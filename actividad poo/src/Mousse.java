public class Mousse {
    private String marca;       // PRIVATE = Modificador de texto
    private boolean inalambrico;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Mousse(String marca, boolean inalambrico, double precio) {
        this.marca = marca;
        this.inalambrico = inalambrico;
        this.precio = precio;
    }
    public Mousse(double precio, String marca, boolean inalambrico) {
        this.precio = precio;
        this.marca = marca;
        this.inalambrico = inalambrico;
    }
    public Mousse(boolean inalambrico, double precio, String marca) {
        this.inalambrico = inalambrico;
        this.precio = precio;
        this.marca = marca;
    }
    public Mousse(String marca, boolean inalambrico) {
        this.marca = marca;
        this.inalambrico = inalambrico;
    }

    @Override
    public String toString() {
        return "Mousse{" +
                "marca='" + marca + '\'' +
                ", inalambrico=" + inalambrico +
                ", precio=" + precio +
                '}';
    }
}


