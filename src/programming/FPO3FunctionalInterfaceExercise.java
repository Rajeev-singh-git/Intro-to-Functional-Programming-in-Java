package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


//1. Find Functional interface behind second argument of reduce method. Create an implementation for the functional interface
public class FPO3FunctionalInterfaceExercise {
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		List<Integer> numbers = List.of(12,13,14,15,16);
	
		
//		BinaryOperator<Integer> totalSum = Integer::sum; // It takes 2 input and return one output
		BinaryOperator<Integer> totalSum = (x,y)->x+y; /* I/P and O/P both are always same in Binary operator, 
														that's why we are  writing, integer only once in generic */
		
		//Supplier = Takes No input Gives Output
		Supplier<Integer> randomIntegerSupplier = ()->{
			Random random = new Random();
			return random.nextInt(1000);
			};
			
			System.out.println("Supplier Output\t" +randomIntegerSupplier.get());
			
			UnaryOperator<Integer> unaryOperator = (x) -> 3 *x;  //takes 1 input and return output of same type
			System.out.println("Unary Operator Output\t" +unaryOperator.apply(10));
		
		int sum = numbers.stream()
		         .reduce(0, totalSum);
		System.out.println(sum);
		
		

	
	}	
}
