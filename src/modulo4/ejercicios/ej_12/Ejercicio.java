package modulo4.ejercicios.ej_12;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        System.out.println("ingresar un nro de 4 digitos: ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        for(int i = 1; i<=4; i++){

            System.out.println("nro actualizado: "+nro);
            System.out.println("digito "+i+":"+ (nro % 10));

            nro =   nro / 10;; //le saco el ultimo digito
        }

    }
}
