package homework2;

public class Main {

	public static void main(String[] args) {
		
		//Öðrenci örneði
		Student ogrenci =new Student();
		ogrenci.ad="Ümmühan";
		ogrenci.soyad="PERÇEM";
		ogrenci.bölüm="Endüstri Mühendisi";
		ogrenci.github="https://github.com/percem";
		ogrenci.email="percem@gmail";
		
		//Eðitimci örneði
		Instructor egitimci=new Instructor();
		egitimci.ad="Engin";
		egitimci.soyad="Demiroð";
		egitimci.kursAdi="Java";
		egitimci.email="engin@gmail";
		egitimci.sertifika="MCT";
		egitimci.yetkinlik="SOLID";
		
		//User örneði
		User genel=new User();
		genel.ad="Bilinmeyen";
		genel.soyad="kullanýcý";
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
