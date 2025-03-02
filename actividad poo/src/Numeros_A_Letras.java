//TAREA: CREAR UNA CLASE QUE RECIBA UN NUMERO ENTRE 0 - 9999 Y QUE TENGA UN METODO PARA IMPRIMIR LA CANTIDAD CON LETRA.
//EJEMPLO: 1945
//SALIDA: Mil Novecientos Cuarenta y Cinco

import java.util.Scanner;

public class Numeros_A_Letras {

    public static String[] unidades = {
            "", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"
    };
    public static String[] diez_veinte = {
            "Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"
    };
    public static String[] decenas = {
            "", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"
    };
    public static String[] centenas = {
            "", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"
    };

    public static String separar(int numero) {
        return convertir_a_letras(numero).trim();
    }

    public static String convertir_a_letras(int numero) {
        if (numero == 0) {
            return "Cero";
        } else if (numero < 10) {
            return unidades[numero];
        } else if (numero < 20) {
            return diez_veinte[numero - 10];
        } else if (numero < 100) {
            String resta1 = decenas[numero / 10];
            if (numero % 10 != 0) {
                resta1 += " y " + unidades[numero % 10];
            }
            return resta1;
        } else if (numero < 1000) {
            if (numero == 100) {
                return "Cien";
            }

            String resta2 = centenas[numero / 100];

            if (numero % 100 != 0) {
                resta2 += " " + convertir_a_letras(numero % 100);
            }
            return resta2;
        } else if(numero < 10000){
            String resta3;
            if(numero/1000 == 1){
                resta3 = "Mil";
            }else{
                resta3 = convertir_a_letras(numero/1000) + " Mil";
            }
            if(numero % 1000 != 0){
                resta3 += " " + convertir_a_letras(numero%1000);
            }
            return resta3;
        }
        return "Número fuera de rango";
    }

    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(separar(numero));
    }
}
