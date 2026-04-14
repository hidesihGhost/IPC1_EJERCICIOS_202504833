package tarea9;

public class ListaEstudiantes {
    private NodoEstudiante cabeza; //head, puntero

    public ListaEstudiantes() {
        this.cabeza = null;
    }
    
    //------------------------Inserta al inicio de la lista-------------------
    public void agregarInicio(String carnet, String nombre, double nota){
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);// Crear nodo
        nuevo.setSiguiente(cabeza);//nuevo apunta al primer nodo
        cabeza = nuevo; // cabeza apunta al nuevo nodo
    }
    
    //----------------------Inserta al final de la lista--------------------------
    public void agregarFinal(String carnet, String nombre, double nota){
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        
        NodoEstudiante actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
    }
    
    //---------------------------Elimina el nodo con el carnet---------------------
    public boolean eliminarPorCarnet(String carnet){
        if (cabeza == null) {
            return false;
        }
        
        //eliminar la cabeza
        if (cabeza.getCarnet().equals(carnet)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }
        
        // Buscar el nodo
        NodoEstudiante actual = cabeza;
        NodoEstudiante anterior = null;
        
        while (actual != null && !actual.getCarnet().equals(carnet)) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        
        if (actual != null) {
            anterior.setSiguiente(actual.getSiguiente());
            return true;
        }
        
        return false;
    }
    
    //------------------------Retorna el nodo o null si no existe------------------
    public NodoEstudiante buscarPorCarnet(String carnet){
        NodoEstudiante actual = cabeza;
        
        while (actual != null) {
            if (actual.getCarnet().equals(carnet)) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        
        return null;
    }
    
    //--------------------Imprime todos los estudiantes en orden-----------------------
    public void imprimirLista(){
         if (cabeza == null) {
            System.out.println("No hay elementos en la lista");
            return;
        }
        
         //Recorrer e impirmir datos
        NodoEstudiante actual = cabeza;
        int posicion = 1;
        
        while (actual != null) {
            System.out.println(posicion + ". Carnet: " + actual.getCarnet() + 
                             " | Nombre: " + actual.getNombre() + 
                             " | Nota: " + actual.getNota());
            actual = actual.getSiguiente();
            posicion++;
        }
    }
    
    //------------------------Retorna el promedio de notas------------------
    public double obtenerPromedio(){
         if (cabeza == null) {
            return 0.0;
        }
        NodoEstudiante actual = cabeza;
        double suma = 0.0;
        int contador = 0;
        
        while (actual != null) {
            suma += actual.getNota();
            contador++;
            actual = actual.getSiguiente();
        }
        return suma / contador;
    }
    
    //--------------------------Retorna el estudiante con mayor nota----------------------
    public NodoEstudiante obtenerMejorNota(){
         if (cabeza == null) {
            return null;
        }
        
        NodoEstudiante actual = cabeza;
        NodoEstudiante mejor = cabeza;
        
        while (actual != null) {
            if (actual.getNota() > mejor.getNota()) {
                mejor = actual;
            }
            actual = actual.getSiguiente();
        }
        
        return mejor;
    }
}
