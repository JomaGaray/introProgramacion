package modulo4.ejercicios.ej_15;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        System.out.println("ingresar un nro : ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        int digito = 0;
        int resultado =0;

        while (nro != 0){

            digito = nro % 10; //obtengo el ultimo digito
            resultado = resultado + digito; // voy sumando

            nro = nro / 10; // corto el nro
            System.out.println("valor nro: " +nro);
        }

        System.out.println("resultado de la suma de digitos: "+ resultado);
    }
}
