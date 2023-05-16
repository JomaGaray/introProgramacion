package modulo4;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {


        //
        System.out.print("Ingrese su edad: ");

        //
        Scanner scanner = new Scanner(System.in);

        //
        String edadStr = scanner.nextLine();

        //
        int edad = Integer.valueOf(edadStr);

        //
        if (edad < 15) {
            //
            System.out.println("...clase A");

        } else if (edad >= 15 && edad <= 17) {
            //
            System.out.println("...clase B");

        } else if (edad >= 18 && edad <= 21) {
            //
            System.out.println("...clase C");

        } else {
            //
            System.out.println("...clase D");

        }

    }

}
