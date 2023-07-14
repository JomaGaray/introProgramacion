public class Ejercicio {



    public static void main(String[] args) {


               /*ejercicio 5*/

        int[] vector1 = new int[max_cantidad];
        int[] vector2 = new int[max_cantidad];

        //inicializo los valores
        for (int i= 0; i<max_cantidad; i++){

            Random ran = new Random();


            vector1[i] =  ran.nextInt(10);
            vector2[i]= ran.nextInt(10);

            System.out.println("valor indice: " + i + ": "+ vector1[i]);
            System.out.println("valor indice: " + i + ": "+ vector2[i]);
        }

        System.out.println("-->Sumatoria de los valores");
        for (int i= 0; i<max_cantidad; i++){

            System.out.println("la suma del indice : "+ i+ " es: "+ (vector1[i]+ vector2[i]) );
        }

        System.out.println("-->Diferencia de los valores");
        for (int i= 0; i<max_cantidad; i++){

            System.out.println("la resta del indice : "+ i+ " es: "+ (vector1[i] - vector2[i]) );
        }

        System.out.println("-->Producto Escalar");
        int productoEscalar = 0;

        for (int i= 0; i<max_cantidad; i++){

            productoEscalar = productoEscalar + ( vector1[i]*vector2[i] );

        }
        System.out.println("el producto escalar es: "+ productoEscalar);

}

}
