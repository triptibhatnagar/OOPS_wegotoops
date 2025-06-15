import java.util.Scanner;

public class A_InputOutput {
    static void inputOutput(Scanner sc) {
        int x = sc.nextInt();
        System.out.print(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputOutput(sc);
    }
}