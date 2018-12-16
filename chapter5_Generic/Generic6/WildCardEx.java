package chapter5_Generic.Generic6;

import java.util.Arrays;

public class WildCardEx {

	public static void registerCourse(Course<?> course){
		// TODO Auto-generated method stub
		System.out.println(course.getName() + "수강생: " +Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: " +Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " +Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new HighStudent("고등학생"));
		personCourse.add(new Student("학생"));
		
		Course<Worker> personCourseWorker = new Course<>("직장인과정", 5);
		personCourseWorker.add(new Worker("직장인"));
	
		Course<Student> personCourseStudent= new Course<>("학생과정", 5);
		personCourseStudent.add(new Student("학생"));
		
		Course<HighStudent> personCourseHighStudent= new Course<>("고등학생과정", 5);
		personCourseHighStudent.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(personCourseWorker);
		registerCourse(personCourseStudent);
		registerCourse(personCourseHighStudent);
		System.out.println();
		registerCourseStudent(personCourseStudent);
		registerCourseStudent(personCourseHighStudent);
		System.out.println();
		registerCourseWorker(personCourseWorker);
		registerCourseWorker(personCourse);
		

		
	}
}
