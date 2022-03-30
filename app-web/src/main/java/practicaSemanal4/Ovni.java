package practicaSemanal4;

public class Ovni extends Volador{

	private int diametro;
	private String origen;
	private String funcionEnLaTierra;
	
	public Ovni(String nombre, int diametro, String origen, String funcionEnLaTierra) {
		super(nombre);
		this.diametro = diametro;
		this.origen = origen;
		this.funcionEnLaTierra = funcionEnLaTierra;
	}
	
	public int getDiametro() {
		return diametro;
	}



	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}



	public String getOrigen() {
		return origen;
	}



	public void setOrigen(String origen) {
		this.origen = origen;
	}



	public String getFuncionEnLaTierra() {
		return funcionEnLaTierra;
	}



	public void setFuncionEnLaTierra(String funcionEnLaTierra) {
		this.funcionEnLaTierra = funcionEnLaTierra;
	}



	@Override
	public void presentacion() {
		System.out.println("-----------------------------------");
		System.out.println("Tipo de volador: OVNI");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Diámetro: " + this.diametro + " metros");
		System.out.println("Función: " + this.funcionEnLaTierra);
		System.out.println("-----------------------------------");		
	}
	
}
