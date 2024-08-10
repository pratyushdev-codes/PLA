public class ReplaceChar {
    public static void main(String[] args) {
        String str = "hello world";
        char oldChar = 'l';
        char newChar = 'x';

        String newStr = str.replace(oldChar, newChar);

        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + newStr);
    }
}
