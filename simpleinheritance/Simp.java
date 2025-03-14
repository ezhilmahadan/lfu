class Parent{
    public void add(){
        System.out.println("hello world");

    }

}
class child extends Parent{
    void display(){
        add();
    }

}
public class Simp{
    public static void main(String[] args){
        child obj = new child();
        obj.display();
    }
}