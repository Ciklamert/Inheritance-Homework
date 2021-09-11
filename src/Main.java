import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		User mert = new User(1,"Mert","mert.cikla@gmail.com","123456",new String[]{"Java","C#"});
		System.out.println(Arrays.toString(mert.getCourses()));
		Student ulas = new Student(2,"Ulaþ","ulas.bakioglu@gmail.com","456789",new String[] {"Java"},"1234567890","05468972346");
		System.out.println(ulas.getPhoneNumber());
		Instructor engin = new Instructor(3,"Engin","engin.demirog@gmail.com","369852147",new String[] {"Java","C#","Javascript"},"Udemy Eðitmeni");
		System.out.println(engin.getDescription());
		UserManager userManager = new UserManager();
		userManager.login(engin, "engin.demirog@gmail.comm", "369852147");
		StudentManager studentManager = new StudentManager();
		studentManager.registerToCourse(ulas, "C#");
		System.out.println(Arrays.toString(ulas.getCourses()));
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework("Kodlama.io simülasyonu yap");
		instructorManager.login(mert, "mert.cikla@gmail.com", "123456");
	}

}
