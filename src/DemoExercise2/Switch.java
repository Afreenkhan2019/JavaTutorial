package DemoExercise2;

import java.util.*;

public class Switch {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		

		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Month number");
		int month = sc.nextInt();
		
		
		switch(month){
        case 1:
        System.out.println("Month is JANUARY");break;
        case 2:
        System.out.println("Month is FEBRUARY");break;
        case 3:
        System.out.println("Month is MARCH");break;
        case 4:
        System.out.println("Month is APRIL");break;
        case 5:
        System.out.println("Month is MAY");break;
        case 6:
        System.out.println("Month is JUNE");break;
        case 7:
        System.out.println("Month is JULY");break;
        case 8:
        System.out.println("Month is AUGUST");break;
        case 9:
        System.out.println("Month is SEPTMBER");break;
        case 10:
        System.out.println("Month is OCTOBER");break;
        case 11:
        System.out.println("Month is NOVEMBER");break;
        case 12:
        System.out.println("Month is DECEMBER");break;
        default:
        System.out.println("Enter number less than 12 for month next time.");

		}
		
		
		System.out.println("Enter the Day number");
		int day = sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("This is first day : Monday");
			break;
		case 2:
			System.out.println("This is second day : Tuesday");
			break;			
		case 3:
			System.out.println("This is third day : Wednesday");
				break;				
		case 4:
			System.out.println("This is fourth day : Thursday");
			break;			
		case 5:
			System.out.println("This is fifth day : Friday");
			break;			
		case 6:
			System.out.println("This is sixth day : Saturday");
			break;			
		case 7:								
			System.out.println("This is seventh day : Sunday");			
			break;
			default:
				System.out.println("Enter number less than 7 for day next time");
		}
	}
}
