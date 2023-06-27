import java.util.Scanner;

public class EjerciciosTP4Resueltos {

    public static void main(String[] args) {

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

/*ejercicio 1 */


        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nro de la semana: ");
        int dia = Integer.parseInt(sc.nextLine()); //meto en la misma linea

        if ( dia == 1){
            System.out.println(" el dia es Lunes");
        } else if (dia == 2) {
            System.out.println("el dia es martes");
        } else if (dia == 3) {
            System.out.println("el dia es miercoles ");
        } else if (dia == 4) {
            System.out.println("el dia es jueves");
        }else if (dia == 5) {
            System.out.println( "el dia es viernes");
        } else if (dia == 6) {
            System.out.println(" el dia es sabado");
        } else if (dia == 7) {
            System.out.println("el dia es domingo");
        } else {
            System.out.println(" ingrese un valor valido");
        }


//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

/*ejercicio 2 */

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una hora en formato de 24 hs: ");
        int hora = Integer.parseInt(sc.nextLine()); //meto en la misma linea

        if (hora >= 6 && hora<=12 ){ //uso un and para verificar las dos condiciones
            System.out.println("buenos dias!");
        } else if (hora >= 13 && hora<=20) {
            System.out.println("buenas tardes !!");
        }else if (hora >= 21 && hora<=5){
            System.out.println("buenas noches");
        }



//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

/*ejercicio 3*/

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nro de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        System.out.println("ingrese el valor de la hora: ");
        int valorHora = sc.nextInt();

        if (horasTrabajadas <= 40){
            System.out.println("el sueldo es: "+ (horasTrabajadas*valorHora));
        }else if (horasTrabajadas > 40){

            int horasExtra = horasTrabajadas-40;

            int valorHoraDoble = valorHora*2;
            System.out.println("el sueldo es: "+ ( (horasTrabajadas*valorHora) + (horasExtra*valorHoraDoble)));
        }


//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /*ejercicio 4*/

        for (int i= 0; i<=100; i++ ){ //itero 101 veces

            if ( i % 5 == 0){ // utilizo el modulo, el resto de la division
                System.out.println("multiplo de 5: "+ i);
            }
        }


//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /* ejercicio 5 */
        int i = 0;
        while (i<=100){ //evalua al principio de cada repeticion

            if ( i % 5 == 0){ // utilizo el modulo, el resto de la division
                System.out.println("multiplo de 5: "+ i);
            }

            i++; //tengo que sumarle 1 para que avance
        }


//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

/*ejercicio 6 */

        int i = 0;
        do {

            // la primera vez NO EVALUA, entra derecho
            // evalua al final

            if ( i % 5 == 0){ // utilizo el modulo, el resto de la division
                System.out.println("multiplo de 5: "+ i);
            }

            i++; //tengo que sumarle 1 para que avance

        }while (i<=100);

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /*ejercicio 7*/
        for (int i=400; i>=200 ; i= i-20){

            System.out.println("numero: " + i);

          //  i = i-20;
        }

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /*ejercicio 8*/

        Scanner sc = new Scanner(System.in);
        System.out.println("--> calculadora de factorial <--");
        System.out.println("ingrese nro : ");
        int nro = sc.nextInt();
        int resultado = 1;
        //int i = nro;

        for(int i = nro; i>=1; i = i-1){

            System.out.println("valor i: "+ i);
            resultado = resultado*i;

        }

        System.out.println("valor final: " + resultado);

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /*ejercicio 9*/

        final int claveReal= 1234;
        System.out.println("-->Control de caja fuerte<--");
        Scanner sc = new Scanner(System.in);
        int clave = 0;

        do {
            System.out.println("ingrese clave : ");
            clave = sc.nextInt();

            if (clave != claveReal){
                System.out.println("intente nuevamente");
            }

        }while (clave != claveReal);

        System.out.println("-->ACCESO PERMITIDO<--");

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /*ejercicio 10*/

        final int claveReal= 1234;
        System.out.println("-->Control de caja fuerte<--");
        Scanner sc = new Scanner(System.in);
        int clave = 0;
        int cantIntentos = 4;

        do {
            System.out.println("ingrese clave : ");
            clave = sc.nextInt();

            if (clave != claveReal){
                System.out.println(" lo siento ..");
                cantIntentos --;
            }

            if (cantIntentos == 0) {

                System.out.println("LLAMANDO A LA POLICIA ..");
            }

        }while ((clave != claveReal) && (cantIntentos>0));//segunda condicion para el corte de intentos

        if (clave == claveReal){ //pregunto si salio por esta condicion
            System.out.println("-->ACCESO PERMITIDO<--");

        }
//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /*ejercicio 11*/
        System.out.println("ingresar un nro: ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        for (int i =1 ; i<=10; i++){
            System.out.println(nro +"x" + i +"= "+ (nro*i));
        }


//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /* ejercicio 12 */
        System.out.println("ingresar un nro de 4 digitos: ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        for(int i = 1; i<=4; i++){

            System.out.println("nro actualizado: "+nro);
            System.out.println("digito "+i+":"+ (nro % 10));

            nro =   nro / 10;; //le saco el ultimo digito
        }

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

    /*ejercicio 13*/
        System.out.println("ingresar un nro : ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        int cantDigitos = 0;

        while (nro != 0){

            cantDigitos++; //sumo 1
            nro = nro / 10; //
            System.out.println("valor nro: " +nro);
        }
        System.out.println("cantidad de digitos: "+ cantDigitos);

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------

        /*ejercicio 14*/

        System.out.println("ingresar un nro de 4 digitos: ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        int digito = 0;
        int resultado =0;

        for (int i = 0; i<4; i++){

            digito = nro % 10; //obtengo el ultimo digito
            resultado = resultado + digito; // voy sumando

            nro = nro / 10; // corto el nro
            System.out.println("valor nro: " +nro);
        }

        System.out.println("resultado de la suma de digitos: "+ resultado);

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------



        /*ejercicio 15*/

        System.out.println("ingresar un nro : ");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();

        int digito = 0;
        int resultado =0;

        while (nro != 0){

            digito = nro % 10; //obtengo el ultimo digito
            resultado = resultado + digito; // voy sumando

            nro = nro / 10; // corto el nro
            System.out.println("valor nro: " +nro);
        }

        System.out.println("resultado de la suma de digitos: "+ resultado);
    }
}
