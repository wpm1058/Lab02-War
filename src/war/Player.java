package war;

public class Player {
    private Pile pile;
    private boolean winner;
    public Player(int id)
    {
        this.pile = new Pile("P"+id);
        this.winner = false;
    }

    public void addCard(Card card)
    {
        //TODO
        this.pile.addCard(card)
    }

    public void addCards(Pile cards)
    {
        //TODO
        for (Card c : cards) {
            this.pile.addCard(c);
        }
    }

    public boolean hasCard()
    {
        //TODO
        return this.pile.hasCard();;
    }

    public Card drawCard()
    {
        //TODO
        return this.pile.drawCard();
    }

    public void setWinner()
    {
        this.winner = false;
    }

    public boolean isWinner()
    {
        //TODO
        return this.winner;
    }
    @Override
    public String toString()
    {
        //TODO
        return this.pile.toString;
    }
}
