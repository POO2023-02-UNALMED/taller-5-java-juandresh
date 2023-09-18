package gestion;
import java.util.ArrayList;
import java.util.List;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List <Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre =nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
	}
	
}
