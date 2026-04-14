package tarea9;

public class NodoEstudiante {
    private String carnet;
    private String nombre;
    private double nota;//por decimales
    
    private NodoEstudiante siguiente;
    
    public NodoEstudiante(String carnet, String nombre, double nota) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota = nota;
        this.siguiente = null;
    }
    
    //-------------------Getters---------------
    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    
    public NodoEstudiante getSiguiente() {
        return siguiente;
    }
    
 
    //-------------Setters-------------------
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
    public void setNota(double nota) {
        this.nota = nota;
    }
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSiguiente(NodoEstudiante siguiente) {
        this.siguiente = siguiente;
    }
        
}
