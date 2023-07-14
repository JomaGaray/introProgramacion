public class Ejercicio {

/*ejercicio 4*/

    public static void main(String[] args) {


        final int max_cantidad = 10;
        int[] vectorr = new int[max_cantidad];

        //inicializo los valores
        for (int i= 0; i<max_cantidad; i++){

            Random ran = new Random();
            int x = ran.nextInt(10);

            vectorr[i] =  x;

            System.out.println("valor indice: " + i + ": "+ vectorr[i]);
        }

        int productoMenoresDiez= 1;
        int cantMenores = 0;
        int sumaImpares = 0;
        int canImpares = 0;
        int promedioImpares = 0;

        //forma ineficiente
        for (int i= 0; i<max_cantidad; i++){ //recorro

            //el producto de los menores a 10
            if (vectorr[i]<10){
                productoMenoresDiez = productoMenoresDiez * vectorr[i];
                cantMenores++;
            }

            if ( (vectorr[i] % 2) != 0){ //para saber si es IMPAR

                sumaImpares= sumaImpares + vectorr[i];
                canImpares++;
            }

        }
        System.out.println("cant elementos menores a 10: "+ cantMenores);

        System.out.println("producto de los elementos menores a 10: "+productoMenoresDiez);
        System.out.println("cantidad impares: "+canImpares);
        System.out.println("promedio de los impares: "+ (sumaImpares/canImpares));

}

}
