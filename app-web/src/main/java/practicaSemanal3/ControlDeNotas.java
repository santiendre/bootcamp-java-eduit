package practicaSemanal3;

import java.util.*;

public class ControlDeNotas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad de alumnos a procesar");
		int cantidadDeAlumnos = scanner.nextInt();
		Alumno[] alumnos = new Alumno[cantidadDeAlumnos];
		int[] notas;
		
		for(int i = 0; i < cantidadDeAlumnos; i++) {
			System.out.println("Ingrese nombre del alumno n°: " + (i + 1));
			String name = scanner.next();
			System.out.println("Ingrese apellido del alumno n°: " + (i + 1));
			String lName = scanner.next();
			System.out.println("Ingrese la cantidad de exámenes que rindió " + name + " " + lName);
			int examSize = scanner.nextInt();
			notas = new int[examSize];
			for(int j = 0; j < examSize; j++) {
				System.out.println("Ingrese nota " + (j + 1) + " de " + name + " " + lName);
				int nota = scanner.nextInt();
				while(nota < 0 || nota > 10) {
					System.out.println("El valor debe ser entre 0 y 10, intente nuevamente");
					nota = scanner.nextInt();
				}
				notas[j] = nota;
			}
			alumnos[i] = new Alumno(name, lName, notas);
		}
	
		// Ejecuto los metodos de cada alumno para los calculos de notas
		for(Alumno al : alumnos) {
			al.calcularMaximo();
			al.calcularMinimo();
			al.calcularPromedio();
		} 
		
		int menorNota = 11;
		int mayorNota = -1;
		int auxMin;
		int auxMax;
		for(int i = 0; i < cantidadDeAlumnos; i++) {
			auxMin = alumnos[i].getNotaMinima();
			if(auxMin < menorNota) {
				menorNota = auxMin;
			}
			auxMax = alumnos[i].getNotaMaxima();
			if(auxMax > mayorNota) {
				mayorNota = auxMax;
			}
		}
		
		// Recorro el array de alumnos para cada lista que tengo que armar
		System.out.println("--------------------------------------");
		System.out.println("Alumnos con la menor nota (" + menorNota + "):");
		for(Alumno al : alumnos) {
			if(al.getNotaMinima() == menorNota) {
				System.out.println(al.getFullName());
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Alumnos con la mayor nota (" + mayorNota + "):");
		for(Alumno al : alumnos) {
			if(al.getNotaMaxima() == mayorNota) {
				System.out.println(al.getFullName());
			}
		}		
		System.out.println("--------------------------------------");
		System.out.println("Alumnos que promocionan:");
		for(Alumno al : alumnos) {
			if(al.getPromedio() >= 7) {
				System.out.println(al.getFullName());
				System.out.println("Promedio: " + al.getPromedio());
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Alumnos que deben recursar la materia:");
		for(Alumno al : alumnos) {
			if(al.getPromedio() < 7) {
				System.out.println(al.getFullName());
				System.out.println("Promedio: " + al.getPromedio());
			}
		}
		
		scanner.close();
		
	}

}
