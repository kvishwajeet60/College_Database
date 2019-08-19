package main;
import java.util.Scanner;

class Courses {
	public String displayCourseDetails(String dept) {			
			return "You have chosen "+dept+" department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\n";
		}
}

class ECE extends Courses { 
	public String displayCourseDetails(String dept) {
		
		String commonSubjects = new Courses().displayCourseDetails(dept);//commonSubjects
		String subject1 = "Microprocessor"; //specific subject
		String subject2 = "Linear Integrated Circuits"; //specific subjects
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;
		
	}
}
class Mechanical extends Courses{ 
	public String displayCourseDetails(String dept) {
		
		String commonSubjects = new Courses().displayCourseDetails(dept);//commonSubjects
		String subject1 = "Fluid Mechanics"; //specific subject
		String subject2 = "Thermodynamics"; //specific subject
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;	
	
	}

}
class CSE extends Courses { 
	public String displayCourseDetails(String dept) {		
		
		String commonSubjects =  new Courses().displayCourseDetails(dept);//commonSubjects
		String subject1 = "Network Theory"; //specific subject
		String subject2 = "Operating Systems"; //specific subject
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;		
	}
}

public class Question1 {
	public static void main(String[] args){
		System.out.println("Departments:");
		System.out.println(" 1) ECE \n 2) Mechanical \n 3) CSE");
		System.out.println("Choose the department:");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		//Question1 mn=new Question1();
		switch(choice) {
		case 1:
		{
			//this case is or ECE
			//Initialize the Class using appropriately taking the concept of inheritence and polymorphism in mind.
			Courses c1 = new ECE();
			System.out.println(c1.displayCourseDetails("ECE"));//call the function of the class that you initialized
			break;
		}
		case 2:
		{
			//this case is or Mechanical
			//Initialize the Class using appropriately taking the concept of inheritence and polymorphism in mind.
			Courses c2 = new Mechanical();
			System.out.println(c2.displayCourseDetails("Mechanical"));//call the function of the class that you initialized
			break;
		}
		case 3:
		{
			//this case is or CSE
			//Initialize the Class using appropriately taking the concept of inheritence and polymorphism in mind.
			Courses c3 = new CSE();
			System.out.println(c3.displayCourseDetails("CSE"));//call the function of the class that you initialized
			break;
		}
		default:
			System.out.println("Invalid input!");
		break;
		}
	}
}