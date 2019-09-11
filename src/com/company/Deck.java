package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        this.createDeck();
    }

    private void createDeck() {
        this.cards = new ArrayList<>();
        for (int i = 0; i <= 14; i++) {
            switch (i) {
                case 2:
                    cards.add(new Card("Two", "Heart", i));
                    cards.add(new Card("Two", "Spade", i));
                    cards.add(new Card("Two", "Club", i));
                    cards.add(new Card("Two", "Diamond", i));
                    break;
                case 3:
                    cards.add(new Card("Three", "Heart", i));
                    cards.add(new Card("Three", "Spade", i));
                    cards.add(new Card("Three", "Club", i));
                    cards.add(new Card("Three", "Diamond", i));
                    break;
                case 4:
                    cards.add(new Card("Four", "Heart", i));
                    cards.add(new Card("Four", "Spade", i));
                    cards.add(new Card("Four", "Club", i));
                    cards.add(new Card("Four", "Diamond", i));
                    break;
                case 5:
                    cards.add(new Card("Five", "Heart", i));
                    cards.add(new Card("Five", "Spade", i));
                    cards.add(new Card("Five", "Club", i));
                    cards.add(new Card("Five", "Diamond", i));
                    break;
                case 6:
                    cards.add(new Card("Six", "Heart", i));
                    cards.add(new Card("Six", "Spade", i));
                    cards.add(new Card("Six", "Club", i));
                    cards.add(new Card("Six", "Diamond", i));
                    break;
                case 7:
                    cards.add(new Card("Seven", "Heart", i));
                    cards.add(new Card("Seven", "Spade", i));
                    cards.add(new Card("Seven", "Club", i));
                    cards.add(new Card("Seven", "Diamond", i));
                    break;
                case 8:
                    cards.add(new Card("Eight", "Heart", i));
                    cards.add(new Card("Eight", "Spade", i));
                    cards.add(new Card("Eight", "Club", i));
                    cards.add(new Card("Eight", "Diamond", i));
                    break;
                case 9:
                    cards.add(new Card("Nine", "Heart", i));
                    cards.add(new Card("Nine", "Spade", i));
                    cards.add(new Card("Nine", "Club", i));
                    cards.add(new Card("Nine", "Diamond", i));
                    break;
                case 10:
                    cards.add(new Card("Ten", "Heart", i));
                    cards.add(new Card("Ten", "Spade", i));
                    cards.add(new Card("Ten", "Club", i));
                    cards.add(new Card("Ten", "Diamond", i));
                    break;
                case 11:
                    cards.add(new Card("Knight", "Heart", i));
                    cards.add(new Card("Knight", "Spade", i));
                    cards.add(new Card("Knight", "Club", i));
                    cards.add(new Card("Knight", "Diamond", i));
                    break;
                case 12:
                    cards.add(new Card("Queen", "Heart", i));
                    cards.add(new Card("Queen", "Spade", i));
                    cards.add(new Card("Queen", "Club", i));
                    cards.add(new Card("Queen", "Diamond", i));
                    break;
                case 13:
                    cards.add(new Card("King", "Heart", i));
                    cards.add(new Card("King", "Spade", i));
                    cards.add(new Card("King", "Club", i));
                    cards.add(new Card("King", "Diamond", i));
                    break;
                case 14:
                    cards.add(new Card("Ace", "Heart", i));
                    cards.add(new Card("Ace", "Spade", i));
                    cards.add(new Card("Ace", "Club", i));
                    cards.add(new Card("Ace", "Diamond", i));
                    break;
            }
        }
    }

    Card giveCard() {
        Random random = new Random();
        int num = random.nextInt(cards.size());
        if(num >= 0 && num <= cards.size()) {
            return cards.remove(num);
        }
        return new Card();
    }

    void shuffle() {
        Random random = new Random();
        int count = 0;
        while(count < cards.size()*1000) {
            int nr = random.nextInt(cards.size());
            Card temp = cards.get(nr);
            cards.remove(temp);
            cards.add(temp);
            count++;
        }
    }

    void printDeck() {
        for(Card card : cards) {
            System.out.println(card);
        }
    }
}
