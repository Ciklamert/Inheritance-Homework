
public class Student extends User {
	private String cardDetail;
	private String phoneNumber;
	public Student(int id, String name, String email, String password, String[] courses, String cardDetail, String phoneNumber) {
		super(id, name, email, password,courses);
		this.cardDetail = cardDetail;
		this.phoneNumber = phoneNumber;
	}
	public Student() {
		
	}
	public String getCardDetail() {
		return cardDetail;
	}
	public void setCardDetail(String cardDetail) {
		this.cardDetail = cardDetail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
