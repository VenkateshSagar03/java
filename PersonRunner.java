package in.nit.workshop;

public class PersonRunner {

	public static void main(String[] args) {
		
		System.out.println("main method is started");
		
		//assign the value
		Person.country ="india";
		Person.state ="Karnataka";
		System.out.println("country is:"+Person.country);
		System.out.println("state is:"+Person.state);
		
		// create object
		Person person = new Person();
		person.personName = "Venkatesh Sagar";
		person.qualificaton = "B.E";
		person.panCardNumber = "0307";
		person.AadharcardNumber ="1234 5678 0307";
		
		System.out.println("person name is:"+person.personName);
		System.out.println("qualification:"+person.qualificaton);
		System.out.println("panCardNumber:"+person.panCardNumber);
		System.out.println("AadharcardNumber:"+person.AadharcardNumber);
		
		// invoke the method
		Person.displayInfo();
		person.getInformation();
		
		
	}

}
