package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
	public static int hacones;
	public static int aguilas;
	private String colorPlumas;
	private static List<Ave> listado = new ArrayList<Ave>();
	
	public 	Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave(){
		super();
		listado.add(this);
	}

}
