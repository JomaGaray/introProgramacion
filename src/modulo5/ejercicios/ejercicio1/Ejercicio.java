import java.util.Random;

public class Ejercicio {


    public static void main(String[] args) {

        final int max_cantidad = 10;

        //ejercicio 1

        int[] arreglo = new int[max_cantidad];

        for (int i= 0; i<max_cantidad; i++){

            if (i % 2 == 0){ //para saber si es par

                Random ran = new Random();
                int x = ran.nextInt(100);

                arreglo[i] =  x;
            }

            System.out.println("valor indice: " + i + ": "+ arreglo[i]);
        }
   }   
}
