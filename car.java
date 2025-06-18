public class car {

    int x = 5;
    String name = "Scorpio";


    public static void main(String[] args) {

        car myobj = new car();

        System.out.println(myobj.x);
        System.out.println(myobj.name);

        car mycar = new car ();
        System.out.println(mycar.x + " " + mycar.name);

    }
}

