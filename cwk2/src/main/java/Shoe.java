import java.util.Collections;

public class Shoe extends CardCollection {
    public Shoe(int numDecks) {
        super();
        if (numDecks != 6 && numDecks != 8) {
            throw new CardException("Invalid number of decks");
        }
        for (int i = 0; i < numDecks; i++) {
            for (Card.Suit suit : Card.Suit.values()) {
                for (Card.Rank rank : Card.Rank.values()) {
                    this.add(new BaccaratCard(rank, suit));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public BaccaratCard deal() {
        if (this.isEmpty()) {
            throw new CardException("Shoe is empty");
        }
        return (BaccaratCard) cards.remove(0);
    }
}
