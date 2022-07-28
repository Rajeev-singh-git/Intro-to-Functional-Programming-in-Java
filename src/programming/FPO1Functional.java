package programming;

import java.util.List;

public class FPO1Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,18,16,12,36,39);
		System.out.println("All Numbers ");
		printAllNumbersInFunctional(numbers);
		System.out.println("Even Numbers only");
		printAllEvenNumbersInFunctional(numbers);
		System.out.println("Odd Numbers only");
		printAllOddNumbersInFunctional(numbers);
	}


   private static void printAllNumbersInFunctional(List<Integer> numbers) {
		//Our focus is  =  What to do?
		numbers.stream()
		.forEach(System.out::println); //Method Reference
	}
	
	private static void printAllEvenNumbersInFunctional(List<Integer> numbers) {
		//Our focus is  =  What to do?
		numbers.stream()
		  .filter(number -> number%2 ==0)  //Lambda Expression
		  .forEach(System.out::println);   //Method Reference
	}
	

	private static void printAllOddNumbersInFunctional(List<Integer> numbers) {
	   numbers.stream()
	   .filter(number -> number%2 !=0)
	   .forEach(System.out::println);  
	}
	
}
