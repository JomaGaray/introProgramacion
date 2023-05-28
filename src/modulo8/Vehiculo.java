package modulo8;

public class Vehiculo {

    //
    private String patente;

    //
    private String marca;

    //
    private String modelo;

    //
    private String color;

    // Constructor
    public Vehiculo(){

    }

    // Constructor
    public Vehiculo(String patente, String marca, String modelo, String color) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //
    public void setColor(String color){
        this.color = color;
    }

    public Vehiculo setColor2(String color){
        //
        this.color = color;

        //
        return this;
    }

    //
    public String getColor(){
        return this.color;
    }

    //
    public void mostrarDatos(){
        System.out.println("Patente: "+patente+" - marca: "+
                marca+" - modelo: "+modelo+" - color: "+color);
    }
}
