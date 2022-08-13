package programming;

import java.util.List;

public class FPO2Functional {
	
	public static void main(String[]args) {
	
	List<Integer> numbers = List.of(12,13,14,12,14,18,16, 18,21);
         int sum = addListFunctional(numbers);
         System.out.println("Sum of list is " +sum);
         printDistinctNumber(numbers);
         sortAllNumbers(numbers);
         sortDistinctNumbers(numbers);
	}
	
	private static void sortDistinctNumbers(List<Integer> numbers) {
		 System.out.println("Distinct Sorted  numbers are");
		 numbers.stream().distinct().sorted().forEach(System.out::println);
		
	}

	private static void sortAllNumbers(List<Integer> numbers) {
		
		    System.out.println("Sorted  numbers are");
			numbers.stream().sorted().forEach(System.out::println);
		
	}

	private static void printDistinctNumber(List<Integer> numbers) {
		
		  System.out.println("Distinct numbers are");
		  numbers.stream().distinct().forEach(System.out::println);
		
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " +nextNumber);
		return aggregate + nextNumber;
	}
	

	private static int addListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
			//	.reduce(0,FPO2Functional::sum);     //using user defined sum method
			//	.reduce(0, (x,y) -> x+y);          //using Lambda
				.reduce(0, Integer::sum);	       //using java inbuilt method 
		 
	}

	

}
