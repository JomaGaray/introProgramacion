package modulo5;

import java.util.Random;
import java.util.Scanner;


public class Matriz_ej2 {

    public static void main2(String[] args) {

        //
        final int N = 3;

        //
        int[][] numeros = new int[N][N];

        //
        Scanner scanner = new Scanner(System.in);

        //
        for (int fila = 0; fila < N; fila++) {
            //
            for (int columna = 0; columna < N; columna++) {
                //
                System.out.printf("ingrese el valor para la posición [%s,%s]: ",fila,columna);
                numeros[fila][columna] = scanner.nextInt();
            }
        }

    }

    public static void main(String[] args) {

        //
        final int N = 3;

        //
        int[][] numeros = new int[N][N];

        //
        for (int fila = 0; fila < N; fila++) {
            //
            for (int columna = 0; columna < N; columna++) {
                //
                System.out.printf("ingrese el valor para la posición [%s,%s]: ",fila,columna);
                numeros[fila][columna] = (new Random()).nextInt(1,11); //del 1 al 10
            }
        }

        //
        for (int fila = 0; fila < N; fila++) {

            //
            for (int columna = 0; columna < N; columna++) {

                //
                System.out.println(
                        String.format("fila: %s - columna: %s - valor: %s",
                                fila,
                                columna,
                                numeros[fila][columna])
                );
            }
        }
    }

}
