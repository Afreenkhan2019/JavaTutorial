package DemoExercise2;

import java.util.*;

import Assignment.Employee;

public class Test111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Taking Number Of Employees From The User.
		System.out.println("How many employees are there: ");
		int numberOfEmployees = scan.nextInt();
		scan.nextLine(); // <- reads the newline from the console

		//Creating An Array With The Size Of Employees Entered By The User.
		Employee1[] E = new Employee1[numberOfEmployees];

		// Filling Out Information About Employees In Array.
		for(int i = 0; i <= E.length-1; i++){
		    System.out.println("Enter employee " + i + "'s name: ");
		    String name = scan.nextLine();
		    
		    System.out.println("Enter employee " + i + "'s birth date: ");
		    String bday = scan.nextLine();
		    
		    System.out.println("Enter employee " + i + "'s salary: ");
		    double salary = scan.nextDouble();
		    
		    System.out.println("Enter employee " + i + "'s overtime: ");
		    int overtime = scan.nextInt();
		    
		     //create a new employee with the entered information and save in the array
		    E[i] = new Employee1(name, bday, salary, overtime);
		    
		    E[i].showdata();
		   
		}
		 
	}
	
}

