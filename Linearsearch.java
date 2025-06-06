import java.util.Scanner;

public class Linearsearch {
    //public static int linearsearch(String[]names,String searchname) {
//        for (int i = 0; i < names.length; i++) {
//            if (names[i].equals(searchname)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        String [] students = {"Alice", "bob", "david", "eve"};
//        String target = "david" ;
//
//        int result = linearsearch(students, target );
//        if (result !=-1) {
//            System.out.println("the target name " + target + " was found at index " + result);
//        }else
//            System.out.println("the target name "+ target + " was not found in the array ");

    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        int c = scn.nextInt();
//        int max = a;
//        if (b >= max ){
//            max = b;
//    }  else if (c >=max ) {
//            max=c;
//        }
//        if (max==a){
//            boolean flag = ((b * b + c * c) == (a * a));
//            System.out.println(flag);
//        }else if (max == b){
//            boolean flag = ((c * c + a * a)==(b * b));
//            System.out.println(flag);
//        }else{
//            boolean flag = ((b * b + a * a)==(c * c));
//            System.out.println(flag);
//        }

        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        for (int i=n ; i >=1; i--){  // ye input le rha rows jo ek baad ek km ho rhe
            for(int j= 1; j<=i; j++){  // ye print krwa rha 1 by 1 kr ke loop chla ke or i ke equal aa rha
                System.out.print("* \t");  // ye print kr rha h star ko loop ke according
            }
           System.out.println(); // ye line is important ye next line me print and enter kr rhi h
        }
         // scn.close();

        Scanner cn = new Scanner(System.in); // pattern
        int b = scn.nextInt();
        for (int i= 1; i<=b;i++){
            for(int j =1; j<=i; j++){
                System.out.print(" * \t");
            }
            System.out.println();
        }


        Scanner bc = new Scanner(System.in);
        int kd = bc.nextInt();
        int spa= n-1; // input number me se 1 minus ho rhi h space
        int st= 1;

        for (int i =1; i<=kd; i++) {

            for (int j = 1; j <= spa; j++) {  // jitni space variable ki value hogi utne ye space print krega
               System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(" * \t");

            }
            spa--;
            st++;
            System.out.println();
        }

        Scanner ddd = new Scanner(System.in);
        int N = ddd.nextInt();
        int d = ddd.nextInt();
        int f= Linearsearch(N,d);
        System.out.println(f);
    }

    public static int Linearsearch(int N, int d){
        int rv = 0;

        while (N>0){
            int dig = N % 10;
             N= N/10;

             if (dig==0){
                 rv++;
             }

             
        }

        return rv;


    }
}

