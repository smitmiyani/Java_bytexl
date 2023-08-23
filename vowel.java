import java.util.*;

public class vowel {
    public static void main(String[] args) {
        String s;
        StringBuilder s1 = new StringBuilder();

        System.out.print("Enter a String: ");
        Scanner k = new Scanner(System.in);
        s = k.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                s1.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                s1.append(Character.toUpperCase(c));
            } else {
                s1.append(c);
            }
        }
        System.out.println(s1.toString());
        k.close();
    }
}
