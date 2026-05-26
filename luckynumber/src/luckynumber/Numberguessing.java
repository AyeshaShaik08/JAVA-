package luckynumber;

import java.util.Scanner;

public class Numberguessing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int computerchoice = (int)(Math.random()*10)+1;	
		int  mychoice= 0;
		do {
		System.out.println("Guess the Number: ");
		mychoice = sc.nextInt();
		
		if(computerchoice == mychoice) {
			System.out.println(" It MATCHED");
			
		}else {
			System.out.println("It NOT MATCHED");
		}
			
			
		}while(computerchoice != mychoice);
		
		System.out.println("ENDED");
		sc.close();
		
		
		

	}

}
