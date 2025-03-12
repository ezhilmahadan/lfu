public class Trex{
    public void add(int numone,int numtwo){
        int numthree = numone + numtwo;
        System.out.println(numthree);
    }
    public static void main(String args[]){
        Trex obj = new Trex();
        obj.add(50,10);
    }
}