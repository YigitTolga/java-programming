package day54_abstraction;

public abstract class MyAbstractClass {
    int num = 55;
    public void learn(){
        System.out.println("Learning...");
    }
    public abstract void close();
}
class Sub extends MyAbstractClass {
@Override
    public void close(){
        System.out.println("Closing...");
    }
}
class MyObject {

    public  static void main(String [] args){
        Sub mac = new Sub();
        System.out.println(mac.num);
        mac.learn();



    }
}
