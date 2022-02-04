public class JavaCourse {
	private int id;
	private String name;
	private String category;
	private Instructor instructor;

	public JavaCourse(int id, String name, String category, Instructor instructor) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Instructor getInstructor() {
		return instructor;
	}

	public void setEgitmen(Instructor instructor) {
		this.instructor = instructor;
	}

}
