package org.example;

import Model.Board;
import Model.Dice;
import Model.Ladder;
import Model.Snake;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Snake> snakes = List.of(
                new Snake(9,2),
                new Snake(30, 12),
                new Snake(98, 10)
        );
        List<Ladder> ladders = List.of(
                new Ladder(30, 50),
                new Ladder(4,98),
                new Ladder(5,65)
        );
        List<String> players= List.of("Kushagra", "Sakshi");
        Board board = new Board(snakes, ladders, players);
        board.simulateGame();
    }
}

/*
 Dice
    -rollDice
 Snake
    - startingPosition
    - endingPosition
  Ladders
    - startingPosition
    - endingPosition
  Cell
    - position
    - snake which have head here
    - Ladder which have starting position here
  Board
    - List<Cell>
    - players With Positions
    - simulateGame
    - playTurn

 */
