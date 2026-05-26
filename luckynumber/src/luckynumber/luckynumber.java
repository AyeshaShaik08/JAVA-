package luckynumber;

import java.util.Scanner;

public class luckynumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Luckynumber  = (int) (Math.random() * 100 + 1);
		int choice = 0;
		
		do {
			
			System.out.println("_________SIMPLE CALCULATION_________");
			
			System.out.println(" 1. Addition");
			System.out.println(" 2. substraction");
			System.out.println(" 3. Multiplication");
			System.out.println(" 4. Division");
			System.out.println(" 5. exit");
		
		if (choice >= 1 && choice <= 4) {
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			System.out.println("Enter First Number: ");
			double a = sc.nextDouble();

			System.out.println("Enter Second Number: ");
			double b = sc.nextDouble();

	
			switch(choice) {
			case 1 :
				System.out.println("Result = "+(a+b));
				break;
				
			case 2 :
				System.out.println("Result = "+(a-b));
				break;
			
			case 3 :
				System.out.println("Result = "+(a*b));
				break;
			
			case 4 :
				if(b!=0) {
				System.out.println("Result = "+(a/b));
				}else {
			System.out.println("Cannot divisible by zero");
				
			}
				
			break;
		}
			
			
			
			
			
	}else if (choice==5){
		System.out.println("calculator closed");
	}else {
		System.out.println("Invalid number");
		
	}
		
	
		}while(choice != 5);
		sc.close();
			
	}

}
