public class Ejercicio {



    public static void main(String[] args) {


        /*ejercicio 6*/


        final int diasEnero = 31;
        int[] vector1 = new int[diasEnero];
        int totalHectareas = 0;
        //inicializo los valores
        for (int i= 0; i<diasEnero; i++){

            Random ran = new Random();
            vector1[i] =  ran.nextInt(100);

            System.out.println("valor dia: " + i + ": "+ vector1[i]);

            totalHectareas= totalHectareas + vector1[i];
        }

        int promedio = totalHectareas / diasEnero;

        System.out.println("el promedio de siembra es de "+promedio+ " hectareas");
        for (int i= 0; i<diasEnero; i++){

            if (vector1[i]<promedio){

                System.out.println("el dia "+ i + " se sembro menos: "+vector1[i]);

            }


        }

}

}
