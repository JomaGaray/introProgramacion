package modulo7.ordenamiento;

public class OrdenamientoSeleccion {

    //
    public static void ordenar(int[] vector) {

        //
        final int N = vector.length;

        //
        for (int i = 0; i < N - 1; i++) {

            //
            int pos = i;

            //
            for (int j = i + 1; j < N; j++) {
                if (vector[j] < vector[pos]) {
                    pos = j;
                }
            }

            //
            int menor = vector[pos];
            vector[pos] = vector[i];
            vector[i] = menor;
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
