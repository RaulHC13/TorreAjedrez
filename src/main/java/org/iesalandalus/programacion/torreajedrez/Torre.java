package org.iesalandalus.programacion.torreajedrez;

public class Torre {
	
	public Color color;
	public Posicion posicion;
	
	public Torre() {
		
	}
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		
		if(color == null) {
			throw new NullPointerException("No se puede copiar un color nulo.");
		}
		if(color != Color.BLANCO && color != Color.NEGRO) {
			throw new IllegalArgumentException ("No es un color valido");
		} this.color = color;
			
	}

	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		
		if(posicion == null) {
			throw new NullPointerException("No se puede copiar una posicion nula.");
		} this.posicion = posicion;
	}	
}