import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Check and print result
        if (isAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    // Simple method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {
        // Convert strings to character arrays
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare sorted arrays
        return Arrays.equals(a, b);
    }
}
