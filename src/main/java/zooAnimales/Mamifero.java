package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	public static int caballos = 0;
	public static int leones = 0;
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
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos+=1;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones+=1;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
}
