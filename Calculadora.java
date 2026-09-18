import java.util.Scanner;

public class Main {

    public static int readInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }//Esta funcion es para simplificar el scanner

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. Salir");
        //Menú de opciones inicial


        int opcion;
        while(true){
            opcion = readInt("Elija una opción: ");
            int resultado = 0;    //Creadas las variables que se van a usar

            if (opcion == 1) {//SUMAR
                int numero1 = readInt("Numero 1: ");
                int numero2 = readInt("Numero 2: ");
                resultado = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);

            } else if (opcion == 2) {   //RESTAR
                int numero1 = readInt("Numero 1: ");
                int numero2 = readInt("Numero 2: ");
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado);

            } else if (opcion == 3) {   //MULTIPLICAR
                int numero1 = readInt("Numero 1: ");
                int numero2 = readInt("Numero 2: ");
                for (int i = 0; i < numero2; i++) {  //Bucle for para la multiplicacion
                    resultado += numero1;
                } System.out.println(numero1 + " * " + numero2 + " = " + resultado);

            } else if (opcion == 4) {   //Dividir
                int numero1 = readInt("Numero 1: ");
                int numero2 = readInt("Numero 2: ");
                    resultado = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + resultado);

            } else if (opcion == 5){    //Salir
                break;

            } else {
                System.out.println("Numero fuera de la eleccion");
            }   //Esta linea es para si e introduce un numero fuera de las opciones, se repita el bucle
        }
    }
}
