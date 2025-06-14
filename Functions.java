import java.util.Scanner;

public class Functions {
//    public static void printMyName (String name) {
//        System.out.println(name);
//        return;
//    }
//    public static void main (String args []){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        printMyName(name);  // printMyName is a function we are calling in main.
//    }



//    public static int calculateProduct(int a, int b) {
//        int sum = a * b;  // sum and multiplication
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//
//        int sum1 = calculateProduct(a, b);
//        System.out.println(sum1);
//    }
//}
//    public static int printFactorial(int n){
//            int factorial= 1;
//            for (int i=n; i>=1; i--){
//                factorial = factorial*i;
//            }
//      //  System.out.println(factorial);
//            return factorial;
//    }
//
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//                int n = scn.nextInt();
//
//        int b = printFactorial(n);
//
//        System.out.println(b);
//    }
//}

//        public static int primeNo (int n){
//            boolean primeNo = true;
//
//            if (n<=1){
//                primeNo=false;
//            }
//            else {
//               for(int i =2; i<n; i++){
//                   if (n%2==0){
//                       System.out.println(i);
//                       primeNo=false;
//                       break;
//                   }
//               }
//            }
//            if (primeNo) {
//                System.out.println(n + " is Prime");
//            } else {
//                System.out.println(n + " is Not Prime");
//            }
//
//            return n;
//        }
//            public static void main(String[] args) {
//            Scanner scn = new Scanner(System.in);
//            int n = scn.nextInt();
//            int a = primeNo(n);
//
//            System.out.println(a);

    public static void main(String[] args) {
        String [] cars = {"BMW","Honda","Skoda", "Audi"};

        cars[0] = "Opel";


            System.out.println(cars[1]);

    }
}
