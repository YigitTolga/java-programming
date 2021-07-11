package day56_abstraction.greeting;

public class MountainLanguage implements Greeting{
    @Override
    public void hi() {
        System.out.println("Selam");
    }

    @Override
    public void bye() {
        System.out.println("Hoscakal");
    }
}
class Japanise implements Greeting{

    @Override
    public void hi() {
        System.out.println("Konichiwa");
    }

    @Override
    public void bye() {
        System.out.println("Seyanora");
    }
}