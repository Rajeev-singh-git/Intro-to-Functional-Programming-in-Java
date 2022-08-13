package programming;

import java.util.List;

public class FPO2Functional {
	
	public static void main(String[]args) {
	
	List<Integer> numbers = List.of(12,13,14,12,14,18,21);
         int sum = addListFunctional(numbers);
         System.out.println(sum);
	}
	
	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " +nextNumber);
		return aggregate + nextNumber;
	}
	

	private static int addListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
			//	.reduce(0,FPO2Functional::sum);     //using sum method
			//	.reduce(0, (x,y) -> x+y);          //using Lambda
				.reduce(0, Integer::sum);	       //using java inbuilt method 
		 
	}

	

}
