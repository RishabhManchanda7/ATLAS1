public class ar1 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};

            System.out.println("Value at index 2: " + myNumbers[2]);


            System.out.println("Value at index 3: " + myNumbers[3]);

        } catch (Exception e) {
            System.out.println("Something went wrong.");

        } finally {
            System.out.println("I'm from finally block.");
        }
    }
}