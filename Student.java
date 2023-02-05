package week1.Assignment;

public class Student {
	
	String studentName="Nandhu";
	String collegeName="PSG";
	int rollno=101;
	int markscored=587;
	float cgpa=4.8f;
	
  public void report() {
	  
	System.out.println("The student name is"+ studentName);  
	System.out.println("The college name is"+ collegeName);  
	System.out.println("Roll no is"+ rollno);  
	System.out.println("Marks scored is"+ markscored);  
	System.out.println("Cgpa is"+ cgpa);  
	         
  }
	
   public static void main(String[] args) {
		Student st=new Student();
		st.report();

	}

}
