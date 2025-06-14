package src;

public class task10 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 10;
        int num3 = 30;

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greater");
        }

        else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greater");
        } else {
            System.out.println("num3 is greater");
        }
    }
}

