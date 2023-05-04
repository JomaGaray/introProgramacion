package modulo7.recursion;

public class factorial {

    //
    public static int factorialR(int n) {

        //
        if (n == 0) {
            //
            return 1;

        } else {

            //
            return n * factorialR(n-1);
        }
    }

    //
    public static int factorial(int n) {
        //
        int resultado = 1;

        //
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        //
        return resultado;
    }
}
