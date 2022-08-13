package programming;

import java.util.List;

public class FPO1Exercise {
	
public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker", "Git", "PCF");
		printAllCoursesInFunctional(courses);
		printSpringCoursesInFunctional(courses);
		printCoursesHavingAtLeastFourLetterInFunctional(courses);
		printNoOfCharOfEachCourse(courses);
		sortAllCourses(courses);
	}

	private static void sortAllCourses(List<String> courses) {
	System.out.println("Course sorted alphabetically ");
	courses.stream().sorted().forEach(System.out::println);
	
}

	private static void printAllCoursesInFunctional(List<String> courses) {
	System.out.println("All Courses ");
	courses.stream()
	.forEach(System.out::println);
	}

	private static void printSpringCoursesInFunctional(List<String> courses) {
	  System.out.println("Courses only containing spring word");
	  courses.stream()
	 .filter(course->course.contains("Spring"))
	 .forEach(System.out::println);
	} 
 
	private static void printCoursesHavingAtLeastFourLetterInFunctional(List<String> courses) {
	  System.out.println("Courses containing at least 4 letters");
	  courses.stream()
	 .filter(course-> course.length() >= 4)
	 .forEach(System.out::println);
		
	}
	
	private static void printNoOfCharOfEachCourse(List<String> courses) {
		System.out.println("No of Character of each course");
		courses.stream()
		 .map(course -> course + " " +course.length())
		 .forEach(System.out::println);
	}


}
