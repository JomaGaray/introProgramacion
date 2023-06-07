package modulo3;

public class Variable_ej3 {

    public static void main(String[] args) {

        String nombre = "Alfonzo Zarate";

        int posEspacio = nombre.indexOf(" ");

        String iniciales = String.valueOf(nombre.charAt(0)) +
                  nombre.charAt(posEspacio+1);

        System.out.printf("%s --> %s", nombre, iniciales);
    }
}
