package modulo5;

import modulo8.*;

import java.util.Scanner;


public class Matriz_ej1 {

    public static void main(String[] args) {

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

}
