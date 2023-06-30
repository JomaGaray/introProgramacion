package modulo4.ejercicios.ej_08;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--> calculadora de factorial <--");
        System.out.println("ingrese nro : ");

        int nro = sc.nextInt();

        int resultado = 1;

        //
        for(int i = nro; i>=1; i = i-1){

            System.out.println("valor i: "+ i);

            resultado = resultado*i;

        }

        System.out.println("valor final: " + resultado);
    }
}
