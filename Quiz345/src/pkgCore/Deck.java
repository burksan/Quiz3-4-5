package pkgCore;

import java.util.Collections;
import java.util.ArrayList;
import pkgCore.Card;

import pkgEnum.eRank;
import pkgEnum.eSuit;


public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	private eRank eRank;
	private eSuit eSuit;

	public Deck(int NumofDeck) {

		for (int deck = 1; deck < NumofDeck; deck++) {
			for (eRank eRank : pkgEnum.eRank.values()) {
				for (eSuit eSuit : pkgEnum.eSuit.values()){
					cards.add(new Card(eSuit, eRank));}
				}
			Collections.shuffle(cards);
		}
	}


	public Card draw() throws Exception {
		if (cards.size() == 0) {
			throw new Exception ("Deck is empty!");
		}
		return (cards.remove(0));
	}
	
	public int DeckSize() {
		return this.cards.size();
	}
	
	public void getRemaining(Object eNum) {
		int cardCountS = 0;
		int cardCountR = 0;
		if (eNum instanceof eSuit) 
			this.eSuit = (eSuit) eSuit;
		for (Card c: this.cards) {
			if (c.geteSuit() == eNum)
				cardCountS++;}
		if (eNum instanceof eRank) 
			this.eRank = (eRank) eRank;
		for (Card c: this.cards) {
			if (c.geteRank() == eNum)
				cardCountR++;}
	}
}