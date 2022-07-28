package programming;

import java.util.List;

public class FPO1Functional {

	public static void main(String[] args) {
		
		printAllNubersInStructured(List.of(12,9,18,16,12,36,39));
	}

	private static void printAllNubersInStructured(List<Integer> numbers) {
		//Our focus is  =  What to do?
		
		numbers.stream().forEach(FPO1Functional::print);
		
	}
	
	private static void print(int number) {
		System.out.println(number);
	}

}
