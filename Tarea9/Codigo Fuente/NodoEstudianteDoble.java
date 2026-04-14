package tarea9;

public class NodoEstudianteDoble {
    private String carnet;
    private String nombre;
    private double nota;
    private NodoEstudianteDoble anterior;
    private NodoEstudianteDoble siguiente;

    public NodoEstudianteDoble(String carnet, String nombre, double nota) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota = nota;
        this.anterior = null;
        this.siguiente = null;
    }

    //--------Getters-------
    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    
    public NodoEstudianteDoble getAnterior() {
        return anterior;
    }
    
     public NodoEstudianteDoble getSiguiente() {
        return siguiente;
    }
     
    //---------Setters------
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
     public void setAnterior(NodoEstudianteDoble anterior) {
        this.anterior = anterior;
    }
     
    public void setSiguiente(NodoEstudianteDoble siguiente) {
        this.siguiente = siguiente;
    }
}
