package programming;

import java.util.List;
import java.util.function.Predicate;

public class FPO1Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,18,16,12,36,39);
		printAllNumbersInFunctional(numbers);
		printAllEvenNumbersInFunctional(numbers);
	}

	private static void printAllNumbersInFunctional(List<Integer> numbers) {
		//Our focus is  =  What to do?
		numbers.stream()
		.forEach(System.out::println); //Method Reference
	}
	
	private static void printAllEvenNumbersInFunctional(List<Integer> numbers) {
		//Our focus is  =  What to do?
		numbers.stream()
	
		.filter(FPO1Functional::isEven) //Filter - Only Allow even numbers. Bascically, we are saying "isEven" is the method to be called on each number
		.forEach(System.out::println); //Method Reference
	}


	private static boolean  isEven(int number) {
		// TODO Auto-generated method stub
		return number%2==0;
	}
	
	

}
