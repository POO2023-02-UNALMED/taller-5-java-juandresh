package gestion;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
		
	public Zoologico() {		
	}
	
	
}
