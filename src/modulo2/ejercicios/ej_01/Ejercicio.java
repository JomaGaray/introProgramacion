package modulo2.ejercicios.ej_01;

/**
 * Escribir un programa que muestre tu nombre por pantalla.
 */

public class Ejercicio {

    public static void main(String[] args) {

        //
        System.out.println("Daniel E, AGUIL MALLEA");
        
        /* ejercicio 1 */
            System.out.println("mi nombre es  Jose Garay ");
            //forma mas sofisticada ..
            Scanner sc= new Scanner(System.in);
            System.out.print("Escribi tu nombre: ");
            String miNombre= sc.nextLine();   
            System.out.print("mi nombre es: "+ miNombre);
        
        
        
    }
}
