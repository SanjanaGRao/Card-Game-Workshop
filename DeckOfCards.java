package com.WorkshopProblem;
/*
*  The class DeckOfCards implements the class to initialize the decks, ranks and suits
*  @param deckOfCards is a static memory with size 52 for 52 cards.
*  @param suits contains the category of cards - 4
*  @param ranks give the ranks to the suits -13
*  @author Sanjana Rao
*  @since 5-09-2021
*/
public class DeckOfCards 
{
	public static final String[] deckOfCards = new String[52];
    public String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    DeckOfCards[] cards = new DeckOfCards[52];

	// Constructor to print welcome message and intializing decks,suits and ranks
	public DeckOfCards()
	{
		System.out.println("Welcome to the Card Game."); 
		
	}
	
	/*
	 * The method initializeGame is used to initialize deckOfCards
	 * The loop will iterate 52 times.
	 */
	public void initializeGame()
	{
		 for (int i = 0; i < ranks.length; i++)
		 {
	         for (int j = 0; j < suits.length; j++) 
	         {
	             deckOfCards[suits.length*i + j] = ranks[i] + " of " + suits[j];
	         }
		 }
	}

	/*
	 * Main function
	 * Creating an object of class DeckOfCards and calling the function
	 */
	public static void main(String[] args)
	{
		 DeckOfCards game = new DeckOfCards();
		 game.initializeGame();
	}
}


