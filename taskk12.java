import java.util.Scanner;

public class taskk12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String loiginid = "Rishi";
        String pwd = "****";
        int count = 0;

        do{
            System.out.println("you have logged in for " + count++ +"times");
            System.out.println("enter your login id and password");
            loiginid = scn.nextLine();
            pwd = scn.nextLine();
        }while (loiginid=="Rishi" && pwd=="****");



    }
}
