package _06_Card_Game;

import java.util.ArrayList;
import java.util.Random;

public class CardDealer {
    
    ArrayList<Card> deck;

    public void populateDeck() {
    	deck=new ArrayList<Card>();
    	for(Suit i: Suit.values()) {
    		for(Rank j: Rank.values()) {
    			Card card=new Card(j, i);
    			deck.add(card);
    		}
    	}
    }
    public void shuffle() {
    	for(int i=0; i<52; i++) {
    	Random rand=new Random();
    	int randomNumber=rand.nextInt(53);
    	int randomNumber2=rand.nextInt(53);
    	if(!(randomNumber==randomNumber2)) {
    		Card firstCard=deck.get(randomNumber);
    		Card secondCard=deck.get(randomNumber2);
    		deck.set(randomNumber2, firstCard);
    		deck.set(randomNumber, secondCard);
    	}
    	}
    }
}
