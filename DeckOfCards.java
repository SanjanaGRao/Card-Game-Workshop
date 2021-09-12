package com.WorkshopProblem;

import java.util.ArrayList;
import java.util.List;

/*
*  The class DeckOfCards implements the class to initialize the decks, ranks and suits
*  @param cards is a list which contains 52 cards
*  @param suits contains the category of cards - 4
*  @param ranks give the ranks to the suits -13
*  @author Sanjana Rao
*  @since 8-09-2021
*/
public class DeckOfCards 
{
    private List<Cards> numberOfCards;   
	private final List<String> ranks = new ArrayList<String>(List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"));
	private final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	//Constructor to display welcome message as well as initialize the list of cards to 52. 
	public DeckOfCards() 
	{
        System.out.println("Welcome to the Card Game.");
		this.numberOfCards = new ArrayList<Cards>(52);
    }
	
	/*
	 * The method initializeGame is used to initialize the deck
	 * The for loop iterates 52 times and the ranks are assigned to the suits.
	 * For 52 cards, inbuilt function add is used to assign ranks and suits.
	 */
	public void initializeGame()
	{
		 for (int suit = 0; suit < 4; suit++) 
	        {
	            for (int rank = 0; rank < 13; rank++) 
	            {
	            	numberOfCards.add(new Cards(suits[suit],ranks.get(rank))); 
	            	System.out.println(numberOfCards);
	            } 
	        }
	}
}