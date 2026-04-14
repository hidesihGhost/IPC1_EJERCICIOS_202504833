package tarea9;

public class ListaDobleEstudiantes {
    private NodoEstudianteDoble cabeza; //head, puntero
    private NodoEstudianteDoble cola; //cola, puntero
    
    public ListaDobleEstudiantes() {
        this.cabeza = null;
        this.cola = null;
    }
    
    //------------------------Inserta al inicio de la lista----------------
    public void agregarInicio(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
    }
    
    //-------------------------Interta al final de la lista------------------
    public void agregarFinal(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
    }
    
    //-----------------Eliminacion correcta actualizando prev y next---------------------
    public boolean eliminarPorCarnet(String carnet) {
        if (cabeza == null) {
            return false;
        }
        
        NodoEstudianteDoble actual = cabeza;
        
        //Buscar el nodo a eliminar
        while (actual != null && !actual.getCarnet().equals(carnet)) {
            actual = actual.getSiguiente();
        }
        
        if (actual == null) {
            return false;
        }
        
        //Si solo hay un nodo
        if (actual == cabeza && actual == cola) {
            cabeza = null;
            cola = null;
        }
        //Si el nodo es la cabeza
        else if (actual == cabeza) {
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
        }
        //Si el nodo es la cola
        else if (actual == cola) {
            cola = cola.getAnterior();
            cola.setSiguiente(null);
        }
        //Si está en medio
        else {
            actual.getAnterior().setSiguiente(actual.getSiguiente());
            actual.getSiguiente().setAnterior(actual.getAnterior());
        }
        
        return true;
    }
    
    
    //--------------------------------Recorre HEAD-TAIL-------------------
     public void imprimirAdelante() {
        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }
        
        System.out.println("Recorrido HEAD-TAIL");
        NodoEstudianteDoble actual = cabeza;
        int posicion = 1;
        
        while (actual != null) {
            System.out.println(posicion + ". Carnet: " + actual.getCarnet() + 
                             " | Nombre: " + actual.getNombre() + 
                             " | Nota: " + actual.getNota());
            actual = actual.getSiguiente();
            posicion++;
        }
    }
     
    //--------------------------Recorrer TAIL-HEAD------------------------------
     public void imprimirAtras() {
        if (cola == null) {
            System.out.println("Lista vacia");
            return;
        }
        
        System.out.println("Recorrido TAIL-HEAD");
        NodoEstudianteDoble actual = cola;
        int posicion = 1;
        
        while (actual != null) {
            System.out.println(posicion + ". Carnet: " + actual.getCarnet() + 
                             " | Nombre: " + actual.getNombre() + 
                             " | Nota: " + actual.getNota());
            actual = actual.getAnterior();
            posicion++;
        }
    }
     
    //---------------------------Inserta manteniendo orden ascendente por nota-----------------
     public void insertarOrdenado(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        
        //Lista vacia
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            return;
        }
        
        //Insertar al inicio
        if (nota <= cabeza.getNota()) {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
            return;
        }
        
        //Insertar al final
        if (nota >= cola.getNota()) {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
            return;
        }
        
        //Insertar en medio
        NodoEstudianteDoble actual = cabeza;
        
        while (actual != null && actual.getNota() < nota) {
            actual = actual.getSiguiente();
        }
        
        //Insertar antes del actual
        nuevo.setSiguiente(actual);
        nuevo.setAnterior(actual.getAnterior());
        actual.getAnterior().setSiguiente(nuevo);
        actual.setAnterior(nuevo);
    }   
}
