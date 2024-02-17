/* 
 * Aranza Ibarra Camarena 
 * 200258 
 * Clase para poder dar la información sobre los artistas
 * Es maremanete para tener los objetos que tendra la matriz
 */
import java.util.Objects;

public class Artista implements Comparable<Artista> {
	protected String nombre; 
	protected double venta; 
	protected char tipo;
	public Artista(String nombre, double venta, char tipo) {
	
		this.nombre = nombre;
		this.venta = venta;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public double getVenta() {
		return venta;
	}
	public char getTipo() {
		return tipo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		return nombre.equals(other.getNombre());
	} 
	public int compareTo (Artista otro) {
		return nombre.compareTo(otro.getNombre()); 
	}
	
	public String toString() {
	StringBuilder sb; 
	
	sb=new StringBuilder(); 
	
	sb.append("Artista   :\n");
	sb.append("Nombre:   "+nombre+"\n"); 
	sb.append("Ventas:   "+venta+"\n"); 
	sb.append("Tipo:   "+tipo+"\n");
	
	return sb.toString(); 
	
	
	}
	//En esta clase no hay funciones porque no se requieren 
	
}
