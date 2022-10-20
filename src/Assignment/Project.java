package Assignment;

public class Project {
	private String project;
	final String startDate = "23-02-2021";
	final String endDate = "23-02-2030";

	
	
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

}
