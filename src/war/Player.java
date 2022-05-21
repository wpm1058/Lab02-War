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
    }

    public void addCards(Pile cards)
    {
        //TODO
    }

    public boolean hasCard()
    {
        //TODO
        return false;
    }

    public Card drawCard()
    {
        //TODO
        return null;
    }

    public void setWinner()
    {
        //TODO
    }

    public boolean isWinner()
    {
        //TODO
        return false;
    }
    @Override
    public String toString()
    {
        //TODO
        return null;
    }
}
