package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("___________CALCULATOIN____________");
			
			System.out.println("1.Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
		   
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			if(choice >=1 && choice <=4 ) {
				System.out.println("Enter your first Number: ");
				double a = sc.nextDouble();
				
				System.out.println("Enter yout Second Number: ");
				double b = sc.nextDouble();
				
				switch(choice) {
				case 1 :
					System.out.println("Result = "+(a+b));
					
				case 2 :
					System.out.println("Result = "+(a-b));
				
				case 3 :
					System.out.println("Result = "+(a*b));
				
				case 4 :
					if(b!=0) {
					System.out.println("Result = "+(a/b));
					}else {
				System.out.println("Cannot divisible by zero");
					
				}
					
				break;
			}
		}else if(choice==5){
			System.out.println("calculator closed");
		}else {
			System.out.println("Invalid number");
		}
		
		}while(choice !=5);
		sc.close();

	}

}

