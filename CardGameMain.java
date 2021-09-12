package com.WorkshopProblem;

import java.util.Scanner;
/*
*  The class CardGameMain has a Main function
*  @param numberOfPlayers asks the user to input the number of players between 2 - 4.
*  Once the number of players are obtained, cards are initialized and distributed.
*  @author Sanjana Rao
*  @since 11-09-2021
*/
public class CardGameMain 
{
	public static void main(String[] args) 
	{
		 int numberOfPlayers;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number of players: ");
	     numberOfPlayers = sc.nextInt();
	     if(numberOfPlayers < 2||numberOfPlayers > 4)
	        {
	            System.out.println("Number of players can only be between 2 to 4.");
	            numberOfPlayers = sc.nextInt();
	        }
	     NoOfPlayers player = new NoOfPlayers(numberOfPlayers);	
	     sc.close();
	}
}
