package Assignment;

public class ArrayEmpDetail {	

	private String eName;
	private String eTech1;
	private String eTech2;
	
	public ArrayEmpDetail(String eName, String eTech1) {
		this.eName=eName;
		this.eTech1=eTech1;		
	}
	public ArrayEmpDetail(String eName, String eTech1, String eTech2) {
		this.eName=eName;
		this.eTech1=eTech1;
		this .eTech2=eTech2;		
	}

	public String geteTech1() {
		return eTech1;
	}
	
	public void seteTech1(String eTech1) {
		this.eTech1 = eTech1;
	}

	public String geteTech2() {
		return eTech2;
	}


	public void seteTech2(String eTech2) {
		this.eTech2 = eTech2;
	}

	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public void showEmpdetail1() {
		System.out.println();
		System.out.println(" Employee Name : "+eName +"\n Employee Technology : "+eTech1);
	}
	public void showEmpdetail2() {
		System.out.println();
		System.out.println(" Employee Name : "+eName +"\n Employee Technology 1 : "+eTech1+" , "+eTech2);
	}
}


