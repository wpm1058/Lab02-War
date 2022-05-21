package war;

import java.util.ArrayList;
import java.util.Random;

public class Pile {
    private final ArrayList<Card> cards;
    private final String name;
    private static Random rng;

    public Pile(String name)
    {
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public static void setSeed(long seed)
    {
        //TODO
    }

    public void shuffle()
    {
        //TODO
    }

    public void addCard(Card card)
    {
        //TODO
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card drawCard(boolean faceUp)
    {
        //TODO
        return null;
    }

    public boolean hasCard()
    {
        //TODO
        return false;
    }

    public void clear()
    {
        //TODO
    }

    @Override
    public String toString()
    {
        //TODO
        return null;
    }
}
