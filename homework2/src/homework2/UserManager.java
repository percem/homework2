package homework2;

public class UserManager {
	//Ekleme
	public void add(User user) {
		System.out.println(user.ad + " genel kullan�c�");
	}
	
	//Silme
	public void delete(User user) {
		System.out.println(user.email + " genel kullan�c� silindi");
	}

}
