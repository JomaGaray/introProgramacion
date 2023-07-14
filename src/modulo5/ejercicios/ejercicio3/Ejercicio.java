public class Ejercicio {

  /*ejercicio 3*/

    public static void main(String[] args) {
      
        final int max_cantidad = 10;

        int[] vector = new int[max_cantidad];
            //inicializo los valores
        for (int i= 0; i<max_cantidad; i++){

            Random ran = new Random();
            int x = ran.nextInt(10);

            vector[i] =  x;

            System.out.println("valor indice: " + i + ": "+ vector[i]);
        }

        // forma ineficientes, recorro OTRA VEZ

        int suma= 0;
        int multiplicacion = 1;

        for (int i= 0; i<max_cantidad; i++){

            suma = suma + vector[i];
            multiplicacion = multiplicacion * vector[i]; //esto puede dar 0

        }
        System.out.println("la suma es: "+ suma);

        System.out.println("la multiplicacion es " + multiplicacion);

    }
}


    
