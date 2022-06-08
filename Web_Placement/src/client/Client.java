package client;

import java.time.LocalDate;

import entities.Admin;
import entities.Certificate;
import entities.College;
import entities.Placement;
import entities.Student;
import entities.User;
import service.IAdminService;
import service.IAdminServiceImp;
import service.ICertificateService;
import service.ICertificateServiceImp;
import service.ICollegeService;
import service.ICollegeServiceImp;
import service.IPlacementService;
import service.IPlacementServiceImp;
import service.IStudentService;
import service.IStudentServiceImp;
import service.IUserService;
import service.IUserServiceImp;

public class Client {
	public static void main(String[] args) {
		Student student = new Student();
		IStudentService service = new IStudentServiceImp();
		
	    student.setId(403);
		student.setName("Sunil");
		student.setRoll(2);
		student.setQualification("BE");
		student.setCourse("RGIT");
		student.setYear(2021);
		Certificate c=new Certificate();
		c.setId(324);
		c.setYear(2021);
		College col=new College();
		col.setId(501);
		col.setCollegeName("Rajiv Gandhi Institute Of Technology ");
		col.setLocation("Bangalore");
		User u=new User();
		u.setId(601);
		u.setName("SunilKR ");
		u.setPassword("789456123");
		IUserService user=new IUserServiceImp();
		user.addNewUser(u);
		col.setCollegeAdmin(u);
		ICollegeService college=new ICollegeServiceImp();
		college.addCollege(col);
		c.setCollege(col);
		ICertificateService certificate=new ICertificateServiceImp();
		certificate.addCertificate(c);
        student.setCollege(col);
		student.setRoll(785);
		student.setQualification("BE");
		student.setCourse("CSE");
	    student.setCertificate(c);
		student.setHallTicketNo(701);
		
		Admin a=new Admin();
		a.setId(301);
		a.setName("Sunil Kumar ");
		a.setPassword("7895685123");
	    IAdminService ad=new IAdminServiceImp();
	    ad.addNewAdmin(a);
		
		

		Placement p=new Placement();
		p.setId(901);
		LocalDate date=LocalDate.now();
		p.setDate(date);
		p.setQualification("BE");
		p.setCollege(col);
		p.setName("placement creaters group");
		p.setYear(2022);
		IPlacementService placement =new IPlacementServiceImp();
		placement.addPlacement(p);
		service.addStudent(student);
	
	
	
		
	   System.out.println("data is inerted");
		
		
	student = service.searchStudentById(101);
		System.out.println("Id is: "+student.getId());
		System.out.println("Roll is: "+student.getRoll());
		System.out.println("college is: "+student.getCollege());
		
		student = service.searchStudentById(101);
		student.setCollege(col);
		service.updateStudent(student);
		System.out.println("Updated successfully");
	

		
	}

}