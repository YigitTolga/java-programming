package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage turkish = new MountainLanguage();
        turkish.hi();
        turkish.bye();
        Japanise jp =  new Japanise();
        jp.hi();
        jp.bye();
    }
}
