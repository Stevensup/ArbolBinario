package co.edu.unbosque.view;

import java.util.Scanner;


public class VistaConsola {

	private Scanner leer;


	public VistaConsola() {
		leer = new Scanner(System.in);
	}


	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void mostrarInformacion(int mensaje) {
		System.out.println(mensaje);
	}

	public int leerDato(String mensaje) {
		mostrarInformacion(mensaje);
		int n = leer.nextInt();
		return n;
	}


	public Scanner getLeer() {
		return leer;
	}

	public void setLeer(Scanner leer) {
		this.leer = leer;
	}


	public int LeerInt(int menu) {
		mostrarInformacion(menu);
		int n = leer.nextInt();
		return n;
	}

}
