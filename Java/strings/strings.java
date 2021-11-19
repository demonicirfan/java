public class strings {
    public static void main(String[] args) {
        String str1 = "java program"; // thsi is in string pool area
        String str2 = new String("Java"); // this is in heap

        char c[] = { 'H', 'e', 'l', 'l', 'o' };
        String str3 = new String(c);

        byte b[] = { 65, 66, 67, 68 };
        String str4 = new String(b, 2, 2); // this means start from index 2 and go till next 2

        System.out.println(str4);
    }
}
