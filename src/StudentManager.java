
public class StudentManager extends UserManager {
	public void registerToCourse(Student student,String courseName) {
		String[] temp = new String[student.getCourses().length + 1];
		int index = 0;
		for(String course : student.getCourses()) {
			temp[index] = course;
			index++;
		}
		temp[temp.length - 1] =  courseName;
		student.setCourses(temp);
	}
	
}
