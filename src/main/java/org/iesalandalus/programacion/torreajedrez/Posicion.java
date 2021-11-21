package org.iesalandalus.programacion.torreajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	
	public Posicion(int fila, char columna){
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("No es un atributo correcto");	
		}
		setFila(fila);
		
		if((columna > 'H' && columna <='Z')||(columna > 'h' && columna <='z')) {
			throw new IllegalArgumentException("No es un atributo correcto");
		}
		setColumna(columna);
	}
	public Posicion(Posicion posicion) {
		
		if (posicion == null) {
			throw new NullPointerException("No se puede copiar una posición nula");
		}
			this.fila = posicion.getFila();
			this.columna = posicion.getColumna();
		
	}
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
		throw new IllegalArgumentException("No esta comprendido entre 1 y 8");	
		}
			this.fila = fila;
			}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if((columna > 'H' && columna <='Z')||(columna > 'h' && columna <='z')) {
			throw new IllegalArgumentException("No esta comprendido entre A/a y H/h");
		}
		this.columna = columna;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Posicion: Fila = %s Columna = %s", fila, columna);
	}
}