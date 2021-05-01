package homework2;

public class Main {

	public static void main(String[] args) {
		
		//��renci �rne�i
		Student ogrenci =new Student();
		ogrenci.ad="�mm�han";
		ogrenci.soyad="PER�EM";
		ogrenci.b�l�m="End�stri M�hendisi";
		ogrenci.github="https://github.com/percem";
		ogrenci.email="percem@gmail";
		
		//E�itimci �rne�i
		Instructor egitimci=new Instructor();
		egitimci.ad="Engin";
		egitimci.soyad="Demiro�";
		egitimci.kursAdi="Java";
		egitimci.email="engin@gmail";
		egitimci.sertifika="MCT";
		egitimci.yetkinlik="SOLID";
		
		//User �rne�i
		User genel=new User();
		genel.ad="Bilinmeyen";
		genel.soyad="kullan�c�";
		genel.email="xyz";
		genel.parola="xyz";
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse(egitimci);
		
		StudentManager studentManager =new StudentManager();
		studentManager.add(ogrenci);
		
		UserManager userManager=new UserManager();
		userManager.delete(genel);
	}

}
