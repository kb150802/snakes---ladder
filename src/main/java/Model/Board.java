package Model;

import java.util.*;

public class Board {
    private final List<Cell> cells;
    private final List<String> players;
    private final Map<String, Integer> playerPositions;
    private boolean finished ;
    String winner;
    Dice dice;
    public Board(List<Snake> snakes, List<Ladder> ladders, List<String> players){
        dice = new Dice();
        cells = new ArrayList<>();
        this.players = players;
        playerPositions = new HashMap<>();
        for(String player: players) {
            playerPositions.put(player, 0);
        }
        finished = false;
        for(int i = 0; i < 100; ++i) {
            cells.add(new Cell(i));
        }

        for(Snake snake : snakes) {
            cells.get(snake.getStartingPosition()).setTeleporter(snake);
        }
        for(Ladder ladder: ladders) {
            cells.get(ladder.getStartingPosition()).setTeleporter(ladder);
        }
    }
    public void simulateGame() {
        int turn = 0;
        while(!finished) {
            String currentPlayer = players.get(turn % players.size());
            makeMove(currentPlayer);
            turn++;
        }
    }
    private void makeMove(String player) {
        int currentPosition = playerPositions.get(player);
        int numberOnDice = dice.rollDice();

        int newPosition = currentPosition + numberOnDice;
        if(newPosition >= 100) {
            System.out.println(player + " rolled " + numberOnDice + " cannot make a move from " + currentPosition);
            return;
        }
        Teleporter teleporter = cells.get(newPosition).getTeleporter();
        if(teleporter != null){
            newPosition = teleporter.getEndingPosition();
        }
        System.out.println(player + " rolled " + numberOnDice + " and moved from " + currentPosition + " " + newPosition);
        playerPositions.put(player, newPosition);
        if(newPosition == 99) {
            System.out.println(player + " won");
            finished = true;
            winner = player;
        }

    }
}
