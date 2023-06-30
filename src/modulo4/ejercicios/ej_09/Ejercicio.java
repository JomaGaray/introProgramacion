package modulo4.ejercicios.ej_09;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        final int CLAVE = 1234;

        System.out.println("-->Control de caja fuerte<--");

        Scanner sc = new Scanner(System.in);
        int clave = 0;

        do {
            System.out.println("ingrese la clave : ");
            clave = sc.nextInt();

            if (clave != CLAVE){
                System.out.println("intente nuevamente");
            }

        }while (clave != CLAVE);

        System.out.println("-->ACCESO PERMITIDO<--");
    }
}
