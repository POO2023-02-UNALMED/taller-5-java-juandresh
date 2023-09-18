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
	
	public static String totalPorTipo() {
		return("Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"+"Aves: "+Aves.cantidadAves()+"\n"+"Peces: "+Pez.cantidadPeces()+"\n"+"Reptiles: "
				+Reptil.cantidadReptiles()+"\n"+"Anfibios: "+Anfibio.cantidadAnfibios()+"\n")
	}
	
	public String toString() {
		if (zona==null) {
			return("Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero);
		}
		else
			return("Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+
					", la zona en la que me ubico es "+this.getZona().getNombre()+", en el zoo "+this.zona.getZoo().getNombre());
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
}
