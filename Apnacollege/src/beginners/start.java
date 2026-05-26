package beginners;

import java.util.Scanner;

public class start {

	public static void main(String[] args) {

		
		//MINI PROJECT
		Scanner sc = new Scanner(System.in);
		int myNumber = (int)(Math.random()*100);
		int userNumber = 0;
		
		do {
			System.out.println("Guess the Number: ");
			userNumber = sc.nextInt();
			if(userNumber == myNumber ) {
				System.out.println("YEAH HOO");
				break;
		}
		else if(userNumber> myNumber) {
			System.out.println("Number is too large");
		}
		else
			System.out.println("Number is too small");
		
		
		
	}while(userNumber >= 0); 
		System.out.print("this is my number: ");
		System.out.println(myNumber);
}
}