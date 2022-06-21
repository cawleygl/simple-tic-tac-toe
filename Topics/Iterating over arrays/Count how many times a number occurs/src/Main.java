import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int count = 0;
        for (int element : array) {
            if (element == n) {
                count++;
            }
        }
        System.out.print(count);
    }
}