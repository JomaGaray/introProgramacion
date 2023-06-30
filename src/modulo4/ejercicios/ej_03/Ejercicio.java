package modulo4.ejercicios.ej_03;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);

        //
        System.out.println("ingrese nro de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        //
        System.out.println("ingrese el valor de la hora: ");
        int valorHora = sc.nextInt();

        //
        if (horasTrabajadas <= 40){
            System.out.println("el sueldo es: "+ (horasTrabajadas*valorHora));

        }else if (horasTrabajadas > 40){

            int horasExtra = horasTrabajadas-40;
            int valorHoraDoble = valorHora*2;
            System.out.println("el sueldo es: "+ ( (40*valorHora) + (horasExtra*valorHoraDoble)));
        }
    }
}
