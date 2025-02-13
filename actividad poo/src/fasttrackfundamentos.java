import javax.crypto.spec.PSource;
import java.util.Scanner;
public class fasttrackfundamentos {
    public static void main(String[] args) {

        //Variables en java
        int a;
        double b;
        float c;
        String d;
        boolean e;

        a = 3;
        b = 20.50;
        e = true;
        d = "Esto es una cadena de texto";
        String nombre = "Leonardo Garcia";

        //Constantes

        final double PI = 3.141516;

        Scanner intro = new Scanner(System.in);
        /*
       System.out.println(b);
       b=intro.nextDouble();
       System.out.println(b);

        // condicionales <,>,<=,>=,!=,==
        // operadores logicos &&, ||, !

        int valor=12;
        int calif=82;
        if(valor>=20 || calif>85){
            if(valor>=20) {
                if (valor == 20) {
                    System.out.println("Es exactamente 20");
                } else {
                    System.out.println("Es superior a 20");
                }
            }

        }
        else{
            System.out.println("Es menor o igual");
        }
        System.out.println("FIN DEL PROGRAMA");

    }
}


        //Condicionales multiples "switch"
        int opcion;
        opcion = 1;

        switch (opcion) {
            case 1:
                System.out.println("Vale 1");
                break;
            case 2:
                System.out.println("Vale 2");
                break;
            case 3:
                System.out.println("Vale 3");
                break;
            default:
                System.out.println("Valor no permitido");
                break;
        }

        //ciclos:

        for(int i=10, j=0 ;i!=j;i--,j++){
            if(i==9){
                continue;
            }
            System.out.println(i);
            if(i==7){
                break;
            }
        }
        // PUEDE USARSE PARA HACER UN MENU

        Scanner teclado = new Scanner(System.in);
        int opcion=-1;
        for(;;){
            System.out.println("escribe 0 para salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("tecleaste 1");
                    break;
                case 2:
                    System.out.println("tecleaste 2");
                    break;
                case 3:
                    System.out.println("tecleaste 3");
                    break;
                default:
                    break;
            }
            if(opcion == 0){
                break;
            }
        }//termina el for

        //while
        //centinela

        int opcion=20;
        while(opcion>10) {
            System.out.println(opcion);
            opcion=opcion-1;
        }
        int centinela=0;
        while(centinela!=0){
            System.out.println("centinela en while");
        }

        //el do while se usa mayormente en menus
        centinela=0;
        do{
            System.out.println("centinela en do while");
        }while(centinela!=0);


        // Arreglos
        // int[] edades={18,20,21,25,19,22};
        // String nombres[]={"Leo","Abraham","Rebecca"};

        int edades[]=new int[10];

        edades[6]=16;
        edades[1]=20;
        System.out.println(edades[6]);
        System.out.println(edades[1]);
        System.out.println(edades[0]);

        String[] paises=new String[5];
        paises[0]="Mexico";
        System.out.println(paises[0]);

        //System.out.println(nombres[nombres.length-1]);

        //for(int i=0;i<nombres.length;i++){
            //System.out.println(nombres[i]);


        //Matrices, son arreglos bidimensionales
        int[][] calificaciones ={{1,2,3},
                                 {4,5,6},
                                 {7,8,9}};

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[0].length; j++) {
                System.out.print(calificaciones[j][i]);
            }
        }
        */
        double[][] calif_poo=new double[27][6];
        calif_poo[6][0]=99;
        System.out.println(calif_poo[6][0]);
      

        //}
    }   //FIN DE MAIN


}