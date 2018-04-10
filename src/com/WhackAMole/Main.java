package com.WhackAMole;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int positionX;
        int positionY;
        Scanner scanner = new Scanner(System.in);
        WhackAMole game = new WhackAMole(50, 10);
        game.printGrid();
        System.out.println("Attempts Left: " + game.getAttemptsLeft());
        System.out.println("Moles Left: " + game.getMolesLeft());
        System.out.println("Score: " + game.getScore());
        while (game.getAttemptsLeft() > 0){
            System.out.println("Enter a value for X coordinate (0-9): ");
            positionX = scanner.nextInt();
            System.out.println("Enter a value for Y coordinate (0-9): ");
            positionY = scanner.nextInt();
            if(positionX != -1 && positionY != -1)
            {
                game.whack(positionX, positionY);
                System.out.println("Attempts Left: " + game.getAttemptsLeft());
                System.out.println("Moles Left: " + game.getMolesLeft());
                System.out.println("Score: " + game.getScore());
            }
            else break;

        }
        game.printGrid();
        System.out.println("Final Score: " + game.getScore());

    }
}


