package org.iesalandalus.programacion.torreajedrez;

public class Torre {
	
	public Color color;
	public Posicion posicion;
	
	public Torre() {
		this.color=Color.NEGRO;
		posicion = new Posicion(8,'h');
		
		
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		
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
	public void setPosicion(Posicion posicion) {
		
		if(posicion == null) {
			throw new NullPointerException("No se puede copiar una posicion nula.");
		} this.posicion = posicion;
	}
	@Override
	public String toString() {
		return String.format("Torre %s, %s", color, posicion);
	}	
}