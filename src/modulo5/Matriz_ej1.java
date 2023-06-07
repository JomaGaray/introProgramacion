package modulo5;


public class Matriz_ej1 {

    public static void main(String[] args) {

        //
        final int MAX_FIL = 3;
        final int MAX_COL = 4;

        //
        int[][] numeros = new int[MAX_FIL][MAX_COL];

        //
        for (int fila = 0; fila < MAX_FIL; fila++) {
            //
            for (int columna = 0; columna < MAX_COL; columna++) {
                //
                System.out.print(numeros[fila][columna]+" ");
            }
            System.out.println();
        }
    }

}
