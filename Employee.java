
public class Employee {

	private int departmentId = 1;
	private String firstName;
	private String lastName;
	
	public String getInfo () {
		return firstName + " " + lastName + " " + departmentId;
	}
	public void setInfo (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee empl = new Employee();
		empl.setInfo ("Kovalenko", "Ostap");
	
		System.out.println(empl.getInfo());
	}

}
