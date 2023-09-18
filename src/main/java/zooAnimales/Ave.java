package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	private static List<Ave> listado = new ArrayList<Ave>();
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave(){
		super();
		listado.add(this);
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static int cantidadAves() {
		return (listado.size());
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones+=1;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas+=1;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
}
