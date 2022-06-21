import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array;
        for (n != 0) {
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            n = scanner.nextInt();
        }
        System.out.print(sum);
    }
}