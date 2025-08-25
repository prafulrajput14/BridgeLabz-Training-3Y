import java.util.Scanner;

public class ChocolatesDivision {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[1] + ", Remaining chocolates: " + result[0]);
    }
}
