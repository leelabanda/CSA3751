public class StringComparison {
    public static boolean areEqual(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";

        boolean result = areEqual(string1, string2);

        if (result) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}