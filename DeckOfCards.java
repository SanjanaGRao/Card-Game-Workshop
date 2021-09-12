package com.WorkshopProblem;

import java.util.ArrayList;
import java.util.Collections;
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
    private ArrayList<Cards> PlayerCards;   
	private final List<String> ranks = new ArrayList<String>(List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"));
	private final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	//Constructor to display welcome message as well as initialize the list of cards to 52. 
	public DeckOfCards() 
	{
        System.out.println("Welcome to the Card Game.");
		this.PlayerCards = new ArrayList<Cards>(52);
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
	            	PlayerCards.add(new Cards(suits[suit],ranks.get(rank))); 
	            	System.out.println(PlayerCards);
	            } 
	        }
	}
	
	/*
	 * Method shuffleCards is a function to shuffle the cards, everytime we distribute the cards with the Player.
	 * In built method shuffle is used to randomly permute the specified list using a default source of randomness.
	 */
	public void shuffleCards()
	{
		    Collections.shuffle(PlayerCards);
	}
	/*
	 * The method returnCards is getter method to return the cards
	 * @returns an ArrayList of PlayerCards
	 */
    public ArrayList<Cards> returnCards() 
    {
        return PlayerCards;
    }
}