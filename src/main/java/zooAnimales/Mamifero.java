package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	public static int caballos = 0;   //ya
	public static int leones = 0;    //ya
	private boolean pelaje;          //ya
	private int patas;       //ya
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.patas = patas;
		this.pelaje = pelaje;
		listado.add(this);
	}
	
	public Mamifero(){
		super();
		listado.add(this);
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static int cantidadMamiferos() {
		return (listado.size());
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos+=1;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones+=1;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	public void setPatas(int patas){
	    this.patas = patas;
	}
	
	public int getPatas(){
	    return this.patas;
	}
	
	public void setPelaje(boolean pelaje) {
	    this.pelaje = pelaje;
	}
	
	public boolean getPelaje(){
	    return this.pelaje;
	}
	
	public void setCaballos(int caballos) {
	    this.caballos = caballos;
	}
	
	public int getCaballos(){
	    return this.caballos;
	}
	
	public void setLeones(int leones) {
	    this.leones = leones;
	}
	
	public int getLeones(){
	    return this.leones;
	}
	
	public void setListado(List<Mamifero> listado) {
		this.listado=listado;
	}
	
	public List<Mamifero> getListado() {
		return this.listado;
	}
}
