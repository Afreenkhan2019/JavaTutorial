package Assignment;

public class EmpDetail {
	private String eName;
	private String eTech;
	
	
	public EmpDetail(String eName, String eTech) {
		this.eName=eName;
		this.eTech=eTech;
		
	}


	public String geteTech() {
		return eTech;
	}


	public void seteTech(String eTech) {
		this.eTech = eTech;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public void showEmpdetail() {
		System.out.println();
		System.out.println(" Employee Name : "+eName +"\n Employee Technology : "+eTech);
	}
}
