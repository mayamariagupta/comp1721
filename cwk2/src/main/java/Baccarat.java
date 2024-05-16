public class Baccarat {
    public static void main(String[] args) {
        Shoe shoe = new Shoe(6);
        shoe.shuffle();

        BaccaratHand playerHand = new BaccaratHand();
        BaccaratHand bankerHand = new BaccaratHand();

        playerHand.add(shoe.deal());
        playerHand.add(shoe.deal());
        bankerHand.add(shoe.deal());
        bankerHand.add(shoe.deal());

        System.out.println("Player: " + playerHand + " = " + playerHand.value());
        System.out.println("Banker: " + bankerHand + " = " + bankerHand.value());

        if (playerHand.isNatural()) {
            System.out.println("Player has a Natural");
        }
        if (bankerHand.isNatural()) {
            System.out.println("Banker has a Natural");
        }
    }
}


