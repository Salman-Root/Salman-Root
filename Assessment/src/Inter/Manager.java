package Inter;

public class Manager extends Employee implements CustomerManager,EmployeeManager  {

	@Override
	public void solveIssues() {
		// TODO Auto-generated method stub
		System.out.println("Solve issues");
	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("approve loan");
	}

	@Override
	public void conductMeeting() {
		// TODO Auto-generated method stub
		System.out.println("conduct meeting");
	}

	@Override
	public void setTarget() {
		// TODO Auto-generated method stub
		System.out.println("settarget");
		
	}

	@Override
	public void assignDesignation() {
		// TODO Auto-generated method stub
		System.out.println("assign designation");
	}

	
}
