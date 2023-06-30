package modulo4.ejercicios.ej_11;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        System.out.println("ingresar un nro: ");
        Scanner sc = new Scanner(System.in);

        int nro = sc.nextInt();

        for (int i =1 ; i<=10; i++){
            System.out.println(nro +"x" + i +"= "+ (nro*i));
        }
    }
}
