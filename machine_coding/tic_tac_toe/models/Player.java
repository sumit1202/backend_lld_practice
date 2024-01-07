package machine_coding.tic_tac_toe.models;

import java.util.Scanner;

import machine_coding.tic_tac_toe.models.enums.PlayerType;

public class Player {
    private int id;
    private String name;
    private PlayerType playerType;
    private Symbol symbol;

    private Scanner scanner;

    public Player(int id, String name, PlayerType playerType, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Move makeMove(Board board) {
        System.out.println("Please mention move's row number.");
        int row = scanner.nextInt();
        System.out.println("Please mention move's column number.");
        int col = scanner.nextInt();

        Move move = new Move(new Cell(row, col), this);

        return move;
    }

}
