package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	private static List<Repil> listado =new ArrayList<Reptil>();
	
	private Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	private Reptil() {
		super();
		listado.add(this);
	}
}
