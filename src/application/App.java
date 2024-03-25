package application;
import entities.Card;
import entities.Suit;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        generate(52, 13);
    }
    public static void generate(int quantityCards, int quantitySuits){
        Scanner read = new Scanner(System.in);
        Card[] deck = new Card[quantityCards];//decks have 52 cards, 4 suits which 13 cards each
        Suit[] suits = new Suit[quantitySuits];
        int usedCards = 0;

        for (int i=0; i<4; i++){
            System.out.print("Which suit do you want to add? ");
            String suit = read.nextLine();
            suits[i] = new Suit(suit);

            System.out.print("How many cards are it going to have? ");
            int amountCard = read.nextInt();
            read.nextLine();

            for(int j=0; j<amountCard; j++){
                deck[usedCards] = new Card('❤',j+1,suits[i]);
                usedCards++;
            }
        }
        for(int j=0; j<52; j++){
            System.out.println(deck[j]);
        }
    }
}
