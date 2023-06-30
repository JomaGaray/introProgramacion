package modulo4.ejercicios.ej_14;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        System.out.println("ingresar un nro de 4 digitos: ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        int digito = 0;
        int resultado =0;

        for (int i = 0; i<4; i++){

            digito = nro % 10; //obtengo el ultimo digito
            resultado = resultado + digito; // voy sumando

            nro = nro / 10; // corto el nro
            System.out.println("valor nro: " +nro);
        }

        System.out.println("resultado de la suma de digitos: "+ resultado);

    }
}
