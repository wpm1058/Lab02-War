package src.war;

import war.*;

/**
 * The main program for the card game, War.  It is run on the command line as:<br>
 * <br>
 * java War cards-per-player seed<br>
 * <br>
 *
 * @author RIT CS
 * @author YOUR NAME HERE
 */

public class War {
    /** The maximum number of cards a single player can have */
    public final static int MAX_CARDS_PER_PLAYER = 26;
    private final Player p1;
    private final Player p2;

    private int round;
    /**
     * Initialize the game.
     *     * @param cardsPerPlayer the number of cards for a single player
     */
    public War(int cardsPerPlayer) {
        // TODO
        Pile initialPile = new Pile("Initial Deck");
        for(Rank rank : Rank.values())
        {
            for (Suit suit : Suit.values())
            {
                initialPile.addCard(new Card(rank,suit));
            }
        }

        initialPile.shuffle();
        p1 = new Player(1);
        p2 = new Player(2);
        for(int i = 0; i < cardsPerPlayer; i++)
        {
            p1.addCard(initialPile.drawCard(false));
            p2.addCard(initialPile.drawCard(false));
        }
    }

    /** Play a round of the game. */
    public void playRound() {
        // TODO
        // this pile is the pile of cards played
        Pile trick = new Pile("Trick");
        // print the current round
        System.out.println("Round " + round);
        //roundWon is true only when one card beats another
        boolean roundWon = false;
        while(!roundWon)
        {
            System.out.println(p1.toString());
            System.out.println(p2.toString());
        //Breaks out of loop if either player has no card
            if(!p2.hasCard())
            {
                p1.addCards(trick);
                System.out.println("P1 wins round gets " + trick);
                roundWon = true;
                continue;
            }
            else if (!p1.hasCard())
            {
                p2.addCards(trick);
                System.out.println("P2 wins round gets " + trick);
                roundWon = true;
                continue;
            }
            // draws a card from each player and sets them face up
            Card card1 = p1.drawCard();
            card1.setFaceUp();

            Card card2 = p2.drawCard();
            card2.setFaceUp();

            System.out.println("P1 card: " + card1);
            System.out.println("P2 card: " + card2);

            trick.addCard(card1);
            trick.addCard(card2);
        // checks if the card is equal or if it beats the other card
            if(card1.equals(card2))
            {
                System.out.println("WAR!");
            }
            else if (card1.beats(card2))
            {
                p1.addCards(trick);
                System.out.println("P1 wins round gets " + trick);
                roundWon = true;
            }
            else {
                p2.addCards(trick);
                System.out.println("P2 wins round gets " + trick);
                roundWon = true;
            }
        }
        round += 1;
    }
    /** Play the full game*/
    private void playGame()
    {
        // initialize round
        round = 1;
    //game plays while there is no winner
        while (!p1.isWinner() && !p2.isWinner())
        {
            playRound();
    // if either p1 or p2 have no cards left the other player is set as the winner
            if(!p2.hasCard())
            {
                p1.setWinner();
            }
            else if (!p1.hasCard())
            {
                p2.setWinner();
            }
        }

        System.out.println(p1);
        System.out.println(p2);
    // declare the winner
        if (p1.isWinner())
        {
            System.out.println("P1 WINS!");
        }
        else System.out.println("P2 WINS!");
    }

    /**
     * The main method get the command line arguments, then constructs
     * and plays the game.  The Pile's random number generator and seed
     * need should get set here using Pile.setSeed(seed).
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java War cards-per-player seed");
        } else {
            int cardsPerPlayer = Integer.parseInt(args[0]);
            // must be between 1 and 26 cards per player
            if (cardsPerPlayer <= 0 || cardsPerPlayer > MAX_CARDS_PER_PLAYER) {
                System.out.println("cards-per-player must be between 1 and " + MAX_CARDS_PER_PLAYER);
            } else {
                // set the rng seed
                Pile.setSeed(Integer.parseInt(args[1]));
                War war = new War(cardsPerPlayer);
                war.playGame();
            }
        }
    }


}
