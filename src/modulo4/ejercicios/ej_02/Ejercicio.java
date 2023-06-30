package modulo4.ejercicios.ej_02;

import java.util.Scanner;

/**
 * Escribir un programa que pida una hora por teclado, en formato 24, y mostrar
 * "buenos días", "buenas tardes" o "buenas noches" según los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente.
 */
public class Ejercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una hora en formato de 24 hs: ");
        int hora = Integer.parseInt(sc.nextLine()); //meto en la misma linea

        if (hora >= 6 && hora<=12 ){ //uso un and para verificar las dos condiciones
            System.out.println("buenos dias!");
        } else if (hora >= 13 && hora<=20) {
            System.out.println("buenas tardes !!");
        }else if (hora >= 21 && hora<=5){
            System.out.println("buenas noches");
        }
    }
}
