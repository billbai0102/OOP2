/**
 * DeckOfCards class
 *
 * @author Bill Bai
 */
public class DeckOfCards {
    private Card myDeck[];
    private int myCardNum = 0;

    public DeckOfCards() {
        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        myDeck = new Card[52];
        for (int n = 0; n < 52; n++) {
            myDeck[n] = new Card(faces[n % 13], suits[n / 13]);
        }
    }

    public Card deal() {
        if (myCardNum < 52)
            return myDeck[myCardNum++];
        else
            return null;
    }

    /**
     * Shuffles the deck of cards. Works by choosing a random index from 0 to 0..52, and swapping. Does this exact
     * operation 4 times to ensure maximum randomness.
     */
    public void shuffle() {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 52; x++) {
                int randomIndex = (int) (Math.random() * x);
                Card temp = myDeck[randomIndex];
                myDeck[randomIndex] = myDeck[x];
                myDeck[x] = temp;
            }
        }
    }
}
// close class











