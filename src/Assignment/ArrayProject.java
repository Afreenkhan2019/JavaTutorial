package Assignment;

public class ArrayProject {
	private String project;
	final String startDate = "23-02-2021";
	final String endDate = "23-02-2030";

	public ArrayProject(String project) {
		this.project=project;
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	public void EmpProject() {
		System.out.println(" Assigned Project : " +project+"\n Start Date of "
	+project+" is - : " +startDate+"\n End Date of "
	+project+" is - : " +endDate);
	}
	public void EmpProject1(String project) {
		System.out.println(" Assigned Project : " +project+"\n Start Date of "
	+project+" is - : " +startDate+"\n End Date of "
	+project+" is - : " +endDate);
	}
}
