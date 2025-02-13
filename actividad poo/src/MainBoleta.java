public class MainBoleta {
    public static void main(String[] args) {
        Boleta p1 = new Boleta();

        p1.nombre = "Leonardo Garcia Ponce";
        p1.semestre = "Segundo Semestre";
        p1.materia1 = 66;
        p1.materia2 = 99;
        p1.materia3 = 25;
        p1.materia4 = 11;
        p1.materia5 = 89;
        p1.materia6 = 75;
        p1.materia7 = 15;
        System.out.println(p1.obtener_dato());

        Boleta p2 = new Boleta();
        p2.nombre = "Cristel Ismeirai Lara Garcia";
        p2.semestre = "Segundo Semestre";
        p2.materia1 = 97;
        p2.materia2 = 99;
        p2.materia3 = 96;
        p2.materia4 = 95;
        p2.materia5 = 100;
        p2.materia6 = 100;
        p2.materia7 = 90;
        System.out.println(p2.obtener_dato());

        Boleta p3 = new Boleta();
        p3.nombre = "Mariana Rojas Vicario";
        p3.semestre = "Segundo Semestre";
        p3.materia1 = 100;
        p3.materia2 = 95;
        p3.materia3 = 29;
        p3.materia4 = 87;
        p3.materia5 = 30;
        p3.materia6 = 59;
        p3.materia7 = 80;
        System.out.println(p3.obtener_dato());
    }
}
