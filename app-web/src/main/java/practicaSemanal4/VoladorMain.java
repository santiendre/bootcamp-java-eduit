package practicaSemanal4;

public class VoladorMain {

	public static void main(String[] args) {
		
		// Creo array con un objeto de cada tipo en vez de pedirlo al usuario
		
		Volador[] voladores = new Volador[4];
		
		voladores[0] = new Avion("Avion de pasajeros", 350, 4, "Boeing 747");
		voladores[1] = new Helicoptero("Helicoptero policial", 4, "Azul", "Patrullar");
		voladores[2] = new Superman("Hombre de acero", "Gris");
		voladores[3] = new Ovni("Nave extraterrestre", 300, "Marte", "Conquistar la Tierra");
		
		// Recorro array para ejecutar el método "presentacion" y si es aterrizable, ejecutar ese método
		for(Volador v : voladores) {
			v.presentacion();
			if(v instanceof Aterrizable) {
				Aterrizable at = (Aterrizable)v;
				at.aterrizar();
			}
			else {
				System.out.println("Este tipo de volador no puede aterrizar\n");
			}
		}

	}

}
