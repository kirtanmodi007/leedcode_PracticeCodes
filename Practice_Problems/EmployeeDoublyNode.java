package job_coding;

//Here, the node will have both prev and next
public class EmployeeDoublyNode 
{
	private Employee employee;
	private EmployeeDoublyNode next;
	private EmployeeDoublyNode prev;
	

	//Make a constructor which acdepts Employee type's data.
	//COnstructor never has a return type. So, need to even mention void.
	public EmployeeDoublyNode(Employee employee)
	{
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeDoublyNode getNext() {
		return next;
	}

	public void setNext(EmployeeDoublyNode next) {
		this.next = next;
	}

	public EmployeeDoublyNode getPrev() {
		return prev;
	}

	public void setPrev(EmployeeDoublyNode prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "EmployeeDoublyNode [employee=" + employee + ", next=" + next + ", prev=" + prev + "]";
	}
	
	//Make overriden toString method to override everything 

	
	
	
	
}
