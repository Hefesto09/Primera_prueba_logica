public class App {
    public static void main(String[] args) throws Exception {

/* realizar un programa de intercambio entre dos variables.
ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20,
realizar las acciones necesarias para que numero pase a valer 20 y numero2 pase a valer 35.
una vez realizado el cambio mostrar.
*/ 
        int numero = 35;
        int numero2 = 20;
        int x = numero - 15;
        int y = numero2 + 15;

        System.out.println("-----antes----");
        System.out.println("numero = " + numero);
        System.out.println("numero2 = " + numero2);

        System.out.println("-----despues----");
        System.out.println("numero = " + x);
        System.out.println("numero2 =" + y);

// por si cambia de numero y no aplica lo de sumar y restar
        int n1 = 35;
        int n2 = 20;
        int n3;

        System.out.println("-----antes----");
        System.out.println("numero = " + n1);
        System.out.println("numero2 = " + n2);

        n3 = n2;
        n2 = n1;

        System.out.println("-----despues----");
        System.out.println("numero = " + n3);
        System.out.println("numero2 =" + n2);


    }
}
