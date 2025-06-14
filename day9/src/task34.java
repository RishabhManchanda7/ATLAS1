package src;

public class task34{
    void add(int x, int y){
        System.out.println(x+ " &&& "+ y);
    }
    void add(int x, int y, int z ){
        System.out.println(x + " $$$ "+ y+ " $$$"+ z);
    }
    public static void main(String[] args){
        task34 tobj = new task34();

         tobj.add(10,20,30);
         tobj.add(10,20);
    }
}

