package war;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

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
        rng.setSeed(seed);
    }

    public void shuffle()
    {
        //TODO
        System.out.println("Shuffling " + this.name + " pile");
        Collections.shuffle(cards,rng);
    }

    public void addCard(Card card)
    {
        //TODO
        this.cards.add(Card);
    }

    public Card drawCard(boolean faceUp)
    {
        //TODO
        Card dCard = cards.remove(0);
        if(faceUp)
        {
            dCard.setFaceUp;
        }
        else 
        {
            dCard.setFaceDown;
        }

        return dCard;
    }

    public boolean hasCard()
    {
        //TODO
        return cards.isEmpty();
    }

    public void clear()
    {
        //TODO
        this.cards.clear();
    }

    @Override
    public String toString()
    {
        String toPile = "";
        for (Card c : cards)
        {
            toPile += c + " ";
        }
        return(name + " pile: " + toPile);
    }
}
