package homework2;

public class StudentManager {
	//Siteye öğrenci ekleyelim
	public void add(Student student) {
		System.out.println(student.ad + " öğrencisi kaydoldu!");
	}
	
	//Siteden öğrenci silelim
	public void delete(Student student) {
		System.out.println(student.ad + " öğrencisi silindi");
	}
	
	//Siteye okul ekleyelim
	public void addSchool(Student student) {
		System.out.println(student.okulAdi+ " okulunda öğrenci");
	}
	
	//Github linki ekleyelim
	public void addGithub(Student student) {
		System.out.println(student.github);
	}

}
