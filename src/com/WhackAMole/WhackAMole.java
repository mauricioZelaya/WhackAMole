package com.WhackAMole;

public class WhackAMole {
    private int score = 0;
    private int molesLeft = 10;
    private int attemptsLeft;
    private char [][] moleGrid;

    public WhackAMole(int numAttempts, int gridDimension){
        attemptsLeft = numAttempts;
        moleGrid = new char[gridDimension][gridDimension];
        initializeMoleGrid();
        placeMolesInTheGrid();
    }

    public boolean place (int x, int y) {
        if(moleGrid[x][y] == 'M'){
            return true;
        }
        return false;
    }

    public void printGridToUSer() {
        for (int i = 0; i < moleGrid.length; i++) {
            for (int j = 0; j < moleGrid[i].length; j++) {
                System.out.println("\t * ");
            }
            System.out.println();
        }
    }

    public void whack(int x, int y){
        if(place(x, y)){
            moleGrid[x][y] = 'W';
            molesLeft--;
            score+=1;
        }
        attemptsLeft--;
    }

    public void printGrid(){
        for (int i = 0; i < moleGrid.length; i++) {
            for (int j = 0; j < moleGrid[i].length; j++) {
                System.out.println(moleGrid[i][j] + "\t" + i + " " + j);
            }
            System.out.println();
        }
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public int getScore(){
        return score;
    }

    public int getMolesLeft() {
        return molesLeft;
    }

    private void initializeMoleGrid(){
        for (int i = 0; i < moleGrid.length; i++) {
            for (int j = 0; j < moleGrid.length; j++) {
                moleGrid[i][j] = '*';
            }
        }
    }

    private void placeMolesInTheGrid(){
        int xCoordinate;
        int yCoordinate;
        for (int i = 0; i < molesLeft; i++){
            xCoordinate = generateRandomPosition();
            yCoordinate = generateRandomPosition();
            moleGrid[xCoordinate][yCoordinate] = 'M';
        }
    }

    private int generateRandomPosition(){
        double value = Math.random() * 10;
        return (int)value;
    }
}
