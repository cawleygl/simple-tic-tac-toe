import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] twoDimArray = new int[rows][cols];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }
        int swap1 = scanner.nextInt();
        int swap2 = scanner.nextInt();

        for (int i = 0; i < twoDimArray.length; i++) {
            int int1 = twoDimArray[i][swap1];
            int int2 = twoDimArray[i][swap2];
            twoDimArray[i][swap1] = int2;
            twoDimArray[i][swap2] = int1;
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}