public class Ejercicio {

    public static void main(String[] args) {

 //ejercicio 2

        int[] vector = new int[11];

        for (int j=1; j <= 10; j++){

            vector[j]=j;

            System.out.println("valor de vector["+j+"]: "+ j);
        }


        System.out.println("--> Sumatoria <--");

        //voy recorriendo j
        for (int j=1; j <= 10; j++){

            int suma = 0;

            int i = 1;

            // voy recorriendo los valores dentro del vector y los sumo
            while(i<=j){
                suma = suma + i;
                i++;
            }

            vector[j] = suma;

            System.out.println("suma en  vector["+j+"]: "+ vector[j]);
        }

}

}
