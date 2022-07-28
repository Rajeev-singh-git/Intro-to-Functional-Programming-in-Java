package programming;

import java.util.List;

public class FPO1Structureed {

	public static void main(String[] args) {
		
		printAllNubersInStructured(List.of(12,9,18,16,12,36));
	}

	private static void printAllNubersInStructured(List<Integer> numbers) {
		// Our focus is  =  How to loop the numbers?
		for(int number:numbers) {
			System.out.println(number);
		}
		
	}

}
