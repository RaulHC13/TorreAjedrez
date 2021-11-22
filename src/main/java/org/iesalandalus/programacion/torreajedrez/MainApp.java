package org.iesalandalus.programacion.torreajedrez;

public class MainApp {
private static Torre miTorre=null;

	public static void main(String[] args) {
		 monstrarTorre();
	}

	private static void monstrarTorre() {
		Torre miTorre = new Torre();
		
		System.out.println(miTorre);
		
	}
}