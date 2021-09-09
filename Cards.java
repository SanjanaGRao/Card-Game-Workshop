package com.WorkshopProblem;

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

