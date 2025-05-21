import java.util.*;

public class ReverseString{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // To read input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();         // Read the full line as input

        String reversed = reverse(input);     // Call the reverse method
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse the string
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);  // Use StringBuilder to manipulate string
        return sb.reverse().toString();           // Reverse and convert back to string
    }
}
