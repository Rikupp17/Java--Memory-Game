# Java--Memory-Game
By Marc

### README

#### Project Description:

This project simulates the classic Memory Game in Java. It consists of several classes that structure the game, allowing players to flip cards, check for matches, and track the score.

#### Project Structure:

- **Card**: A class representing a single card with a symbol. Each card can be "face up" or "face down" and has a symbol.
- **Board**: The game board, which manages the cards and provides logic to check for matches.
- **Player**: Represents a player and keeps track of their score.
- **MemoryGame**: The main logic of the game that processes player actions and controls the game state.
- **Main**: The entry point of the program where the game is initialized and started.

#### How to Run the Game:

1. Compile all Java files:
   ```bash
   javac *.java
   ```

2. Run the program:
   ```bash
   java Main
   ```

3. Follow the instructions in the terminal to play the Memory Game.

#### Gameplay Overview:

- Players will take turns selecting two cards to flip.
- If the symbols on both cards match, the player earns a point, and the cards remain face up.
- If the symbols do not match, the cards are flipped back face down.
- The game continues until all cards are matched.
- The player’s score is displayed throughout the game, and the game ends once all cards have been matched.

#### Customization:

- The symbols for the cards are defined in the `symbols` array in the `Main.java` file. You can modify the symbols to customize the game.
