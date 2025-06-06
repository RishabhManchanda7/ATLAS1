import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayStack {
//    private ArrayList<T> stacklist;
//
//    public DynamicArrayStack() {
//         stacklist = new ArrayList<>();
//    }
//        public void push ( T data) {
//            stacklist.add(data);
//        }
//
//        public T pop(){
//        if(isEmpty()){
//            throw new IllegalStateException("Stack is empty. cannot pop.");
//        }
//        return stacklist.remove(stacklist.size()-1);
//        }
//
//        public boolean isEmpty(){
//        return stacklist.isEmpty();
//        }
//        public int size (){
//        return stacklist.size();
//        }

    //    public static void main(String[] args) {
//        DynamicArrayStack <Integer>stack= new DynamicArrayStack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        while (!stack.isEmpty()){
//            System.out.println("POPPED "+ stack.pop());
//        }
//    }
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int t = scn.nextInt();
//
//        for (int i = 0; i < t; i++) {  // iska kaam h input me jitna number daala utni baar chlana or t yha pr woh number h
//            int n = scn.nextInt();  // n yha pr number h user daalega check krne ke liye ki prime h ya nhi
//            int count = 1; // count is initialized to 1 because every number is divisible by itself (so, n is always a divisor).
//
//            for (int div = 1; div <= n; div++) {
//                if (n % div == 0) {
//                    count++;
//
//                }
//            }
//            if (count == 2) {
//                System.out.println("Prime");
//            } else {
//                System.out.println("not prime");
//            }
//        }

        Scanner scn = new Scanner(System.in);// Fabniachi series
        int n = scn.nextInt();// how many number will be input eg (4)
        int a = 0; // starts from (0)
        int b = 1;// 0 + 1 = 1 , 1+1=2 and so on....
        for (int i = 0; i<=n; i++) {  // loop will run 4 times3
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int node = 0;
//        int temp = n;
//        while (temp != 0){
//            temp = temp / 10;
//            node++;
//        }
//        int div = (int) Math.pow(10, node - 1);
//        while (div != 0) {
//            int q = n / div;
//            System.out.println(q);
//
//           n = n % div;
//           div = div / 10;
//
//        }

//        Scanner scn= new Scanner(System.in);// reverse the number
//        int n = scn.nextInt();
//
//        while (n>0){
//            int dig = n%10;
//            n= n/10;
//            System.out.print(dig);
//        }

//        Scanner scm = new Scanner(System.in);// inverse position
//        int n = scm.nextInt();
//        int inv= 0;
//        int op= 1;
//        while (n> 0){
//            int od = n%10;
//            int id=op;
//            int ip =od;
//
//            inv = inv + id * (int)Math.pow(10, ip-1);
//
//            n=n/10;
//            op++;
//        }
//
//        System.out.println(inv);

//        public static int linearSearch(int[] arr, int target) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == target) {  // If we find the target
//                    return i;  // Return the index where we found it
//                }
//            }
//            return -1;  // Return -1 if the target is not found
//        }

 //   public static void main(String[] args) {
//            int[] nums = {10, 20, 30, 40, 50};
//            int target = 80;
//
//            int index = linearSearch(nums, target);  // Call the search method
//
//            if (index != -1) {
//                System.out.println("Found at index: " + index);  // If found, print index
//            } else {
//                System.out.println("Not found");  // If not found, print message
//            }

//        Scanner scn = new Scanner(System.in);// gcd and lcm
//        int n1 = scn.nextInt();
//        int n2 = scn.nextInt();
//        int on1 = n1;
//        int on2 = n2;
//        while (n1 % n2 != 0) {
//            int rem = n1 % n2;
//            n1 = n2;
//            n2 = rem;
//        }
//
//        int gcd = n2;
//        int lcm = (on1 * on2) / gcd;
//
//        System.out.println(gcd);
//        System.out.println(lcm);


    }
}















