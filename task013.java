class OuterClass1 {
    int x = 10;
    static class InnerClass {
        int y = 5;
    }
}

public class task013 {
    public static void main(String[] args) {
        OuterClass1.InnerClass myIn = new OuterClass1.InnerClass();
        OuterClass1 myOut = new OuterClass1();
        System.out.println(myIn.y + myOut.x);
    }
}
