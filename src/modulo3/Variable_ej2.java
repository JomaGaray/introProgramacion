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
        
        //-----------------------------------------------------------------------------
        
        /* ejercicio 2
        final char char1= 'H';
        final char char2= 'o';
        final char char3= 'l';
        final char char4= 'a';
        final char char5= '!';

       // String holaMundo = char1+char2+char3+char4+char5; //--> no se puede, son de tipos diferentes

        //preguntarle a los alumnos como lo resolverian

       // String holaMundo = String.valueOf(char1+char2+char3+char4+char5); //tengo que convertirlo usando una funcion de String

        String holaMundo = String.valueOf(char1)+ String.valueOf(char2)+ String.valueOf(char3)+ String.valueOf(char4) +String.valueOf(char5);


        System.out.println(holaMundo);
        */
        
        
        
        
    }
}
