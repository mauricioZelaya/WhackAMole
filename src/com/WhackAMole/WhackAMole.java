package com.WhackAMole;

public class WhackAMole {
    private int score = 0;
    private int molesLeft;
    private int attemptsLeft;
    private char [][] moleGrid;

    public WhackAMole(int numAttempts, int gridDimension){
        attemptsLeft = numAttempts;
        moleGrid = new char[gridDimension][gridDimension];
    }

    public boolean place (int x, int y) {
        //TODO
        return true;
    }

    public void printGridToUSer() {
        for (int i = 0; i < moleGrid.length; i++) {
            System.out.println("*");
//            for (int j = 0; j < moleGrid.length; j++) {
//                System.out.println('*');
//            }
        }
    }
}
