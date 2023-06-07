package modulo3;

public class Variable_ej2 {

    public static void main(String[] args) {

        int num1 = 144, num2 = 999;

        System.out.printf("Suma %s\n", num1+num2);
        System.out.printf("Resta %s\n", num1-num2);
        System.out.printf("División %s\n",  ((float) num1 / num2));
        System.out.printf("Multiplicación %s\n", num1*num2);

        int aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.printf("Intercambio %s - %s", num1, num2);
    }
}
