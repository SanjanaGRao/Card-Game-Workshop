package com.WorkshopProblem;

import java.util.ArrayList;
import java.util.List;
/*
*  A class distributeCards is created to initialize card for the players.
*  An ArrayList is created of with size 9 because each player needs to have 9 cards each.
*  @author Sanjana Rao
*  @since 11-09-2021
*/
public class distributeCards 
{
	ArrayList<Cards> distributeCards = new ArrayList<Cards>(9);
	
	/*
    * The method getCard gets the card - getter method 
    * @returns the list containing cards
    */
   public List<Cards> getCard()
   {
       return this.distributeCards;
   }
   
   /*
    * Method setCard adds a value to the card
    * @param a is the card value
    */
   public void setCard(Cards a)
   {
       this.distributeCards.add(a);
   }
}
