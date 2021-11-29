package org.iesalandalus.programacion.torreajedrez;

public class Torre {
	
	private Color color;
	private Posicion posicion;
	private Direccion direccion;
	
	public Torre() { //Constructor que crea la Torre por defecto con los parametros indicados
		setColor(Color.NEGRO);
		posicion = new Posicion(8,'h');	
	}
	public Torre(Color color) {//Crea una Torre a partir de un color introducido
		if(color == null) {
			throw new NullPointerException("No se puede copiar un color nulo.");
		}
		if(color == Color.BLANCO) {
			setColor(Color.BLANCO);
			posicion = new Posicion(1,'h');
		}else {
			setColor(Color.NEGRO);
			posicion = new Posicion(8,'h');
		}		
	}
	public Torre(Color color, char columnaInicial) { //Crea una Torre a partir de un color y una columna inicial
		if(columnaInicial != 'A' && columnaInicial != 'H' && columnaInicial != 'a' && columnaInicial !='h') {
			throw new IllegalArgumentException("No es una columna valida");
		}
		if(color == null) {
			throw new NullPointerException("No se puede copiar un color nulo.");
		}
		if(color == Color.BLANCO) {
			setColor(Color.BLANCO);
			posicion = new Posicion(1,columnaInicial);
		}else {
			setColor(Color.NEGRO);
			posicion = new Posicion(8,columnaInicial);
		}		
	}
	private void setPosicion(Posicion posicion) {
		if(posicion == null) {
			throw new NullPointerException("No se puede copiar una posicion nula.");
		} this.posicion = posicion;
		
	}
	public Posicion getPosicion() {
		return posicion;
	}
	
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
	
	public void enrocar(Direccion direccion) {
		Torre torre2 = new Torre();
		
		if(direccion == null) {
			throw new NullPointerException("No se puede copiar una direccion nula.");
		}
		if(torre2.color==Color.BLANCO) {
			if(direccion == Direccion.ENROQUE_CORTO) {
				this.posicion= new Posicion(1,'f');
			} else if (direccion == Direccion.ENROQUE_LARGO) {
				this.posicion= new Posicion(1,'d');
			}
			
		}else if(torre2.color==Color.NEGRO) {
			if(direccion == Direccion.ENROQUE_CORTO) {
				this.posicion= new Posicion(8,'f');
			} else if (direccion == Direccion.ENROQUE_LARGO) {
				this.posicion= new Posicion(8,'d');
			}
		}
	}
	
	public void mover(Direccion direccion, int numPasos) {
		if (numPasos < 1) {
			throw new IllegalArgumentException("No se pueden dar 0 o menos pasos.");
		}
		if(direccion == null) {
			throw new NullPointerException("La direccion no puede ser nula");
		}//Crear OperationNotSupportedException
		posicion = new Posicion (getPosicion());
		
		}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
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
		Torre other = (Torre) obj;
		if (color != other.color)
			return false;
		if (direccion != other.direccion)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Torre == Color: %s\n======== Posicion: %s", color, posicion);
	}	
}