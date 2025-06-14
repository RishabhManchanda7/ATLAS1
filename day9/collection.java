import java.util.ArrayList;
public class collection  {
    public static void main (String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> a = new ArrayList<Integer>();
        // Adding Element in ArrayList
        a.add(1);
        a.add(2);
        a.add(3);

        // Printing ArrayList
        System.out.println(a);
    }

    public static class ExcepTest {

        public static void main(String args[]) {
            try {
                int a[] = new int[2];
                int b = 0;
                int c = 1/b;
                System.out.println("Access element three :" + a[3]);
            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException thrown  :" + e);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
            }catch (Exception e) {
                System.out.println("Exception thrown  :" + e);
            }
            System.out.println("Out of the block");
        }
    }
}
