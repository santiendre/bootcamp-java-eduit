package practicaSemanal2;

import java.util.*;

public class DateValidation {

	public static void main(String[] args) {

		Scanner scanInput = new Scanner(System.in);
		System.out.println("Ingrese una fecha en formato dd/mm/yyyy");
		String date = scanInput.next();
	
		// Llamo al m�todo para validar la fecha ingresada
		boolean dateResult = checkDate(date);
		
		// Si el primer ingreso es inv�lido, vuelvo a pedir una fecha y agrego una opci�n para salir
		while(!dateResult) {
			System.out.println("Ingrese una fecha en formato dd/mm/yyyy o 'q' para salir");
			date = scanInput.next();
			if(date.equals("q")) {
				break;
			}
			dateResult = checkDate(date);
		}
		
		scanInput.close();
		System.out.println("---Fin del programa---");
		return;
	}
	
	// M�todo para chequear la validez de una fecha a partir de un string con formato dd/mm/yyyy
	public static boolean checkDate(String date) {
				
		String[] dateNumbers = date.split("/");
		// Chequeo que se hayan ingresado 3 valores para evitar problemas con los arrays
		if(dateNumbers.length != 3) {
			System.out.println("El formato ingresado es inv�lido");
			return false;			
		}
		int daySize = dateNumbers[0].length();
		int monthSize = dateNumbers[1].length();
		int yearSize = dateNumbers[2].length();
		
		// Validaciones de formato
		if(date.length() != 10 || dateNumbers.length != 3 || daySize != 2 || monthSize != 2 || yearSize != 4) {
			System.out.println("El formato ingresado es inv�lido");
			return false;
		}
		
		int day = Integer.valueOf(dateNumbers[0]);
		int month = Integer.valueOf(dateNumbers[1]);
		int year = Integer.valueOf(dateNumbers[2]);
		
		if(year >= 1900 && year <= 2099) {
			if(month >= 0 && month <= 12) {
				if(day <= daysPerMonth(month, year)) {
					System.out.println("La fecha " + date + " es v�lida");
					return true;
				}

			}
		}
		System.out.println("La fecha ingresada es inv�lida");
		return false;
	}	
	
	// M�todo que chequea si un a�o es bisiesto
	public static boolean isLeap(int year) {
		if(year % 4 == 0) {
			if(year % 100 != 0) {
				return true;
			}
			else {
				if(year % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}

	// M�todo que devuelve la cantidad de d�as que tiene un mes ingresando mes y a�o
	
	// m�todo que devuelve la cantidad de d�as que tiene el mes a partir del mes y a�o (considerando a�os biciestos)
	public static int daysPerMonth(int month, int year) {
		if((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			return 30;
		}
		else if(month == 2) {
			if(isLeap(year)) {
				return 29;
			}
			return 28;
		}
		return 31;
	}

}
