package modulo8;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        //
        List<String> lista = new ArrayList();

        //Agregamos objetos de tipo String
        lista.add("Hola");
        lista.add("Mundo");


        //obtenemos el segundo elemento
        String texto = lista.get(1);

        //obtenemos y removemos el segundo elemento
        String elemento = lista.remove(1);

        //obtenemos la cantidad de elementos
        int tamaño = lista.size();

        //obtenemos la posición del elemento "Mundo"
        int posicion = lista.indexOf("Mundo");

        //limpiamos los elementos de la lista
        lista.clear();

        //averiguamos si la lista está vacia
        boolean vacia = lista.isEmpty();

        //averiguamos si la lista contiene el elemento "Mundo"
        boolean contiene = lista.contains("Mundo");

        //
        List<String> colores = new ArrayList<String>();

        //
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");

        //
        System.out.println("Contenido de la lista: ");

        //
        for(String color: colores) {
            System.out.println(color);
        }
    }
}
