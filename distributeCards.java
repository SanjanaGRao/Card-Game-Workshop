package com.WorkshopProblem;

import java.util.ArrayList;
/*
*  An interface distributeCards is created to initialize card for the players.
*  An ArrayList is created of with size 9 because each player needs to have 9 cards each.
*  @author Sanjana Rao
*  @since 11-09-2021
*/
public interface distributeCards
{
	ArrayList<Cards> distributeCards = new ArrayList<Cards>(9);
}
