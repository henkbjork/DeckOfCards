package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        menu();

        while (!quit) {
            int number = scanner.nextInt();
            switch (number) {
                case 0:
                    System.out.println("Exiting the program");
                    quit = true;
                    break;
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.shuffle();
                    break;
                case 3:
                    System.out.println("Your card is: " + deck.giveCard());
                    break;
                case 4:
                    System.out.println("Unique hands to get a royal straight flush in on hand: " + royalStraightFlush());
                    break;
                case 5:
                    menu();
                default:
                    System.out.println("Invalid input, try again");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Options: " + "\n" +
                "Enter 0: Exit the program" + "\n" +
                "Enter 1: Print deck of cards" + "\n" +
                "Enter 2: Shuffle deck of cards" + "\n" +
                "Enter 3: Draw a random card from deck" + "\n" +
                "Enter 4: How many unique hands to get a RSF?" + "\n" +
                "Enter 5: Print menu options" + "\n" +
                "Enter your choice: ");

    }


    public static int royalStraightFlush() {
        long startTime = System.currentTimeMillis();
        //Create a royalStraightFlush
        Card[] rsf = new Card[5];
        rsf[0] = new Card("Ten", "Heart", 10);
        rsf[1] = new Card("Knight", "Heart", 11);
        rsf[2] = new Card("Queen", "Heart", 12);
        rsf[3] = new Card("King", "Heart", 13);
        rsf[4] = new Card("Ace", "Heart", 14);

        int count = 0;

        while (true) {
            count++;
            int sameCard = 0;

            //Create a new hand every loop
            Deck deck = new Deck();
            Card[] hand = new Card[5];
            for (int i = 0; i < hand.length; i++) {
                hand[i] = deck.giveCard();
            }

            //loop through the two Arrays and check if equal
            for (Card card : rsf) {
                if (Arrays.asList(hand).contains(card)) {
                    sameCard++;
                    if (sameCard == 5) {
                        long endTime = System.currentTimeMillis();
                        System.out.println("That took " + (endTime - startTime) + " milliseconds");
                        return count;
                    }
                } else {
                    break;
                }
            }
        }
    }
}

            //loop through the two Arrays and check if equal
//            for(int i=0; i<rsf.length; i++) {
//                for(int j=0; j<hand.length; j++) {
//                    if(rsf[i].equals(hand[j])) {
//                        sameCard++;
//                        if (sameCard == 5) {
//                            return count;
//                        }
//                    }
//                }
//            }

