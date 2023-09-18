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
	
	public int cantidadTotalAnimales() {
		int total=0;
		for(int i=0; i<zonas.size();i++) {
			total+=zonas.get(i).cantidadAnimales();
		}
		return total;
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
}
