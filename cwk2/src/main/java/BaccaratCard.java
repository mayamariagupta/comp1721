public class BaccaratCard extends Card implements Comparable<Card> {
    public BaccaratCard(Rank rank, Suit suit) {
        super(rank, suit);
    }


    public Rank getRank() {
        return super.getRank();
    }


    public Suit getSuit() {
        return super.getSuit();
    }


    public String toString() {
        return super.toString();
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaccaratCard other = (BaccaratCard) obj;
        return getRank() == other.getRank() && getSuit() == other.getSuit();
    }


    public int compareTo(Card other) {
        int difference = this.getSuit().compareTo(other.getSuit());

        if (difference != 0) {
            return difference;
        }

        return this.getRank().compareTo(other.getRank());
    }
    

    public int value() {
        switch (getRank()) {
            case TEN:
            case JACK:
            case QUEEN:
            case KING:
                return 0;
            default:
                return getRank().ordinal() + 1;
        }
    }
}
