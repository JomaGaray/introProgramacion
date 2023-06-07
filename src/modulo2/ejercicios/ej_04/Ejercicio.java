package modulo2.ejercicios.ej_04;

import java.util.Scanner;

public class Ejercicio{

  /* ejercicio 4 y 5 */
    public static void main(String[] args) {
              String negro = "\033[30m";
              String rojo = "\033[31m";
              String verde = "\033[32m";
              String amarillo = "\033[33m";
              String azul = "\033[34m";
              String magenta = "\033[35m";
              String celeste = "\033[36m";
              String blanco = "\033[37m";


              Scanner sc= new Scanner(System.in);
              System.out.print("Teoria:  ");
              String claseTeoria= "teoria: " + sc.nextLine();
              System.out.print("Practica:  ");
              String clasePractica = "practica: " + sc.nextLine();

              System.out.print(rojo + "Horarios clases: \n"+ claseTeoria.toUpperCase() + "\n" +clasePractica.toUpperCase() );

    }

}
