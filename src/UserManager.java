
public class UserManager {
	public void login(User user,String email,String password) {
		if(user.getEmail() == email && user.getPassword() == password) {
			System.out.println("Baþarýyla giriþ yapýldý.");
		}else {
			System.out.println("Email ve parola hatalý");
		}
	}
}
