package practicaSemanal3;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int[] notas;
	private int notaMinima;
	private int notaMaxima;
	private float promedio;
	
	public Alumno(String nombre, String apellido, int[] notas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = notas.clone();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getFullName() {
		return this.nombre + " " + this.apellido;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas.clone();
	}
	
	public int getNotaMinima() {
		return notaMinima;
	}

	public int getNotaMaxima() {
		return notaMaxima;
	}

	public float getPromedio() {
		return promedio;
	}
	
	public void calcularPromedio() {
		float av = 0;
		for(int n : this.notas) {
			av+=n;
		}
		this.promedio = av/this.notas.length;
	}
	
	public void calcularMinimo() {
		int temp = -1;
		if(this.notas.length != 0) {
			temp = this.notas[0];
			for(int n : this.notas) {
				if(n < temp) {
					temp = n;
				}
			}
		}
		this.notaMinima = temp;
	}
	
	public void calcularMaximo() {
		int temp = 0;
		for(int n : this.notas) {
			if(n > temp) {
				temp = n;
			}
		}
		this.notaMaxima = temp;
	}	

}
