package _03_print_and_popups._2_madlibs;
     
import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  " If you find yourself trapped in a room with Nick Graham doing fun coding projects for an hour and a half. What will you use and do? Try to finish in 10 minutes, or else........";
		
		// Get the player to enter an adjective
		String adj = JOptionPane.showInputDialog("Welcome to MadLibs.jpeg, Player 1! Please enter an adjective to begin :)");
		// Get the player to enter a type of liquid
		String liq = JOptionPane.showInputDialog("Player 1, please enter a kind of likwid");
		// Get the player to enter a body part
		String bdp = JOptionPane.showInputDialog("Player 1, please enter a random body part. Keep it appropritate!");
		// Get the player to enter a verb
		String vrb = JOptionPane.showInputDialog("Player 1, please enter a random activity");
		// Get the player to enter a place
		String plc = JOptionPane.showInputDialog("Player 1, please enter a place.");
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		String story = 
		"So you find yourself in a lit room with multiple Macs with 3 kids and a bottle of " +liq
		+". "   +
		"You are working on Java Projects, and suddenly, a random guy in glasses named Osvaldo Ruiz\n"
		+ " kicks down the classroom door. Glass shards fly everywhere. "  +
		"He first yells WHERE IS MIKE JOHNSON!!!!!!!!!!!!!!!. If you do not tell him, he will blow "
		+ "a punch at your " +bdp+". "   +   
		"Acccording to past survivors, "
		+ "Osvaldo will also punch you if you mention " +vrb+". "   + 
		"According to survivors, he is only known to calm down if you tell him where "+plc+" is. "    ;
		
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		JOptionPane.showMessageDialog(null,story);
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	}
}