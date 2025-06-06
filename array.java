import java.util.Scanner;

public class array {
//    public static void main(String[] args) {
//        Scanner csn = new Scanner(System.in);// find index value
//        int n = csn.nextInt();
//        int [] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = csn.nextInt();
//        }
//        int data = csn.nextInt();// data provided by user
//
//        int idx= -1;
//        for (int i= 0; i< arr.length;i++){
//            if (arr[i]==data){
//                idx=i;// if it get and data got match it will print the index
//                break;// if not then it will print default value of idx which is -1
//            }
//            }
//            System.out.println(idx);

//        String weather = "sunny";
//        if (weather.equals("sunny")) {
//            System.out.println("wear flipflopps");
//        }
//        else if (weather.equals("rainn")) {
//            System.out.println("wear rain boots");
//        }
//        else {
//                System.out.println("wear normal shoes");
//            }
//
//        int l= 4;
//
//        for (int i = 1 ; i<=l; i++)
//        {
//
//            for (int j = 1;j<=l-i; j++){ // space print krane ka loop
//                System.out.print(" ");
//            }
//            for (int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//        int n =5;
//
//        for(int i=n;i>=1;i-- ){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        }
//
//    }

    public static boolean iseven (int num) {
        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
        public static void main(String[] args) {

            int n = 5;
            if (iseven(n)) {
                System.out.println(n + " is even number" );
            } else {
                System.out.println(n  + " is not even");

            }


        }

        }


