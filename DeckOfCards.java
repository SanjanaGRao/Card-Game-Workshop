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
    public static final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public static final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static String[][] cards = new String[suits.length][ranks.length];

	// Constructor to print welcome message
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
	             cards[i][j] = ranks[j];
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


