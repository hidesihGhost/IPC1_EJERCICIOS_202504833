package tarea9;
public class Tarea9 {

   
    public static void main(String[] args) {
       System.out.println("*************************************");
        System.out.println("Lista simplemente Enlazada");
        System.out.println("*************************************\n");
        
        ListaEstudiantes listaSimple = new ListaEstudiantes();
        
        //Probar agregarInicio y agregarFinal
        listaSimple.agregarInicio("202300001", "Ana", 85.0);
        listaSimple.agregarInicio("202300002", "Luis", 90.0);
        listaSimple.agregarFinal("202300003", "Maria", 78.0);
        
        System.out.println("Lista despues de inserciones:");
        listaSimple.imprimirLista();
        
        //Probar busqueda
        System.out.println("\nBuscando 202300001:");
        NodoEstudiante encontrado = listaSimple.buscarPorCarnet("202300001");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre() + " - Nota: " + encontrado.getNota());
        }
        
        //Probar promedio
        System.out.println("\nPromedio de notas: " + listaSimple.obtenerPromedio());
        
        //Probar mejor nota
        NodoEstudiante mejor = listaSimple.obtenerMejorNota();
        System.out.println("Mejor estudiante: " + mejor.getNombre() + " - Nota: " + mejor.getNota());
        
        //Probar eliminación
        System.out.println("\nEliminando 202300001");
        listaSimple.eliminarPorCarnet("202300001");
        listaSimple.imprimirLista();
        
        
        //----------------------------------------------------------------------------------------------------------
        System.out.println("\n*************************");
        System.out.println("Lista doblemente enlazada");
        System.out.println("*****************************\n");
        
        ListaDobleEstudiantes listaDoble = new ListaDobleEstudiantes();
        
        //Probar agregarInicio y agregarFinal
        System.out.println("Agregando al inicio y final:");
        listaDoble.agregarInicio("202300001", "Ana", 85.0);
        listaDoble.agregarInicio("202300002", "Luis", 90.0);
        listaDoble.agregarFinal("202300003", "Maria", 78.0);
        
        //Imprimir adelante
        System.out.println("\nImprimir adelante:");
        listaDoble.imprimirAdelante();
        
        //Imprimir atras
        System.out.println("\nImprimir atras:");
        listaDoble.imprimirAtras();
        
        //Probar eliminación
        System.out.println("\nEliminando 202300001");
        listaDoble.eliminarPorCarnet("202300001");
        listaDoble.imprimirAdelante();
        
        // Probar inserciones ordenadas
        System.out.println("Insertando estudiantes ordenados por nota:");
        ListaDobleEstudiantes listaOrdenada = new ListaDobleEstudiantes();
        listaOrdenada.insertarOrdenado("202300001", "Ana", 85.0);
        listaOrdenada.insertarOrdenado("202300002", "Luis", 90.0);
        listaOrdenada.insertarOrdenado("202300003", "Maria", 78.0);
        listaOrdenada.imprimirAdelante();
    }
    
}
