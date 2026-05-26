package luckynumber;

import java.util.Scanner;

public class diceroll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int diceroll = (int)(Math.random()*6)+1;
		 int mychoice = 0;
		
		 do {
			 System.out.println("Enter a numeber between 1 to 6: ");
			 mychoice = sc.nextInt();
			 
			 if(diceroll == mychoice) {
				 System.out.println("YOU WON");
			 }else {
				 System.out.println("YOU LOSE");
			 }
		 }while(diceroll != 6);
		 System.out.println("GAME END");
		 sc.close();
		 
		 

	}

}
