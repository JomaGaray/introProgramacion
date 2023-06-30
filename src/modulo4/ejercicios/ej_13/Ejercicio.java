package modulo4.ejercicios.ej_13;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        System.out.println("ingresar un nro : ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        int cantDigitos = 0;

        while (nro != 0){

            cantDigitos++; //sumo 1
            nro = nro / 10; //
            System.out.println("valor nro: " +nro);
        }
        System.out.println("cantidad de digitos: "+ cantDigitos);
    }
}
