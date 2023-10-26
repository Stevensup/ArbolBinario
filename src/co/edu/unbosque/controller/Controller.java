package co.edu.unbosque.controller;

import co.edu.unbosque.model.ArbolBinario;
import co.edu.unbosque.model.Nodo;
import co.edu.unbosque.model.Arbol;
import co.edu.unbosque.view.VistaConsola;


public class Controller {
	
	private ArbolBinario arbolBinario;
    private VistaConsola vista;

    public Controller() {
        arbolBinario = new ArbolBinario();
        vista = new VistaConsola();
        Funcionar();
    }
		
    public void Funcionar() {
        arbolBinario.insertar(8);
        arbolBinario.insertar(3);
        arbolBinario.insertar(1);
        arbolBinario.insertar(20);
        arbolBinario.insertar(5);
        arbolBinario.insertar(10);
        arbolBinario.insertar(7);
        arbolBinario.insertar(4);

        vista.mostrarInformacion("Recorrido Preorder:");
        arbolBinario.preOrden();

        vista.mostrarInformacion("Recorrido Inorder:");
        arbolBinario.inOrden();

        vista.mostrarInformacion("Recorrido Postorder:");
        arbolBinario.postOrden();
    }


}
