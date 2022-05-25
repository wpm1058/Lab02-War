package war;

/**
 * Represents a single player in the game
 */
public class Player {
    private Pile pile;
    private boolean winner;

    /**
     * Create the player with their id
     * @param id identification of the player created
     */
    public Player(int id)
    {
        this.pile = new Pile("P"+id);
        this.winner = false;
    }

    /**
     * Add a single card to the bottom of the player's pile
     * @param card the card to add
     */
    public void addCard(Card card)
    {
        //TODO
        this.pile.addCard(card);
    }

    /**
     * Add the collection of cards from the incoming pile to the bottom of player's pile, in order. Do not remove cards
     * from the incoming pile! Use Pile's getCards
     * @param cards the incoming pile of cards to add to this player's pile
     */
    public void addCards(Pile cards)
    {
        //TODO
        for(Card c : cards.getCards())
        {
            this.pile.addCard(c);
        }
    }

    /**
     * Are there any cards left in the player's pile?
     * @return whether there are any cards in the player's pile or not.
     */
    public boolean hasCard()
    {
        //TODO
        return this.pile.hasCard();
    }

    /**
     * Remove a card from the top of the pile. The intention is the card should switch to be face up
     * @return
     */
    public Card drawCard()
    {
        //TODO
        return this.pile.drawCard(true);
    }

    /**
     * Declare this player to be winner
     */
    public void setWinner()
    {
        this.winner = true;
    }

    /**
     * Is this player the winner?
     * @return whether this player is the winner or not?
     */
    public boolean isWinner()
    {
        //TODO
        return this.winner;
    }

    /**
     * Returns a string representation of this player's pile e.g: "P1 pile: 10♢(D) 4♧(D)".
     * @return the string mentioned above
     */
    @Override
    public String toString()
    {
        //TODO
        return this.pile.toString();
    }
}
