package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	private static List<Pez> listado =new ArrayList<Pez>();

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez() {
		super();
		listado.add(this);
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static int cantidadPeces() {
		return (listado.size());
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones+=1;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos+=1;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public void setSalmones(int salmones) {
	    this.salmones = salmones;
	}
	
	public int getSalmones(){
	    return this.salmones;
	}
	
	public void setBacalaos(int bacalaos) {
	    this.bacalaos = bacalaos;
	}
	
	public int getBacalaos(){
	    return this.bacalaos;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	
	public String getColorEscamas(){
		return this.colorEscamas;
	}
	
	public void setCantidadAletas(int cantidadAletas){
	    this.cantidadAletas = cantidadAletas;
	}
	
	public int getCantidadAletas(){
	    return this.cantidadAletas;
	}
	
	public void setListado(List<Pez> listado) {
		this.listado=listado;
	}
	
	public List<Pez> getListado() {
		return this.listado;
	}
}
