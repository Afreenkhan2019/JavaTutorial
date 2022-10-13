package DemoExercise;

public class Phone {

	   public String brand;
	   public String model;
	   public String color;
	   public int ramStorage;
	   public int totalMemory = 100;
	   public String playTone;
	   public int usedMemory;
	   
	  
	   public Phone(int usedMemory) {
		   this.usedMemory= usedMemory;
		   System.out.println("Constructor without parameters.");
	   }
	   
//	   public Phone(String color, String brand, String model){
//		   System.out.println("Constructor with color, brand & model");
//		   this();
//		}//====>this is not properly implemented

	   public Phone(int ramStorage, int totalMemory, String playTone){
		   this.ramStorage = ramStorage;
		   this.totalMemory = totalMemory;
		   this.playTone=playTone;
		   System.out.println("Constructor with ram storage in GB is : "+ramStorage+" totalMemory(GB) : "+totalMemory+" PlayTone is : " +playTone);
	   }
	   
	   public Phone(String brand, String model){
		   this.brand = brand;
		   this.model = model;
		   System.out.println("Constructor with "+brand+" & "+model);
	   }
//	   public void display() {
//		   
//		   System.out.println("The current brand value is "+brand+" and model is "+model);
//	   }
	   
	   public void clearMemory(int usedMemory) {
		   this.usedMemory=0;
		   System.out.println("When memory is Clear then totalmemory = "+this.usedMemory);
	   } 
	   
	   public void setFullMemory(int usedMemory) {
		   this.usedMemory= totalMemory;
		   System.out.println("When memory is full then: totalmemory = "+totalMemory);
	   }
	   
	   public static void main(String []args) {
	       Phone p = new Phone("Samsung","Black");
		   
		   
		   Phone iPhone5= new Phone(50);
		   //iPhone5.display();
		   
		   iPhone5.setFullMemory(50);
		   iPhone5.clearMemory(0);
	   }
	  }



