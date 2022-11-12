package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("Hello! Do you know how to write code?");

		// 2. If they say "yes", tell them they will rule the world.
		if(input.equals("Yes")) {
			  JOptionPane.showMessageDialog(null,
				"You shall rule this world one day!.");
			  }
		else {
			//no response
			JOptionPane.showMessageDialog(null,
					"You are not going to rule this world. I recommend you to enroll into a class "
					+ "with Mike Johsnon at the League of Amazing Programmers. Then, maybe that will change in the future.");
			
		
		}
		
	}
	
	








}

