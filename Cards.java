package com.WorkshopProblem;
/*
*  The class Cards implements the class to initialize and get the decks, ranks and suits.
*  @param suit contains the category of cards - 4
*  @param rank give the ranks to the suits -13
*  @author Sanjana Rao
*  @since 8-09-2021
*/
public class Cards 
{
	private final String rank;
	private final String suit;
	
	//Constructor to initialize suit and rank parameters
	public Cards(String suit, String rank) 
	{
	    this.rank = rank;
	    this.suit = suit;
	}
	
	/*
	 * The method getRanks is used to get the rank
	 * @returns the String value
	 */
	public String getRanks() 
	{
	    return this.rank;
	}
	
	/*
	 * The method getSuits is used to get the suit
	 * @returns the String value
	 */
	public String getSuits() 
	{
	    return this.suit;
	}	    
}
