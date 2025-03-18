public class Aves {
    public static void main(String[] args) {
        Colibri colibri = new Colibri();
        Aguila aguila = new Aguila();
    }
}
abstract class Ave {
    String color;
    public abstract void comer();
    public abstract void volar();
}

class Colibri extends Ave {
    public void comer() {                                           //POLIMORFISMO DE COMPORTAMIENTO
        System.out.println("Comiendo como un colibri");             //HERENCIA DE IMPLEMENTACION
    }                                                               //IMPLEMENTAR UN METODO
    public void volar() {
        System.out.println("Vuelo como colibri");
    }
}

class Aguila extends Ave {
    public void comer() {
        System.out.println("Comiendo como un aguila");
    }
    public void volar() {
        System.out.println("Vuelo como un aguila");
    }
}
