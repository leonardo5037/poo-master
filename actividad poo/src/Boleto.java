public class Boleto {
    private String tipo;
    private double precio;
    private String fecha_vencimiento;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", fecha_vencimiento='" + fecha_vencimiento + '\'' +
                '}';
    }
}
