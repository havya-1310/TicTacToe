package com.havya.practice;


public class Board {
    int[][] board;
    int movesTotal = 0;
    int winner = -1;

    int[] row, col;
    int diag, revDiag;

    int n;

    public Board(int n) {
        this.n = n;
        this.board = new int[n][n];
        this.row = new int[n];
        this.col = new int[n];
    }

    /*    public int makeMove(int player, int row, int col) {
        movesTotal+=1;
        this.board[row][col] = player;
        if (isPlayerWon(player, row, col)) {
            winner = player;
            System.out.println(("Player : " + player + " won the game!"));
            printBoard();
            return player;
        }
        if (movesTotal == 9 || winner != -1) {
            System.out.println("Game is finished, create new game board!!");
            if (winner != -1) {
                System.out.println(("Player : " + winner + " won the game!"));
            }
            else {
                System.out.println("Game resulted in draw, board state is...");
            }
            printBoard();
            return -1;
        }
        return 0;
    }*/

    /**
     * return player if won otherwise print relevant info of the game state and return 0.
     * @param player is either -1 or 1
     * @param row is index of row where player is making move
     * @param col is index of column where player is making move
     * @return player if won otherwise 0.
     */
    public int makeMove(int player, int row, int col) {
        movesTotal += 1;
        this.board[row][col] = player;
        if (isPlayerWon(player, row, col)) {
            winner = player;
            System.out.println(("Player : " + player + " won the game!"));
            printBoard();
            return player;
        }
        if (movesTotal == 9 || winner != -1) {
            System.out.println("Game is finished, create new game board!!");
            if (winner != -1) {
                System.out.println(("Player : " + winner + " won the game!"));
            } else {
                System.out.println("Game resulted in draw, board state is...");
            }
            printBoard();
        }
        return 0;
    }

    public boolean isPlayerWon(int player, int r, int c) {
        row[r] += player;
        col[c] += player;
        if (r == c) {
            diag += player;
        }
        if (r == n - c - 1) {
            revDiag += player;
        }
        return (n == Math.abs(row[r]) || n == Math.abs(col[c]) || (n == Math.abs(diag)) || (n == Math.abs(revDiag)));
    }

    public void printBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==========");
    }
}
