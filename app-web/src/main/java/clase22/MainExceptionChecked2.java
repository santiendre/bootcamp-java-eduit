package clase22;

import java.util.Scanner;

public class MainExceptionChecked2 {

	public static void main(String[] args) {

		int a = 100;
		int b;
		boolean error = true;
		Scanner teclado = new Scanner(System.in);
		do {
			try {
				b = teclado.nextInt();
			}catch (Exception e) {
				
			}
		}while(error);
		
		/* COMPLETAR
		try {
			Calculadora.dividir(a, b);
		} catch (DivisionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
