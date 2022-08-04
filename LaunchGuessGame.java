package com.training.assignments.two;

import java.util.Scanner;
//This class will guess the numbers between 1 to 10. If its not between the given range it will be asking the both the players and gusser to re-guess the number

class Gusser {
	int guessNumber;
	public int guesserGuessNumber() {
		System.out.println("Guesser, Please guess the number between 1 to 10");
		Scanner scan = new Scanner(System.in);
		guessNumber = scan.nextInt();
		return guessNumber;
	}
}

class Player {
	int guessNumber;
	public int playerGuessNumber() {
		System.out.println("Player, Please guess the number between 1 to 10");
		Scanner scan = new Scanner(System.in);
		guessNumber = scan.nextInt();
		return guessNumber;
	}
}

class Mediator {
	int gusserNumber;
	int player1Number;
	int player2Number;
	int player3Number;
	
	void mediatorGuessGuesserNumber() {
		Gusser g = new Gusser();
		gusserNumber = g.guesserGuessNumber();
		if (gusserNumber >=0 && gusserNumber<=10) {
			System.out.println("Gusser guess is saved");
		} else {
			System.out.println("The gussed number is not between 1 to 10. Hence please retry the guess");
			gusserNumber = g.guesserGuessNumber();
		}
		
	}
	void mediatorGuessPlayer1Number() {
		Player p1 = new Player();
		player1Number = p1.playerGuessNumber();
		if (player1Number >=0 && player1Number<=10) {
			System.out.println("Player1 guess is saved");
		} else {
			System.out.println("The gussed number is not between 1 to 10. Hence please retry the guess");
			player1Number = p1.playerGuessNumber();
		}
		
	}
	void mediatorGuessPlayer2Number() {
		Player p2 = new Player();
		player2Number = p2.playerGuessNumber();
		if (player2Number >=0 && player2Number<=10) {
			System.out.println("Player2 guess is saved");
		} else {
			System.out.println("The gussed number is not between 1 to 10. Hence please retry the guess");
			player2Number = p2.playerGuessNumber();
		}
	}
	void mediatorGuessPlayer3Number() {
		Player p3 = new Player();
		player3Number = p3.playerGuessNumber();
		if (player3Number >=0 && player3Number<=10) {
			System.out.println("Player3 guess is saved");
		} else {
			System.out.println("The gussed number is not between 1 to 10. Hence please retry the guess");
			player3Number = p3.playerGuessNumber();
		}
	}
	
	void announceTheWinner() {
		if (gusserNumber == player1Number) {
			if (gusserNumber == player2Number && gusserNumber!= player3Number) {
				System.out.println("Player 1,2 are thw Winners!!!");
			} else if (gusserNumber != player2Number && gusserNumber== player3Number) {
				System.out.println("Player 1,3 are the Winners!!!!!");
			} else if (gusserNumber == player2Number && gusserNumber== player3Number) {
				System.out.println("All the players gussed it right!!!!!");
			} else {
				System.out.println("Player1 is the Winner!!!!!!!!!!!!!!!!!");
			}
		} else if (gusserNumber == player2Number) {
			if (gusserNumber == player3Number) {
				System.out.println("Player 2 and 3 are the Winners!!!!!!!!!!!!!1");
			} else {
				System.out.println("Player 2 is the Winner!!!!!!!!!1");
			}
			
		} else if (gusserNumber == player3Number){
			System.out.println("Player 3 is the Winner!!!!!!!111");
		} else{
			System.out.println("There are no Winners. Please retry");
		}
	}
	
}

public class LaunchGuessGame {
	public static void main(String[] args) {
		Mediator med = new Mediator();
		med.mediatorGuessGuesserNumber();
		med.mediatorGuessPlayer1Number();
		med.mediatorGuessPlayer2Number();
		med.mediatorGuessPlayer3Number();
		med.announceTheWinner();
	}
	

}
