package modulo6;

public class Funcion {

    //
    public static float promedio(int[] vector){

        //
        float suma = 0;

        //
        for (int i=0; i< vector.length; i++){
            suma = suma + vector[i];
        }

        //
        return  suma / vector.length;
    }

    public static void main(String[] args) {

        //
        int[] elementos = {1,5,3,7,8};

        //
        float prom = promedio(elementos);

        //
        System.out.println("El promedio de los valores es: "+ prom);
    }
}
