package com.havya.practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Board board = new Board(3);
        board.printBoard();
        board.makeMove(1, 0, 0);
        board.makeMove(-1, 0, 1);
        board.makeMove(1, 0, 2);
        board.makeMove(-1, 1, 0);
        board.makeMove(1, 1, 1);
        board.makeMove(-1, 1, 2);
        board.makeMove(-1, 2, 0);
        board.makeMove(1, 2, 1);
        board.makeMove(-1, 2, 2);
    }
}