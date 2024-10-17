import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spielername eingeben
        System.out.print("Gib deinen Namen ein: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        // Memory-Symbole (kann angepasst werden)
        String[] symbols = {"A", "B", "C", "D", "E", "F", "G", "H"};

        MemoryGame game = new MemoryGame(player, symbols);
        game.playGame();
    }
}
