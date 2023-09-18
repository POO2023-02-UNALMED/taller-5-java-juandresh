package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	private static List<Anfibio> listado =new ArrayList<Anfibio>();
	
	private Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	private Anfibio() {
		super();
		listado.add(this);
	}
}
