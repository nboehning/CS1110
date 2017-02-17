package homework.HW7;

import java.util.Random;
import java.util.Scanner;

// Author: Nathan Boehning
// Purpose: Create a hangman game
public class Prob3 
{
	static String words[] = {"dragon", "keyboard", "sword", "shield", "gate", "controller", "pirate", };
	static StringBuilder answer;
	static StringBuilder shownAnswer;
	static StringBuilder guesses;
	
	public static void main(String[] args) 
	{
		boolean playAgain = true;
		
		// Start scanner
		Scanner scan = new Scanner(System.in);
		while(playAgain)
		{
			// Misc variables
			boolean gameDone = false;
			int numWrong = 0;
		
			// Randomly generate a number and assign corresponding index of words array to answer
			Random rand = new Random();
			int val = rand.nextInt(words.length);
		
			// Set the answer to the chosen word, assign that to a public answer, loop through and change all letters to *'s.
			answer = new StringBuilder(words[val]);
			shownAnswer = new StringBuilder(answer);
			
			// Resets the guesses between rounds
			guesses = new StringBuilder();
			
			System.out.println("shownAnswer: " + shownAnswer);
			for(int i = 0; i < shownAnswer.length(); i++)
			{
				shownAnswer.setCharAt(i, '*');
			}
						
			while(!gameDone)
			{
				System.out.print("(Guess) Enter a letter in word " + shownAnswer + ">");
				// Stores only the first character if multiple characters are inputed
				char guess = scan.nextLine().charAt(0);
					
				// Forces the character to lower case. No upper case needed. Would cause wrong answer even if letter was in word. 
				guess = Character.toLowerCase(guess);
				
				// See if users guess has already been guessed
				if(checkAlreadyGuessed(guess))
				{
					System.out.println(guess + " is already in the word.");
				}
				else
				{
					// Hasn't been guessed yet, add it to the guess array
					guesses.setLength(guesses.length() + 1);
					guesses.setCharAt(guesses.length() - 1, guess);
				
					// Check guess, if it's not in word output it and increment numWrong, otherwise check if game is over
					if(!checkGuess(guess))
					{
						System.out.println(guess + " is not in the word.");
						numWrong++;
					}
					else
					{
						gameDone = isGameDone();
					}
				}
			}
		
			// Switch statement to make it grammatically correct
			switch(numWrong)
			{
				case 1:
					System.out.println("The word is " + answer + ". You missed " + numWrong + " time.");
					break;
				default:
					System.out.println("The word is " + answer + ". You missed " + numWrong + " times.");
				break;
			}

			// See if player wants to play again
			boolean deciding = true;
			while(deciding)
			{
				// Prompt and get response
				System.out.print("Do you want to guess another word? (y/n)>");
				char response = scan.nextLine().charAt(0);
				
				// force to lower in case they did upper case
				response = Character.toLowerCase(response);
				
				// switch on the response and change the booleans accordingly
				switch(response)
				{
					case 'y':
						deciding = false;
						break;
					case 'n':
						deciding = false;
						playAgain = false;
						break;
					default:
						System.out.println("Invalid choice.");
						break;
				}
			}

		}
		
		System.out.println("Thanks for playing!");
		
		// Close the scanner
		scan.close();
	}

	// Checks if the game has been complete
	static boolean isGameDone()
	{
		boolean isDone = true;
		// Loops through and checks if any character in the shown answer is an '*'
		for(int i = 0; i < shownAnswer.length(); i++)
		{
			if(shownAnswer.charAt(i) == '*')
			{
				// If there is a '*' the game isn't done yet
				isDone = false;
				break;
			}
		}
		return isDone;
	}
	
	// See if player has already guessed that letter
	static boolean checkAlreadyGuessed(char c)
	{
		// Loop through guesses, if it's already been guessed return true
		for(int i = 0; i < guesses.length(); i++)
			if(guesses.charAt(i) == c)
				return true;
		
		// Otherwise it hasn't been guessed and return false
		return false;
	}
	
	// Check if the players guess is in the word
	static boolean checkGuess(char c)
	{
		boolean isIn = false;
		for(int i = 0; i < answer.length(); i++)
		{
			if(answer.charAt(i) == c)
			{
				isIn = true;
				shownAnswer.setCharAt(i, c);
			}
		}
		
		return isIn;
	}
}
