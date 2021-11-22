package org.iesalandalus.programacion.torreajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
private static Torre miTorre=null;

	public static void main(String[] args) {
		int opcion;
		
		
		do {
			
			mostrarTorre();
			mostrarMenu();
			opcion = elegirOpcion();
			ejecutarOpcion(opcion);
			
		} while(opcion != 0);
			 System.out.println("Saliendo del programa...");
		 
	}

	private static void mostrarTorre() {
		Torre miTorre = new Torre();
		System.out.println(miTorre);
		}
	private static void mostrarMenu() {
		System.out.println("\n\n           Menu Inicial");
		System.out.println("==================================");
		System.out.println("\n1. Elegir un color");
		System.out.println("2. Elegir la columna inicial");
		System.out.println("3. Abrir menu direcciones");
		System.out.println("4. Crear una torre con valores por defecto");
		System.out.println("5. Crear torre a partir de un color introducido");
		System.out.println("6. Crea torre a partir del color y columna introducida");
		System.out.println("7. Abrir menu mover");
		System.out.println("\n0.- Salir del programa.\n");
	}
	private static int elegirOpcion() {
		int opcion;
		
		do {
			System.out.println("Elige una opcion: ");
			opcion = Entrada.entero();
			
		} while (opcion < 0 || opcion > 7 );
		
		System.out.println("La opcion elegida es: " + opcion);
		
		return opcion;	
		
		}
	
	private static void ejecutarOpcion(int opcion) {
		
		switch(opcion) {
		
		case 1:
			
			elegirColor();
			
		break;
		
		case 2:
			System.out.println("Case 2");
			System.out.println("Entra un numero");
			int asd = Entrada.entero();
			
			
		break;
		
		case 3:
			
		break;
		
		case 4:
			
		break;
		
		case 5:
			
		break;
		
		case 6:
			
		break;
		
		case 7:
			
		break;
		}
	}
	
	private Color elegirColor() {
		
	}
	
	}
