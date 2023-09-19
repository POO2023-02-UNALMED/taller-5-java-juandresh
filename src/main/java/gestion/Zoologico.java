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
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setZona(List<Zona> zonas) {
		this.zonas=zonas;
	}
	
	public List<Zona> getZona() {
		return this.zonas;
	}
}
