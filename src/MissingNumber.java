import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        
        // Expected sum using the formula: n * (n + 1) / 2
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                actualSum += sc.nextInt();
            }
        }
        
        long missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
        
        sc.close();
    }
}