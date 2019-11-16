import java.util.Scanner;

/*
 * Aristotle chatbot 
 * @Authors -- Josh Jaskolski, Chad Falkenberg, Taylor Hammes, Kallen Marcavage, Dawson McKenzie
 * 
 * This bot is designed to take in user input, analyze the words used, and make a reply roughly based on what was said
 * The focus of the topics of the bot is ethics, specifically the ethical ideas that Aristotle invented
 * 
 * Last edited -- 5:34 11/16
 */

public class Aristotle {

	
	public static void main(String[] args){
		
		System.out.println("Hello my child, I am Aristotle, what would you like to talk about? ");
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		System.out.println(input);
	}
}
