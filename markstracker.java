import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class markstracker <T> {
    public static void main(String[] args) {
//        int marksarray[] = new int[3];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < marksarray.length; i++) {
//            System.out.println("enter marks for student ");
//            marksarray[i] = scanner.nextInt();
//        }
//        scanner.close();
//
//        for (int i = 0; i < marksarray.length; i++) { //
//            System.out.println("student : " + " marks " + marksarray[i]);
//        }


        int numbers[] = new int[3];
        Scanner g = new Scanner(System.in);

        for (int count = 0; count < numbers.length; count++) {

            System.out.println("Entered numbers are " + (count ));
            numbers[count] = g.nextInt();


        }
        System.out.println("Even numbers entered:");
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] % 2 == 0) {  // Check if number is even
                System.out.println("Number is even" );
            }else{
                System.out.println("Number is not even");            }
        }
    }
}
//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");  // Use print() instead of println()
//            }
//            System.out.println();
//
//        }
//
//        int students = 4;
//        int grades[] = new int[students];
//        int sum = 0;
//        Scanner student = new Scanner(System.in);
//
//        for (int i = 0; i < students; i++) {
//            System.out.println("enter grade of students " + " : ");
//            grades[i] = student.nextInt();
//            sum += grades[i];
//        }
//        student.close();
//        double average = (double) sum % students;
//        System.out.println(" Average grade : " + average);
//
//        int[][] puzzle = new int[9][9];
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("enter the sudoku puzzle(9)(9): ");
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                puzzle[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println("sudoku puzzle ");
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.println(puzzle[i][j] + " ");
//                if ((j + 1) % 3 == 0) {
//                    System.out.println("|");
//                }
//            }
//            System.out.println();
//            if ((i + 1) % 3 == 0) {
//                System.out.println("-----------");
//            }
//
//        }
//    }
//

//        scanner.close();

//        private int[] stackArray;
//        private int top;
//        private int capacity;
//
//    public markstracker (int capacity) {
//            this.capacity = capacity;
//            this.stackArray = new int[capacity];
//            this.top = -1;
//        }
//
//        public boolean isEmpty() {
//            return top == -1;
//        }
//
//        public boolean isFull() {
//            return top == capacity - 1;
//        }
//
//        public void push(int data) {
//            if (isFull()) {
//                int newCapacity = capacity * 2;
//                stackArray = Arrays.copyOf(stackArray, newCapacity);
//                capacity = newCapacity;
//            }
//            stackArray[++top] = data;
//        }
//
//        public int pop() {
//            if (isEmpty()) {
//                throw new IllegalStateException("Stack is empty, cannot pop");
//            }
//            return stackArray[top--];  // ✅ Moved return outside of if
//        }
//
//        public int peek() {
//            if (isEmpty()) {
//                throw new IllegalStateException("Stack is empty, cannot peek");
//            }
//            return stackArray[top];  // ✅ Moved inside method
//        }
//
//        public int size() {
//            return top + 1;  // ✅ Added missing semicolon
//        }
//
//
//            markstracker stack = new markstracker(3);  // ✅ Fixed class name
//        public static void main(String[] args) {
//            stack.push(10);
//            stack.push(20);
//            stack.push(30);
//
//            System.out.println("Stack elements:");
//            while (!stack.isEmpty()) {
//                System.out.println(stack.pop());
//            }
//        }
//
//
//            public static void main(String[] args) {
//                LinkedList<String> markstracker= new
//                LinkedList<>();
//
//                markstracker.push("Buy Groceries ");
//                markstracker.push("eat groceries");
//                String completedTask = markstracker.pop();
//
//                System.out.println(completedTask);
//                for (int i = 0; i < markstracker.size(); i++){
//                    System.out.println(markstracker.get(i));
//                }
//


























