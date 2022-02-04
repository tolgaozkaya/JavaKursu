public class CourseManager {

	public void ekle(JavaCourse javaCourse) {
		System.out.println("Kurs adı:" + javaCourse.getName() + "\nEgitmen:" + javaCourse.getInstructor().getName()
				+ " " + javaCourse.getInstructor().getSurname() + "\nKurs eklendi..");
	}

}