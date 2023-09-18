package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.patas = patas;
		this.pelaje = pelaje;
		listado.add(this);
	}
	
	public Mamifero(){
		super();
		listado.add(this);
	}
	
	

}
