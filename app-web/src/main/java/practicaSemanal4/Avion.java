package practicaSemanal4;

public class Avion extends Volador implements Aterrizable{

	private int cantidadAsientos;
	private int cantidadTurbinas;
	private String modelo;
	
	public Avion(String nombre, int cantidadAsientos, int cantidadTurbinas, String modelo) {
		super(nombre);
		this.cantidadAsientos = cantidadAsientos;
		this.cantidadTurbinas = cantidadTurbinas;
		this.modelo = modelo;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public int getCantidadTurbinas() {
		return cantidadTurbinas;
	}

	public void setCantidadTurbinas(int cantidadTurbinas) {
		this.cantidadTurbinas = cantidadTurbinas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void aterrizar() {
		System.out.println("Avion aterrizando\n");
	}
	
	@Override
	public void presentacion() {
		System.out.println("-----------------------------------");
		System.out.println("Tipo de volador: Avion");
		System.out.println("Nombre: " + this.nombre);	
		System.out.println("Cantidad de asientos: " + this.cantidadAsientos);	
		System.out.println("Cantidad de turbinas: " + this.cantidadTurbinas);
		System.out.println("Modelo: " + this.modelo);	
		System.out.println("-----------------------------------");
	}

}
