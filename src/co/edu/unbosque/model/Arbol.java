package co.edu.unbosque.model;

public class Arbol {
    public Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    // Método para recorrido Preorder
    public void preorder(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valorNodo() + " ");
            preorder(nodo.ArbolIzquierdo());
            preorder(nodo.ArbolDerecho());
        }
    }

    // Método para recorrido Inorder
    public void inorder(Nodo nodo) {
        if (nodo != null) {
            inorder(nodo.ArbolIzquierdo());
            System.out.print(nodo.valorNodo() + " ");
            inorder(nodo.ArbolDerecho());
        }
    }

    // Método para recorrido Postorder
    public void postorder(Nodo nodo) {
        if (nodo != null) {
            postorder(nodo.ArbolIzquierdo());
            postorder(nodo.ArbolDerecho());
            System.out.print(nodo.valorNodo() + " ");
        }
    }

    // Inicio del recorrido Preorder desde la raíz
    public void recorrerPreorder() {
        preorder(raiz);
    }

    // Inicio del recorrido Inorder desde la raíz
    public void recorrerInorder() {
        inorder(raiz);
    }

    // Inicio del recorrido Postorder desde la raíz
    public void recorrerPostorder() {
        postorder(raiz);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
