package com.WorkshopProblem;

import java.util.ArrayList;
import java.util.Collections;
/*
*  The class NoOfPlayers implements the class to get the number of players and initialize cards to them.
*  @param noOfPlayers tells the number of players playing the card game.
*  @author Sanjana Rao
*  @since 11-09-2021
*/
public class NoOfPlayers 
{ 
	private int noOfPlayers;
	
	/*
	 * Constructor is given to initialize the @param noOfPlayers
	 * An object playerCards of class DeckOfCards is created.
	 *  An ArrayList is created of interface distributeCards to distribute class to the number of players.
	 */
	public NoOfPlayers(int noOfPlayers)
	    {
	        this.noOfPlayers = noOfPlayers;
			DeckOfCards playerCards = new DeckOfCards();
	        ArrayList<distributeCards> numberOfPlayers = new ArrayList<distributeCards>(noOfPlayers);    
	    }
	
	/*
	 * The method PlayerOrder is the method to sequence the Players order and how they should receive the cards and further order for play.
	 * @param sequence is the ArrayList of integer datatype to sequence players' order.
	 * for loop is used to add the order.
	 * In built method shuffle is used to randomly permute the specified list using a default source of randomness.
	 */
	public void PlayerOrder()
	{
		ArrayList<Integer> sequence = new ArrayList<Integer>(noOfPlayers);
	    for(int order=0; order<noOfPlayers; order++)
	    {
	    	sequence.add(order);
	    }
	    Collections.shuffle(sequence);
	}
}
