package String;

public class String_Rotation {

    public static void main(String[] args) {
        // Define the two strings to be checked for rotation
        String str1 = "abcde";
        String str2 = "deabc";

        // Check if the lengths of the two strings are different
        if (str1.length() != str2.length()) {
            System.out.println("Second String is not a rotation of the first String");
        } else {
            // Concatenate str1 with itself
            str1 = str1.concat(str1);

            // Check if str2 is a substring of the concatenated string str1
            if (str1.indexOf(str2) != -1) {
                System.out.println("Second String is a rotation of the first String");
            } else {
                System.out.println("Second String is not a rotation of the first String");
            }
        }
    }
}
