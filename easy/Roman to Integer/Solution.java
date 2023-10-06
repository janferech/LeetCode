import java.util.Scanner;

public class Solution {
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            switch (currentChar) {
                case 'I':
                    if (i < s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (i < s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (i < s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Ungültige römische Ziffer: " + currentChar);
                    //my eyes are hurting by seeing this 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input: ");
        String romanNumeral = sc.nextLine();
        System.out.println(romanToInt(romanNumeral));
        sc.close();
    }
}
