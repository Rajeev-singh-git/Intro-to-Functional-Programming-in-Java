package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	
	
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	public String toString() {
		return name+ ":" + noOfStudents + ":" +reviewScore;
		
	}
	
}



public class FPO4CustomClass {

	public static void main(String[] args) {
	   List<Course> courses = List.of(
				new Course("Spring","Framework", 98, 20000),
				new Course("Spring Boot","Framework", 96, 30000),
				new Course("API","Microservices", 97, 30000),
				new Course("Angular","Frontend Framework", 99, 18000),
				new Course("Git","Cloud", 99, 85000),
				new Course("Azure","Cloud", 100, 96000)
			);
	   
	   Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore()>95;
	   Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore()>90;
	   Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore()<90;
	   
	   System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
	   System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
	   System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan90Predicate));
	   
	   Comparator<Course> comparingByNoStudentsIncreasing =  Comparator.comparing(Course::getNoOfStudents);
	   Comparator<Course> comparingByNoStudentsDecreasing =  Comparator.comparing(Course::getNoOfStudents).reversed();
	   Comparator<Course> comparingByNoStudentsAndNoOfReviews = 
			   Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore).reversed();
		
	   
	   System.out.println(courses.stream().sorted(comparingByNoStudentsIncreasing).collect(Collectors.toList()));
	   System.out.println(courses.stream().sorted(comparingByNoStudentsDecreasing).collect(Collectors.toList()));
	   System.out.println(courses.stream().sorted(comparingByNoStudentsAndNoOfReviews).collect(Collectors.toList()));

	}

}
