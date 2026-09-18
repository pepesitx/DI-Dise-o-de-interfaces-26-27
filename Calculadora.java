import java.util.Scanner;

public class Main {

    public static int readInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. Salir");



        int opcion;
        while(true){
            opcion = readInt("Elija una opción: ");
            int resultado = 0;

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
                for (int i = 0; i < numero2; i++) {
                    resultado += numero1;
                } System.out.println(numero1 + " * " + numero2 + " = " + resultado);

            } else if (opcion == 4) {
                int numero1 = readInt("Numero 1: ");
                int numero2 = readInt("Numero 2: ");
                    resultado = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + resultado);

            } else if (opcion == 5){
                break;

            } else {
                System.out.println("Numero fuera de la eleccion");
            }
        }
    }
}
