import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String username = "Rishabh";
        String pwd = "********";

        String inputid = "";
        String inputpwd = "";

        while (!(inputid.equals(username) && inputpwd.equals(pwd))){
            System.out.println(" login id");
            inputid = scn.nextLine();

            System.out.println("Password");
            inputpwd = scn.nextLine();

            System.out.println("invalid login id or password");
        }

        System.out.println("login sucess ");
    }
}
