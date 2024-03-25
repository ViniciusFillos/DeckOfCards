package entities;

public class Card{
    private char symble;
    private int value;
    private Suit suit;

    public Card(char symble, int value, Suit suit) {
        this.symble = symble;
        this.value = value;
        this.suit = suit;
    }

    public char getSymble() {
        return symble;
    }

    public void setSymble(char symble) {
        this.symble = symble;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value +" "+ suit.toString();
    }
}
