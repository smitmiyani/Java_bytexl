import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader obj = new InputStreamReader(System.in);

        System.out.println("Enter the first number: ");
        int a = Integer.parseInt(obj.readLine());

        System.out.println("Enter the second number: ");
        int b = Integer.parseInt(obj.readLine());

        System.out.println("The product is: " + a * b);
    }
}