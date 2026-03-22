package poo_usac;

import java.util.Scanner;

public class POO_USAC {
    
    //----------------------------------variables globales-------------------------------------
    private static Curso[] misCursos = new Curso[10];//!0 cursos
    private static int totalCursos = 0;
    private static Scanner sc = new Scanner(System.in);
    
    //----------------------------------Metodo principal----------------------------------------
    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n:::::::::::::::::Bienvenido al programa de Gestion de CURSOS y TAREAS:::::::::::::::::");
            System.out.println("1. Crear curso");
            System.out.println("2. Agregar tarea");
            System.out.println("3. Mostrar todo");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion){
                case 1:
                    crearNuevoCurso();
                    break;
                case 2:
                    registrarTarea();
                    break;
                case 3:
                    mostrarReporte();
            }
        }
    }
    
    //-----------------------------Crear Curso-------------------------------------
    private static void crearNuevoCurso() {
        if (totalCursos >= misCursos.length) {
            System.out.println("Ha alcanzado el limite de cursos");
            return;
        }
        
        //crear curso si no se ha llenado
        System.out.print("Nombre del curso: ");
        String nombreCurso = sc.nextLine();
        System.out.print("Codigo: ");
        String codigoCurso = sc.nextLine();
        System.out.print("Catedratico: ");
        String catedraticoCurso = sc.nextLine();

        misCursos[totalCursos++] = new Curso(nombreCurso, codigoCurso, catedraticoCurso);
        System.out.println("Se guardo el curso");
    }

    //---------------------------Registrar tarea------------------------------------
    private static void registrarTarea() {
        if(totalCursos == 0) {
            System.out.println("Error: No hay nigun curso");
            return;
        }
        
        for (int i=0; i<totalCursos; i++) {
            System.out.println((i+1) + ". " + misCursos[i].getNombre());
        }
        
        System.out.print("Seleccione el numero de curso: ");
        int seleccionUSU = sc.nextInt();
        sc.nextLine();//Limpiar el bufer

        if (seleccionUSU >= 1 && seleccionUSU <= totalCursos) {
            System.out.print("Titulo de la tarea: ");
            String tituloTarea = sc.nextLine();
            System.out.print("Descripcion: ");
            String descripcionTarea = sc.nextLine();
            System.out.print("Fecha entrega: ");
            String fechaEntrega = sc.nextLine();
            
            //Se le resta uno debido aque se le sumó uno antes, esto por razones de visualizacion
            misCursos[seleccionUSU-1].agregarTarea(new Tarea(tituloTarea, descripcionTarea, fechaEntrega));
        }
    }

    //--------------------Mostrar REporte-------------------------------
    private static void mostrarReporte(){
        for (int i=0; i<totalCursos; i++){
            System.out.println(misCursos[i].obtenerInformacion());
        }
    }
    
    //-----------------------------------Herencia y polimorfismo-------------------------------
    public static class Base{
        private String nombre;

        public Base(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return nombre;
        }

        //Polimorfismo
        public String obtenerInformacion(){
            return "Nombre: " + nombre;
        }
    }
    
    //-------------------------------Herencia de Base-----------------------------
    public static class Tarea extends Base{
        private String descripcion;
        private String fechaEntrega;

        public Tarea(String titulo, String descripcion, String fechaEntrega) {
            super(titulo); //Llama al constructor
            this.descripcion = descripcion;
            this.fechaEntrega = fechaEntrega;
        }

        @Override
        public String obtenerInformacion() {
            return "[Tarea] Titulo: " +getNombre()+"| Entrega: "+fechaEntrega+" | Descripcion: "+descripcion;
        }
    }
    
    //-------------------------Encapsulamiento y Composicion(Herencia)------------------------
    public static class Curso extends Base{
    private String codigo;
    private String catedratico;
    private Tarea[] tareas;
    private int contadorTareas;

    public Curso(String nombre, String codigo, String catedratico) {
        super(nombre);
        this.codigo = codigo;
        this.catedratico = catedratico;
        this.tareas = new Tarea[15];//15 tareas
        this.contadorTareas = 0;//inicia en 0
    }

    public void agregarTarea(Tarea nuevo) {
        if (contadorTareas < tareas.length) {
            tareas[contadorTareas++] = nuevo;
        } else {
            System.out.println("No se permiten más tareas, FELICIDADES");
        }
    }
    
    @Override
    public String obtenerInformacion() {
        String info = "\nCurso: "+getNombre()+"| Codigo: "+codigo +" | Tutor: "+catedratico;
        info += "\nTareas asignadas:";
        if(contadorTareas == 0){
            info+= "\nNo hay tareas registradas.";
        }
        for (int i = 0; i < contadorTareas; i++) {
            info += "\n" + tareas[i].obtenerInformacion(); //Polimorfismo
        }
        return info; 
    }
    }   
}
    

