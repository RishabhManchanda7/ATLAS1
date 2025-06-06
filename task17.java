class Person1 {
    private String name;
    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }
}
public class task17 {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}
