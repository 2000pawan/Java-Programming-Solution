import java.util.*;
class vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single character:");
        String s = sc.nextLine();

        // Check if the input is a single character
        if (s.length() == 1) {
            char ch = Character.toLowerCase(s.charAt(0)); // Convert to lowercase for case insensitivity
            String vowels = "aeiou"; // String containing all vowels

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel."); // Case 1: vowel
                    break;
                default:
                    System.out.println(ch + " is a consonant."); // Case 2: consonant
                    break;
            }
        } else {
            System.out.println("Please enter only a single character.");
        }
    }
}