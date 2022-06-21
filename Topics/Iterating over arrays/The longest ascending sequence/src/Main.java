import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int element = i;
            int prev = i - 1;
            if (prev > 0) {
                if (array[element] > array[prev]) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}