package co.edu.unbosque.controller;

import co.edu.unbosque.model.ArbolBinario;
import co.edu.unbosque.view.VistaConsola;

import java.util.Scanner;

public class Controller {

    private ArbolBinario arbolBinario;
    private VistaConsola vista;
    private Scanner scanner;

    public Controller() {
        arbolBinario = new ArbolBinario();
        vista = new VistaConsola();
        scanner = new Scanner(System.in);
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
        
        boolean continuar = true;
        while (continuar) {
            vista.mostrarInformacion("1. Insertar valor");
            vista.mostrarInformacion("2. Recorrido Preorder");
            vista.mostrarInformacion("3. Recorrido Inorder");
            vista.mostrarInformacion("4. Recorrido Postorder");
            vista.mostrarInformacion("5. Buscar valor");
            vista.mostrarInformacion("6. Eliminar valor");
            vista.mostrarInformacion("7. Salir");

            int opcion = vista.leerDato("Ingrese la opción: ");

            switch (opcion) {
                case 1:
                    int valorAInsertar = vista.leerDato("Ingrese el valor a insertar: ");
                    arbolBinario.insertar(valorAInsertar);
                    vista.mostrarInformacion("Valor " + valorAInsertar + " insertado en el árbol.");
                    break;
                case 2:
                    vista.mostrarInformacion("Recorrido Preorder:");
                    arbolBinario.preOrden();
                    break;
                case 3:
                    vista.mostrarInformacion("Recorrido Inorder:");
                    arbolBinario.inOrden();
                    break;
                case 4:
                    vista.mostrarInformacion("Recorrido Postorder:");
                    arbolBinario.postOrden();
                    break;
                case 5:
                    int valorABuscar = vista.leerDato("Ingrese el valor a buscar: ");
                    boolean encontrado = arbolBinario.buscar(valorABuscar);
                    if (encontrado) {
                        vista.mostrarInformacion("El valor " + valorABuscar + " se encuentra en el árbol.");
                    } else {
                        vista.mostrarInformacion("El valor " + valorABuscar + " no se encuentra en el árbol.");
                    }
                    break;
                case 6:
                    int valorAEliminar = vista.leerDato("Ingrese el valor a eliminar: ");
                    boolean eliminado = arbolBinario.eliminar(valorAEliminar);
                    if (eliminado) {
                        vista.mostrarInformacion("El valor " + valorAEliminar + " ha sido eliminado del árbol.");
                    } else {
                        vista.mostrarInformacion("El valor " + valorAEliminar + " no se encuentra en el árbol.");
                    }
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    vista.mostrarInformacion("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }

}
