public class Card {
    private String symbol;
    private boolean isFaceUp;
    private boolean isMatched;

    public Card(String symbol) {
        this.symbol = symbol;
        this.isFaceUp = false;
        this.isMatched = false;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }
}
