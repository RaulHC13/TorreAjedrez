package org.iesalandalus.programacion.torreajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
private static Torre torreDefecto;
private static Torre torreColor;
private static Torre torreColorColumna;

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

	private static void mostrarTorre() {//Puede mostrar hasta 3 Torres distintas
		if(torreDefecto != null) {
			System.out.println("Torre defecto:\n" + torreDefecto);
		}
		if(torreColor != null) {
			System.out.println("Torre color:\n" + torreColor);
		}
		if(torreColorColumna != null) {
			System.out.println("Torre colorColumna:\n" + torreColorColumna);
		}
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
		
		System.out.println("La opcion elegida es: " + opcion + "\n");
		
		return opcion;	
		
		}
	
	private static void ejecutarOpcion(int opcion) {
		
		switch(opcion) {
		
		case 1:
			
			elegirColor();
		break;
		
		case 2:
			
			elegirColumnaInicial();
		break;
		
		case 3:
			
			mostrarMenuDirecciones();
			elegirDireccion();	
		break;
		
		case 4:
			
			crearTorreDefecto();
		break;
		
		case 5:
			
			crearTorreColor();
		break;
		
		case 6:
			
			crearTorreColorColumna();
		break;
		
		case 7:
			
			mover();
		break;
		}
	}
	
	private static Color elegirColor() {//Elige un color y lo devuelve
	    int codigoColor;
	    Color color = Color.BLANCO;
		
		do { 
			System.out.println("Selecion de color");
			System.out.println("==================");
			System.out.println("1. " + Color.BLANCO);
			System.out.println("2. " + Color.NEGRO);
			codigoColor = Entrada.entero();
			
		}while (codigoColor !=1 && codigoColor !=2);
		
		switch(codigoColor) {
		
		case 1:
			color = Color.BLANCO;
			System.out.println("El color seleccionado es: " + color);
		break;
			
		case 2:
			color = Color.NEGRO;
			System.out.println("El color seleccionado es: " + color);
		break;
		
		}
		 return color;
		}
	
	 private static char elegirColumnaInicial(){//Elige una columna inicial y la devuelve
		 char columnaInicial;
		 do {
			 System.out.println("Introduce la columna inicial (a o h): ");
			 columnaInicial = Entrada.caracter();
			 
		 }while(columnaInicial != 'A' && columnaInicial != 'H' && columnaInicial != 'a' && columnaInicial !='h');
		 
		 System.out.println("La columna inicial es: " + columnaInicial);
		 return columnaInicial;
	 }
	 
	 private static void mostrarMenuDirecciones() {//Muestra las varias direcciones del enumerador
		 
			 
		  		System.out.println("Menu direcciones");
				System.out.println("==================");
				System.out.println("1. " + Direccion.ABAJO);
				System.out.println("2. " + Direccion.ARRIBA);
				System.out.println("3. " + Direccion.IZQUIERDA);
				System.out.println("4. " + Direccion.DERECHA);
						
		 }
	 private static Direccion elegirDireccion() {
		 Direccion direccion = Direccion.ABAJO; //Se inicializa
		 int codigoDireccion;
		 
		 do {
			 System.out.println("\nSelecciona una opcion (1-4)");
				codigoDireccion = Entrada.entero();
		 } while(codigoDireccion < 1 || codigoDireccion > 4);
		
		 switch (codigoDireccion) {
		 case 1:
			 direccion = Direccion.ABAJO;
			 System.out.println("La direccion elegida es: " + direccion);
			 break;
		 case 2:
			 direccion = Direccion.ARRIBA;
			 System.out.println("La direccion elegida es: " + direccion);
			 break;
		 case 3:
			 direccion = Direccion.IZQUIERDA;
			 System.out.println("La direccion elegida es: " + direccion);
			 break;
		 case 4:
			 direccion = Direccion.DERECHA;
			 System.out.println("La direccion elegida es: " + direccion);
		 }
		 return direccion;
		 
	 }
	 
	 private static void crearTorreDefecto(){//Crea la Torre por defecto
		 try {
				torreDefecto = new Torre();
			} catch(IllegalArgumentException | NullPointerException excepcion) {
				System.out.println(excepcion.getMessage());
			}
	 }
	 private static void crearTorreColor() {//Crea la Torre a partir del color elegido
		 Color color; 
		 color = elegirColor();
		 try {
				torreColor = new Torre(color);
			} catch(IllegalArgumentException | NullPointerException excepcion) {
				System.out.println(excepcion.getMessage());
			}
	 } 
	 private static void crearTorreColorColumna() {//Crea la Torre a partir del color y la columna inicial
		 Color color; 
		 color = elegirColor();
		 
		 char columnaInicial;
		 columnaInicial = elegirColumnaInicial();
		 try {
				torreColorColumna = new Torre(color, columnaInicial);
			} catch(IllegalArgumentException | NullPointerException excepcion) {
				System.out.println(excepcion.getMessage());
			}
	 }
	 
	 private static void mover() {
		 Direccion direccion;
		 mostrarMenuDirecciones();
		 direccion = elegirDireccion();
		 System.out.println("Elige la cantidad de pasos a mover: ");
		 int numPasos = Entrada.entero();
		 
		 
	 }
	 
	 
	 }
		
	
	
