package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many days would you like to play for? ");
		int totalSimulations = in.nextInt();
		
		System.out.println("Enter starting amount: ");
		double startAmount = in.nextDouble();
		
		System.out.println("Enter chance of winning: ");
		double winChance = in.nextDouble();
		
		System.out.println("Enter winning limit: ");
		double winLimit = in.nextDouble();
		
		//int winNumber = 0;
		//int loseNumber = 0;
		
		for (int i = totalSimulations; totalSimulations > 0; totalSimulations--) {
		
			while(startAmount > 0 && startAmount < winLimit)
			{
				double random = Math.random();
				
				if (random < winChance) {
					startAmount += 1;
					System.out.println("You won this round!");
					winNumber++;
					}
				else {
					startAmount -= 1;
					System.out.println("You lose this round");
					loseNumber++;
					}
				}
			
			if (startAmount == winLimit) {
					System.out.println("You have reached the win limit!");
					} else {
						System.out.println("You lost.");
					}
			//System.out.println("Number of wins = " + )
		}
		}

}
