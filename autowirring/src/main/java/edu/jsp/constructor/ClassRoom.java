package edu.jsp.constructor;

public class ClassRoom {
    private Board board;

    // Constructor for dependency injection
    public ClassRoom(Board board) {
        this.board = board;
        System.out.println("ClassRoom object created...");
        System.out.println("Board object injected into ClassRoom.");
    }
}
