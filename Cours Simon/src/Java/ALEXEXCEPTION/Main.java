package Java.ALEXEXCEPTION;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws AllException {

     int[] numbers = {1,2,3,4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre un num batard");
        int result = scanner.nextInt();
        if (result > 4 ) {
            throw new AllException("T'es trop haut chien");
        }
        System.out.println(numbers[result]);
    }


    public static void throwexc() throws AllException {
        throw new AllException("loupé");
    }
}
