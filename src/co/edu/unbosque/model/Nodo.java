package co.edu.unbosque.model;

public class Nodo {
    private int dato;
    private Nodo hojaDerecha;
    private Nodo hojaIzquierda;

    public Nodo(int dato) {
        this.dato = dato;
        this.hojaDerecha = null;
        this.hojaIzquierda = null;
    }

    public Nodo(int dato, Nodo hojaDerecha, Nodo hojaIzquierda) {
        this.dato = dato;
        this.hojaDerecha = hojaDerecha;
        this.hojaIzquierda = hojaIzquierda;
    }
   
    public int valorNodo(){
    	return dato;
    }
    
    public Nodo ArbolIzquierdo(){
    	return hojaIzquierda;
    }
    
    public Nodo ArbolDerecho(){
    	return hojaDerecha;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }

    public Nodo getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }
    
    
}
