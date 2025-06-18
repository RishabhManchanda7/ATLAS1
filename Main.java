import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean ILoveJava = true;
        boolean IHateJava = false;
        char myclass = 'a';
        long mybyte = 12345678;
        int x = 5;
        int y = 2;
        double result = (double) x / y;
        String name = "atlas";
        String greetings = "oops";
        boolean dhak = true;
        final int mynum = 15;
        int myNum = 20;
        int p = 1, q = 2, r = 3;
        String Name = "Amazon";
        int price = 5;
        int myint = 7;
        double myDouble = myint;
        double Mydouble = (double) 7.7d;
        int myInt = (int) Mydouble;
        double num1 = 7.5;
        int num2 = 3;
        String message = "Hello , World";
        String bhaajaa = message.replace('o', 'x');
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1 = "Hello";
        String str2 = "hello";
        String st1 = "hello";
        char firstchar = st1.charAt(0);
        char lastchar = st1.charAt(st1.length() - 1);
        int a = 10;
        int b = 5;
        int results = a / b * 2;
        Boolean str3 = str1.equals(str2);
        int c = 10;
        int d = 5;
        int ans = (c * d) / (c - d);
        int f = 5;
        int j = 3;
        int k = 5 % 3;
        int z = 5;
        int o = 3;
        int l = z++ + o--;
        int h = 5;
        double value = 9.3;
        double squareroot = Math.sqrt(value);
        System.out.println(IHateJava);
        System.out.println(ILoveJava);
        System.out.println(myclass);
        System.out.println(mybyte);
        System.out.println(greetings);
        System.out.println(result);
        System.out.println(name);
        System.out.println(dhak);
        System.out.println(mynum);
        System.out.println(myNum);
        System.out.println("Hello " + Name);
        System.out.println(p + q + r);
        System.out.println("\n" + price);
        System.out.println(price);
        System.out.println(myint);
        System.out.println(myDouble);
        System.out.println(Mydouble);
        System.out.println(bhaajaa);
        System.out.println("the length of text is  " + txt.length());
        System.out.println("is str 1 equals to str2 ;" + str3);
        System.out.println(st1);
        System.out.println(b > a);
        System.out.println(a > b);
        System.out.println(firstchar + "" + lastchar);
        System.out.println(ans);
        System.out.println(k);
        System.out.println(l);
        System.out.println(h++);
        System.out.println(h++);
        System.out.println(h--);
        System.out.println(h--);
        System.out.println(h);
        System.out.println("square root " + squareroot);
        System.out.println(results);
        int w = (5 + 3) * 2 - 4;
        System.out.println("result " + w);
        boolean jjj = !(5 > 3);
        System.out.println(jjj);

        String weather = "air";
        if (weather.equals("sunny")) {
            System.out.println("wear flipflopps");
        } else {
            if (weather.equals("rainn")) {
                System.out.println("wear rain boots");
            } else {
                System.out.println("wear normal shoes");
            }
        }


        int number = 2;
        switch (number) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("invalid number");

        }

        int marks = 100;

        if (marks == 10) {
            System.out.println(" A class");
        } else if (marks <= 90) {
            System.out.println(" B class");
        } else {
            System.out.println(" c lass ");
        }


        for (int i = 1; i < 20; ) {
            i++;
            System.out.println("hello world");
        }


        Scanner scannerr = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 0;


        do {
            System.out.println("enter your pin : ");
            correctPin = scannerr.nextInt();
            attempts++;


            if (1234 == correctPin) {
                System.out.println("pin accepted. access granted");

                break;
            } else {
                System.out.println("wrong pin. access denied");
            }

        } while (attempts < 3);

        if (attempts == 3) {
            System.out.println("max. attempts reached , access denied");

            scannerr.close();


            int suM = 0;
            do {
                System.out.println(suM + "  ");
                suM++;
            } while (suM < 0);


            int num = 15;
            if (num % 5 == 0) {
                System.out.println("Divisible by 5");
            } else {
                System.out.println("Not divisible by 5");
            }
        }
    }
}
//
//
//                int[] marksArray = new int[3];
//                marksArray[0] = 85;
//                marksArray[1] = 95;
//                marksArray[2] = 100;
//
//                System.out.println(marksArray[0]);
//                System.out.println(marksArray[1]);
//                System.out.println(marksArray[2]);
//
//                int[] markss = {98, 78, 85};
//                for (int i = 0; i < 3; i++) {
//                    System.out.println("student " + "marks " + markss[i]);
//
//
//                    int n = 5;
//
//                    for (int i = 1; i <= n; i++) {
//                        for (int J = 1; J <= i; J++) {
//
//                            System.out.print(J + "");



//Scanner scn = new Scanner(System.in);
//int n = Integer.parseInt(scn.nextLine()); // Read integer input
//String name = scn.nextLine(); // Read string input
//
//    for (int i = 0; i < n; i++) { // Use i < n instead of i <= n
//        System.out.println( i);
//        System.out.println("print " + name );// Added space before i
//    }
//
//            scn.close(); // Always close the scanner to avoid memory leaks
//}

























