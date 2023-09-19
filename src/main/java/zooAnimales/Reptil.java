package zooAnimales;
import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	private static List<Reptil> listado =new ArrayList<Reptil>();
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		super();
		listado.add(this);
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return (listado.size());
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas+=1;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes+=1;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public void setIguanas(int iguanas) {
	    this.iguanas = iguanas;
	}
	
	public int getIguanas(){
	    return this.iguanas;
	}
	
	public void setSerpientes(int serpientes) {
	    this.serpientes = serpientes;
	}
	
	public int getSerpientes(){
	    return this.serpientes;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	
	public String getColorEscamas(){
		return this.colorEscamas;
	}
	
	public void setLargoCola(int largoCola){
	    this.largoCola = largoCola;
	}
	
	public int getLargoCola(){
	    return this.largoCola;
	}
	
	public void setListado(List<Reptil> listado) {
		this.listado=listado;
	}
	
	public List<Reptil> getListado() {
		return this.listado;
	}
}
