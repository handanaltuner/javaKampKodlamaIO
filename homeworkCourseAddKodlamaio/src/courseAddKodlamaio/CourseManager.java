package courseAddKodlamaio;

public class CourseManager {



	public void AddToCourse(Course course) {
		System.out.println("Eklediğim kurs :" + course.courseName);
	}
	public void DeleteToCourse(Course course) {
		System.out.println("Sildiğimiz kurs :" + course.courseName);
	}
	public void chooseToCourse(Course course) {
		System.out.println("Seçtiğimiz kurs :" + course.courseName);
	}
}


