package modulo9;

public class Gato extends Animal{

    //
    private int vidas;

    //
    public Gato(String nombre, int edad, int vidas) {
        //
        super(nombre,edad);
        //
        this.vidas = this.vidas;
    }

    //
    public int getVidas() {
        return vidas;
    }

    //
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    //
    public void maullar(){
        System.out.println("miauuuuuuu");
    }
}
