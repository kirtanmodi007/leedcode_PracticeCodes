package job_coding;

public class EmployeeNode 
{
	private Employee employee;
	private EmployeeNode next;
	
	//Constructor will require only 1 value.
	//The constructor only takes 1 argument, because at the creation time of first Node
	//We don't know wther the 2nd Node exists or not.
	public EmployeeNode(Employee employee)
	{
		this.employee = employee;
	}

	//Since, our variables are private we have to use SETTERS & GETTERS
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() 
	{
		//From here, we have to call the EMployee class's to string method.
		//To print all the values.
		return employee.toString();
	}
	
	
	
	
	
}
