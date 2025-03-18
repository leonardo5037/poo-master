public class DemoHerenciaConstructores {
    public static void main(String[] args) {
    Elefante dumbo = new Elefante("Elephantidae", "mamifero", "Asiatica", 4000);
    System.out.println(dumbo);

    //SI TIENE NEW ES UN INSTANCIAMIENTO
    // Animal lobo = new Animal("Canis Lupus", "Mamifero");     NO SE PUEDE PORQUE LA CLASE ANIMAL ES ABSTRACTA
    //  System.out.println(lobo);
    // for (Estudiante estudiante : estudiante) ES UN ITERADOR que recorre todos los elementos de la lista
        //EQUALS. compara
        // if regresa un booleano
    }
}

abstract class Animal {             //ABSTRACTA significa que no se puede instanciar
    private String especie;
    private String tipo_nacimiento;

    public Animal() {}

    public Animal(String especie, String tipo_nacimiento) {
        this.especie = especie;
        this.tipo_nacimiento = tipo_nacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo_nacimiento() {
        return tipo_nacimiento;
    }

    public void setTipo_nacimiento(String tipo_nacimiento) {
        this.tipo_nacimiento = tipo_nacimiento;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "especie = '" + especie + '\'' +
                ", tipo_nacimiento = '" + tipo_nacimiento + '\'' +
                '}';
    }
}//aqui termina la clase animal

class Elefante extends Animal {
    private String raza;            //DECLARACION
    private double peso;

    public Elefante(String especie, String tipo_nacimiento, String raza, double peso) {
        super(especie, tipo_nacimiento);  //SUPER sirve para invocar al constructor de la clase padre
        //super () se refiere a los constructores de la clase padre
        //super.ejemplo se refiere a los atributos de la clase padre
        this.raza = raza;
        this.peso = peso;

    }

    public Elefante() {}

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Elefante { " +
                "especie = '" + super.getEspecie() + '\'' +
                ", tipo = " + super.getTipo_nacimiento() + '\'' +
                ", raza = '" + raza + '\'' +
                ", peso = " + peso +
                '}';
    }
}


