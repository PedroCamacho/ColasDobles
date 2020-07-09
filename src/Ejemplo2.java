import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ejemplo2 {

	public static void main(String[] args) {
		List <Integer> numeros = Arrays.asList(3, 4, 5, 6, 7, 8);
		Deque <Integer> lista = new LinkedList <> (numeros);
		System.out.println("Inicial: \t" + lista);
		lista.addFirst(2);
		System.out.println("addFirst 2: \t" + lista);
		lista.addLast(9);
		System.out.println("addLast 9: \t" + lista);
		lista.offerFirst(1);
		System.out.println("offerFirst 1: \t" + lista);
		lista.offerLast(10);
		System.out.println("offerLast 10: \t" + lista);
		System.out.println("getFirst 1: \t" + lista.getFirst());
		System.out.println("peekFirst 1: \t" + lista.peekFirst());
		System.out.println("getLast 10: \t" + lista.getLast());
		System.out.println("peekLast 10: \t" + lista.peekLast());
		lista.removeFirst();
		System.out.println("removeFirst: \t" + lista);
		lista.removeLast();
		System.out.println("removeLast: \t" + lista);
		lista.pollFirst();
		System.out.println("pollFirst: \t" + lista);
		lista.pollLast();
		System.out.println("pollLast: \t" + lista);
		
	} 

}
