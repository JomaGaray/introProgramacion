package modulo3;


import java.util.Scanner;

public class FuncionesTexto {

    public static void main(String[] args){

        //
        Scanner lector = new Scanner(System.in);

        //
        System.out.print("ingrese un valor x: ");

        int x = lector.nextInt();

        System.out.print("ingrese un valor y: ");
        int y = lector.nextInt();

        System.out.println(x+y);
    }

}
