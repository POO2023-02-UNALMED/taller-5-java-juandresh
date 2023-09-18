package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	private static List<Anfibio> listado =new ArrayList<Anfibio>();
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		super();
		listado.add(this);
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public int cantidadAnfibios() {
		return listado.size();
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas+=1;
		return new Anfibio (nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio  crearSalamandra(String nombre, int edad, String genero) {
		salamandras+=1;
		return new Anfibio (nombre, edad, "selva", genero, "negro y amarillo", false);
	}
}
