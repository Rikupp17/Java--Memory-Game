import java.util.ArrayList;
import java.util.Collections;

public class Board {
    private ArrayList<Card> cards;

    public Board(String[] symbols) {
        cards = new ArrayList<>();
        for (String symbol : symbols) {
            cards.add(new Card(symbol));
            cards.add(new Card(symbol)); // Füge jedes Symbol zweimal hinzu
        }
        Collections.shuffle(cards); // Mische die Karten
    }

    public void displayBoard() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).isFaceUp() || cards.get(i).isMatched()) {
                System.out.print(cards.get(i).getSymbol() + " ");
            } else {
                System.out.print("[?] ");
            }

            if ((i + 1) % 4 == 0) { // Zeilenumbruch nach jeder 4. Karte
                System.out.println();
            }
        }
    }

    public Card getCard(int index) {
        if (index >= 0 && index < cards.size()) {
            return cards.get(index);
        }
        return null;
    }

    public boolean checkMatch(int index1, int index2) {
        Card card1 = getCard(index1);
        Card card2 = getCard(index2);

        if (card1.getSymbol().equals(card2.getSymbol())) {
            card1.setMatched(true);
            card2.setMatched(true);
            return true;
        }
        return false;
    }

    public boolean allCardsMatched() {
        for (Card card : cards) {
            if (!card.isMatched()) {
                return false;
            }
        }
        return true;
    }
}
