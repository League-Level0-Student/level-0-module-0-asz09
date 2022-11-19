package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
 String input = JOptionPane.showInputDialog("Hello! My name is Jersey Mike Johnson. BEHOLD! My Quiz!!!! Please answer the following question to go on. "
		 		+ "Are you a student with Nick Graham?");
				// 3.  Use an if statement to check if their answer is correct
          int count;
		 if(input.equals("Yes")) {
			  JOptionPane.showMessageDialog(null,
				"Great Job! Go ahead!. You currently have one point.");
				
			// 4.  if the user's answer was correct, add one to their score 
			  count = 1;
		 }
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		 String input1 = JOptionPane.showInputDialog("Now it's Two Time. Please answer the following question."
		 		+ "Do you attend the Carmel Valley location");
					// 3.  Use an if statement to check if their answer is correct
	          int count1;
			 if(input1.equals("No")) {
				  JOptionPane.showMessageDialog(null,
					"Oh no! that was not right, try again.");
					
				// 4.  if the user's answer was correct, add one to their score 
				  count1 = -1;
			 }
    			
		// After all the questions have been asked, tell the user their final score 
			 String input11 = JOptionPane.showInputDialog("quiz complete. Your final answer was 0 points. Do better next time");
	}
}
