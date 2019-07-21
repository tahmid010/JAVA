import static java.lang.System.out;
class EncapSulation
{
	public static void main(String args[])
	{
		Emp E1 = new Emp();
		Emp E2 = new Emp();
		
		E1.setEmpId(01);
		E1.setEmpName("Tahmid");
		
		E2.setEmpId(02);
		E2.setEmpName("Rahman");
		
		out.println(E1.getEmpId());
		out.println(E1.getEmpName());
		
		out.println(E2.getEmpId());
		out.println(E2.getEmpName());
	}
}

class Emp
{
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}	
}