class customer1 {
    int cost;
    String items;

    void purchaseList() {
        cost = 40;
        items = "Tomatoes";
    }
}

public class Mart extends customer1 {
    void billing() {
        items = "Onions";
        cost = 30;
    }

    public static void main(String[] args) {
        Mart m = new Mart();
        m.purchaseList();
        System.out.println(m.items);
        System.out.println(m.cost);

        m.billing();
        System.out.println(m.items);
        System.out.println(m.cost);
    }
}