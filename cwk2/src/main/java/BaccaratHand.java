import java.util.ArrayList;
import java.util.List;

public class BaccaratHand {
    private List<BaccaratCard> hand;

    public BaccaratHand() {
        this.hand = new ArrayList<>();
    }

    public int size() {
        return this.hand.size();
    }

    public void add(BaccaratCard card) {
        this.hand.add(card);
    }

    public int value() {
        int total = 0;
        for (BaccaratCard card : this.hand) {
            total += card.value();
        }
        return total % 10;
    }

    public boolean isNatural() {
        return this.size() == 2 && (this.value() == 8 || this.value() == 9);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (BaccaratCard card : this.hand) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}