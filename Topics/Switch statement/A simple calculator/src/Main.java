import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        char operator = scanner.next().charAt(0);
        long num2 = scanner.nextLong();
        long ans;

        switch (operator) {
            case '+':
                ans = num1 + num2;
                System.out.println(ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println(ans);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    ans = num1 / num2;
                    System.out.println(ans);
                }
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}