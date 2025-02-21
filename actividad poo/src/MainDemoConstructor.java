public class MainDemoConstructor {
    public static void main(String[] args) {
        //Aqui estas invocando al constructor
        DemoConstructor_01 obj = new DemoConstructor_01();
        System.out.println(obj.atributo1);
        obj.atributo1 = "Nuevo valor";
        System.out.println(obj.atributo1);

        DemoConstructor_01 obj2 = new DemoConstructor_01("Este es mi valor");
        System.out.println(obj2.atributo1);

        DemoConstructor_01 obj3 = new DemoConstructor_01(20.5, "Este es mi valor");
        //DemoConstructor1 con la huella (DOUBLE, STRING)
        /*
        new Alumno ("Rebeca",18,"E20234567","Segundo");
        //Esto ya no seria necesario:
        r.nombre = "Rebeca";
        r.edad = 18;
        r.control = "E20234567";
        r.semestre = "Segundo";
        */

    }
}
