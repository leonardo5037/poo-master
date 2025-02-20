public class MainBoleto {
    public static void main(String[] args) {
    Boleto boleto1 = new Boleto();
    Boleto boleto2 = new Boleto();

    boleto1.setTipo("Cine");
    boleto2.setTipo("Teatro");

    boleto1.setPrecio(90);
    boleto2.setPrecio(200);

    boleto1.setFecha_vencimiento("12 de Diciembre");
    boleto2.setFecha_vencimiento("5 de Junio");

    System.out.println(boleto1);
    System.out.println(boleto2);
    }
}
