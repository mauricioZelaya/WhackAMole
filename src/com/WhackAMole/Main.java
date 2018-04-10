package com.WhackAMole;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int positionX;
        int positionY;
        Scanner scanner = new Scanner(System.in);
        WhackAMole game = new WhackAMole(50, 10);
        System.out.println("Game is Started.........");
        game.printGridToUSer();
        game.printBoard();
        while (game.getAttemptsLeft() > 0){
            System.out.println("Enter a value for X coordinate (0-9): ");
            positionX = scanner.nextInt();
            System.out.println("Enter a value for Y coordinate (0-9): ");
            positionY = scanner.nextInt();
            if(positionX != -1 && positionY != -1)
            {
                game.whack(positionX, positionY);
                game.printBoard();
            }
            else break;

        }
        game.printGrid();
        System.out.println("Final Score: " + game.getScore());

    }
}


