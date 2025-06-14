class outerClass {
    int x = 10;
     class InnerClass {
        int y = 5;
    }
}

public class task011 {
    public static void main(String[] args) {
        outerClass myOuter = new outerClass();
        outerClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

