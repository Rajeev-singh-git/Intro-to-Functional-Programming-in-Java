package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


//1. Find Functional interface behind second argument of reduce method. Create an implementation for the functional interface
public class FPO3FunctionalInterfaceExercise {
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		List<Integer> numbers = List.of(12,13,14,15,16);
		
		
	
		BinaryOperator<Integer> totalSum = Integer::sum;
		BinaryOperator<Integer> totalSum2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer x, Integer y) {
				return x+y;
			}
			
		};
		
		int sum = numbers.stream()
		         .reduce(0, totalSum2);
		System.out.println(sum);

	
	}	
}
