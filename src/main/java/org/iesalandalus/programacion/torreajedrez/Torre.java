package org.iesalandalus.programacion.torreajedrez;

public class Torre {
	
	private Color color;
	private Posicion posicion;
	private Direccion direccion;
	
	
	public Torre() {
		this.color=Color.NEGRO;
		posicion = new Posicion(8,'h');	
	}
	
	public Torre(Color color) {
		if(color == Color.BLANCO) {
			this.color=Color.BLANCO;
			this.posicion = new Posicion(1,'h');
		}else {
			this.color=Color.NEGRO;
			this.posicion = new Posicion(8,'h');
		}		
	}
	public Torre(Color color, char columna) {
		if(columna != 'A' && columna != 'H' && columna != 'a' && columna !='h') {
			throw new IllegalArgumentException("No es una columna valida");
		}
		if(color == Color.BLANCO) {
			this.color=Color.BLANCO;
			this.posicion = new Posicion(1,columna);
		}else {
			this.color=Color.NEGRO;
			this.posicion = new Posicion(8,columna);
		}		
	}
	
	public void Mover(Direccion direccion, int numPasos) {
		if (numPasos < 1) {
			throw new IllegalArgumentException("No se pueden dar 0 o menos pasos.");
		}
		if(direccion == null) {
			throw new NullPointerException("La direccion no puede ser nula");
		}
		
		
		
	}
	
	@SuppressWarnings("unused")
	private void setPosicion(Posicion posicion) {
		
		if(posicion == null) {
			throw new NullPointerException("No se puede copiar una posicion nula.");
		} this.posicion = posicion;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	@SuppressWarnings("unused")
	private void setColor(Color color) {
		
		if(color == null) {
			throw new NullPointerException("No se puede copiar un color nulo.");
		}
		if(color != Color.BLANCO && color != Color.NEGRO) {
			throw new IllegalArgumentException ("No es un color valido");
		} this.color = color;	
	}

	public Color getColor() {
		return color;
	}
	@Override
	public String toString() {
		return String.format("Torre %s, %s", color, posicion);
	}	
}