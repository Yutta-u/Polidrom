import java.util.Scanner;

public class Polidrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      //System.out.println("Введите 4х значное число ");
        int a = scan.nextInt();

        int c = a / 1000;
        int b = a % 10;
        int n = a / 100;
        int x = n % 10;
        int h = a / 10;
        int z = h % 10;

        if (c == b && x == z) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
