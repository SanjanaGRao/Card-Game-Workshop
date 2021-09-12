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
	
	public Cards(String suit, String rank) 
	{
	    this.rank = rank;
	    this.suit = suit;
	}
	
	public String getRanks() 
	{
	    return this.rank;
	}
	
	public String getSuits() 
	{
	    return this.suit;
	}	    
}
