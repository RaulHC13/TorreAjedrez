package org.iesalandalus.programacion.torreajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila < 1 || fila > 8)
			throw new IllegalArgumentException("No esta comprendido entre 1 y 8");
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if((columna > 'H' && columna <='Z')||(columna > 'h' && columna <='z')) {
			throw new IllegalArgumentException("No esta comprendido entre A y H");
		}
		this.columna = columna;
	}
	

}
