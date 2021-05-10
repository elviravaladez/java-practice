public class Palindrome {
    public static boolean isPalindromeSolutionOne(String word) {
        String reverse = reverse(word).toLowerCase();

        if(word.toLowerCase().equals(reverse)) {
            return true;
        }
        return false;
    }

    public static String reverse(String input) {
        if(input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

    public static boolean isPalindromeSolutionTwo(String word) {
        if(word == null || word.isEmpty()) {
            return false;
        }

        String originalWord = word.toLowerCase();
        originalWord = originalWord.replace(" ", "");
        String reverse = "";

        //reverse originalWord
        for(int i = originalWord.length() - 1; i >= 0; i--) {
            reverse += originalWord.charAt(i);
        }

        boolean palindrome = true;

        for(int i = 0; i < originalWord.length(); i++) {
            if(reverse.charAt(i) != originalWord.charAt(i)) {
                palindrome = false;
            }
        }

        return palindrome;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeSolutionOne("anna"));
        System.out.println(isPalindromeSolutionOne("Kayak"));
        System.out.println(isPalindromeSolutionOne("James"));
        System.out.println("====================================");
        System.out.println(isPalindromeSolutionTwo("dad"));
        System.out.println(isPalindromeSolutionTwo("hello"));
        System.out.println(isPalindromeSolutionTwo("race car"));
    }
}
