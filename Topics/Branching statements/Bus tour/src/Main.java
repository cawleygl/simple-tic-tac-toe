import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int bridgeCrash = 0;
        boolean willCrash = false;
        for (int i = 0; i < numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                willCrash = true;
                bridgeCrash = i + 1;
                break;
            }
        }
        if (willCrash) {
            System.out.print("Will crash on bridge " + bridgeCrash);
        } else {
            System.out.print("Will not crash");
        }
    }
}