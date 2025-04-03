public class DemoLanzarExcepcion {
    public static void main(String[] args) throws Exception {
        // throw new Exception("Se me ocurrio lanzar esta excepcion");
        int a=10;
        int b=0;

        if  (b == 0)
            throw new MiExcepcion();
        else {
            int div=a/b;
            System.out.println(div);
        }
    }
}

class MiExcepcion extends Exception {
    public MiExcepcion() {
        super("Esta es mi propia excepcion");
    }
}
