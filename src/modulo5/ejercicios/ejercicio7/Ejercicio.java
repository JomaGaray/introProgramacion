public class Ejercicio {



    public static void main(String[] args) {

        /*ejercicio 7 */
       
       final int diasJunio = 31;
        int[] vector1 = new int[diasJunio];

        //inicializo los valores
        for (int i= 0; i<diasJunio; i++){

            Random ran = new Random();

            //inicializo los valores de las temperaturas
            vector1[i] =  ran.nextInt(25);

            System.out.println("Temperatura el dia : " + (i+1) + ": "+ vector1[i]);
        }

        int valorMasBajo = vector1[0];
        int diaMasFrio = 1;
        int valorMasAlto = vector1[0];
        int diaMasCaluroso = 1;

        //recorro de nuevo para verificar todos los dias
        for (int i= 0; i<diasJunio; i++){

            if (vector1[i] < valorMasBajo){

                valorMasBajo = vector1[i];
                diaMasFrio = i+1;

            }

            if (vector1[i]> valorMasAlto){
                valorMasAlto = vector1[i];
                diaMasCaluroso = i+1;
            }
        }

        System.out.println("el dia mas frio fue: "+diaMasFrio + " con una temp  de: "+valorMasBajo);
        System.out.println("el dia mas caluroso fue: "+diaMasCaluroso + " con una temp  de: "+valorMasAlto);


}

}
