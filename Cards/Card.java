/**
 * Card class to construct a Card with face and suit.
 *
 * @author Bill Bai
 */
public class Card {
    String myFace;
    String mySuit;

    public Card(String theFace, String theSuit) {
        myFace = theFace;
        mySuit = theSuit;
    }

    public String toString() {
        return myFace + " of " + mySuit;
    }
}











