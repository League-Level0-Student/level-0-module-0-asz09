package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
 String input = JOptionPane.showInputDialog("Hello! I am Osvaldo Ruiz. BEHOLD! My Quiz!!!! Please answer the following question to go on. "
		 		+ "Are you a student with Nick Graham Crackers?");
				// 3.  Use an if statement to check if their answer is correct
          int count = 0;
		 if(input.equals("Yes")) {
			  JOptionPane.showMessageDialog(null,
				"Great Job! Go ahead!. You currently have one point.");
			  
				
			// 4.  if the user's answer was correct, add one to their score 
			  count = 1;
		 }
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		 String input1 = JOptionPane.showInputDialog("Now it's Two Time. Please answer the following question."
		 		+ "Do you attend the League's Carmel Valley location");
					// 3.  Use an if statement to check if their answer is correct
	          ;
	          if(input1.equals("Yes"))
	        	  JOptionPane.showMessageDialog(null,
	  					"Congrats! Onward");
			 if(input1.equals("No")) {
				  JOptionPane.showMessageDialog(null,
					"Oh no! that was not right. Move along...");
				  
				  
				// 4.  if the user's answer was correct, add one to their score 
				  count = count - 1 ;
			 }
    			
		// After all the questions have been asked, tell the user their final score 
			 String input11 = JOptionPane.showInputDialog("quiz complete. Your final answer was 0 point(s). Would you like"
			 		+ " us to send the results to Mike Johnson?");
	}
}
