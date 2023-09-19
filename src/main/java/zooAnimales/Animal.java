package zooAnimales;
import gestion.*;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal() {		
	}
	
	public String totalPorTipo() {
		return("Mamiferos: "+ Mamifero.cantidadMamiferos() + "\n" +
				"Aves: " + Ave.cantidadAves() + "\n" +
				"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios());
	}
	
	public String toString() {
		if (zona==null) {
			return("Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero);
		}
		else
			return("Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+
					", la zona en la que me ubico es "+this.zona.getNombre()+", en el zoo "+this.zona.getZoo());
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales=totalAnimales;
	}
	
	public int getTotalAnimales(){
		return this.totalAnimales;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat=habitat;
	}
	
	public String getHabitat(){
		return this.habitat;
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	public String getGenero(){
		return this.genero;
	}
}
