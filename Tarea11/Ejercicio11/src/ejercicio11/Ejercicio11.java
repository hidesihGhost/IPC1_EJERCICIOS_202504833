package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int respuesta;
        do {
            System.out.println("\nElija que Ejercicio quiere usar:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            respuesta = sc.nextInt();
            
            switch(respuesta) {
                case 1:
                    Ejercicio1.main(new String[0]);
                    break;
                    
                case 2:
                    Ejercicio2.main(new String[0]);
                    break;
                    
                case 3:
                    System.out.println("Adios");
                    break;
                    
                default:
                    System.out.println("intenta de nuevo");
            }            
        } while(respuesta != 3);
        sc.close();
    }
}