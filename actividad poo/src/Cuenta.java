public class Cuenta {
    double saldo;
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }
    public boolean retirar(double cantidad) {
        if (saldo >= cantidad){
            this.saldo -= cantidad;
            return true;
        }else{
            return false;
        }
    }
}

    class CuentaCredito extends Cuenta{
        double monto_credito;
        double taza_interes;
        double aPagar;
        public void corte() {
        double deuda = monto_credito - this.saldo + aPagar;
        double interes = (taza_interes/12*deuda);
        aPagar = deuda + interes;
    }

    public CuentaCredito(double credito, double interes) {
            this.monto_credito = credito;
            this.taza_interes = interes;
            this.saldo = credito;
    }

    public void pagar_deuda(double cantidad) {
        monto_credito += cantidad;
        if (saldo>monto_credito){
            saldo = monto_credito;
        }
        aPagar = aPagar - cantidad;
    }

    public void usar_credito(double cantidad) {
            retirar(cantidad);
    }

}