package modulo4.ejercicios.ej_10;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {


        final int CLAVE = 1234;

        System.out.println("-->Control de caja fuerte<--");
        Scanner sc = new Scanner(System.in);

        int clave = 0;
        int cantIntentos = 4;

        do {

            System.out.println("ingrese la clave : ");
            clave = sc.nextInt();

            if (clave != CLAVE) {
                System.out.println(" clave incorrecta, intente nuevamente ..");
                cantIntentos--;
            }

        }while ((clave != CLAVE) && (cantIntentos>0));

        //
        if (clave == CLAVE){
            System.out.println("-->ACCESO PERMITIDO<--");
        }else{
            System.out.println("-->LLAMANDO A LA POLICIA<--");
        }


    }
}
