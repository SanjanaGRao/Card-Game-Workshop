package com.WorkshopProblem;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
*  The class NoOfPlayers implements the class to get the number of players and initialize cards to them.
*  @param noOfPlayers tells the number of players playing the card game.
*  @author Sanjana Rao
*  @since 11-09-2021
*/
public class NoOfPlayers 
{ 
	private int noOfPlayers;
	private static ArrayList<distributeCards> numberOfPlayers;
    private ArrayList<Integer> sequence;
    private DeckOfCards playerCards;
	
	/*
	 * Constructor is given to initialize the @param noOfPlayers
	 * An object playerCards of class DeckOfCards is created.
	 *  An ArrayList is created of interface distributeCards to distribute class to the number of players.
	 */
	public NoOfPlayers(int noOfPlayers)
	    {
	        this.noOfPlayers = noOfPlayers;
	        playerCards = new DeckOfCards();
	        playerCards.initializeGame();
	        numberOfPlayers = new ArrayList<distributeCards>(noOfPlayers); 
	        for(int i = 0; i < noOfPlayers ; i++)
	        {
	        	numberOfPlayers.add(i,new distributeCards());
	        }
	    }
	
	/*
	 * The method PlayerOrder is the method to sequence the Players order and how they should receive the cards and further order for play.
	 * @param sequence is the ArrayList of integer datatype to sequence players' order.
	 * for loop is used to add the order.
	 * In built method shuffle is used to randomly permute the specified list using a default source of randomness.
	 */
	public void PlayerOrder()
	{
		sequence = new ArrayList<Integer>(noOfPlayers);
	    for(int order=0; order < noOfPlayers; order++)
	    {
	    	sequence.add(order);
	    }
	    Collections.shuffle(sequence);
	}
	
	/*
     * In the method DistributeCards, cards are distributed among players. Each player should have different 9 cards.
     * First the deck is shuffled and an ArrayList is created @param tempCards is used to remove the card given to the player.
     * Then a random number is generated and a card corresponding to that random number is given to the player according to sequence.
     * for loop is used to distribute the cards and initially @param playerCard is used to get the player according to the sequence.
     */
    public void DistributeCards()
    {
    	playerCards.shuffleCards();
        ArrayList<Cards> tempCards = playerCards.returnCards();
        Random random = new Random();  
        for(int i = 0; i < 9 ;i++)
        {
            for(int j = 0; j < noOfPlayers; j++)
            {
               distributeCards playerCard = numberOfPlayers.get(sequence.get(j));
               int x = random.nextInt(tempCards.size());
               playerCard.setCard(tempCards.get(x));
               tempCards.remove(x);
            }
        }  
    } 
    
    /*
     * Method verifyCards gives the number of suits present with each player.
     * for loop is used to display the cards of each player
     * Initially @param spade, @param heart, @param club and @param diamond are initialized to 0.
     * @param j of String type is used to get the suits from each player and switch case is used to count the number of club, spade, heart and diamonds
     * each player has
     * Finally, the statistics is displayed.
     */
    public void verifyCards()
    {   
        for (distributeCards player:numberOfPlayers)
        {
            List<Cards> p = player.getCard();
            int spade=0,heart=0,diamond=0,club=0;
            for(Cards i : p)
            {  
                String j = i.getSuits();
                
                switch(j)
                {
	                case "Spades":spade++;
	                			  break;
	                case "Diamonds":diamond++;
	                				break;
	                case "Hearts":heart++;
	                			  break;
	                case "Clubs":club++;
	                			 break;
	                default: System.out.println("Invalid suit.");
                }
            }
            System.out.println("\n Player Number: "+ (numberOfPlayers.indexOf(player)+1));
            System.out.println(" ----------------");
            System.out.println("No. of Clubs: "+ club);
            System.out.println("No. of Diamonds: "+ diamond);
            System.out.println("No. of Hearts: "+ heart);
            System.out.println("No. of Spades: "+ spade);
        }
    }
    
    /*
     * The method sortCards is used to sort the player Cards before displaying the player Cards
     * for loop is used to get each player and a list is created to get the card present with a player.
     * Second for loop is used to sort the cards, greatest order of cards is put first - descending order
     * @param rank1 and @param rank2 are used to get two cards to be compared.
     * if block compares the ranks of the cards and returns the greatest card and replaces the card in descending order.
     */
    public void sortCards()
    {
        for (distributeCards player:numberOfPlayers)
        {
            List<Cards> p = player.getCard();
            for(int i = 0; i < p.size(); i++)
            {
                for(int j = 0; j < (p.size()-i-1) ; j++)
                {
                    Cards rank1=p.get(j);
                    Cards rank2=p.get(j+1);
                    if(playerCards.compareTheRanks(rank1,rank2)==rank2)
                    {
                        p.set(j, rank2);
                        p.set(j+1,rank1);
                    }   
                }
            } 
         }
     }
    
    /*
     * Method DisplayPlayerCards is used to print the cards present with a player.
     * for loop is used to get each player and @param s returns the set of cards present with a player.
     * Another for loop is used to print each card with its rank and suit.
     */
    public void DisplayPlayerCards()
    {
        for (distributeCards player:numberOfPlayers)
        {
            System.out.println("\n Player No.: "+ (numberOfPlayers.indexOf(player)+1));
            System.out.println(" -------------");
            List<Cards> s = player.getCard();
            for(Cards i : s)
            	System.out.println(i.getRanks()+" of "+i.getSuits());     
        }
    }
}
