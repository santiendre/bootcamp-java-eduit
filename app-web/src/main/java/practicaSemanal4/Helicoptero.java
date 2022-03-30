package practicaSemanal4;

public class Helicoptero extends Volador implements Aterrizable{
	
	private int capacidad;
	private String color;
	private String funcion;
	
	public Helicoptero(String nombre, int capacidad, String color, String funcion) {
		super(nombre);
		this.capacidad = capacidad;
		this.color = color;
		this.funcion = funcion;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public void aterrizar() {		
		System.out.println("Helicóptero aterrizando\n");
	}
	
	@Override
	public void presentacion() {
		System.out.println("-----------------------------------");
		System.out.println("Tipo de volador: Helicóptero");		
		System.out.println("Nombre: " + this.nombre);	
		System.out.println("Capacidad: " + this.capacidad + " pasajeros");	
		System.out.println("Color: " + this.color);
		System.out.println("Función: " + this.funcion);	
		System.out.println("-----------------------------------");
	}
}
