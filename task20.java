public class task20 {
    public static void main(String[] args) {

        char[] Name = {'R', 'I', 'S', 'H', 'A', 'B', 'H'};

        System.out.println(Name);

        int n = Name.length;
        System.out.println("There are " + n + " letters in my name");

        System.out.print("Letters in my name: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }
    }
}
