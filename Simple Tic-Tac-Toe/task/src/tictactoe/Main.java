package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameState = 0;
        char turnCounter = 'X';
        boolean gameContinue = true;

        char[][] game = new char[3][3];
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                game[i][j] = '_';
            }
        }
        while (gameContinue) {
            switch (gameState) {
                // Start game
                case 0:
                    // Print Board
                    System.out.println("---------");
                    for (int i = 0; i < game.length; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < game[i].length; j++) {
                            System.out.print(game[i][j]);
                            System.out.print(' ');
                        }
                        System.out.println("| ");
                    }
                    System.out.println("---------");
                    gameState = 1;
                    break;
                // Turn Input
                case 1:
                    // Coordinates
                    System.out.println("Enter the coordinates:");
                    int rowInput = 0;
                    int colInput = 0;
                    boolean isValid = true;

                    while (isValid) {

                        try {
                            rowInput = scanner.nextInt() - 1;
                            colInput = scanner.nextInt() - 1;

                            if (rowInput > 2 || rowInput < 0 || colInput > 2 || colInput < 0) {
                                System.out.println("Coordinates should be from 1 to 3!");
                                isValid = true;
                                continue;
                            }
                            if (game[rowInput][colInput] == 'X' || game[rowInput][colInput] == 'O') {
                                System.out.println("This cell is occupied! Choose another one!");
                                isValid = true;
                                continue;
                            }

                            isValid = false;

                        } catch (Exception e) {
                            System.out.println("You should enter numbers!");
                            isValid = true;
                        }
                    }

                    game[rowInput][colInput] = turnCounter;

                    // Print Board with new move
                    System.out.println("---------");
                    for (int i = 0; i < game.length; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < game[i].length; j++) {
                            System.out.print(game[i][j]);
                            System.out.print(' ');
                        }
                        System.out.println("| ");
                    }
                    System.out.println("---------");


                    // Lines
                    int h1 = game[0][0] + game[0][1] + game[0][2];
                    int h2 = game[1][0] + game[1][1] + game[1][2];
                    int h3 = game[2][0] + game[2][1] + game[2][2];
                    int v1 = game[0][0] + game[1][0] + game[2][0];
                    int v2 = game[0][1] + game[1][1] + game[2][1];
                    int v3 = game[0][2] + game[1][2] + game[2][2];
                    int d1 = game[0][0] + game[1][1] + game[2][2];
                    int d2 = game[0][2] + game[1][1] + game[2][0];

                    // Number of X's, O's, and Total Moves
                    int totalMoves = 0;
                    int totalXs = 0;
                    int totalOs = 0;

                    for (char[] chars : game) {
                        for (char aChar : chars) {
                            if (aChar == 'X') {
                                totalMoves++;
                                totalXs++;
                            }
                            if (aChar == 'O') {
                                totalMoves++;
                                totalOs++;
                            }

                        }
                    }

                    // Impossible if both X's and O's make lines
                    if ((h1 == 264 && h2 == 237) || (h1 == 264 && h3 == 237) || (h2 == 264 && h3 == 237) || (h1 == 237 && h2 == 264) || (h1 == 237 && h3 == 264) || (h2 == 237 && h3 == 264)) {
                        System.out.print("Impossible");
                        gameState = 4;
                    }
                    else if ((v1 == 264 && v2 == 237) || (v1 == 264 && v3 == 237) || (v2 == 264 && v3 == 237) || (v1 == 237 && v2 == 264) || (v1 == 237 && v3 == 264) || (v2 == 237 && v3 == 264)) {
                        System.out.print("Impossible");
                        gameState = 4;
                    }
                    // Impossible if a player moves twice
                    else if (Math.abs(totalXs - totalOs) > 1) {
                        System.out.print("Impossible");
                        gameState = 4;
                    }
                    // X wins
                    else if (h1 == 264 || h2 == 264 || h3 == 264 || v1 == 264 || v2 == 264 || v3 == 264 || d1 == 264 || d2 == 264) {
                        System.out.print("X wins");
                        gameState = 4;
                    }
                    // O wins
                    else if (h1 == 237 || h2 == 237 || h3 == 237 || v1 == 237 || v2 == 237 || v3 == 237 || d1 == 237 || d2 == 237) {
                        System.out.print("O wins");
                        gameState = 4;
                    }
                    // Draw if 9 moves have been made without a winner
                    else if (totalMoves >= 9) {
                        System.out.print("Draw");
                        gameState = 4;
                    }
                    // Game not finished if not no winner, draw, and board not impossible
                    else {
                        if (turnCounter == 'X') {
                            turnCounter = 'O';
                        } else {
                            turnCounter = 'X';
                        }
                    }
                    break;
                // Game Over
                case 4:
                    gameContinue = false;
                    break;
                default:
                    System.out.println("error");
                    gameContinue = false;
            }
        }

    }
}
