
public class Instructor extends User {
	String description;
	
	public Instructor(int id, String name, String email, String password, String[] courses, String description) {
		super(id, name, email, password, courses);
		this.description = description;
	}
	public Instructor() {
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
