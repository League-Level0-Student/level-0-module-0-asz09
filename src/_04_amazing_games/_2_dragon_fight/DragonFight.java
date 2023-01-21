package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerHealth = 100;
			// playerHealth to store your health - set it equal to 100
	
			// dragonHealth to store the dragon's health - set it equal to 100
		int dragonHealth = 100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int holdAttackStrengths = 100;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
		int playerAttack = -10;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
		int dragonAttack = 0;
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
	JOptionPane.showMessageDialog( null, "Would you dare to fight the Dragon?");
				// 4. If they typed in "yell":
	String input = "yell"; {
		JOptionPane.showMessageDialog(null, "Yelling will not help thou.");
	}
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			int dragonAttack1 = 4;
				// 5. If they typed in "kick":
	String input1 = "kick";{
		 JOptionPane.showMessageDialog(null, "Kicking would help thou who do it correctly.";)
	}
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
		int playerAttack = 20;
				// 6. Subtract the player attack value from the dragon's health

			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
	int dragonAttack = 27;
				// 8. Subtract the dragon attack value from the player's health

			// ASSESS THE DAMAGE

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
	if playerHealth = 0;
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method

			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure


		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!

		System.exit(0);   //This code ends the program
	}

}
