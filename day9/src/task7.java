package src;

import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Id: ");
        String id = sc.nextLine();

        System.out.print("Enter your Password: ");
        String pwd = sc.nextLine();



        System.out.println("\nHi ,");
        System.out.println("\n\tYour login id is " + id);

        sc.close();
    }
}
