package ejercicio11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    
    public static void main(String[] args) {
 
        //Prueba metodo 1
        extraerFechas();
 
        //Prueba metodo 2
        extraerCorreos();
 
        //Prueba metodo 3
        System.out.println("\n****Censura de datos sensibles****");
 
        String ejemplo = "Llama a 5555-1234 o escribe a juan@usac.edu.gt para mas info.";
        System.out.println("Entrada: " + ejemplo);
        System.out.println("Salida:  " + censurarDatos(ejemplo));
 
        System.out.println("\n****Texto completo censurado*****");
        System.out.println(censurarDatos(TEXTO));
    }
    
    //texto constante
    static final String TEXTO =
        "UNIVERSIDAD DE SAN CARLOS DE GUATEMALA\n" +
        "Facultad de Ingenieria - Boletin Informativo\n" +
        "2024-04-25\n" +
        "Actividades programadas:\n" +
        "- Conferencia el 2024-05-01 a las 10:30 en el Edificio T3\n" +
        "- Examen parcial el 2024-05-15 a las 08:00 en el Edificio S11\n" +
        "- Defensa de proyecto el 2024-06-10 a las 14:30 en el Edificio T7\n" +
        "Contactos del departamento:\n" +
        "- Coordinador: coord.ipc1@ingenieria.usac.edu.gt  Tel: 2418-8000\n" +
        "- Auxiliar 1:  aux01_ipc1@ingenieria.usac.edu.gt  Tel: 5555-1234\n" +
        "- Auxiliar 2:  aux02.ipc1@gmail.com  Tel: 4321-9876\n";
 
    //Metodo 1
    public static void extraerFechas() {
        //Fechas con formato YYYY-MM-DD
        Pattern patron = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher buscador = patron.matcher(TEXTO);
 
        System.out.println("****Fechas encontradas****");
        while (buscador.find()) {
            String anio = buscador.group(1);
            String mes  = buscador.group(2);
            String dia  = buscador.group(3);
            System.out.println("Anio: " + anio + " | Mes: " + mes + " | Dia: " + dia);
        }
    }
 
    //Metodo 2
    public static void extraerCorreos() {
        //Encontrar correos presentes
        Pattern patron = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}");
        Matcher buscador = patron.matcher(TEXTO);
 
        System.out.println("\n****Correos encontrados****");
        while (buscador.find()) {
            System.out.println(buscador.group());
        }
    }
 
    //Metodo3
    public static String censurarDatos(String entrada) {
        //1.Cambiar correos
        String patronCorreo = "[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}";
        String resultado = entrada.replaceAll(patronCorreo, "[CORREO]");
 
        //2. Cambiar telefonos
        String patronTelefono = "\\d{4}-\\d{4}";
        resultado = resultado.replaceAll(patronTelefono, "[TEL]");
 
        return resultado;
    }
}
