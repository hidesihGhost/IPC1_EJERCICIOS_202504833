package ejercicio11;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
 
        //----------------prueba de metodo 1, carnet---------------------
        System.out.println("***Validacion de Carnet***");
        String[] carnets = {"202300123", "202512345", "20230012", "2023ABC12"};
        
        for (String carnet : carnets) {
            if (validarCarnet(carnet)) {
                System.out.println(carnet + " -> Valido");
            } else {
                System.out.println(carnet + " -> Invalido");
            }
        }
 
        //----------------prueba de metodo 2, correo--------------------
        System.out.println("\n***Validacion de Coreo***");
        String[]correosPrueba = {"juan.perez@usac.edu.gt", "carla_001@usac.edu.gt", "juan@gmail.com",".juan@usac.edu.gt"};

        for (String correo : correosPrueba) {
            if (validarCorreo(correo)) {
                System.out.println(correo + "-> Valido");
            } else {
                System.out.println(correo + "-> Invalido");
            }
        }
 
        //----------------prueba de metodo 3, telefono------------------
        System.out.println("\n*****Validacion de Telefono****");
        String[] telefonosPrueba = {"5555-1234", "30001234", "1234-5678", "555-1234"};

        for (String telefono : telefonosPrueba) {
            if (validarTelefono(telefono)) {
                System.out.println(telefono + "-> Valido");
            } else {
                System.out.println(telefono + "-> Invalido");
            }
        }
    }
    
    //Metodo 1
    public static boolean validarCarnet(String carnet) {
        String patron = "\\d{9}"; //9 Digitos exactos
        return Pattern.matches(patron, carnet);
    }
 
    //Método 2
    public static boolean validarCorreo(String correo) {
        //debe de terminar en @usac.edu.gt y no puede empezar con un guion bajo ni punto
        String patron = "[a-zA-Z0-9][a-zA-Z0-9._]*@usac\\.edu\\.gt"; 
        return Pattern.matches(patron, correo);
    }
 
    // Método 3
    public static boolean validarTelefono(String telefono) {
        //Debe de tener 8 digitos, con o sin guion en el centro, empezar con 3, 4, 5 o 6
        String patron = "[3456]\\d{3}-?\\d{4}";
        return Pattern.matches(patron, telefono);
    }

}
