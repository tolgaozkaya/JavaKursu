public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", 35);
		JavaCourse javaCourse = new JavaCourse(1, "Java Eğitimi", "Programlama", instructor1);

		CourseManager courseManager = new CourseManager();
		courseManager.ekle(javaCourse);

	}

}
