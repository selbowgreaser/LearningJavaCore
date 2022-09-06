public class Palindrome {
    public static void main(String[] args) {
        String text = "Madam, I'm Adam!";
        boolean result = isPalindrome(text);
        System.out.println(result);
    }

    public static boolean isPalindrome(String text) {
        StringBuilder changedString = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", ""));
        String newString = changedString.toString();
        String newStringReverse = changedString.reverse().toString();
        return newString.equalsIgnoreCase(newStringReverse);
    }
}
