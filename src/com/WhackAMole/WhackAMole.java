package com.WhackAMole;

public class WhackAMole {
    private int score = 0;
    private int molesLeft;
    private int attemptsLeft;
    private char [][] moleGrid;

    public WhackAMole(int numAttempts, int gridDimension){
        attemptsLeft = numAttempts;
        moleGrid = new char[gridDimension][gridDimension];
        initializeMoleGrid();
        placeMolesInTheGrid();
    }

    public boolean place (int x, int y) {
        //TODO
        return true;
    }

    public void printGridToUSer() {
        for (int i = 0; i < moleGrid.length; i++) {
            for (int j = 0; j < moleGrid[i].length; j++) {
                System.out.println(moleGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void initializeMoleGrid(){
        for (int i = 0; i < moleGrid.length; i++) {
            for (int j = 0; j < moleGrid.length; j++) {
                moleGrid[i][j] = '*';
            }
        }
    }

    private void placeMolesInTheGrid(){
        int xCordinate;
        int yCordinate;
        for (int i = 0; i < 10; i++){
            xCordinate = generateRandomPosition();
            yCordinate = generateRandomPosition();
            moleGrid[xCordinate][yCordinate] = 'M';
        }
    }

    private int generateRandomPosition(){
        return (int)Math.random() * 9;
    }
}
