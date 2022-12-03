package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("Hello World! I am a random thing floating in space that has found a computer in a crater on the moon. "
			+ "Don't worry, I am harmless, but can cause harm if told to vote for this random person on Earth named Nick Graham for the so called \"president\"");
	
	String input = JOptionPane.showInputDialog("Welcome to the Presidential Database, What is your political party and name?");
	JOptionPane.showMessageDialog(null,"Hello "+input);
}}

