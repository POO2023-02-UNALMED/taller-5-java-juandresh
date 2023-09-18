package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	private static List<Pez> listado =new ArrayList<Pez>();

	private Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	private Pez() {
		super();
		listado.add(this);
	}
}
