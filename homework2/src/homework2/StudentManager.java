package homework2;

public class StudentManager {
	//Siteye ��renci ekleyelim
	public void add(Student student) {
		System.out.println(student.ad + " ��rencisi kaydoldu!");
	}
	
	//Siteden ��renci silelim
	public void delete(Student student) {
		System.out.println(student.ad + " ��rencisi silindi");
	}
	
	//Siteye okul ekleyelim
	public void addSchool(Student student) {
		System.out.println(student.okulAdi+ " okulunda ��renci");
	}
	
	//Github linki ekleyelim
	public void addGithub(Student student) {
		System.out.println(student.github);
	}

}
