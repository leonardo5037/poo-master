// Crear un programa orientado a objetos que permita crear objetos calculadora de cambio de divisas.
// Debe de recibir la cantidad de un tipo de moneda y dar como salida la cantidad equivalente en la otra moneda
// Crear 5 objetos que realicen cambios diferentes
// Evitar que el objeto pida los datos de entrada desde teclado
// Implementar herencia
// Implementar 2 constructores no vacios.

class CalculadoraDivisas {
    String monedaInicial;
    String monedaFinal;
    double tasaDeCambio;
    double monedaCambiada;

  public CalculadoraDivisas(String monedaInicial, String monedaFinal, double tasaDeCambio) {
      this.monedaInicial = monedaInicial;
      this.monedaFinal = monedaFinal;
      this.tasaDeCambio = tasaDeCambio;
  }

    public CalculadoraDivisas (double tasaDeCambio) {
    this("monedaInicial", "monedaFinal", tasaDeCambio);
    }

    public void calcular (double cantidad) {
    monedaCambiada = cantidad * tasaDeCambio;
    }
    
}

public class EjercicioCalculadoraDivisas {
}
