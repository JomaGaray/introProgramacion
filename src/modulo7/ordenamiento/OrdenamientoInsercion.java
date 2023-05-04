package modulo7.ordenamiento;

public class OrdenamientoInsercion {

    //
    public static void ordenar(int[] vector) {

        //
        final int N = vector.length;

        //
        for (int i = 1; i < N; ++i) {
            //
            int elemento = vector[i];
            //
            int j = i - 1;

            //
            while (j >= 0 && vector[j] > elemento) {
                vector[j + 1] = vector[j];
                j = j - 1;
            }
            //
            vector[j + 1] = elemento;
        }
    }

    //
    public static void main(String[] args) {
        //
        int[] vector = { 12, -5, -8, 2, 1, 7, 0 };

        //
        ordenar(vector);

        //
        for (int i:vector) {

            //
            System.out.println(i);
        }
    }
}
