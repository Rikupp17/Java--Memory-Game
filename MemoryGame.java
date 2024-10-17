import java.util.Scanner;

public class MemoryGame {
    private Board board;
    private Player player;
    private Scanner scanner;

    public MemoryGame(Player player, String[] symbols) {
        this.player = player;
        this.board = new Board(symbols);
        this.scanner = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("Willkommen zum Memory-Spiel!");

        while (!board.allCardsMatched()) {
            board.displayBoard();

            // Spieler wählt zwei Karten
            System.out.print("\n" + player.getName() + ", wähle die erste Karte (Index 0-15): ");
            int index1 = scanner.nextInt();
            System.out.print("Wähle die zweite Karte (Index 0-15): ");
            int index2 = scanner.nextInt();

            Card card1 = board.getCard(index1);
            Card card2 = board.getCard(index2);

            card1.flip();
            card2.flip();

            board.displayBoard();

            if (board.checkMatch(index1, index2)) {
                System.out.println("Treffer! Du bekommst einen Punkt.");
                player.addPoint();
            } else {
                System.out.println("Leider kein Treffer.");
                card1.flip(); // Karten wieder umdrehen
                card2.flip();
            }

            System.out.println("Dein Punktestand: " + player.getScore() + "\n");
        }

        System.out.println("Herzlichen Glückwunsch, " + player.getName() + "! Du hast das Spiel gewonnen.");
        System.out.println("Endstand: " + player.getScore() + " Punkte");
    }
}
