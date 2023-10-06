import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inout");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("digits:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int[] result = solution.plusOne(numbers);

        System.out.println("Result:");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        sc.close();
    }
}
