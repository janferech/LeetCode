import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int original = x;

        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;

        System.out.println("Input: ");
        number = sc.nextInt();
        sc.close();
        System.out.println(Solution.isPalindrome(number));
    }
}