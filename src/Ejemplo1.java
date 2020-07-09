import java.util.ArrayDeque;
import java.util.Deque;

public class Ejemplo1 {

	public static void main(String[] args) {
		int[] listadoInicial = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Deque<Integer> listadoFinal = new ArrayDeque<>();

		for (Integer elto : listadoInicial) {
			if (elto % 2 == 0)
				listadoFinal.addFirst(elto);
			else
				listadoFinal.addLast(elto);
		}
		System.out.println("Resultado Final: " + listadoFinal);

	}
}
