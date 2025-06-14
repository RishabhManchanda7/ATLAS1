public class exceptiontask0 {

        public static void main (String[]args){
        int[] myNumbers = {1, 2, 3};

        try {
            System.out.println(myNumbers[10]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
            System.out.println("Array length is: " + myNumbers.length);
        }
    }
    }