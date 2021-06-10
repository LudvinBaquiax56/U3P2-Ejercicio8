import java.util.*;
import java.math.*;

public class Ejercicio8 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int multiplo5;
		String salir;

		System.out.println("Ingrese s cuando desee salir y enter para continuar");
		do {
			multiplo5 = (int)(Math.floor(Math.random()*100000)+1)*5;
			System.out.println(multiplo5);
			salir = scanner.nextLine();
		} while (!salir.equals("s"));
	}


}

