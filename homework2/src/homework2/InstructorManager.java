package homework2;

public class InstructorManager {
	//Siteye e�itmen ekleyelim
	public void add(Instructor instructor) {
		System.out.println(instructor.ad + " eklendi");
	}
	
	//Siteye kurs ekleyelim
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.kursAdi + " yeni kurs");
	}

}
