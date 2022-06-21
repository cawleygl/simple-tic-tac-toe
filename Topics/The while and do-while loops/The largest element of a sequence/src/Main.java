import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int input = 1;
        while (input != 0) {
            input = scanner.nextInt();
            if (input > largest) {
                largest = input;
            }
        }
        System.out.print(largest);
    }
}