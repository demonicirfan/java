public class palindrome {
    public static void main(String[] args) {

    }

    static boolean isPalendrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char head = str.charAt(i);
            char tail = str.charAt(str.length() - 1 - i);
            if (head != tail) {
                return false;
            }
        }
        return true;

    }
}
