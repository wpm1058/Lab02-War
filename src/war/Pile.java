package war;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/**
 * public class Pile
 * Represents a pile of cards. The behavior of a pile is that it holds a collection of cards
 * that can be added to the bottom that are either face up or face down. The cards can be shuffled randomly into a face
 * down position. When a card is removed (drawn), if the top card is face up, it means the pile need to be shuffled
 * before the card is removed from the top.
 */
public class Pile {
    private final ArrayList<Card> cards;
    private final String name;
    private static Random rng = new Random();

    /**
     * Create a pile of cards for a given seed
     * @param name of the pile being created
     */
    public Pile(String name)
    {
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    /**
     * Create and set the seed for the random number generator. First create the
     * Static object using the defualt constructor, and next call setSeet() on it and
     * pass in the seed number.
     * @param seed the seed value
     */
    public static void setSeed(long seed)
    {
        //TODO
        rng.setSeed(seed);
    }

    /**
     * Shuffle the cards and set the, all to face down. It displays the following
     * to standarf output: "Shufflin{name} pile". Where{name } is the name of the pile
     */
    public void shuffle()
    {
        //TODO
        System.out.println("Shuffling " + this.name + " pile");
        Collections.shuffle(cards,rng);
        for (Card c : cards)
        {
            c.setFaceDown();
        }
    }

    /**
     * Add a card to the bottom of the pile(leave the face setting as it is)
     * @param card the card to add
     *
     */
    public void addCard(Card card)
    {
        //TODO
        this.cards.add(card);
    }

    /**
     * Get the next top card from the pile. First , check if the card at the top of the pile is face up. If so, the pile
     * needs to be @see Pile#shuffle()'d (it will be printed to standard output there before shuffling), then print it
     * again here after  (cards should now be face down). Second, remove the card that is now at the top. If faceUp is
     * true, the card should be set to be face up, otherwise that state is not changed. Finally, return the top card.
     * @param faceUp should the card be set to face up when drawn.
     * @return the card that was at the top of the pile
     */
    public Card drawCard(boolean faceUp)
    {
        //TODO
        boolean dCard = cards.get(0).isFaceUp();
        if(dCard)
        {
            shuffle();
            System.out.print(name + " pile: ");
            for (Card c : cards)
            {
                System.out.print(c.toString() + " ");
            }
            System.out.println();
        }
        Card c = cards.remove(0);
        if(faceUp)
        {
            c.setFaceUp();
        }
        return c;
    }

    /**
     * Is there at least one card in the pile (it is not empty)?
     * @return whether there is a card in the pile or none.
     */
    public boolean hasCard()
    {
        //TODO
        return !cards.isEmpty();
    }

    /**
     * Remove all cards from the pile by clearing it out.
     */
    public void clear()
    {
        //TODO
        this.cards.clear();
    }

    /**
     * Returns the collection of card in the pile's current state.
     * @return all the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Returns a string representation of the pile in the format: {name } pil: first-card second-card
     * @return the string described above
     */
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

