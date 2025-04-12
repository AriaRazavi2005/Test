import java.util.Scanner;

public class StringCompressionWhileInput {

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        int i = 0;
        while (i < str.length()) {
            int j = i + 1;
            while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                count++;
                j++;
            }
            compressed.append(count);
            compressed.append(str.charAt(i));
            count = 1;
            i = j;
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to compress: ");
        String inputString = scanner.nextLine();

        String compressedString = compressString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Compressed string: " + compressedString);

        scanner.close();
    }
}