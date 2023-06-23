package modulo3;

import java.util.Scanner;

public class Variable_ej2 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int num1 = lector.nextInt();
        int num2 = lector.nextInt();

        System.out.printf("Suma %s\n", num1+num2);
        System.out.printf("División %s\n",  ((float) num1 / num2));

        int aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.printf("Intercambio %s - %s", num1, num2);
    }
}
