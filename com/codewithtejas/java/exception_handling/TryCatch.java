/*
 * https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */

import java.io.*;
import java.util.*;

public class TryCatch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        scanner.close();
    }
}
