/**
 * Client class.
 *
 * @author Bill Bai
 */
public class DeckCardsClient {
    public static void main(String[] args) {
        DeckOfCards deck1 = new DeckOfCards();
        deck1.shuffle();
        for(int x = 0; x < 52; x++)
            System.out.println(deck1.deal());
    }
}











