public class Computadora {
    private String marca;
    private int memoria_ram;
    private int almacenamiento;
    private String procesador;
    private String tarjeta_grafica;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjeta_grafica() {
        return tarjeta_grafica;
    }

    public void setTarjeta_grafica(String tarjeta_grafica) {
        this.tarjeta_grafica = tarjeta_grafica;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", memoria_ram=" + memoria_ram +
                ", almacenamiento=" + almacenamiento +
                ", procesador='" + procesador + '\'' +
                ", tarjeta_grafica='" + tarjeta_grafica + '\'' +
                '}';
    }
}
