package practicaSemanal4;

public class Superman extends Volador{

	private String colorDeTraje;
	
	public Superman(String nombre, String colorDeTraje) {
		super(nombre);
		this.colorDeTraje = colorDeTraje;
	}

	public String getColorDeTraje() {
		return colorDeTraje;
	}

	public void setColorDeTraje(String colorDeTraje) {
		this.colorDeTraje = colorDeTraje;
	}
	
	@Override
	public void presentacion() {
		System.out.println("-----------------------------------");
		System.out.println("Tipo de volador: Superman");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Color del traje: " + this.colorDeTraje);
		System.out.println("-----------------------------------");
	}
	
}
