package src;

class Superclass{
    int var;
    Superclass(int var){
        this.var = var;
    }
    public void getVar(){
        System.out.println("var value in super class is "+ var);
    }
}
public class task33 extends Superclass {
    task33(int var) {
        super(var);
    }
    public static void main(String[] args) {
        Superclass sobj = new Superclass(100);
        sobj.getVar();
        task33 tobj = new task33 (346);
        tobj.getVar();
    }
}