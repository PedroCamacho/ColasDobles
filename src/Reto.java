import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Reto {
	public static void main(String[] args) {

		// Inicialización
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba la expresión a evaluar: ");
		String expresion = sc.nextLine();
		Deque<Character> dobleCola = new ArrayDeque<>();
		int num, res = 0;
		Character operador;

		// Proceso
		for (int i = 0; i < expresion.length(); i++) {
			dobleCola.offerLast(expresion.charAt(i));
		}
		res = Character.getNumericValue(dobleCola.pollFirst());
		do {
			num = Character.getNumericValue(dobleCola.pollFirst());
			operador = dobleCola.pollLast();
			switch (operador) {
			case '+':
				res += num;
				break;
			case '-':
				res -= num;
				break;
			case '*':
				res *= num;
				break;
			}
		} while (!dobleCola.isEmpty());

		// Salida
		System.out.println("El resultado es: " + res);
		sc.close();
	}

}