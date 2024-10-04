package in.nit.workshop;

public class Subject {

    // properties of subject
	public String subjectName;
	public String subjectCode;
	
	// construtor
	public Subject() {
		System.out.println("defualt construtor");
		
	}
	
	//instance method 
	public void getSubjectDetails() {
		System.out.println("this is getSubjectDetails ");
	}
		
		public void getSubjectDetails(String subjectName) {
			System.out.println("this is getSubjectDetasils method");
			System.out.println("subject name:" + subjectName);
			
		}
	
	//to get the length of the given subject
		public void getNumberofChar(String subjectName) {
			System.out.println("finnding the char count");
			System.out.println("subject char count:"+subjectName.length());
			
			
		}
	


}
