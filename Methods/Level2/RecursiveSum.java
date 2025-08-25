import java.util.Scanner;

public class RecursiveSum {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int rec = recursiveSum(n);
        int formula = formulaSum(n);
        System.out.println("Recursive Sum = " + rec);
        System.out.println("Formula Sum = " + formula);
        System.out.println("Both are " + (rec == formula ? "equal" : "not equal"));
    }
}
