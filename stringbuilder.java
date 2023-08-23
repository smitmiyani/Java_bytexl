package learning;

import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder k = new StringBuilder("hello");
        for (int i = 0; i < k.length() / 2; i++) {
            int front = i;
            int back = k.length() - 1 - i;

            char frontchar = k.charAt(front);
            char backchar = k.charAt(back);

            k.setCharAt(front, backchar);
            k.setCharAt(back, frontchar);

           
        }
        System.out.println(k);

    }
}
