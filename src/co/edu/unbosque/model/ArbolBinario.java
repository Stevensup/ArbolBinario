package co.edu.unbosque.model;

public class ArbolBinario extends Arbol {

    public ArbolBinario() {
        super();
    }

    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo raiz, int dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return raiz;
        }

        if (dato < raiz.valorNodo()) {
            raiz.setHojaIzquierda(insertarRec(raiz.getHojaIzquierda(), dato));
        } else if (dato > raiz.valorNodo()) {
            raiz.setHojaDerecha(insertarRec(raiz.getHojaDerecha(), dato));
        }

        return raiz;
    }
    
    public boolean eliminar(int dato) {
        if (raiz == null) {
            return false; 
        } else {
           
            Nodo padre = null;
            return eliminarRec(raiz, dato, padre);
        }
    }

    private boolean eliminarRec(Nodo nodo, int dato, Nodo padre) {
        if (nodo == null) {
            return false; 
        }

        if (dato < nodo.valorNodo()) {
            return eliminarRec(nodo.getHojaIzquierda(), dato, nodo);
        } else if (dato > nodo.valorNodo()) {
            return eliminarRec(nodo.getHojaDerecha(), dato, nodo);
        } else {
           
            if (nodo.getHojaIzquierda() == null && nodo.getHojaDerecha() == null) {
                
                if (padre != null) {
                    if (padre.getHojaIzquierda() == nodo) {
                        padre.setHojaIzquierda(null);
                    } else {
                        padre.setHojaDerecha(null);
                    }
                } else {
                    raiz = null; 
                }
            } else if (nodo.getHojaIzquierda() == null || nodo.getHojaDerecha() == null) {
               
                Nodo hijo = (nodo.getHojaIzquierda() != null) ? nodo.getHojaIzquierda() : nodo.getHojaDerecha();
                if (padre != null) {
                    if (padre.getHojaIzquierda() == nodo) {
                        padre.setHojaIzquierda(hijo);
                    } else {
                        padre.setHojaDerecha(hijo);
                    }
                } else {
                    raiz = hijo;
                }
            } else {
                
                Nodo sucesor = obtenerSucesor(nodo.getHojaDerecha());
                nodo.setDato(sucesor.valorNodo());
                eliminarRec(nodo.getHojaDerecha(), sucesor.valorNodo(), nodo);
            }
            return true; 
        }
    }

    private Nodo obtenerSucesor(Nodo nodo) {
        Nodo sucesor = nodo;
        while (sucesor.getHojaIzquierda() != null) {
            sucesor = sucesor.getHojaIzquierda();
        }
        return sucesor;
    }


    public boolean buscar(int dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(Nodo raiz, int dato) {
        if (raiz == null) {
            return false;
        }

        if (dato == raiz.valorNodo()) {
            return true;
        }

        if (dato < raiz.valorNodo()) {
            return buscarRec(raiz.getHojaIzquierda(), dato);
        } else {
            return buscarRec(raiz.getHojaDerecha(), dato);
        }
    }

    public void postOrden() {
        postOrdenRec(raiz);
    }

    private void postOrdenRec(Nodo raiz) {
        if (raiz != null) {
            postOrdenRec(raiz.getHojaIzquierda());
            postOrdenRec(raiz.getHojaDerecha());
            System.out.print(raiz.valorNodo() + " ");
        }
    }

    public void preOrden() {
        preOrdenRec(raiz);
    }

    private void preOrdenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valorNodo() + " ");
            preOrdenRec(raiz.getHojaIzquierda());
            preOrdenRec(raiz.getHojaDerecha());
        }
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(Nodo raiz) {
        if (raiz != null) {
            inOrdenRec(raiz.getHojaIzquierda());
            System.out.print(raiz.valorNodo() + " ");
            inOrdenRec(raiz.getHojaDerecha());
        }
    }
}
