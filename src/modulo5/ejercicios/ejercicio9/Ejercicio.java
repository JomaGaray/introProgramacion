public class Ejercicio {



    public static void main(String[] args) {

        /*ejercicio 9*/

        final int max_cantidad = 20;
        int[] vector1 = new int[max_cantidad];
        int valorMasAlto = 0;

        //inicializo los valores
        for (int i= 0; i<max_cantidad; i++){

            Random ran = new Random();

            vector1[i] =  ran.nextInt(25);

            System.out.println("valor en el indice : " + i + ": "+ vector1[i]);

            if (vector1[i] > valorMasAlto){ // pregunto si este valor es mas chico que donde estoy

                valorMasAlto = vector1[i];

            }
        }

        //recorro de nuevo para verificar todos los dias, ineficiente
        for (int i= 0; i<max_cantidad; i++){

            if (vector1[i] == valorMasAlto){ 

                System.out.println("Valor alto en: "+i);
            }

        }


}

}
