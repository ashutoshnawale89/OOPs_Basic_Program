package com.Oops.Program_11thDayAssignm;

public class Deckcard {

	public void Deck() {
		String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

		String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};

		// initialize deck
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
				  System.out.println(deck[SUITS.length*i + j]);
			}
		}
		
	}
	public static void main(String[] args) {
		Deckcard card=new Deckcard();
		card.Deck();
	}
}
