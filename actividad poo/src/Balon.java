public class Balon {
    private String tipo;
    private String color;
    private Boolean inflado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getInflado() {
        return inflado;
    }

    public void setInflado(Boolean inflado) {
        this.inflado = inflado;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", inflado=" + inflado +
                '}';
    }
}
