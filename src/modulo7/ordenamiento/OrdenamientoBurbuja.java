package modulo7.ordenamiento;

public class OrdenamientoBurbuja {

    //
    public static void ordenar(int[] vector) {

        //
        final int N = vector.length;

        //
        for (int i = 0; i < N - 1; i++) {
            //
            for (int j = 0; j < N - i - 1; j++) {
                //
                if (vector[j] > vector[j + 1]) {
                    //
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
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
