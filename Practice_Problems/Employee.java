package job_coding;

public class Employee 
{

	private String firstName;
	private String lastName;
	private int id;
	
	
	public Employee(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	
	/*
	 * By default in JAVA every class extends Object class.
	 * Now this object class has a toString method.
	 * Everytime when you try to print an object it will by default call toString method
	 * EX:
	 * 	System.out.println(myObj);
	 * This will be by default considered like this
	 * 	System.out.println(myObj.toString());
	 * That's why we have to overrride the toString method.
	 * Because the original toString() method is in Object class. WHich is SUPER CLASS for us.
	 * Now, if your subclass also has the same method, then by using subclass's toString method
	 * You are going to override the SUPER CLASS's toString Method.
	 * You can make any changes you want in your to String method.
	 * 
	 * In, Java when we try to print an OBJECT it will by default call the toString method.
	 * If our class doesn't have the toString method, it will jump to object class's toString method.
	 * That's why in order to use our OWN toString method, we have OVERRIDE the 
	 * Object CLASS's toString method.
	 */

	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}
}
